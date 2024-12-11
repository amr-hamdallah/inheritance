public class Employee extends Person{

    //  1
// this attribute only for employee addtional the parent
private String lastName;


//    2
    public Employee() {

    }
    public Employee(String n, String ad, int a, String nat, String lastName) {
        super(n, ad, a, nat);
        this.lastName = lastName;
    }
    //     3

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

