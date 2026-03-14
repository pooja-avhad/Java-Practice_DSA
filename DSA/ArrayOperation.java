public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,};
        int sum=0;
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];

            if(arr[i]> max)
            {
               max=arr[1];
            }

            if(arr[i]< min)
             {
                min=arr[i];
            }
        }
        System.out.println("Length:"+ arr.length);
        System.out.println("Sum:"+sum);
        System.out.println("Largest:"+ max);
        System.out.println("Smallest:"+ min);

    }
}
