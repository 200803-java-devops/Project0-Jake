package com.revature;

import java.lang.reflect.Method; 

public class Tester 
{   public static void main(String[] args) throws Exception 
    {   System.out.println("Running Tests...");
        int passed = 0, failed = 0;

        for (Method m : Class.forName(args[0]).getMethods())
        {   if (m.isAnnotationPresent(Test.class))
            {   try 
                {   m.invoke(null);
                    passed++;
                }   catch (Throwable ex)
                    {   System.err.printf("Test %s failed: %s %n", m, ex.getCause());
                        failed++;
                    }
            }
        }

        System.err.printf("Passed: %d, Failed %d %n", passed, failed);
    }

    public static void assertEquals(double expected, double actual)
    {   if (expected == actual) {   System.out.println("Test Passed");  }
        else                    {   System.out.println("Test Failed");  }
    }
}