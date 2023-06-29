//first name, last name, expected year to graduate,GPA , delcared major
//behavior : incremetn expected graduation year by one / constructor
//two students / incrementExpectedGraduationYear function
public class StudentProfile {
    String firstName;
    String lastName;
   int expectedGraduationYear ;
    double GPA;
    String major;
    StudentProfile (String firstName , String lastName, int expectedGraduationYear, double GPA, String major) {
       this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.major = major;
    }
   // StudentProfile student1 = new StudentProfile("Andrei","Gavri",2021, 4.00, "Trading");
   public int incrementExpectedGraduation() {

       return expectedGraduationYear + 1  ;

   }
   public String fullName() {
        return firstName + " " + lastName ;
   }
}
