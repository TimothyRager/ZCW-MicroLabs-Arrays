package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {

        ArrayParty arrayParty = new ArrayParty();

        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nMushrooms";
        String actual = arrayParty.lastElement(breakfast);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void lastButOneTest() {
        //: Given
        ArrayParty arrayParty = new ArrayParty();
        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nTomatoes";
        String actual = arrayParty.lastButOne(breakfast);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseTest() {
        //: Given
        ArrayParty arrayParty = new ArrayParty();
        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nMushrooms\nTomatoes\n" +
                "Bacon\nBeans\nEggs\nSausage";
        String[] actualArray = arrayParty.reverse(breakfast);
        String actual = "*** Output ***";

        for (String s : actualArray) {
            actual += "\n" + s;
        }

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest(){

        ArrayParty arrayParty = new ArrayParty();

        String[] palindromic = {"Sausage", "Eggs", "Beans",
            "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans",
            "Bacon", "Tomatoes", "Mushrooms"};

        String expected = "*** Output ***\ntrue\nfalse";
        String actual = "*** Output ***";

        actual+="\n"+arrayParty.isPalindrome(palindromic)
               +"\n"+arrayParty.isPalindrome(breakfast);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void compressTest(){

        ArrayParty arrayParty = new ArrayParty();

        int[] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected = "*** Output ***\n1\n3\n2\n1\n4";
        int[] actualArray = arrayParty.compress(nums);
        String actual = "*** Output ***";
        for (Integer i : actualArray){
            actual+="\n"+i;
        }

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method packTest
    @Test
    public void packTest(){

        ArrayParty arrayParty = new ArrayParty();

        char[] letters = {'a', 'a', 'a', 'a',
                          'b',
                          'c', 'c',
                          'a', 'a',
                          'd',
                          'e', 'e', 'e', 'e'};
        String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee";
        String[] actualArray = arrayParty.pack(letters);
        String actual = "*** Output ***\n";

        for (String s : actualArray){
            actual+=s+", ";
        }
        actual = actual.substring(0,actual.length()-2);

        Assert.assertEquals(expected, actual);


    }


}
