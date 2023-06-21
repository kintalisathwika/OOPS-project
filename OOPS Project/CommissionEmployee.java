public class CommissionEmployee extends Employee
{
    private double commissionRate;
    private double baseSalary;
    private double totalSales;
     public CommissionEmployee()
     {
        super();
     }

     public CommissionEmployee(int employeeId,String firstName, String lastName, double baseSalary, double totalSales, double commissionRate)
     {
        super(employeeId,firstName,lastName); 
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
     }
     //Getter methods 
      //Getter methods
    public double  getCommissionRate()
    {
        return commissionRate;
    }
    public double  getBaseSalary()
    {
        return this.baseSalary;
    }
    public double getSales()
    {
        return totalSales;
    }

    //setter methods 
    public void setCommissionRate(double rate)
    {
     this.commissionRate= rate;
    }
    public void setBaseSalary(double salary)
    {
     this.baseSalary = salary;
    }
    public void setSales(double sales)
    {
     this.totalSales = sales;
    }
     public double calculateCommssion()
     {
        return totalSales * commissionRate;
     }
    




    /**
     * function to calculate  salary of an employee - All the child class 
     * must override this function 
     * 
     * @return salary 
    */
    public  double calculateSalary()
    {
        return  calculateCommssion() + baseSalary;
    }


    @Override 
     public String toString()
     {
       return  super.toString() +
       String.format("%-20s %.2f%n" , "Salary:" , calculateSalary());
    }
    
}
