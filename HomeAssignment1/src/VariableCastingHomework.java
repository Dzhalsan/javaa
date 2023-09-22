public class VariableCastingHomework {
    public static void main(String[] args) {

        byte byte1 = 127;
        short short1 = 256;
        int int1 = 13245;
        long long1 = 234567L;
        float float1 = 3.56F;
        double double1 = 3.14;

        byte1 = (byte) short1;
        short1 = (short) int1;
        int1 = (int) long1;
        long1 = (long) double1;
        float1 = (float) double1;

        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(int1);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);


    }
}
