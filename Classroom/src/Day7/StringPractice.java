package Day7;

public class StringPractice {
    public static void main(String[] args) {

        String stringvar = "Good evening Batch4!";
        int year = 2023;

        System.out.println(stringvar.length());

        String str1 = "hello";
        String str2 = "Hello";

//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(stringvar.toLowerCase());
//        System.out.println(stringvar.toUpperCase());
//        System.out.println(stringvar.charAt(18));
//        System.out.println(stringvar.charAt(3));
//        System.out.println(stringvar.charAt(stringvar.length()-1));
//
//        System.out.println(str1.indexOf("e"));
//        System.out.println(str1.indexOf('l'));
//        System.out.println(str1.indexOf("Batch4"));
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.replace("e","l"));
//        System.out.println(str1.endsWith("e"));
//        System.out.println(str1.trim());

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(1,4+1));
        System.out.println(str1.contains("1"));





    }
}
