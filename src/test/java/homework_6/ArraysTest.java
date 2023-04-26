package homework_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
    Arrays arr;
    int[] array1;
    int[] array2;

    @BeforeEach
    void setUp() {
        arr = new Arrays();
        array1 = new int[]{3, 2, 0, 7, 2};
        array2 = new int[0];
    }

    @Test
    void testTheLargest(){
        long[] array = {2, -1, 4, 4};
        assertTrue(4 == arr.theLargest(array));
    }

    @Test
    void testTheSmallest(){
        long[] array = {2, -1, 4, 4};
        assertTrue(-1 == arr.theLargest(array));
    }

    //3,2,0,7
    @Test
    void testReplace(){
        int[] expected = {3, 2, 0, 7};
        assertArrayEquals(expected, arr.replace(array1));
    }

    //toDo
    @Test
    void testSum() throws IOException {
//        InputOutput inputOutput= new InputOutput();
//
//        String input = "add 5";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        assertEquals("add 5", inputOutput.getInput());

        int n = 3;
        byte[] arr1 = {3,4,5};
        byte[] arr2 = {1,2,3};
        InputStream in1 = new ByteArrayInputStream(new byte[]{(byte) n});
        InputStream in2 = new ByteArrayInputStream(arr1);
        InputStream in3 = new ByteArrayInputStream(arr2);

        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
//        System.setIn(in2);
//        System.setIn(in3);
        assertEquals(new int[]{6,8,10}, arr.sum());

//        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n4\n".getBytes());
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        Arrays userInputExample = new Arrays(inputStream);
//        int[] a = userInputExample.sum();
//        String outputText = byteArrayOutputStream.toString();
//        String key = "output:";
//        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
 //       assertEquals(output, "7");
    }

    @Test
    @DisplayName("Number of 2 when the array has 2")
    void testNumberOf1(){
        assertEquals(2, arr.numberOf(array1, 2));
    }

    @Test
    @DisplayName("Number of 2 when the array doesn't have 2")
    void testNumberOf2(){
        assertEquals(0, arr.numberOf(array2, 2));
    }

    //3, 2, 0, 7, 2
    @Test
    void testSort(){
        int[] a = new int[]{7,3,2,2,0};
        assertArrayEquals(a, arr.sort(array1));
    }

    @Test
    void testOdd(){
        int[] a = {2,2,0,7,3};
        assertArrayEquals(a, arr.odd(array1));
    }

    @Test
    void testNoZero(){
        int[] a = {3,2,7,2};
        assertArrayEquals(a, arr.noZero(array1));
    }

    @Test
    void testToDecimal(){
        int[] decimal = {1,0,0,1,1};
        assertTrue(19 == arr.toDecimal(decimal));
    }

    @Test
    void testUpperMatrix(){
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] b = {2,3,6};
        assertArrayEquals(b, arr.upperMatrix(a));
    }

    @Test
    void testTranspose(){
        int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] arr2 = {{1,4,7}, {2,5,8}, {3,6,9}};
        assertArrayEquals(arr2, arr.transpose(arr1));
    }

    @Test
    @DisplayName("Checks all rows to be even")
    void testEvenRow1(){
        int[][] array = {{1,-1,0,0}, {2,-2,1,-1}, {9,7,1,-17}};
        assertTrue(arr.evenRow(array));
    }

    @Test
    @DisplayName("Checks if at least one row is not even")
    void testEvenRow2(){
        int[][] array = {{1,-1,0,0}, {2,-2,1,-1}, {9,7,0,-17}};
        assertFalse(arr.evenRow(array));
    }


}