public class Array
{
    // The array types are all the types we know (int, short, etc...)
    // Can also have arrays of objects or enums 

    int[] integerArray ; // declaring array
    String[] stringArray = {"hi", "bye"} ; // declaring and initializing in same step
    double[] doubleArray = new double[2] ; // declaring and initializing in same step
    float[] floatArray ;

    Array object ;

    public Array ()
    {
        integerArray = new int[3] ; // initializing array. this array has 3 memory blocks
        doubleArray[0] = 4.4 ; // giving a value, has to be done in constructor
        floatArray = new float[]{3.3f, 4.4f, 0.33f} ; // when giving values in constructor you still have to do new float[]

        
        
    }


    public static void main(String[] args) 
    {
        //System.out.println(integerArray.length) ; // This doesnt work because I need to either make array static or assign it to an object
        Array object = new Array() ; // making an object so i can get array values idk
        System.out.println(object.integerArray.length) ;
    }
}