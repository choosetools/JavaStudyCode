//package org.example.exceptionhanding;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
///**
// * @ClassName: Person
// * @Package: org.example.exceptionhanding
// * @Author cheng
// * @Create 2023/12/3 21:44
// * @Description: TODO
// */
//public class Person {
//    public void method() throws IOException {
//        File file = new File("hello.txt");
//        FileInputStream inputStream =  new FileInputStream(file);
//        inputStream.read();
//        inputStream.close();
//    }
//}
//class Sub extends Person{
//    @Override
//    public void method(){
//    }
//}
//
//interface ExceptionTest{
//    public void method();
//}
//
//class ExceptionClassTest implements ExceptionTest{
//
//    @Override
//    public void method() throws Exception{
//
//    }
//}
