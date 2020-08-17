package com.revature;

public class UnitTests 
{   
    @Test
    public static void Integral1Test()
    {   Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.Integral1(3, 1, 2);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void Integral2Test()
    {   Calculator calc = new Calculator();
        double expected = 60;
        double actual = calc.Integral2(3, 2, 4);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void Integral3Test()
    {   Calculator calc = new Calculator();
        double expected = 1;
        double actual = calc.Integral3(Math.exp(1), 1);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void Integral4Test()
    {   Calculator calc = new Calculator();
        double expected = (Math.exp(1)) - 1;
        double actual = calc.Integral4(0, 1);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void Integral5Test()
    {   Calculator calc = new Calculator();
        double expected = (Math.exp(1)) - 1;
        double actual = calc.Integral5(Math.exp(1), 0, 1);
        Tester.assertEquals(expected, actual);
    }
    




    @Test
    public static void formRootA2plusX2Test()
    {   Calculator calc = new Calculator();
        double expected = 5;
        double actual = calc.formRootA2PlusX2(3, 4);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void formRootA2minusX2Test()
    {   Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.formRootA2MinusX2(5, 4);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void formAPlusBTimesXTest()
    {   Calculator calc = new Calculator();
        double expected = 7;
        double actual = calc.formAPlusBTimesX(1, 2, 3);
        Tester.assertEquals(expected, actual);
    }
    
    
    
    
    
    

    @Test
    public static void invertTest()
    {   Calculator calc = new Calculator();
        double expected = -5;
        double actual = calc.invert(5);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void sqrt2Test()
    {   Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.sqrt2(9);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void pownTest()
    {   Calculator calc = new Calculator();
        double expected = 27;
        double actual = calc.pown(3, 3);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void pow2Test()
    {   Calculator calc = new Calculator();
        double expected = 16;
        double actual = calc.pow2(4);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void sinTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.sin2(0);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void cosTest()
    {   Calculator calc = new Calculator();
        double expected = 1;
        double actual = calc.cos2(0);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void tanTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.tan2(0);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void asinTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.asin2(0);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void acosTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.acos2(1);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void atanTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.atan2(0);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void asecTest()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.asec2(1);
        Tester.assertEquals(expected, actual);
    }

    @Test
    public static void log2()
    {   Calculator calc = new Calculator();
        double expected = 0;
        double actual = calc.log2(1);
        Tester.assertEquals(expected, actual);
    }
}