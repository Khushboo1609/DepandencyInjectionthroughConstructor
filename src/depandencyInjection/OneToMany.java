package depandencyInjection;

import java.util.Arrays;

class Emp{
    int empId;
    String name;

    public Emp(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}
class Department{
    String dep;
    int depId;
    Emp[] emp;

    public Department(String dep, int depId, Emp[] emp) {
        this.dep = dep;
        this.depId = depId;
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dep='" + dep + '\'' +
                ", depId=" + depId +
                ", emp=" + Arrays.toString(emp) +
                '}';
    }
}

public class OneToMany {
    public static void main(String[] args) {

        Emp[] e=new Emp[5];
        Emp emp = new Emp(1,"name");
        Emp emp2 = new Emp(2,"name");
        Emp emp3 = new Emp(3,"name");
        e[0]=emp;
        e[1]=emp2;
        e[2]=emp3;
        Department d=new Department("ComputerScience",34,e);
        Emp [] emparr = d.emp;
        for(int i=0;i<emparr.length && emparr[i]!=null ;i++){
            System.out.println(emparr[i].toString());
        }
        System.out.println(d.toString());


    }
}
