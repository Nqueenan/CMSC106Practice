public class arraypractice 
{
    private int[] arr ; // just declaring the array of integers called arr
    private int[] arr3 ;

    public arraypractice() // constructor
    {
        // initializing the array of integers I declared above. this CANT just go in the body of the class
        arr = new int[4] ; 
        // putting values into the array
        arr[0] = 1 ;
        arr[1] = 5 ;

        arr3 = new int[2] ;
    }

    // can also fill the array in a method after its initialized in a constructor:
    public void fillArr3()
    {
        for (int i=0 ; i < arr3.length ; i++)
        {
            arr3[i] = i * 10 ;
        }
    }




    public static void main (String [] args)
    {
        // just making a local array, for when I don't need outside of this
        int[] arr2 ;
        arr2 = new int[5] ;
    }
}