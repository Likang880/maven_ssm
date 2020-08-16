package com.shop.domain;

public class Employee {
    private Integer id;
    private String username;
    private char sex;
    private String city;
    private String sign;
    private String classify;

    public Employee(Integer id, String username, char sex, String city, String sign, String classify) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.city = city;
        this.sign = sign;
        this.classify = classify;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                ", sign='" + sign + '\'' +
                ", classify='" + classify + '\'' +
                '}';
    }
}
