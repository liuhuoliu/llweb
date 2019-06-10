package com.sunline;

import com.sunline.converter.NullConverter;
import com.sunline.enums.UserSexEnum;
import com.sunline.model.Order;
import com.sunline.model.User;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringFestivalApplicationTests {

	@Test
	public void contextLoads() {
		String aa = "1.51";
		if (aa.contains("0.")){
			aa = "1";
		}
		BigDecimal bigDecimal = new BigDecimal(aa).setScale(0,BigDecimal.ROUND_HALF_UP);
		System.out.println("=====>"+aa);

		/*long aa = 1;
		Order order = new Order("111","qwer");
		User user = new User(aa,"liu","123", UserSexEnum.MAN,"456",order);
		XStream xStream = new XStream();
		xStream.alias("user",User.class);
		xStream.aliasField("passWord111",User.class,"passWord");
		NullConverter nullConverter = new NullConverter();
		nullConverter.regAttribute(User.class,"passWord");
		nullConverter.regAttribute(User.class,"nickName");
		*//*nullConverter.regAttribute(User.class,"order");*//*
		xStream.registerConverter(nullConverter);
		Writer writer = new StringWriter();
		xStream.marshal(user,new CompactWriter(writer));
		System.out.println(writer.toString());*/
	}


}

