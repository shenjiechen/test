package cn.shenjiechen.app;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("fsdfds");
        strList.add("sfds");
        strList.add("fsd");
        strList.add("sfdfsdg");
        strList.add("gaetrsfd");
        strList.forEach(item -> {
            System.out.println(item);
        });

        System.out.print("Hello github.");
    }
    
    public String joinStr(String str1, String str2) {
        return str1 + str2;
    }
}
