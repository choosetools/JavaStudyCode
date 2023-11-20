package org.example.javaadvanced.high;

import java.util.Date;

/**
 * @Author cheng
 * @ClassName User
 * @Date 2023/11/19 11:10
 * @Version V1.0
 * @Description
 */
public class User {
    private String username;
    private String password;
    private long registrationTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

//    public User(){
//        System.out.println("新用户注册");
//        this.registrationTime = System.currentTimeMillis();
//        this.username = String.valueOf(registrationTime);
//        this.password = "123456";
//    }
//
//    public User(String username, String password) {
//        this.username = username;
//        this.password = password;
//        this.registrationTime = System.currentTimeMillis();
//    }

    //将其改成使用代码块的方式：
    {
        System.out.println("新用户注册");
        this.registrationTime = System.currentTimeMillis();
    }

    public User() {
        this.username = this.registrationTime + "";
        this.password = "123456";
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getInfo(){
        return  "用户名：" + this.username + "，密码：" + this.password + "，注册时间：" + this.registrationTime;
    }

    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("song","8888");
        System.out.println(u2.getInfo());
    }
}
