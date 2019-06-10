package com.sunline.model;

public class DictModel {

    String id;
    String code_type;
    String code1;
    String code_desc1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode_type() {
        return code_type;
    }

    public void setCode_type(String code_type) {
        this.code_type = code_type;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode_desc1() {
        return code_desc1;
    }

    public void setCode_desc1(String code_desc1) {
        this.code_desc1 = code_desc1;
    }

    public DictModel(String id, String code_type, String code1, String code_desc1) {
        this.id = id;
        this.code_type = code_type;
        this.code1 = code1;
        this.code_desc1 = code_desc1;
    }

    @Override
    public String toString() {
        return "DictModel{" +
                "id='" + id + '\'' +
                ", code_type='" + code_type + '\'' +
                ", code1='" + code1 + '\'' +
                ", code_desc1='" + code_desc1 + '\'' +
                '}';
    }
}
