package org.example;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1.1");
 double [] doubleArray = new double[4];
  doubleArray [0] = 3.43;
  doubleArray [1] =12.1212;
  doubleArray [2] =12.22;
  doubleArray [3] =2.29;
        String arrayString = doubleArray[0] + "; " + doubleArray[1] + "; " + doubleArray[2] + "; " + doubleArray[3];
        System.out.println(arrayString);

        System.out.println("Task 1.2");
      String mama = "Mama мила раму";
      String [] phrase = mama.split(" ");
      String phraseString = String.join(",", phrase);
        System.out.println(phraseString);

        System.out.println("Task 1.3");
        String line = "Я хочу перенесення рядків";
        String moving = line.replace(" ", "\n");
        System.out.println(moving);

        System.out.println("Task 2.1");
        int [] intArray = new int []{58,65,89,45,74,63,27,24,85,41};
        System.out.println(Arrays.toString(intArray) +" before");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] -= 1;
        }
        System.out.println(Arrays.toString(intArray) +" after");

        System.out.println("Task 2.2");
        float[] fraction  = {5.12f, 7.22f, 5.3434f, 0.110f, 6.34f};
        System.out.println(Arrays.toString(fraction));

        System.out.println("Task 2.3");
byte x = 4;
int y = 245_536;
long z = 12_345_678_134L;

int [] intArrayf = new int[3];
        intArrayf[0]=x;
        intArrayf[1]=y;
        intArrayf[2]= (int) z;

        System.out.println(Arrays.toString(intArrayf)); //An error appears with a recommendation to convert long to int. If I write intArrayf[2]= (int) z then incorrect variable z appears.

        System.out.println("Task 2.4");
        int [][] intArrayt = {{45,56,25},{8,9,0}};
        for (int[] newline : intArrayt) {
            System.out.println(Arrays.toString(newline));
    }
        System.out.println("Task 3.1");
String str = "Hello world!";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        int firsti = str.indexOf("world");
        int lasti = firsti + "world".length();
        String addstring = str.substring(firsti, lasti);
        char[] chararray = addstring.toCharArray();
        System.out.println(Arrays.toString(chararray));
        System.out.println(chararray[chararray.length - 2]);

        System.out.println("Task 3.2");
        int a = 8;
        int b = a++;
        System.out.println("a: " +a + "; b: " +b);
        int t = 8;
        int q = ++t;
        System.out.println("t: " +t + "; q: " +q);
        int u = 8;
        int j = u--;
        System.out.println("u: " +u + "; j: " +j);
        int d = 8;
        int f = --d;
        System.out.println("d: " +d + "; f: " +f);
    }
}