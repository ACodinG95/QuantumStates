package com.company;

public class Complex {

    private double a;
    private double b;

    public Complex()
    {

    }

    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getIm()
    {
        return this.b;
    }

    public double getRe()
    {
        return this.a;
    }

    public void setIm(double b)
    {
        this.b = b;
    }

    public void setRe(double a)
    {
        this.a = a;
    }

    public static void printZ(Complex Z)
    {
        if (Z.b >= 0)
        {
            System.out.println(Z.a + " + " + Z.b + "i");
        }
        if (Z.b < 0)
        {
            System.out.println(Z.a + " - " + -Z.b + "i");
        }
    }

    public String toString()
    {
        String ZString = new String();
        if (this.b >= 0)
        {
            ZString = this.a + " + " + this.b + "i";
        }
        if (this.b < 0)
        {
            ZString = this.a + " - " + -this.b + "i";
        }

        return ZString;
    }
/*
        public void print()
        {
            if (this.b >= 0)
            {
                Console.WriteLine(string.Format("{0} + {1}i", this.a, this.b));
            }
            if (this.b < 0)
            {
                Console.WriteLine(string.Format("{0} - {1}i", this.a, -this.b));
            }
        }*/

    public static Complex Add(Complex z1, Complex z2)
    {
        Complex Z = new Complex();
        Z.a = z1.a + z2.a;
        Z.b = z1.b + z2.b;
        return Z;
    }

    public static Complex Subtract(Complex z1, Complex z2)
    {
        Complex Z = new Complex();
        Z.a = z1.a - z2.a;
        Z.b = z1.b - z2.b;
        return Z;
    }

    public static Complex Minus(Complex z)
    {
        Complex Z = new Complex();
        Z.a = -z.a;
        Z.b = -z.b;
        return Z;
    }

    public static Complex Multiply(Complex z1, Complex z2)
    {
        Complex Z = new Complex();
        Z.a = (z1.a * z2.a) - (z1.b * z2.b);
        Z.b = (z1.a * z2.b) + (z1.b * z2.a);
        return Z;
    }

    public static Complex Multiply(double A, Complex z)
    {
        Complex Z = new Complex();
        Z.a = A * z.a;
        Z.b = A * z.b;
        return Z;
    }

    public double Modulus()
    {
        double abs = Math.sqrt((this.a * this.a + this.b * this.b));
        return (abs);
    }

    public double ModulusSq()
    {
        double abs =(this.a * this.a + this.b * this.b);
        return (abs);
    }

    public double Argument()
    {
        double theta = Math.atan(this.b / this.a);
        return (theta);
    }

    public Complex Conjugate()
    {
        var con = new Complex();
        con.a = this.a;
        con.b = -this.b;

        return con;
    }
/*
        public Complex Reciprocal()
        {
            var result = new Complex();
            result = this.Conjugate() / (this.Modulus() * this.Modulus());
            return result;
        }
 */


        public static Complex Pow(Complex Z, int n)
        {
            Complex result = new Complex(1,0);

            for(int i = 1; i<= n; i++)
            {
                result = Complex.Multiply(result,Z);
            }

            return result;
        }

    public static Boolean Equals(Complex z1, Complex z2)
    {
        if (z1.a == z2.a && z1.b == z2.b)
            return true;
        else
            return false;
    }

}
