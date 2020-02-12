
public class Hourly extends Employee
{
    public Hourly(String eName, String eAddress, String ePhone, String job,
                    String socSecNumber, boolean fullOrPart)
    {
        super(eName,eAddress,ePhone, job, socSecNumber,fullOrPart);
    }   
    
    public Hourly(Salary swap)
    {
        
    }   
    
    public double pay()
    {
        double payment = getPayRate() * hoursWorked;
        hoursWorked = 0;
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        result+="\nCurrent Hours: "+hoursWorked;
        return result;
    }       
}
