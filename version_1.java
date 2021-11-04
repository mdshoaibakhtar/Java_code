/*//LoveBabbar Question 1
package code.master;
import java.util.Scanner;
public class version_1
{
    static void traversal(int []arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void rotate(int []arr,int size)
    {
        int temp,start=0,end=size-1;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Size Of The Array");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        traversal(arr,size);
        System.out.println("");
        rotate(arr,size);
        traversal(arr,size);
    }
}
//LoveBabbar Question 2
package code.master;
import java.util.Scanner;
public class version_1
{
    static void traversal(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }


    static void check_min(int arr[],int n)
    {
        int min=0;
        for (int i=1;i<n;i++)
        {

            if(arr[i-1] <= arr[i])
            {
//                System.out.println(arr[i] +" is smaller than "+arr[0]);
                min = arr[i-1];

            }
            else{
//                System.out.println(arr[i]+" is greater than "+arr[0]);
                min = arr[i];
            }
        }
        System.out.println(min+" is the minimum in the array");
    }

    static void check_max(int arr[],int n)
    {
        int max=0;
        for (int i=1;i<n;i++)
        {

            if(arr[i-1] >= arr[i])
            {
//                System.out.println(arr[i] +" is smaller than "+arr[0]);
                max = arr[i-1];

            }
            else{
//                System.out.println(arr[i]+" is greater than "+arr[0]);
                max= arr[i];
            }
        }
        System.out.println(max + " is te maximum in the array");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //             0, 1. 2, 3, 4, 5, 6
        int arr[]  = {10,20,30,40,05,02,100,0001,20000000,-1};
        int n = arr.length;
        traversal(arr,n);
        System.out.println("");
        check_min(arr,n);
        check_max(arr,n);
    }
}

package code.master;
import java.util.Arrays;

public class version_1
{
    static void traversal(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static void sort(int arr[],int n,int k)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
//                   Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            System.out.println("The kth Maximum Element is "+arr[k-1]);
    }
    public static void main(String [] args)
    {
        //           0 ,1,2,3
        int arr[] = {11,21,3,40,00002,10000,-7};
        int n = arr.length;
        int k = 2;
        System.out.println("Unsorted Array:");
        traversal(arr,n);
        System.out.println("\nsorted Array:");
        sort(arr,n,k);
        traversal(arr,n);

    }
}


package code.master;
import java.util.Arrays;
public class version_1
{
    static void traversal(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String [] args)
    {
        int [][] arr = {{10,20,30},
                        {40,50,60}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[i][j]);
//                arr[i][j];
            }
        }

    }
}
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


package code.master;
public class version_1
{
    static  void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void separate(int arr[],int n)
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                zero++;
            }
            if(arr[i] == 1)
            {
                one++;
            }
            else if(arr[i] == 2)
            {
               two++;
            }
        }
        System.out.println("\nNumber of Zero is "+zero);
        System.out.println("Number of One is "+one);
        System.out.println("Number of two is "+two);

        for(int z = 0;z<zero;z++)
        {
            System.out.print(0);
            System.out.print(" ");
        }
        for(int o = 0;o<one;o++)
        {
            System.out.print(1);
            System.out.print(" ");
        }
        for(int t = 0;t<two;t++)
        {
            System.out.print(2);
            System.out.print(" ");
        }
    }
    public static void main(String[] args)
    {
        int []arr={1,2,1,0,1,2};
        int n = arr.length;
        traversal(arr,n);
        System.out.println();
        separate(arr,n);

    }
}
package code.master;
public class version_1
{
    static  void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void separate_negative(int arr[],int n)
    {
        int negative = 0;
        int positive = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < 0)
            {
                negative++;
                System.out.print(arr[i]);
                System.out.print(" ");
            }
//            else
//            {
//                positive++;
//                System.out.println(arr[i]+" is positive");
//            }

//            System.out.print("\n"+negative);
//            System.out.println(positive);
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                negative++;
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }
//        System.out.println(positive);
//        System.out.print("Number of Negative Is "+negative);
//        System.out.println(" ");
//        System.out.print("Number Of Positive Is "+positive);

//        for(int p = 0;p<negative;p++)
//        {
//            System.out.println(negative);
//        }
//        for(int p = 0;p<positive;p++)
//        {
//            System.out.println(positive);
//        }
    }
    public static void main(String[] args)
    {
        int []arr={-1,2,1,1,-2};
        int n = arr.length;
        traversal(arr,n);
        System.out.println();
        separate_negative(arr,n);

    }
}*/


package code.master;
public class version_1
{
    static  void traversal(int arr[],int brr[],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for(int i=0;i<m;i++)
        {
            System.out.print(brr[i]);
            System.out.print(" ");
        }
    }

    static void union(int arr[],int brr[],int crr[],int n,int m)
    {
        if(n > m)
        {
        System.out.println("n badaa hai");
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i] == brr[j])
                {
                    count++;
                }
            }
        }
        int res = count + (n-m);
        System.out.println(res);
        }
        else
        {
            System.out.println("m badaa hai");
            int count = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(arr[i] == brr[j])
                    {
                        count++;
                        System.out.print(brr[j]);
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
            int res = count + (m-n);
            System.out.println(res);
        }
    }
    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5,10,45};
        int []brr={45,50,111,4547,7,1,2,3,4,5,10};
        int n = arr.length;
        int m = brr.length;
        int []crr=new int[m+n];
        traversal(arr,brr,n,m);
        System.out.println();
        union(arr,brr,crr,n,m);

    }
}












