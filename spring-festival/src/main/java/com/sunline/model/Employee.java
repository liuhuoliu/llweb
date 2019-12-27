package com.sunline.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {

    private String name;
    private String address;
    private int ssn;
    private int number;
}
