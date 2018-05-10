package com.htt.unit1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-25
 * Time: 08:58:27
 * Description:
 * 递归总有一个最简单的情况——方法的第一条语句总是一个包含return的条件语句。
 *
 * 递归调用总是去尝试解决一个规模更小的子问题，这样递归才能收敛到最简单的情况。在下
 * 面的代码中，第四个参数和第三个参数的差值一直在缩小。
 *
 * 递归调用的父问题和尝试解决的子问题之间不应该有交集。在下面的代码中，两个子问题各
 * 自操作的数组部分是不同的。
 *
 */
public class Two
{

    /**
     * 求出指定key在数组中的位置
     * {1,2,3,4,5,6,7,8} 给出key=6
     * 那么我们得到的int就是6在数组中的位置下标5.
     * 这是经典的递归加二分法的一个例子。
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key,int[] a)
    {
        return rank(key,a,0,a.length-1);
    }
    public static int rank(int key,int [] a,int lo,int hi)
    {
        Arrays.sort(a);
        //如果key存在于a[]中，他的索引不会小于lo,且不会大于hi
        if(lo>hi)
        {
            return -1;
        }
        int mid = lo+(hi-lo)/2;
        if(key < a[mid])
        {
            return rank(key,a,lo,mid-1);
        }
        else if(key > a[mid])
        {
            return rank(key,a,lo+1,hi);
        }
        else
        {
            return mid;
        }
    }
}
