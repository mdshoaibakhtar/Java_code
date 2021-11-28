/*
//Oops starting
package code.master;
class employee //custom class
{
    int id;
    int sal;
    String name;
    public void printdetails()
    {
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
        System.out.println("my sal is " +sal);
    }
    public int getsalary()
    {
        return sal;
    }

}
public class version_1
{
    public static void main(String[] args)
    {
        System.out.println("This is our custom class");
        //setting attributes
        employee sc = new employee();                //instantiating a nw object
        sc.id = 111;
        sc.name = "md shoaib";
        sc.sal = 48115999;
        employee st = new employee();               //instantiating a nw object
        st.id = 222;
        st.name = "Tanuja";
        st.sal = 48115999;
//        System.out.println(sc.id);
//        System.out.println(sc.name);
//        System.out.println(sc.sal);
//        System.out.println(" ");
//        System.out.println(st.id);
//        System.out.println(st.name);
//        System.out.println(st.sal);

        sc.printdetails();
//        st.printdetails();
//        harry.printdetails();
//        john.printdetails();
//        int sal = john.getsalary();
        System.out.println(sc.sal);


    }
}

//Q.1
package code.master;
class day
{
    public void display()
    {
        System.out.println("Welcome To the Display Method In Class Day");
    }
}
public class version_1
{
    public static void main(String[] args)
    {
        day sc = new day();
        sc.display();

    }
}
//Q.2
package code.master;

class Day
{
    public void display()
    {
        System.out.println("Welcome To the Display Of Day");

    }

}
class Night
{
    public void display()
    {
        System.out.println("Welcome To the Display Of Night");

    }

}
public class version_1
{
    public static void main(String[] args)
    {
        Day sc = new Day();
        Night st = new Night();
        sc.display();
        st.display();

    }
}


//Q.3
package code.master;
class circle
{
    int area;
    public int setRadius(int rad)
    {
        System.out.println("Radius Of The circle is "+rad);
        return rad;
    }
    public int calArea(int rad)
    {
        double area = Math.PI * (rad * rad);
        System.out.println("Area Of The Circle is "+area);
        return (int) area;
    }
}
public class version_1
{
    public static void main(String[] args)
    {
        circle sc = new circle();
        sc.calArea(2);
    }
}


//Q.4
package code.master;
class salesTaxCalculator
{
    int amount,taxRate;
    public int calTax(int amount)
    {
        return amount;
    }
    public int setAmrate(int taxRate)
    {
        return taxRate;
    }
}
public class version_1
{
    public static void main(String[] args)
    {
        salesTaxCalculator sc = new salesTaxCalculator();

        System.out.println("Amount Will Be "+sc.calTax(1000));
        System.out.println("Taxrate wil be "+sc.setAmrate(2000));

    }
}
//Q.5
package code.master;
class Num
{
    int x,y,temp;
    public void swap(int x,int y)
    {
        System.out.println("Before Swap:"+x+" "+y);
        temp = x;
        x = y;
          y = temp;
        System.out.println("After Swap:"+x+" "+y);
    }
}
public class version_1
{
    public static void main(String[] args)
    {
        Num sc = new Num();
        sc.swap(10,20);
    }
}

//Overloaded
package code.master;
public class version_1
{
    static void foo()
    {
        System.out.println("This Is Foo Without Any Argument");
    }

    static void foo(int a,int b)
    {
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        foo();
        foo(5,3);
    }
}


package code.master;
class employee
{
    int salary;
    String name;

    public void setSalary(int n)
    {
        salary = n;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setName(String newname)
    {
        name = newname;
    }
    public String getName()
    {
        return name;
    }

}
public class version_1
{
    public static void main(String[] args)
    {
        employee sc = new employee();
        sc.setSalary(100);
        sc.setName("mdshoaib");
        System.out.println(sc.getSalary());
        System.out.println(sc.getName());
    }
}

package code.master;

import java.util.Random;

public class version_1
{
    public static void main(String[] args)
    {
        Random ran = new Random();
        int number = ran.nextInt(4);
        System.out.println(number);
    }
}

//Q.8
package code.master;
public class version_1
{
    static int max(int a,int b)
    {

        return Math.max(a,b);
    }
    static float max(double x, double y)
    {
        return (float) Math.max(x,y);
    }
    public static void main(String[] args)
    {
       int maximum =  max(10,20);
       float maximumm = max(10.2,20.2);
        System.out.println(maximum + " is The maximum");
        System.out.println(maximumm + " is The maximum");

    }
}

//Q.9
package code.master;
class Shape
{
    //Sphere
    public int calculateVolume(int r)
    {
      int volume = (int) ((4/3) * Math.PI * (r*r*r));
        System.out.println("Volume Of The Sphere is "+volume);
      return volume;
    }
    //Cone
    public int calculateVolume(int r,int h)
    {
       int volume =(int) (Math.PI *(r*r)*(h/3));
        System.out.println("Volume Of The Cone Is "+volume);
       return volume;
    }
//    //Box
    public int calculateVolume(int length,int height,int breadth)
    {
      int volume = length * height * breadth;
        System.out.println("volume Of The box is "+volume);
      return volume;
    }

}
public class version_1
{
    public static void main(String[] args)
    {
        Shape sc = new Shape();
        sc.calculateVolume(2);
        sc.calculateVolume(2,3);
        sc.calculateVolume(2,2,2);


    }
}



//Q.10
package code.master;
class Fact
{
    static int factorial(int n)
    {
        if(n == 0 )
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }

    }
}
public class version_1
{
    public static void main(String[] args)
    {
        Fact sc = new Fact();
        int n=5;
        System.out.println(sc.factorial(n)+" is The factorial of "+n);


    }
}
//Q.7
package code.master;
import java.util.Date;
public class version_1
{

    static Date date_time()
    {
        Date curr = new Date();
//        System.out.println(curr);
        return curr;
    }
    public static void main(String[] args)
    {
        System.out.println("The Current date And Time is "+date_time());
    }
}


package code.master;
import java.util.Scanner;
public class version_1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value OF T");
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
        System.out.println("enter The VAlue Of X,Y,A,B,K");
        int []arr= new int[10];
        for(int i=1;i<=5;i++)
        {
            arr[i] = sc.nextInt();
        }
        int X = arr[1];
        int Y = arr[2];
        int A = arr[3];
        int B = arr[4];
        int K = arr[5];
        if(X+K*A < Y+K*B)
        {
            System.out.println("Petrol");
        }
        if(X+K*A > Y+K*B)
        {
            System.out.println("Diesel");
        }
        else{
            System.out.println("Same Price");
        }
    }
    }
}
package code.master;
import java.util.Scanner;
public class version_1
{
    public static  void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value OF T");
        int T = sc.nextInt();
        for(int j = 0;j<T;j++)
        {
        System.out.println("Enter The VAlue Of X and Y");
        int []arr= new int[5];
        for(int i=1;i<=2;i++)
        {
            arr[i] = sc.nextInt();
        }
        int X = arr[1];
        int Y = arr[2];

        int res1 = X*1;
        int res2 = X*2;
        if((res1+res2) % 2 == 0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
        }
    }
}*/
/*
package code.master;
public class version_1
{
    public static void main(String[] args)
    {
        System.out.println("it's a multidimensional array");
        int [][]flats = {{1,2,3},
                         {4,5,6}};
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//Find The Number Of N Digits which is divisible by 3 but not with 9 ?
package code.master;

import java.util.Scanner;

public class version_1
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                System.out.println(i);
                if(i==1 || i==n)
                {
                    System.out.print(3);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();

    }
}

package code.master;
import java.util.Scanner;
public class version_1
{
    public static void main(String [] args0)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbr of Dost And Slices");
        int n= sc.nextInt();
        int k= sc.nextInt();

        for(int x = 1;x<100;x++)
        {
            int p = (k * x ) % n;
            if( p == 0)
            {
                System.out.println(p);
                System.out.println(x);
                break;
            }
        }
    }
}*/

package code.master;
import java.util.Scanner;
public class version_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int s = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            float sum = ((((float)s)/100)*c)+s;
            System.out.println(sum);
            if(a <= sum && sum <=b)
            {
                System.out.println(sum);
                System.out.println("yes");
            }
            else
            {
                System.out.println(sum);
                System.out.println("No");
            }
        }
    }
}










