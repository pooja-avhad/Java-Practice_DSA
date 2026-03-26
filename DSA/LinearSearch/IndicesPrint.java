public class IndicesPrint
{
    public static void main(String[] args) 
    {
        int arr[]={10,20,10,30,10};
        int key=10;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
              System.out.print(i+" ");
            }
        }
    }
}