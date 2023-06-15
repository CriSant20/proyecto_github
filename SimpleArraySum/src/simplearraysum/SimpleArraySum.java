/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplearraysum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += input.nextInt();
        }

        System.out.println(sum);
    }
}
