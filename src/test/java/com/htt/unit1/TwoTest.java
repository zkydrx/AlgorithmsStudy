package com.htt.unit1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-25
 * Time: 09:25:10
 * Description:
 */
class TwoTest
{

    @BeforeEach
    void setUp()
    {
        System.out.println("String...");
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("Ending...");
    }

    @Test
    void rank()
    {
        int [] nums = {1,2,3,4,5,6,7,8};
        int rank = Two.rank(5, nums);

        System.out.println(rank);
    }

    @Test
    void rank1()
    {
    }
}