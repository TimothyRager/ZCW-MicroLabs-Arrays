package io.zipcoder.microlabs.arrays;

import java.io.InputStream;
import java.util.Arrays;
import java.util.ArrayList;

//import java.util.stream.IntStream;
import java.util.stream.*;

public class ArrayParty {

    public String printArray(String[] inputArray) {
        String returnMe = "*** Output ***";
        for (String s : inputArray) {
            returnMe += "\n" + s;
        }

        return returnMe;

    }

    public String lastElement(String[] inputArray) {
        return "*** Output ***\n" + inputArray[inputArray.length - 1];
    }

    public String lastButOne(String[] inputArray) {
        return "*** Output ***\n" + inputArray[inputArray.length - 2];
    }


    public String[] reverse(String[] inputArray) {

        String[] intermediate = new String[inputArray.length];
        int j = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            intermediate[j] = inputArray[i];
            j++;
        }

        return (intermediate);

    }

    public boolean isPalindrome(String[] inputArray){

    int j=inputArray.length-1;
    for (int i=0; i<=j; i++){
        if (!inputArray[i].equals(inputArray[j]))
        {
            return false;
        }
        j--;
    }
    return true;

}

    public int[] compress(int[] inputArray){

        int nonRepeat=1;

        for (int i=1; i<inputArray.length; i++)
        {
            if (inputArray[i]!=inputArray[i-1])
            {
                nonRepeat++;
            }
        }

        int[] returnMe = new int[nonRepeat];

        nonRepeat=1;
        returnMe[0]=inputArray[0];
        for (int i=1; i<inputArray.length; i++)
        {
            if (inputArray[i]!=inputArray[i-1])
            {
                returnMe[nonRepeat]=inputArray[i];
                nonRepeat++;
            }
        }


        return (returnMe);
    }

    public String[] pack(char[] inputArray){

        char toPack=inputArray[0];
        int neededReturnIndexes=1;
        for (int i=1; i<inputArray.length; i++)
        {
            if (inputArray[i]!=toPack)
            {
                neededReturnIndexes++;
                toPack=inputArray[i];
            }
        }

        String[] returnMe = new String[neededReturnIndexes];

        for (int i=0; i<returnMe.length; i++){
            returnMe[i]="";
        }

        toPack=inputArray[0];
        int rmIterator=0;
        returnMe[rmIterator]+=toPack;
        for (int i=1; i<inputArray.length; i++)
        {
            if (inputArray[i]==toPack)
            {
                returnMe[rmIterator]+=toPack;
                continue;
            }
            toPack=inputArray[i];
            rmIterator++;
            returnMe[rmIterator]+=toPack;
        }


        return (returnMe);
    }


}

