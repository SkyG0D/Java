package br.com.sky.javacore.l25colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");

        for (Map.Entry<String, String> entrey : map.entrySet()) {
            System.out.println(entrey.getKey() + " " + entrey.getValue());
        }

        System.out.println(map.headMap("D"));
    }
}
