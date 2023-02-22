package depandencyInjection;
//one to one association as there lies one account class object for single employee class object
class UserAccount {
    int accountNumber;
    String name;
    int balance;

    public UserAccount(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
}
class Employee{
    int empId;
    String empName;
    UserAccount account;

    public Employee(int empId, String empName, UserAccount account) {

        this.empId = empId;
        this.empName = empName;
        this.account = account;
    }

    @Override
    public String toString() {
        return "constructordepandency.Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", account Name=" + account.name +
                ", account id=" + account.accountNumber+
                "  account balance="+ account.balance+
                '}';
    }
}
 class ConstructorDependency{
    public static void main(String[] args) {
        UserAccount u=new UserAccount(012,"khushboo",1000000000);
        Employee employee=new Employee(1,"khushboo",u);
        System.out.println(employee.empName);
        System.out.println(employee.toString());
    }
}

