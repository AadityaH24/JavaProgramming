package Lab5;

public class LabCourse extends CollegeCourse{
    int labFee = 50;

    LabCourse(String dept, int num, int cred){
        super(dept, num, cred);
        this.cFee += labFee;

    }
    public void display(){
        System.out.println("This is a LAB Course");
        System.out.println("Dept: "+ cDept + " Code: " + cNum + " Creds: " + cCred + " Fee: "+ cFee);
    }
    
}
