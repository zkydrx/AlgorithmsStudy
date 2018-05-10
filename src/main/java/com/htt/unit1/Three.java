package com.htt.unit1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-05-10
 * Time: 21:58:31
 * Description:
 */
public class Three
{
    public static int rank(int k ,int[] a)
    {
        //数组必须是有序的
        int lo =0;
        int hi = a.length-1;


        while (lo <= hi)
        {
            //被查找的键，要么不存在，要么存在于a[lo..hi]中
            int mid = lo+(hi-lo)/2;
            if(k < a[mid])
            {
                hi =mid-1;
            }
            else if (k > a[mid])
            {
                lo = mid+1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
}
