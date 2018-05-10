package com.htt.unit1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-05-10
 * Time: 22:03:46
 * Description:
 */
class ThreeTest
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
        int [] a= {1,2,3,4,5,6};
        int rank = Three.rank(3, a);

        System.out.println(rank);
    }
}