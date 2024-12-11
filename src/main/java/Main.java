public class Main {

    public static void main(String[] args) {
// we create more than object from class student which inherit from person
        Student st1 = new Student();
        st1.setName("amr");
        st1.setAge(35);
        st1.setGender("male");
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getGender());


        Student st2 = new Student();
        st2.setName("ali");
        st2.setAddress("cairo");
        st2.setAge(20);

        System.out.println(st2.getName());
        System.out.println(st2.getAddress());
        System.out.println(st2.getAge());

        // we create another object from another class
        Employee emp = new Employee();

        emp.setName(" ahmed");
        emp.setNationality(" egyptian");
        emp.setLastName("hamdallah");
        System.out.println(emp.getName());
        System.out.println(emp.getNationality());
        System.out.println(emp.getLastName());
    }

}