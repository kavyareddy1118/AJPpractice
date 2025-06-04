class Student
{
int id;
String name;
String qualification;
int age;
   public Student(int id, String name, String qualification, int age)
{
   this.id= id;
   this.name= name;
   this.qualification= qualification;
   this.age= age;
}
   public void getInfo()
{
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Qualificatio: " + qualification);
    System.out.println("Age: " + age);
}
   public static void main(String args[])
{
   Student student1 =new Student(18,"smithanjali","MCA",22);
   student1.getInfo();
}
}


