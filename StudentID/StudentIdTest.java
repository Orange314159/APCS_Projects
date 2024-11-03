class StudentIdTest {
   public static void main(String args[]) {
      
      StudentId stu1 = new StudentId();
      System.out.println(stu1);
      
      stu1.setStudentFirstName("Ada");
      stu1.setStudentLastName("Lovelace");
      stu1.setStudentId(223344);
            
      System.out.println(stu1);
      
      StudentId stu2 = new StudentId("Buzz", "Lightyear", 123456);
      System.out.println(stu2);
   }
}