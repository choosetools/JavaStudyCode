package org.example.javaadvanced.high;
//
///**
// * @Author cheng
// * @ClassName LeafTest
// * @Date 2023/11/19 15:31
// * @Version V1.0
// * @Description
// */
//class Root{
//    static{
//        System.out.println("Root的静态初始化块");
//    }
//    {
//        System.out.println("Root的普通初始化块");
//    }
//    public Root(){
//        System.out.println("Root的无参数的构造器");
//    }
//}
//class Mid extends Root{
//    static{
//        System.out.println("Mid的静态初始化块");
//    }
//    {
//        System.out.println("Mid的普通初始化块");
//    }
//    public Mid(){
//        System.out.println("Mid的无参数的构造器");
//    }
//    public Mid(String msg){
//        //通过this调用同一类中重载的构造器
//        this();
//        System.out.println("Mid的带参数构造器，其参数值："
//                + msg);
//    }
//}
//class Leaf extends Mid{
//    static{
//        System.out.println("Leaf的静态初始化块");
//    }
//    {
//        System.out.println("Leaf的普通初始化块");
//    }
//    public Leaf(){
//        //通过super调用父类中有一个字符串参数的构造器
//        super("尚硅谷");
//        System.out.println("Leaf的构造器");
//    }
//}
//public class LeafTest{
//    public static void main(String[] args){
//        new Leaf();
//        //new Leaf();
//    }
//}
public class LeafTest {
    {
        this.age = 2;
    }

    int age = 1;

    public static void main(String[] args) {
        LeafTest leafTest = new LeafTest();
        System.out.println(leafTest.age);
    }
}
class Fu{
    private static int i = getNum("（1）i");
    private int j = getNum("（2）j");
    static{
        print("（3）父类静态代码块");
    }
    {
        print("（4）父类非静态代码块，又称为构造代码块");
    }
    Fu(){
        print("（5）父类构造器");
    }
    public static void print(String str){
        System.out.println(str + "->" + i);
    }
    public static int getNum(String str){
        print(str);
        return ++i;
    }
}
class Zi extends Fu{
    private static int k = getNum("（6）k");
    private int h = getNum("（7）h");
    static{
        print("（8）子类静态代码块");
    }
    {
        print("（9）子类非静态代码块，又称为构造代码块");
    }
    Zi(){
        print("（10）子类构造器");
    }
    public static void print(String str){
        System.out.println(str + "->" + k);
    }
    public static int getNum(String str){
        print(str);
        return ++k;
    }
}