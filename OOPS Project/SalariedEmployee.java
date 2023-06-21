public class SalariedEmployee extends Employee{
    
    private double baseSalary;
    
     public SalariedEmployee()
     {
        super();
     }

     /**
      * initialize salried employee from given parameters 
      * @param employeeId
      * @param firstName
      * @param lastName
      * @param hoursWorked
      * @param hourlyRate
      */

     public SalariedEmployee(int employeeId,String firstName, String lastName, double salary)
     {
        super(employeeId,firstName,lastName);
        baseSalary = salary;
     }
     
     public void setBaseSalary(double salary)
     {
        this.baseSalary = salary;
     }
    
    
    
    /**
     * function to calculate  salary of an employee - All the child class 
     * must override this function 
     * 
     * @return salary 
    */
    public  double calculateSalary()
    {
        return baseSalary;
    }
 
    @Override 
     public String toString()
     {
       return  super.toString()  +
       String.format("%-20s %.2f%n" , "Salary:" , calculateSalary());
    
    }
    
}
