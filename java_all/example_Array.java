class ArrayFeatures
{
    /*int arry[][]={
        {2,4,6,8},
        {1,3,5,7},
        {1,2,3,5}
    };*/
    int arry[]={2,4,6,8};
    void output()
    {
        System.out.print("Even Numbers: ");
        for(int i : arry)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        ArrayFeatures arr=new ArrayFeatures();
        arr.output();
    }
}