public class Student extends Person {
 //  1
// attribute for Student only additional the parent
private String gender;

//   2
    public Student() {
    }

    public Student(String n, String ad, int a, String nat) {
        super(n, ad, a, nat);
    }
//  3
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


