package com.epam.leecode150.ArrayString;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        //Output: [1,2,2,3,5,6]
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while (i>=0 && j>=0){
            if(num1[i]>=num2[j]){
                num1[k--]=num1[i--];
            }else {
                num1[k--]=num2[j--];
            }
        }

        while (j>=0){
            num1[k--]=num2[j--];
        }
    }
}
