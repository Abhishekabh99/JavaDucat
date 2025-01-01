class GoogleNoThisKey {

int id;
String name;
int salary;
static String cname = "Company Google";



void store(int id, String name, int salary, GoogleNoThisKey google) {
google.id = id;
google.name = name;
google.salary = salary;
}
void display() {
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(cname);
}


public static void main(String[] args) {

GoogleNoThisKey emp1 = new GoogleNoThisKey();
emp1.store(101,"Abhishek",4500,emp1);
emp1.display();

GoogleNoThisKey emp2 = new GoogleNoThisKey();
emp2.store(102,"Naman",8500,emp2);
emp2.display();

GoogleNoThisKey emp3 = new GoogleNoThisKey();
emp3.store(103,"Raman",6000,emp3);
emp3.display(); 


}

}