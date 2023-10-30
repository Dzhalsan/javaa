package D28.A1;

import java.util.ArrayList;

public class PracticeArrayListHW {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("str");
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        boolean check1 = strings.isEmpty();
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        boolean check2 = strings.isEmpty();

        System.out.println(check1);
        System.out.println(check2);


    }



}
