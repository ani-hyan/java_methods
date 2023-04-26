package homework_6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Arrays {
    private Scanner sc;
    public Arrays(InputStream inputStream) {
        this.sc = new Scanner(inputStream);
    }

    public Arrays(){

    }

    //prints the array
    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }


    //տպում է int[] n  array-ի դրական տարրերը
    public void printPositive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    //տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
    public void printReverse(short[] arr){
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    //գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը
    public long theLargest(long[] arr){
        long large = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(large < arr[i])
                large = arr[i];
        }
        return large;
    }

    //գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը
    public float theSmallest(float[] arr){
        float small = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(small > arr[i])
                small = arr[i];
        }
       return small;
    }

    //int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ
    public int[] replace(int[] n){
        int[] m = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
        }
        return m;
    }

    //գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ
    public int[] sum(){
        System.out.print("Enter the size: ");
        int n = Integer.parseInt(sc.next());
        System.out.println("Enter numbers for array 1: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter numbers for array 2: ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    //հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ
    public int numberOf(int[] a, int k){
        int n = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == k)
                n++;
        }
        return n;
    }

    //անդամները նվազման կարգով

    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] > arr[j]) {
                     arr[i] = arr[i]^arr[j]^(arr[j] = arr[i]);
                }
            }
        }
        return arr;
    }
    //վերջում կենտերը

    public int[] odd(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i <= j){
            if(arr[i] % 2 != 0){
                arr[j] = arr[j] ^ arr[i] ^ (arr[i] = arr[j]);
                j--;
            }
            i++;
        }
        return arr;
    }
    //հեռացնել բոլոր զրոները

    public int[] noZero(int[] a){
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] != 0)
                j++;
        }
        int[] newest = new int[j];
        j=0;
        for (int i = 0; i < a.length; i++){
            if(a[i] != 0) {
                newest[j] = a[i];
                j++;
            }
        }
        return newest;
    }

    //TODO 12


    //արտածել arr 10-ական ներկայացումը
    public int toDecimal(int[] arr){
        int n = 0;
        int i = 0;
        for (; i<arr.length; i++){
            if(arr[i] == 1){
                int power = 1;
                int j = arr.length-i-1;
                while(j > 0){
                    power *= 2;
                    j--;
                }
                n += power;
            }
        }
        return n;
    }

    public int[] upperMatrix(int[][] arr){
        int l = arr.length;
        int[] upper = new int[l*(l-1)/2];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[i].length; j++){
                upper[k] = arr[i][j];
                k++;
            }
        }
        return upper;
    }

    public int[][] transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] ^ arr[j][i] ^ (arr[j][i] = arr[i][j]);
            }
        }
        return arr;
    }

    public boolean evenRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum %2 != 0){
                System.out.println("no");
                return false;
            }
        }
        System.out.println("yes");
        return true;
    }

}

