package Lab2;

public class Main {

    public static void main(String[] args) {

        Student masterStudent = new MasterStudent(2120, 50, 80, 10);
        Student bacStudent = new BachelourStudent(2121, 70, 80);
        Student phdStudent = new PhDStudent(2012, 90, 80, 5, 3);


        System.out.println("Master Student Base Score : " + masterStudent.computeBaseScore());
        System.out.println("Master Student Total Score : " + masterStudent.computeTotalScore());
            
        System.out.println("Bachelour Student Base Score : " + bacStudent.computeBaseScore());
        System.out.println("Bachelour Student Total Score : " + bacStudent.computeTotalScore());
         

        System.out.println("PhD Student Base Score : " + phdStudent.computeBaseScore());
        System.out.println("PhD Student Total Score : " + phdStudent.computeTotalScore());
         
        
    }
    
}
