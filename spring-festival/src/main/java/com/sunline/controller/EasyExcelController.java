package com.sunline.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.sunline.model.WriteModel;
import com.sunline.util.DataUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/excel")
public class EasyExcelController {

    @RequestMapping("/writeV2007")
    public void writeV2007(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String fileName = "practice";
        ServletOutputStream out = response.getOutputStream();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename="+fileName+".xlsx");
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
        Sheet sheet1 = new Sheet(1, 3);
        sheet1.setSheetName("第一个sheet");

        //设置列宽 设置每列的宽度
        Map columnWidth = new HashMap();
        columnWidth.put(0,10000);columnWidth.put(1,40000);columnWidth.put(2,10000);columnWidth.put(3,10000);
        sheet1.setColumnWidthMap(columnWidth);
        sheet1.setHead(DataUtil.createTestListStringHead());
        //or 设置自适应宽度
        //sheet1.setAutoWidth(Boolean.TRUE);
        writer.write1(DataUtil.createTestListObject(), sheet1);

        //写第二个sheet sheet2  模型上打有表头的注解，合并单元格
        Sheet sheet2 = new Sheet(2, 3, WriteModel.class, "第二个sheet", null);
        sheet2.setTableStyle(DataUtil.createTableStyle());
        //writer.write1(null, sheet2);
        writer.write(DataUtil.createTestListJavaMode(), sheet2);
        //需要合并单元格
        writer.merge(5,20,1,1);

        //写第三个sheet包含多个table情况
        Sheet sheet3 = new Sheet(3, 0);
        sheet3.setSheetName("第三个sheet");
        Table table1 = new Table(1);
        table1.setHead(DataUtil.createTestListStringHead());
        writer.write1(DataUtil.createTestListObject(), sheet3, table1);

        //写sheet2  模型上打有表头的注解
        Table table2 = new Table(2);
        table2.setTableStyle(DataUtil.createTableStyle());
        table2.setClazz(WriteModel.class);
        List<WriteModel> writeModelList = DataUtil.createTestListJavaMode();
        writer.write(writeModelList, sheet3, table2);

        writer.finish();
        out.close();

    }
}
