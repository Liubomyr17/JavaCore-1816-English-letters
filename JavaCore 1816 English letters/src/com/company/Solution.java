package com.company;

/*
1816 English letters
In the main method, the first parameter is the name of the file.
Count the number of letters of the English alphabet that is in this file.
Display the number (number of letters) on the screen.
Close streams.

Requirements:
1. You do not need to read anything from the console.
2. Create a read stream from the file, which comes as the first parameter in main.
3. In the file, you need to count the letters of the English alphabet and display this number in the console.
4. Take into account uppercase and lowercase letters.
5. The stream of reading from the file should be closed.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetH = alphabetL.toUpperCase();

        FileReader f = new FileReader(args[0]);

        int count = 0;
        while (f.ready()) {
            char s = (char) f.read();
            if ((alphabetL.indexOf(s) > -1) || alphabetH.indexOf(s) > -1)
                count++;
        }
        f.close();

        System.out.println(count);

    }
}


