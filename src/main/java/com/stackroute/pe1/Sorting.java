package com.stackroute.pe1;

public class Sorting {
    public boolean digitsorting(int num) {
        int i = 0;
        int temp;
        int sum = 0;
        int[] arr = new int[100];

        do {
            arr[i] = num % 10;
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
            num = num / 10;
            i++;
        }
        while (num != 0);

        for (int k = 0; k < i; k++) {
            for (int j = k + 1; j < i; j++) {
                if (arr[k] < arr[j]) {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (sum > 15)
        {
            return ("true");
        } else
            return ("false");
    }
}
