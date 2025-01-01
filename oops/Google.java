class Google {

int id;
String name;
int salary;
static String cname = "Company Google";



void store(int id1, String name1, int salary1) {
id = id1;
name = name1;
salary = salary1;
}
void display() {
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(cname);
}


public static void main(String[] args) {

Google emp1 = new Google();
emp1.store(101,"Abhishek",4500);
emp1.display();

Google emp2 = new Google();
emp2.store(102,"Naman",8500);
emp2.display();

Google emp3 = new Google();
emp3.store(103,"Raman",6000);
emp3.display(); 


}

}