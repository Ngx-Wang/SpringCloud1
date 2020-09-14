package com.atguigu;

import org.junit.Test;

public class Test01 {


    @Test
    public void m1(){
        int [] arr={20,48,3,41,20,47,75,1,15,30};

        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int tmp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=tmp;
        }
        for (int tmp: arr) {
            System.out.print(tmp+"  ");
        }
    }




}
