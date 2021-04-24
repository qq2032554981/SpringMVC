package com.heaboy;

import com.heaboy.mvc.HeaboyMvc;

import java.net.URL;

public class Main {
    static {
        String path = Main.class.getResource("").getPath();
        String packageName = Main.class.getPackage().getName();
        HeaboyMvc.scanner(path,packageName);
    }

    public static void main(String[] args) {
        HeaboyMvc.exec("","");
        HeaboyMvc.exec("test","index1");
        HeaboyMvc.exec("test","");
        System.out.println("Hello World!");
    }
}
