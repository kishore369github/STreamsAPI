package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    // get the even Numbers from the List
        // We required the filter Method. filter method use Predicate,

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,5,10,15,20,25));
        List<Integer> evenlist = list.stream().filter(e-> e%2==0).collect(Collectors.toList());
        System.out.println("evenlist :" + evenlist);

        // if i need to increase every element by 5 , than i should go with the map

        List<Integer> addbyfive = list.stream().map(e -> e+5).collect(Collectors.toList());
        System.out.println("addbyfive :" + addbyfive);







    }
}