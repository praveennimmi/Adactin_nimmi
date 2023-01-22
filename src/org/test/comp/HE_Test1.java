package org.test.comp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HE_Test1 {

	public static void main(String args[]) throws Exception {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine(); 
        String name1 = br.readLine();
        long a = Long.parseLong(name);
        long b=a*2;
        System.out.println(" "+b+ "\n"+name1);

	}

}
