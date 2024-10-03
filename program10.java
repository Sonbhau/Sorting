import java.util.*;

class program10
{   public static void printArray(int arr[])
    {
       for(int i = 0 ; i<arr.length;i++)
       {
        System.out.print(arr[i]+"\t");
       }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int iSize = sc.nextInt();
        int arr[] = new int[iSize];
        for(int iCnt = 0 ; iCnt<iSize;iCnt++)
        {
            arr[iCnt] = sc.nextInt();
        }

        for(int i = 0 ; i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j]
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}