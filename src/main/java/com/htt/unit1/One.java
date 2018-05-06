package com.htt.unit1;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-23
 * Time: 20:39:55
 * Description:
 */
public class One
{

    public static int gcd(int p, int q)
    {
        if (q == 0)
        {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
