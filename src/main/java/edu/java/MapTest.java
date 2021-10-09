package edu.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {


    public static void main(String[] args) {
        Map<String,String> m = new HashMap();
        m.put("1","one");
        m.put("2","two");
        m.put("3","Three");

        List<String> list = new ArrayList<>();

        m.keySet().forEach(s-> System.out.println(m.get(s)));




    }



}
