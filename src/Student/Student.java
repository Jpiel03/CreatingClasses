package Student;

/**
 *
 * @author 18275
 */
public class Student {
    
  
    private double gpa;
    private int id;
    private double grade;
    private int numberOfClasses;
    
    public Student(double pGpa, int pId, double pGrade, int pNumberOfClassses ){
        gpa = pGpa;
        id = pId;
        grade = pGrade;
        numberOfClasses = pNumberOfClassses;
        
    }
    
    public void setGpa(double pGpa){
        gpa = pGpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void setId(int pId){
        id = pId;
    }
    public int getId(){
        return id;
    }
    public void setGrade(double pGrade){
        grade = pGrade;
    }
    public double getgrade(){
        return grade;
    }
    public void setNumberofClasses(int pNumberOfClasses){
        numberOfClasses = pNumberOfClasses;
    }
    public int getnumberOfClasses(){
        return numberOfClasses;
    }
    public String toString(){
        return "The student " + id + " has " + numberOfClasses + " classes and a gpa of " + gpa;
    }
    
}
