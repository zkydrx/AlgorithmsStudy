package com.htt.unit1;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-23
 * Time: 20:39:55
 * Description:
 *
 * 计算两个非负整数p 和q 的最大公约数：若
 * q 是0，则最大公约数为p。否则，将p 除以
 * q 得到余数r，p 和q 的最大公约数即为q 和
 * r 的最大公约数。
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
