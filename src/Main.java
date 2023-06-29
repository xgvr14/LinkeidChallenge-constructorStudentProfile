import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
//incrementExpectedGraduation.StudentProfile;
        StudentProfile student1 = new StudentProfile("Andrei","Gavri",2021, 4.00, "Trading");
        StudentProfile student2= new StudentProfile("ingrid","fleancu",2022,4.00,"IT");
        student1.incrementExpectedGraduation();
        System.out.println(student1.incrementExpectedGraduation());
        System.out.println(student2.incrementExpectedGraduation());
        System.out.println(student1.fullName());
        String numar = "2019";
        int numarmodificat = Integer.parseInt(numar);
        System.out.println(numarmodificat);



    }
}