public class StudentId {

   private String studentFirstName;
   private String studentLastName;
   private int studentId;
   
   public StudentId() {
      studentFirstName = "First";
      studentLastName  = "Last";
      studentId = 111111;   
   }
   
   public StudentId(String nameF, String nameL, int SID) {
      studentFirstName = nameF;
      studentLastName  = nameL;
      studentId = SID;  
   }
      
   public void setStudentFirstName(String newStudentFirstName) {
      studentFirstName =  newStudentFirstName;
   }
   
   public void setStudentLastName(String newStudentLastName) {
      studentLastName = newStudentLastName;
   }
   
   public void setStudentId(int newStudentId) {
      studentId = newStudentId;
   }
   
   public String getStudentFirstName() {
      return studentFirstName;
   }
   
   public String getStudentLastName() {
      return studentLastName;
   }
   
   public int getStudentId() {
      return studentId;
   }
   
   public String getPassword() {
      return "" + studentLastName.charAt(0) + studentId + studentLastName.charAt(studentLastName.length()-1);
   }
   
   public String toString() {
      return "Name = " + studentFirstName + " " + studentLastName + "\nStudent Id = " + studentId;
   }
}