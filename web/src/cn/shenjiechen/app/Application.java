package cn.shenjiechen.app;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("fsdfds");
        strList.add("sfds");
        strList.add("fsd");
        strList.add("fsd");
        strList.add("fsd灌灌灌灌灌ddddd");
        strList.add("fsd");
        strList.add("fsd");
        strList.add("sfdfffffffsdg");
        strList.add("sfdfsdg");
        strList.add("sfffffffdfsdg");
        strList.add("sfdffffffffsdg");
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
