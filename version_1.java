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
}*/
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

















