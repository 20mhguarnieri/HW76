
public abstract class  Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected int ID;
    protected boolean atWork;
    protected int offDays;
    protected boolean fulltime;

    public Employee(String eName, String eAddress, String ePhone, String job,
                    String socSecNumber, boolean fullOrPart)
    {
        super(eName,eAddress,ePhone,job);   //1000-9999
        socialSecurityNumber = socSecNumber; //0-9000 +1000
        int ID = (int)(Math.random()*9000)+1000;
        atWork = false;
        offDays = 20;
        fulltime = fullOrPart;
    }   
    
    public String toString()
    {
        String result = super.toString();
        result += "\nSocial Security Number: "+socialSecurityNumber;
        result+= "\nEmployee ID number: "+ID;
        return result;
    }
    
    public void clockIn()
    {
        atWork = true;
    }   
    
    public void clockOut()
    {
        atWork = false;
    }   
    
    public void takeDayOff()
    {
        if(offDays == 0)
            System.out.println("Sorry, "+name+ " is out of sick days");
        else
            System.out.println("Have a good day off, "+name+"."); 
    }   
    
    public void addHours(int hours)
    {
        if(fulltime == false)
        {
            hoursWorked += hours;
            if(hoursWorked > 30)
            {
                hoursWorked = 30;
                System.out.println("Part time employee can't work more than 30 hours");
            }    
        }
        else
            hoursWorked += hours;
    } 
   
    public void hireFullTime()
    {
        fulltime = true;
    }
    public void hirePartTime()
    {
        fulltime = false;
    }
    public void changeJobTitle(String newTitle)
    {
        jobTitle = newTitle;
    }
}
