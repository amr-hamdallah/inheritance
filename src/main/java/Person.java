public class Person {

        // this is the parent class( super class)

        // 1- declare for variables of the parent class
        private String name;
        private String address;
        private int age;
        private String nationality;

        // 2- create constructors for the parent class for its above data one empty and  anther have parameters
        // note we can use  right click  and generate constructors automatically
        public Person() {

        }

        public Person(String n, String ad, int a, String nat) {
            name = n;
            address = ad;
            age = a;
            nationality = nat;
        }


        // 3- we create methods for these attributes ( data or variables)
// not we can use  right click  and generate method automatically
        public String getName() {
            return name;
        }

        public void setName(String n) {
            name  = n;

        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String ad) {
            address = ad;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int a) {
            age = a;
        }

        public String getNationality() {
            return nationality;
        }


        public void setNationality(String nat) {
            nationality = nat;
        }

    }







