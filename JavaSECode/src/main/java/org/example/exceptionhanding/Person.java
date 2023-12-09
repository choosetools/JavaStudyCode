package org.example.exceptionhanding;

/**
 * @ClassName: Person
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/3 21:44
 * @Description: TODO
 */
public class Person {
//    public void method() throws IOException {
//        File file = new File("hello.txt");
//        FileInputStream inputStream =  new FileInputStream(file);
//        inputStream.read();
//        inputStream.close();
//    }


    private String name;
    private double lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(double lifeValue) {
        if (lifeValue < 0){
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }

    public Person(String name, double lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public Person() {
    }
}
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
