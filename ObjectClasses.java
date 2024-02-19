public class ObjectClasses{
    public static void main(String[] args) {
        StudentObject s1 = new StudentObject();
        
        // Setting values for the attributes
        s1.studentName = "Pratyush";
        s1.rollNum = 9.08f; // Assuming roll number is float, use 'f' suffix for float literals
        s1.subject1 = "C++";
        s1.subject2 = "Java";
        s1.marksSubject1 = 97;
        s1.marksSubject2 = 98;

        System.out.println( s1.studentName);
        System.out.println( s1.rollNum);
        System.out.println( s1.subject1);
        System.out.println( s1.subject2);
        System.out.println( s1.marksSubject1);
        System.out.println( s1.marksSubject2);
        
    }
        
  
        public static class StudentObject {
            String studentName;
            float rollNum;
            String subject1;
            String subject2;
            int marksSubject1;
            int marksSubject2;
        }
    }


