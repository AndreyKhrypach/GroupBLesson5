import java.util.Arrays;
import java.util.Random;

public class Lesson5Program {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayInt = new int[15];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrayInt));
//        Arrays.sort(arrayInt);
//        System.out.println(Arrays.toString(arrayInt));

//        for (int index = 0; index < arrayInt.length; index++) {
//            if(arrayInt[index] == 1){
//                System.out.println(arrayInt[index] + " " + index);
//            }
//        }
//        for (int arrayElement:
//             arrayInt) {
//            System.out.println(arrayElement);
//        }
//        for (int index = 0; index <arrayInt.length ; index++) {
//            arrayInt[index] = random.nextInt(10);
//        }
//        System.out.println(Arrays.toString(arrayInt));
//        for (int i = 0; i < arrayInt.length; i++) {
//            System.out.println(arrayInt[i]);
//        }
//        int temp = 1;
//        while(true){
//            System.out.println(temp);
//            temp++;
//            if(temp == 500){
//                break;
//            }
//
//        }
//        System.out.println("___________________________");
//        System.out.println(temp);
//        for(;;){
//            System.out.println(temp);
//            if(temp == 100){
//                break;
//            }
//            temp++;
//        }

//        do {
//            System.out.println(temp);
//            temp++;
//        }while(temp < 10);


//        boolean bool = false;
//        int count = random.nextInt(20) + 1;
//        while (!bool){
//            System.out.println("I am developer");
//            if(count < 10){
//                count++;
//            }else {
//                bool = true;
//            }
//        }

//        int a = 0;
//        while (a < 10){
//            System.out.println(a);
//            a++;
//        }

//       int[] manualArray = new int[] {10, 13, 24, 555, 144, 1};
//       //int[] manualArray1 = {10, 13, 24, 555, 144, 1};
//        System.out.println(Arrays.toString(manualArray));
//        System.out.println("array length = " + manualArray.length);
//
//        double avgManualArray = 0.0;
//        int sum = 0;
//        for (int i = 0; i < manualArray.length; i++) {
//            sum+= manualArray[i];
//        }
//        avgManualArray = (double) sum / manualArray.length;
//        System.out.println(sum);
//        System.out.println(avgManualArray);
//        int[] array = new int[10];
//        long[] arrayL = new long[10];
//        double[] arrayD = new double[10];
//        float[] floatMassyv = new float[10];
//        boolean[] arrayBoolean = new boolean[10];
//        byte[] arrayByte = new byte[10];
//        short[] arrayShort = new short[10];
//        char[] arrayChar = new char[10];
//        for (int index = 0; index < array.length; index++) {
//            System.out.print(array[index] + ", ");
//        }
//        System.out.println();
//        for (int index = 0; index < array.length; index++) {
//            array[index] = random.nextInt(10);
//        }
//
//        for (int index = 0; index < array.length; index++) {
//            System.out.print(array[index] + ", ");
//        }

//        int a = 5;
////        System.out.println(a);
////        a++;
////        System.out.println(a);
//
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(++i);
//            }
//            //a++;
//            //System.out.println(a++);
//        }
//        //System.out.println("___________________________________________________");
//        //System.out.println(i);
//        //System.out.println("_______________________________________________________");
//        //System.out.println(i * a);
//
//
    }
}
