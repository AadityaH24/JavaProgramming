package Lab5;

public class CollegeCourse {
    String cDept;
    int cNum;
    int cCred;
    int cFee;

    CollegeCourse(String dept, int num, int cred){
        cDept = dept;
        cNum = num;
        cCred = cred;
        cFee = cCred*120;

    }
    CollegeCourse(){
        
    }
    public void display(){
        System.out.println("Dept: "+ cDept + " Code: " + cNum + " Creds: " + cCred + " Fee: "+ cFee);

    }
}
