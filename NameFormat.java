package NameFormat;

import java.util.Scanner; 

public class NameFormat {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    String input = scnr.nextLine();
    String[] data = input.split(" ");
    System.out.print(data[data.length -1] + ", ");

    for(int i = 0; i < data.length; i++) {
        if(i != data.length -1){
            System.out.print(data[i].charAt(0) + ".");;
        }
    }
    System.out.println();
    scnr.close();
    }
}
