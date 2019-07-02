enum Day{
            SUNDAY(0),MONDAY,TUESDAY,
            WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
        }
class Enum_Example
{
    Day day;
    Enum_Example(Day day)
    {
        this.day=day;
    }
    void output()
    {
        System.out.println(day);
        for(Day d:Day.values())
            System.out.println(d);
    }
    public static void main(String args[])
    {
        Enum_Example ee=new Enum_Example(Day.SUNDAY);
        ee.output();
    }
}
