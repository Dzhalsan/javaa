package Day24;

public class Main {
    boolean doubleX(String str) {
        int counter =0;
        for (int i=0;i<str.length()-1;i++){
            if (counter==1) return false;
            if ((str.charAt(i)+"").equalsIgnoreCase("x")){
                counter++;
                if ((str.charAt(i+1)+"").equalsIgnoreCase("X")) return true;}
        }
        return false;
    }

    public boolean frontAgain(String str) {
        if (str.length()<2) return false;
        else return str.startsWith(str.substring(0,3))&&str.endsWith(str.substring(0,3));

    }

    public String comboString(String a, String b) {
        String result = "";
        if (a.length()>b.length())  result=b+a+b;
        else result=a+b+a;
        return result;

    }
}
