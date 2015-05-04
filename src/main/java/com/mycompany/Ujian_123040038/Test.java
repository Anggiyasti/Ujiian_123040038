/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Ujian_123040038;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 *
 * @author SB 604-16
 */
public class Test {
    private static Soal s;
    
//    @Test
    public void test1() {
        assertSame("Harusnya", "6", s.perkalian(3, 2));
    }
    
    public void test2() {
        assertNotSame("Harusnya", "10", s.perkalian(1, 5));
    }
    
    public void test3() {
        assertNotSame("Test pangkat", s.pangkat(2, 2));
    }
    
    public void test4() {
        assertSame("Test pangkat", "4", s.pangkat(2, 2));
    }
    
    public void test5() {
        assertSame("Test faktorial", " ", s.faktorial(2));
    }
    
    public void test6() {
        assertSame("Test faktorial", " ", s.faktorial(3));
    }
}
