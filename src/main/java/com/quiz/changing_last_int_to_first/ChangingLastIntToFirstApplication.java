package com.quiz.changing_last_int_to_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ChangingLastIntToFirstApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] a = new int[len];
        
        for (int i = 0; i < len; i++) {
            a[i] = scanner.nextInt();
        }
        
        int lastElement = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = lastElement;
        
        for (int num : a) {
            System.out.print(num + " ");
        }
		scanner.close();
	}

}
