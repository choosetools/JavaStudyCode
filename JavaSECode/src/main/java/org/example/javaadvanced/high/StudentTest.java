package org.example.javaadvanced.high;

/**
 * @ClassName: StudentTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/29 21:05
 * @Description: TODO
 */
@MyAnnotation("chengJiaWei")
public class StudentTest {

    @Column(columnName = "sid",columnType = "int")
    private int id;
    @Column(columnName = "sname@e", columnType = "varchar(20)")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
