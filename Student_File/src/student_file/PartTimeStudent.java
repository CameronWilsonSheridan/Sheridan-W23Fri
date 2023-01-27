/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_file;

/**
 *
 * @author camwi
 */
public class PartTimeStudent extends StudentW23Fri {
    private int numOfCourses;
    
    public PartTimeStudent(int numOfCourses, String studentId, String studentName){
        super(studentId, studentName);
        this.numOfCourses = numOfCourses;
    }
    
    public int getNumOfCourses(){
        return numOfCourses;
    }
}
