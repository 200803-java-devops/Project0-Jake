package com.revature;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

//Used to test all calculator calculation methods for
//accuracy in method invocations. 

public class UnitTests 
{   
    @Test
    public void Integral1Test()
    {   Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.Integral1(3, 1, 2);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void Integral2Test()
    {   Calculator calc = new Calculator();
        double expected = 60;
        double actual = calc.Integral2(3, 2, 4);
        assertEquals(expected, actual, 0.5);
    }

    @Test
    public void Integral3Test()
    {   Calculator calc = new Calculator();
        double expected = 1;
        double actual = calc.Integral3(Math.exp(1), 1);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void Integral4Test()
    {   Calculator calc = new Calculator();
        double expected = (Math.exp(1)) - 1;
        double actual = calc.Integral4(0, 1);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void Integral5Test()
    {   Calculator calc = new Calculator();
        double expected = 2.89;
        double actual = calc.Integral5(2, 1, 2);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void Integral6Test()
    {   Calculator calc = new Calculator();
        double expected = 0.34;
        double actual = calc.Integral6(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral7Test()
    {   Calculator calc = new Calculator();
        double expected = 0.84;
        double actual = calc.Integral7(0, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral8Test()
    {   Calculator calc = new Calculator();
        double expected = 1.56;
        double actual = calc.Integral8(0, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral9Test()
    {   Calculator calc = new Calculator();
        double expected = 1.19;
        double actual = calc.Integral9(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral10Test()
    {   Calculator calc = new Calculator();
        double expected = 0.71;
        double actual = calc.Integral10(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral11Test()
    {   Calculator calc = new Calculator();
        double expected = 0.90;
        double actual = calc.Integral11(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral12Test()
    {   Calculator calc = new Calculator();
        double expected = 0.49;
        double actual = calc.Integral12(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral13Test()
    {   Calculator calc = new Calculator();
        double expected = 0.56;
        double actual = calc.Integral13(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral14Test()
    {   Calculator calc = new Calculator();
        double expected = 0.70;
        double actual = calc.Integral14(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral15Test()
    {   Calculator calc = new Calculator();
        double expected = 0.76;
        double actual = calc.Integral15(0.5, 1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral16Test()
    {   Calculator calc = new Calculator();
        double expected = 0.39;
        double actual = calc.Integral16(3, 1, 2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral17Test()
    {   Calculator calc = new Calculator();
        double expected = 0.089;
        double actual = calc.Integral17(3, 1, 2);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void Integral18Test()
    {   Calculator calc = new Calculator();
        double expected = 0.05;
        double actual = calc.Integral18(1, 4, 5);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral19Test()
    {   Calculator calc = new Calculator();
        double expected = -0.041;
        double actual = calc.Integral19(5, 10, 15);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void Integral20Test()
    {   Calculator calc = new Calculator();
        double expected = 0.041;
        double actual = calc.Integral20(5, 10, 15);
        assertEquals(expected, actual, 0.01);
    }


    @Test
    public void formRootA2plusX2Test()
    {   Calculator calc = new Calculator();
        double expected = 5;
        double actual = calc.formRootA2PlusX2(3, 4);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void formRootA2minusX2Test()
    {   Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.formRootA2MinusX2(5, 4);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void formAPlusBTimesXTest()
    {   Calculator calc = new Calculator();
        double expected = 7;
        double actual = calc.formAPlusBTimesX(1, 2, 3);
        assertEquals(expected, actual, 0.1);
    }
    
    
    
    
    
    

    @Test
    public void invertTest()
    {   Calculator calc = new Calculator();
        double expected = -5;
        double actual = calc.invert(5);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void sqrt2Test()
    {   Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.sqrt2(9);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void pownTest()
    {   Calculator calc = new Calculator();
        double expected = 27;
        double actual = calc.pown(3, 3);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void pow2Test()
    {   Calculator calc = new Calculator();
        double expected = 16;
        double actual = calc.pow2(4);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void sinTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.sin2(0);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void cosTest()
    {   Calculator calc = new Calculator();
        double expected = 1;
        double actual = calc.cos2(0);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void tanTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.tan2(0);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void asinTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.asin2(0);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void acosTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.acos2(1);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void atanTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.atan2(0);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void asecTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.asec2(1);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void log2()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.log2(1);
        assertEquals(expected, actual, 0.1);
    }
}