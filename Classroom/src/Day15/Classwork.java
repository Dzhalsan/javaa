package Day15;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int counter = 0;


        if (str1.contains(str2)) {
            for (int i = 0; i<=(str1.length()-str2.length()); i++) {
                if (str1.substring(i,i+str2.length()).equalsIgnoreCase(str2))
                    counter+=1;}
            System.out.println(str2+" is repeated in "+str1+" "+counter+" time(s) ");}
        else System.out.println("String {"+str1+"} does not contain string2 {"+str2+"}");
    }
}
