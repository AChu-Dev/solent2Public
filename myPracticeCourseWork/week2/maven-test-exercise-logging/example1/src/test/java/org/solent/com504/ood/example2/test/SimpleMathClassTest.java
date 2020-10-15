/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.ood.example2.test;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.solent.com504.ood.example2.SimpleMathClass;

/**
 *
 * @author cgallen
 */
public class SimpleMathClassTest {
    
    @Test
    public void testMain() {
        String[] args = {"add","1.5", "300"};
        SimpleMathClass.main(args);
    }

    @Test
    public void testAdd() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.add(1.5, 300);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }
    
    @Test
    public void testParseAdd() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        
        String[] args = {"add","1.5", "300"};
        double result = simpleMathClass.parseArguments(args);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }
    
    // add tests for subtract, multiply, divide
    @Test
    public void testSubtract() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        String[] args = {"subtract","1.5", "300"};
        double result = simpleMathClass.subtract(1.5, 300);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(-298.5, result, 0.00001);
    }

    @Test
    public void testMultiply() {
        try{
            SimpleMathClass simpleMathClass = new SimpleMathClass();
            double result = simpleMathClass.multiply(300, 2);

            Assert.assertEquals(600, result,0.00000);
    }
        catch (Exception e){
            System.out.println("Failed Test" + e);
        }
    }

    @Test
    public void testDivide() {
        try{
            SimpleMathClass simpleMathClass = new SimpleMathClass();
            double result = simpleMathClass.divide(300, 2);

            Assert.assertEquals(150, result,0.00001);
        }
        catch (Exception e){
            System.out.println("Failed Test" + e);
        }
    }

    @Test
    public void testMultiply2() {
        try{
            String[] args = {"divide","1.12312569878758757575885", "300"};
            SimpleMathClass simpleMathClass = new SimpleMathClass();
            double result = simpleMathClass.multiply(1.12312569878758757575885, 300);
        }
        catch (Exception e){
            System.out.println("Failed Test" + e);
        }
    }
}
