public class BS_SwapCount 
{
    public static void main(String[] args) 
    {
        int arr[]={4,3,5,1};
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                      count++;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSwap:"+count);
    }
}    

