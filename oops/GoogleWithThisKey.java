class GoogleWithThisKey {

int id;
String name;
int salary;
static String cname = "Company Google";



void store(int id, String name, int salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
void display() {
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(cname);
}


public static void main(String[] args) {

GoogleWithThisKey emp1 = new GoogleWithThisKey();
emp1.store(101,"Abhishek",4500);
emp1.display();

GoogleWithThisKey emp2 = new GoogleWithThisKey();
emp2.store(102,"Naman",8500);
emp2.display();

GoogleWithThisKey emp3 = new GoogleWithThisKey();
emp3.store(103,"Raman",6000);
emp3.display(); 


}

}