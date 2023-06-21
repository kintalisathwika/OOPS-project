public class Tester {
    public static void main(String[] args) {
        Employee employees [] = new Employee[3];
        employees[0] = new HourlyEmployee(1,"sathwika","kintali",45,19.99);
        employees[1] = new SalariedEmployee(2,"sathwi","kin",7000);
        employees[2] = new CommissionEmployee(3,"jack","lee",0.05,1500,100000);
          
        //now we call the toString to display the details 
        for(int i=0; i<employees.length;i++)
        {
          System.out.println(employees[i]);
          System.out.println("\n");

        }

     }
}
