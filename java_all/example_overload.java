class Method_OverloadEmp
{
    int empcd;
    String empnm;
    public Method_OverloadEmp()
    {
        empcd=1001;
        empnm="Suresh";
    }
    public Method_OverloadEmp(int ecd)
    {
        empcd=ecd;
    }
    public Method_OverloadEmp(int empcd, String empnm)
    {
        this.empcd=empcd;
        this.empnm=empnm;
    }
    void show_emp()
    {
        System.out.println("Employee Cod: "+empcd);
        System.out.println("Employee Name: "+empnm);
        System.out.println("");
    }
}
class Method_OverloadDept extends Method_OverloadEmp
{
    int deptcd;
    String deptnm,deptloc;
    public Method_OverloadDept()
    {
        deptcd=101;
        deptnm="EDP";
        deptloc="mumbai";
    }
    public Method_OverloadDept(String nm,String loc)
    {
        super(22);
        deptnm=nm;
        deptloc=loc;
    }
    public Method_OverloadDept(String deptloc,String deptnm,int deptcd)
    {
        super(12,"Sandeep");
        this.deptloc=deptloc;
        this.deptnm=deptnm;
        this.deptcd=deptcd;
    }
    void show_dept()
    {
        System.out.println("Department Code: "+deptcd);
        System.out.println("Department Name: "+deptnm);
        System.out.println("Department Location: "+deptloc);
        System.out.println("");
    }
    public static void main(String args[])
    {
        Method_OverloadDept dept1=new Method_OverloadDept();
        dept1.show_dept();
        dept1.show_emp();
        Method_OverloadDept dept2=new Method_OverloadDept("CSE","SCE");
        dept2.show_dept();
        //super.Method_OverloadEmp(22);
        dept2.show_emp();
        Method_OverloadDept dept3=new Method_OverloadDept("IT","ABC",007);
        dept3.show_dept();
        dept3.show_emp();
    }
}