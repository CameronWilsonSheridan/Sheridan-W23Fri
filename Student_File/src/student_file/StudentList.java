/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_file;

/**
 *
 * @author camwi
 */
public class StudentList {
    
    public static void main(String[] args){
        //StudentW23Fri s1 = new StudentW23Fri("s1", "Cameron");
        StudentW23Fri[] studentList = new StudentW23Fri[3];
        studentList[0] = new StudentW23Fri("s1", "Cameron");
        studentList[1] = new StudentW23Fri("s2", "David");
        studentList[2] = new StudentW23Fri("s3", "Carter");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
    
}
