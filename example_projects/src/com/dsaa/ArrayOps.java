package com.dsaa;

public class ArrayOps {
    public void createAndLogIntArray(int[] input){
        for(int i = 0; i < input.length; i++){
            input[i] = i+1;
        }
        if(null != input && input.length > 0){
            //Logging data to console
            for(int i=0; i < input.length; i++){
                System.out.println("Value of array element "+ i +" is : "+ input[i]);
            }
        }
    }
}
