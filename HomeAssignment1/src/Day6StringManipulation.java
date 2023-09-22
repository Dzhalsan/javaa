public class Day6StringManipulation {
    public static void main(String[] args) {

        String str = " This is a random string for testing purposes ";
        System.out.println(str.length());         // task 1

        System.out.println(str.charAt(2));      // task 2

        System.out.println(str.charAt(str.length()-1)) ;  //task 3

        System.out.println(str.replace("o","i").replace("s","i")); // task 4

        System.out.println(str.replace(" ","")); // task 5


        System.out.println(str.substring(str.indexOf("r"),str.indexOf("m")+1)); // task 6

        // task 7

        String q = str.substring(str.indexOf("r"),str.indexOf("m")+1);
        int w= q.length();
        String e = (q.substring(w-1))+(q.substring(w-2,w-1))+(q.substring(w-3,w-2))+(q.substring(w-4,w-3))
                +(q.substring(w-5,w-4))+(q.substring(w-6,w-5));
        System.out.println(e.toUpperCase());

    }
}
