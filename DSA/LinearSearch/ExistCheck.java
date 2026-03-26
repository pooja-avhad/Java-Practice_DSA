public class ExistCheck 
{
    public static void main(String[] args) 
    {
        int arr[]={10,20,30};
        int key=25;  
        boolean found=false;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                found=true;
                break;
            }
                
         }
            if(found==true)
            {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
     }

