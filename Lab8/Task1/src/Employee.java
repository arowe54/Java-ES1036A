public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    // constructors
    public Employee(String n, String num, String date){
        this.name = n;
        this.employeeNumber = num;
        this.hireDate = date;
    }
    public Employee(){

    }

    // mutators/setters
    public void setName(String n){this.name = n;}
    public void setEmployeeNumber(String e){this.employeeNumber = e;}
    public void setHireDate(String h){this.hireDate = h;}

    // accessors/getters
    public String getName(){return name;}
    public String getEmployeeNumber(){return employeeNumber;}
    public String getHireDate(){return hireDate;}

    // checks if the number is a valid employee number
    private boolean isValidEmpNum(String e) {
        // if it does not follow criteria, it is false. If it follows criteria, it is true.
        // must have length 5, as well as have a "-" followed by an uppercase letter for characters 3 and 4
        if (e.length() != 5 || e.charAt(3) != 45 || !Character.isUpperCase(e.charAt(4))) {
            return false;
        }
        // the ASCII for "-" is 45
        else {
            for (int i = 0; i < 3; i++) {
                if (!Character.isDigit(e.charAt(i))) { // first 3 characters must be a digit
                    return false;
                }
            }
            return true; // if it follows all criteria, it is true.
        }
    }

    public String toString(){
        String output = "";
        output += String.format("Name: %s\n", name);

        if (isValidEmpNum(employeeNumber)){
            output += String.format("Employee Number: %s\n", employeeNumber);
        } else {
            output += String.format("Employee Number: Invalid");
        }

        output += String.format("Hire Date: %s\n", hireDate);
        return output;
    }
}
