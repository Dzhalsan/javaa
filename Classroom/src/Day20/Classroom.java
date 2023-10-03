package Day20;

public class Classroom {
    public static void main(String[] args) {
//        for (int i=0; i<5;i++) {
//
//            for (int j=0; j<10;j++) {
//                System.out.print(" 10 ");
//            }
//            System.out.println("  ");
//        }

//        for (int i=7; i>0;i--) {
//
//            for (int j=i-1; j>=1;j--) {
//                System.out.print("*" );
//            }
//            System.out.println("");
//        }

//        int[] array = {1,2,2,2,3,4,5,6,6,5,4,2};
//        int counter=0;
//        int container = array[0];
//
//        for (int i =1;i< array.length;i++) {
//            if (array[i]==container) counter++;
//            container=array[i];
//
//        }
//        System.out.println(counter);
//        if (counter>=3) System.out.println("true");
//        else System.out.println("false");

        String[] names = {"Syrga","Elza","Ludmila","Aizhan",
                "Bektur","Mike","Atabek","Elina","Albert"};

        for (int i=1; i<names.length-1;i+=3){
            System.out.println(names[i - 1]+", " + names[i]+", "  + names[i + 1]+" bought a new Iphone 15 Pro");
        }


    }
}
