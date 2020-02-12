
public class Salary extends Employee
{
    private int salary;
    
    public Salary(String eName, String eAddress, String ePhone, String job,
                    String socSecNumber, int eSalary)
    {
        super(eName,eAddress,ePhone, job, socSecNumber,true);
        salary = eSalary; 
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
        result+="\nSalary: "+hoursWorked;
        return result;
    }       
}
