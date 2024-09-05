package NameFormat;

import java.util.Scanner; 

public class NameFormat {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    String input = scnr.nextLine();
    String[] data = input.split(" ");
    System.out.print(data[data.length -1] + ", ");

    scnr.close();
    }
}
