// Java program to demonstrate
// the printStackTrace(PrintStream s) Method.

import java.io.*;

    class Massiv {

            // Main Method
            public static void main(String[] args)
                    throws ArrayIndexOutOfBoundsException
            {
                try {

                    // create a array of Integers
                    int[] i = new int[2];

                    // try to add numbers to array
                    i[2] = 3;
                }
                catch (Throwable e) {

                    // print Stack Trace
                    e.printStackTrace(System.out);
                }
            }
        }



