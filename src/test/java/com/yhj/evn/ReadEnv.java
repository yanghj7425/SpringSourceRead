package com.yhj.evn;

import java.util.Map;
import java.util.Properties;

public class ReadEnv {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Map.Entry entry : properties.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println("******************************");
        Map<String, String> env = System.getenv();
        for (Map.Entry entry : env.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
