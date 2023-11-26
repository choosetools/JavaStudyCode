package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: USBTEst
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/25 21:14
 * @Description: TODO
 */
public class USBTest {
    @Test
    public void test(){
        Computer computer = new Computer();
        Printer printer = new Printer();
        //多态
        computer.transferData(printer);
    }
}
interface USB{
    //声明常量
    //USB的长、宽、高...

    //方法
    public abstract void start();
    void stop();
}
class Computer{
    public void transferData(USB usb){
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输的细节...");
        usb.stop();
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
