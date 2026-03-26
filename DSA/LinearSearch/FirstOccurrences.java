public class FirstOccurrences 
{
    public static void main(String[] args) 
    {
        int arr[]={10,20,30};
        int key=10;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                System.out.println("First Occurrence at index: " +i);
                break;
            }
        }
    }
}
