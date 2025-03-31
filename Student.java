public class Student {
    private String name;
    private int grade;
    
    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Use setter for validation
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for grade
    public int getGrade() {
        return grade;
    }
    
    // Setter for grade with validation (0-100)
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }
}
