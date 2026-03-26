public class LastOccurrence 
{
    public static void main(String args[])
    {
        int arr[]={10,20,10,30};
        int key=10;
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
         {
                lastIndex=i;
         }
        }
        if(lastIndex==-1)
        {
            System.out.println("Not Found");
        }
        else{
            System.out.println(" Last Occurrence at index " + lastIndex);
        }
  }
}
