package org.example.javaadvanced.high;

/**
 * @ClassName: Weekend
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/27 22:04
 * @Description: TODO
 */
public enum Weekend implements Info{
    MONDAY("Monday","星期一"){
        @Override
        public void show() {
            System.out.println("星期一");
        }
    },
    TUESDAY("Tuesday","星期二"){
        @Override
        public void show() {
            System.out.println("星期二");
        }
    },
    WEDNESDAY("Wednesday","星期三"){
        @Override
        public void show() {
            System.out.println("星期三");
        }
    },
    THURSDAY("Thursday","星期四"){
        @Override
        public void show() {
            System.out.println("星期四");
        }
    },
    FRIDAY("Friday","星期五"){
        @Override
        public void show() {
            System.out.println("星期五");
        }
    },
    SATURDAY("Saturday","星期六"){
        @Override
        public void show() {
            System.out.println("星期六");
        }
    },
    SUNDAY("Sunday","星期日"){
        @Override
        public void show() {
            System.out.println("星期日");
        }
    };



    private final String weekendCode;
    private final String weekendName;
    private Weekend(String weekendCode, String weekendName){
        this.weekendCode = weekendCode;
        this.weekendName = weekendName;
    }

    public String getWeekendCode() {
        return weekendCode;
    }

    public String getWeekendName() {
        return weekendName;
    }

    /**
     * 根据传入的weekendCode获取枚举值
     * @param weekendCode
     * @return
     */
    public static Weekend getWeekendByCode(String weekendCode){
        for (Weekend weekend : Weekend.values()) {
            if (weekend.getWeekendCode().equals(weekendCode)){
                return weekend;
            }
        }
        return null;
    }
}
interface Info{
    void show();
}