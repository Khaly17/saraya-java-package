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

        Course course1 = new Course("Machine Learning", "10h", "10h:30", "14h:30");
        Course course2 = new Course("Machine Learning", "14h", "14h:30", "18h:30");

        System.out.println("============= TEACHER 1 ================");

        System.out.println("FirstName : "+ teacher.getFirstName()+
                    "\nLastName : "+teacher.getLastName()+
                    "\nMatricule : "+ teacher.getMatricule());

        System.out.println("============= STUDENT 1 ================");
        student1.setGrade(grade1);
        System.out.println("FirstName : "+ student1.getFirstName()+
                    "\nLastName : "+student1.getLastName()+
                    "\nGrade : "+ student1.getGrade().getNameGrade());
        
        System.out.println("============= STUDENT 2 ================");
        student2.setGrade(grade2);
        System.out.println("FirstName : "+ student1.getFirstName()+
                    "\nLastName : "+student1.getLastName()+
                    "\nGrade : "+ student1.getGrade().getNameGrade());

        System.out.println("============= STUDENT 3 ================");
        student3.setGrade(grade2);
        System.out.println("FirstName : "+ student1.getFirstName()+
                    "\nLastName : "+student1.getLastName()+
                    "\nGrade : "+ student1.getGrade().getNameGrade());

        System.out.println("============= STUDENT 4 ================");
        student4.setGrade(grade1);
         System.out.println("FirstName : "+ student1.getFirstName()+
                    "\nLastName : "+student1.getLastName()+
                    "\nGrade : "+ student1.getGrade().getNameGrade());

        System.out.println("============= COURSE 1 ================");
        course1.setGrade(grade2);
        course1.setTeacher(teacher);
        System.out.println("NameCourse : "+ course1.getNameCourses()+
                    "\nClass Time : "+course1.getClassTime()+
                    "\nStart Time : "+course1.getStartTime()+
                    "\nEnd Time : "+course1.getEndTime()+
                    "\nFirstName teacher : "+course1.getTeacher().getFirstName()+
                    "\nLastName teacher : "+course1.getTeacher().getLastName()+
                    "\nMatricule teacher : "+course1.getTeacher().getMatricule()+
                    "\nGrade : "+ course1.getGrade().getNameGrade());

        System.out.println("============= COURSE 2 ================");
        course2.setGrade(grade2);
        course2.setTeacher(teacher);
        System.out.println("NameCourse : "+ course2.getNameCourses()+
                    "\nClass Time : "+course2.getClassTime()+
                    "\nStart Time : "+course2.getStartTime()+
                    "\nEnd Time : "+course2.getEndTime()+
                    "\nFirstName teacher : "+course2.getTeacher().getFirstName()+
                    "\nLastName teacher : "+course2.getTeacher().getLastName()+
                    "\nMatricule teacher : "+course2.getTeacher().getMatricule()+
                    "\nGrade : "+ course2.getGrade().getNameGrade());
        
        
    }
}
