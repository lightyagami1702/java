class Student{
  int id;
  String name;
  float marks;
  Student(){
    System.out.println("In Contructor");
  }
  Student(int id, String name, float marks){
    System.out.println("Parameterised Contructor");
  }
  public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student(1,"Fred", 80);
  }
  
}
