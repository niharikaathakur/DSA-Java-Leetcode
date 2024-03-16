package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Niharika",89);
        map.put("Jeet",99);
        map.put("Dharak",85);
        map.put("Rahul",89);
        System.out.println(map.get("Jeet"));
        System.out.println(map.getOrDefault("Apoorva",78));
        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);

        TreeMap<String, Integer> maptree = new TreeMap<>();
        maptree.put("Niharika",89);
        maptree.put("Jeet",99);
        maptree.put("Dharak",85);
        maptree.put("Rahul",89);
        System.out.println(maptree);
    }

}
