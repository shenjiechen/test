package cn.shenjiechen.app;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("fsdfds");
        strList.add("sfds");
        strList.add("fsd");
        strList.add("fsd");
        strList.add("fsdddddd");
        strList.add("fsd");
        strList.add("fsd");
        strList.add("sfdfsdg");
        strList.add("gaetrs烦烦烦烦烦烦烦烦烦方法fd");
        strList.add("gaetrsfd");
        strList.add("gaetrsfd");
        strList.forEach(item -> {
            System.out.println(item);
        });

        System.out.print("Hello github.");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int sub2(int num1, int num2) {
        return num1 - num2;
    }
}
