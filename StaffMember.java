
public abstract class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;
    protected String jobTitle;
    protected int hoursWorked;
    
    public StaffMember(String eName, String eAddress, String ePhone,
                            String ejob)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
        jobTitle = ejob;
        hoursWorked = 0;
    }   
    
    public String toString()
    {
        String result = "Name: "+name+"\n";
        result+="Address: "+address+"\n";
        result+="Phone: "+phone;
        return result;
    }   
    
    public void addHours(int hours)
    {
        hoursWorked = hours;
    }    
    
    //public abstract double pay();
    
    public void changeAddress(String newAddress)
    {
       address = newAddress; 
    }   
    public void changePhoneNum(String newPhoneNum)
    {
       phone = newPhoneNum; 
    }   
}