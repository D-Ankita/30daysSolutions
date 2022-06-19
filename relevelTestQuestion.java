// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    static boolean arraySortedOrNot(int arr[] )
    {
        int n = arr.length;
        // Array has one or no element
        if (n == 0 || n == 1)
            return true;
 
        for (int i = 1; i < n; i++)
 
            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;
 
        // No unsorted pair found
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,0,0,1,1,1,0,0,1,0,1,0,1};
        int[] ar2 = new int[] {1,0,0,1,1,1,0,0,1,0,1,0,1};
        int count = 0;
        System.out.print(count + ":   ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        while(!arraySortedOrNot(arr))
        {
            count++;
            
            for(int i = arr.length -1 ;i>0;i--)
            {
                if(arr[i] < arr[i-1])
                {
                    // int temp = arr[i];
                    arr[i] =1;
                    arr[i-1] = 0;
                }
            }
            System.out.print(count + ":   ");
            for(int i = 0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    
        }
        System.out.println("SORTTED!");
        System.out.println("---------------------------");
        int c0=0;
        int c1 =0;
        int frst = 0;
        for(int i = ar2.length -1 ;i>=0;i--)
        {
            if(ar2[i] == 0) c0++;
            else frst = i;
        }
        c1 = ar2.length - c0;
        System.out.println(c0-frst);
    }
}


/*
OUTPUTS:
java -cp /tmp/6AbiMYeMaY HelloWorld
0:   0 1 0 0 1 0 1 0 
1:   0 0 1 0 0 1 0 1 
2:   0 0 0 1 0 0 1 1 
3:   0 0 0 0 1 0 1 1 
4:   0 0 0 0 0 1 1 1 
SORTTED!
---------------------------
4



0:   0 0 0 0 1 0 1 0 1 
1:   0 0 0 0 0 1 0 1 1 
2:   0 0 0 0 0 0 1 1 1 
SORTTED!
---------------------------
2

java -cp /tmp/6AbiMYeMaY HelloWorld
0:   1 0 0 1 1 1 0 0 1 0 1 0 1 
1:   0 1 0 0 1 1 1 0 0 1 0 1 1 
2:   0 0 1 0 0 1 1 1 0 0 1 1 1 
3:   0 0 0 1 0 0 1 1 1 0 1 1 1 
4:   0 0 0 0 1 0 0 1 1 1 1 1 1 
5:   0 0 0 0 0 1 0 1 1 1 1 1 1 
6:   0 0 0 0 0 0 1 1 1 1 1 1 1 
SORTTED!
---------------------------
6

*/


        
