package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    
    //When in doubt, private it out. Privated all variables.
    
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    //Making a new string variable.
    private String status = "";
    //private String cubeId;

    public Employee() {

    }

    // Assume this must be performed first
    //Shortened the class name to "meetWithHr"
    public void meetWithHr() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    //Removed String cubeId from the ().
    public void moveIntoCubicle() {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            //cubeId is not used anywhere else, so commenting out all instances
            //of cubeId.
            //this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        status = "Orientation is complete.";
            return status;
        //The else is not necessary. If all validations pass as true, which
        //they should in this case, then getStatus will never return the second
        //option.
        /*else {
            return "Orientation in progress...";
        }*/
    }
    
    //Making a setStatus to validate if getStatus should return a value.
    //Commenting out, because now it works the original way.
    //public void setStatus(String status) {
        //if(metWithHr && metDeptStaff
           //&& reviewedDeptPolicies && movedIn) {
            //status = "Orientation is complete.";
        //}
    //}
}
