package Lab4;

public class Patient {

    int id;
    int age;
    int[] BloodData;

    Patient(){
        id = 0;
        age = 0;
        BloodData = new int[] {0,1};

    }
    Patient(int pID, int pAge, int[] pBlood){
        id = pID;
        age = pAge;
        BloodData = pBlood;
    }
    public int getID(){
        return id;
    }
    public int getAge() {
        return age;
        
    }
    public int[] getBloodData() {
        return BloodData;
        
    }
    
}
