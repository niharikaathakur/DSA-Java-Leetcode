package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            list1.add(new ArrayList<>());
//        }
//
//        for(int i=0;i<5;i++){
//            list1.get(i).add(in.nextInt());
//        }


        list.add(55);
        list.add(98);
        list.add(97);
        list.add(93);
        list.add(47);
        list.add(83);
        list.add(36);

        System.out.println(list.reversed());
//
//
//        list.set(3,99);
//        System.out.println(list);
//        System.out.println(list.contains(654));

//        for(int i=0;i<5;i++){
//            list.add(in.nextInt());
//        }
//
//        for(int i=0;i<5;i++){
//            System.out.println(list.get(i)); //pass index, list[index] will not work here
//        }

//        System.out.println(list1);
    }
}
