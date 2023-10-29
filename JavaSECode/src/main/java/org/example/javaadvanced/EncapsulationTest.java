package org.example.javaadvanced;

/**
 * @ClassName: EncapsulationTest
 * @Package: org.example.javaadvance
 * @Author cheng
 * @Create 2023/10/28 21:43
 * @Description: TODO
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge();
        System.out.println(b.getAge());

        Book book = new Book();
        book.setPrice(123);
        double price = book.getPrice();
    }
}
class Person{
    private int age;
    public void setAge(){
        this.age = (int)(Math.random() * 131);
    }

    public int getAge(){
        return this.age;
    }
}

class Book {
   private String bookName;
   private String author;
   private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
