class students {

    String firstName = "Vivek";
    String lastName = "Ramaswamy";
    int roll = 24;
    int std = 5;
    char section = 'A';

    /* Methods */

    public String getStudentFullName() {

        return firstName + " " + lastName;

    }

}

public class classDemo1 {

    public static void main(String[] args) {

        students s1 = new students();
        System.out.println(s1.getStudentFullName());

    }

}
