package com.sunline.practice.L20190923;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class TryWithResource {

    public static void main(String[] args) {
        //<editor-fold desc="传统资源关闭方式">
        /*InputStream inputStream = null;
        Resource resource = new ClassPathResource("static/trywithresource.txt");
        try {
            inputStream = resource.getInputStream();
            System.out.println(inputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(),e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
        }*/
        //</editor-fold>
        //<editor-fold desc="try-with-resource语法">
        Resource resource = new ClassPathResource("static/trywithresource.txt");
        try (InputStream inputStream = resource.getInputStream()) {
            System.out.println(inputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
        //</editor-fold>
    }
}
