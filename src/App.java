import com.school.courses.Course;
import com.school.grades.Grade;
import com.school.users.Student;
import com.school.users.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Olivier", "RIOUL", "12D8");

        Grade grade1 = new Grade("Master", 25);
        Grade grade2 = new Grade("Licence", 34);

        Student student1 = new Student("Michael", "SARR");
        Student student2 = new Student("Issa", "Diop");
        Student student3 = new Student("Fatou", "DIEYE");
        Student student4 = new Student("Kary", "GNo");

        Course course1 = new Course("Information Theory",10, 10);
        Course course2 = new Course("Machine Learning", 14, 18);

        System.out.println("\n============= TEACHER 1 ================\n");

        teacher.getInfo();

        System.out.println("\n============= STUDENT 1 ================\n");
        student1.setGrade(grade1);
        student1.getInfo();
        
        System.out.println("\n============= STUDENT 2 ================\n");
        student2.setGrade(grade2);
        student2.getInfo();

        System.out.println("\n============= STUDENT 3 ================\n");
        student3.setGrade(grade2);
        student3.getInfo();

        System.out.println("\n============= STUDENT 4 ================\n");
        student4.setGrade(grade1);
        student4.getInfo();

        System.out.println("\n============= COURSE 1 ================\n");
        course1.setGrade(grade2);
        course1.setTeacher(teacher);
        course1.getInfo();

        System.out.println("\n============= COURSE 2 ================\n");
        course2.setGrade(grade2);
        course2.setTeacher(teacher);
        course2.getInfo();
        
        
    }
}
