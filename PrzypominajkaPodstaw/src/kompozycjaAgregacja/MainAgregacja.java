package kompozycjaAgregacja;


import java.util.ArrayList;
import java.util.List;

class Student {
    String student_name;
    int student_id ;
    String student_dept;
    //Initialize Student class members
    Student(String student_name, int student_id, String student_dept) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_dept = student_dept;
    }
}

//Branch class indiates the branch or department to which the student belongs
class Branch {
    String Branch_name;
    private List<Student> students;
    //Each branch contain students
    // Initialize class members
    Branch(String Branch_name, List<Student> students) {
        this.Branch_name = Branch_name;
        this.students = students;
    }
    //return list of students
    public List getStudents() {
        return students;
    }
}

//Institure class contains branches which in turn have students
class Institute {
    String instituteName;
    private List<Branch> branches;
    //each institure have various branches
    // initialize members
    Institute(String instituteName, List branches) {
        this.instituteName = instituteName;
        this.branches = branches;
    }
    // count and return number of all students in the institute
    public int getAllStudentsInInstitute() {
        int noOfStudents = 0;
        List<Student> students;
        for(Branch branch : branches) {
            students = branch.getStudents();
            for(Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}

//Aggregate all the classes=> Institute (contains) branches (contains) Students
class MainAgregacja {
    public static void main (String[] args) {
        //declare student objects
        Student s1 = new Student("Megan", 1, "CSE");
        Student s2 = new Student("Mia", 2, "CSE");
        Student s3 = new Student("John", 1, "ETC");
        Student s4 = new Student("Finn", 2, "ETC");
        // List of CSE Students.
        List<Student> cse_students = new ArrayList();
        cse_students.add(s1);
        cse_students.add(s2);
        //List of ETC Students
        List<Student> etc_students = new ArrayList();
        etc_students.add(s3);
        etc_students.add(s4);
        //declare Branch objects
        Branch CSE = new Branch("CSE", cse_students);
        Branch ETC = new Branch("ETC", etc_students);

        //make list of branches
        List<Branch> branches = new ArrayList();
        branches.add(CSE);
        branches.add(ETC);
        // creating an object of Institute.
        Institute institute = new Institute("NIT", branches);
        //display total number of students
        System.out.print("Total students in NIT institute: ");
        System.out.print(institute.getAllStudentsInInstitute());
    }
}

