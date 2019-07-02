class Multi_NestedClass_OuterClass
{
    int x=1;
    class Multi_NestedClass_InnerClass
    {
        int y=2;
        class Multi_NestedClass_InnerMostClass
        {
            int z=3;
            void anony()
            {
                System.out.println("Anonymous Created!!");
            }
        }
    }
    void output()
    {
        Multi_NestedClass_OuterClass.Multi_NestedClass_InnerClass.Multi_NestedClass_InnerMostClass obj_imi=new Multi_NestedClass_OuterClass().new Multi_NestedClass_InnerClass().new Multi_NestedClass_InnerMostClass();
        System.out.println("Z: "+obj_imi.z);
    }
    public static void main(String args[])
    {
        Multi_NestedClass_OuterClass obj_o=new Multi_NestedClass_OuterClass();
        Multi_NestedClass_OuterClass.Multi_NestedClass_InnerClass obj_i=new Multi_NestedClass_OuterClass().new Multi_NestedClass_InnerClass();
        Multi_NestedClass_OuterClass.Multi_NestedClass_InnerClass.Multi_NestedClass_InnerMostClass obj_im=new Multi_NestedClass_OuterClass().new Multi_NestedClass_InnerClass().new Multi_NestedClass_InnerMostClass();
        System.out.println("X: "+obj_o.x);
        System.out.println("Y: "+obj_i.y);
        obj_o.output();
        //System.out.println("Z: "+obj_im.z);
        new Multi_NestedClass_OuterClass().new Multi_NestedClass_InnerClass().new Multi_NestedClass_InnerMostClass().anony();
    }
}