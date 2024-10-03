import java.util.*;


class program11
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
        for(int i = 0  ; i<iSize;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ;i<arr.length-1;i++)
        {      int smallest = i;
            for(int j = i+1 ;j<arr.length;j++)
            {
                     if(arr[smallest]>arr[j])
                     {
                        smallest = j ;
                     }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    
    }
}