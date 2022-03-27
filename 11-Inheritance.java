Inheraitance (extension)

- child inherits its parent
- Subclass can use all features of its super class
- Parent should exist for inheritance

Advantage
- Extension 
   child class extends the functionality of its parent
- Reusability
   we can reuse already existing class with new Functionly 
- Avoid redundancy
   write once, use many times


Extension


e.g                    Calculator(add,sub)
    ScientificCal(cos,sin)                  BusinessCaL(pers,cr,dr)

- ScientificCal extends the concept of calculator

.................................................

class Calculator{
public void add() { System.out.println("Add function");}
public  void sub(){ System.out.println("sub function");}
}
class ScCalculator extends Calculator{

public  void sq() { System.out.println("sq function");}
public void power(){ System.out.println("pow function");}
}
class Test {
public static void main (String o[]) {
Calculator c=new Calcultor();
c.add();
c.sub();
ScCalculator ob= new ScCalculator();
ob.add();
ob.sub();
ob.sq();
ob.power();
}
}
..........................................................
Note : for C++ programmers
java only support public inheritance (by default)
...........................................................
e.g 
Example with data
                 Person(id,name)

 Student(marks,grade())        Teacher(salary,tax())
    (UML Diagram on Board)

// constructor excution top to bottom

class Person{
private int id;
private String name;
public  Person() {System.out.println("Person Created"); }
  Person(int d, String n) {
    id=d;//setId(d)
    name=n;//setName(n)
System.out.println("Person Created");
 }
public void setName(String n) { 
   if (n.length()<=30)
         name=n;
   else
         name=null;
}
public void setId(int d ) { id=d;}
public int getId() { return id;}
public String getName(){return name;} 

};
class Student extends Person{
private int marks;
public Student () { System.out.println("Student Created"); }
public Student (int d,String n,int m)
  {super(d,n);
  // super should be written on first line in constrtuctor code 
   marks=m; 
   System.out.println("Student Created"); 
}
void setMarks(int m) {marks=m;}
int getMarks() {return marks;}
char grade() {
char g;
if (marks>=80)
   g='A';
else if (marks>=70)
   g='B';
else if (marks>=60)
   g='c';
else if (marks>=50)
   g='D';
else
   g='F';
return g;
}
};
// same for teacher class






class Teacher extends Person{
private int salary;
public Teacher ( ) { }
public Teacher (int d,String n, int s){
super(d,n);
salary=s;
}
public int getSalary() { return salary;}
public void setSalary(int s){salary=s;}
public double tax() { return salary*0.05;}

}

class Test {
public static void main (String o[]) {
Student ob=new Student(10,"Imran",80);
//cout<<ob.getId()<<ob.getName()<<ob.getMarks()<<ob.grade()//<<endl;
}
}

Note : use system.out.prinln insted of cout
.............................................................
e.g  Same exmple with extra hierarchy
Extend student class as BS and MS students
                Person(id,name)

 Student(marks,grade())        Teacher(salary,tax())

   
BSStudent(project)     MsStudent(Thesis)

(UML Diagram on Board)

class Person{
private int id;
private String name;
public  Person(){System.out.println("Person Created");}
public  Person(int d, String n) {
    setId(d);
    setName(n);
  System.out.println("Person Created");
 }
void setName(String n) { name=n;}
void setId(int d ) { id=d;}
int getId() { return id;}
String getName(){return name;} 

};
class Student extends Person{
private int marks;
public Student(){System.out.println("Studentcreated");}
public Student (int d,String n,int m)
{super(d,n); 
marks=m; 
System.out.println("Studentcreated"); }
public void setMarks(int m) {marks=m;}
public int getMarks() {return marks;}
public char grade() {
char g;
if (marks>=80)
   g='A';
else if (marks>=70)
   g='B';
else if (marks>=60)
   g='c';
else if (marks>=50)
   g='D';
else
   g='F';
return g;
}
};
class BsStudent extends Student{
private String project;
public BsStudent ( ) {
System.out.prinltn("BS Student Created");
}
BsStudent(int d, String n,int m,String p)
  { supert(d,n,m);
   project=p;
cout<<"BS Student Created"<<endl;
}

void setProject(char p[]){strcpy(project,p);}
char * getProject() { return project;}
};

void main () {
BsStudent ob (10,"Imran",80,"Graphics Game");
cout<<ob.getId()<<ob.getName()<<ob.getMarks()<<ob.grade()<<endl;
cout<<ob.getProject()<<endl;
}
..........................................................

Mixture of Composition and Inheritance

e.g Car must have Engine, Tyre,Body
HondaCivic extends the concept of car with digital meter
(see class diagram on board)



class Engine{
public :
    Engine() {
        cout<<"Engine created"<<endl;
    }
  void start() {
   cout<<"Engine Started 1800 hrspower"<<endl;
  }

};
class Tyre{
public :
    Tyre() {
        cout<<"Tyre  created"<<endl;
    }
  void size() {
   cout<<"Tyre Size is 17 inch"<<endl;
  }

};
class Body{
public :
    Body() {
        cout<<"Body  created"<<endl;
    }
  void type() {
cout<<"Body type is saloon color is white"<<endl;
  }

};
class Car {
private:
Engine e;
Body b;
Tyre t;
public :
  Car () {
   cout<<"Car  created"<<endl;
 }
void printSpecification(){
   e.start();
   b.type();
   t.size();
}
};
class HondaCivic:public Car{
private:
int digitalMeter;
public:
 HondaCivic() {
  cout<<"Honda Civic Created"<<endl;}

HondaCivic(int p ) {
  digitalMeter=p;
  cout<<"Honda Civic Created"<<endl;}
void printHondaSpecification(){
  printSpecification();
  cout<<digitalMeter<<endl;

}

};

void main (){

HondaCivic civic(300);
civic.printHondaSpecification();

}
..........................................................
Mixture of Composition and Inheritance
(Same problem with data)
e.g Car must have Engine(hrPower),Tyre(size),Body(type)
HondaCivic extends the concept of car with digital meter
(see class diagram on board)

class Engine{
private:
int hrPower;
public :
    Engine() {
        cout<<"Engine created"<<endl;
    }
 ~Engine() {
        cout<<"Engine expired"<<endl;
    }
Engine(int hp) {
        hrPower=hp;
        cout<<"Engine created"<<endl;
    }
int getHrPower() { return hrPower;}
void setHrPower(int hp) {  hrPower=hp;}
  void start() {
   cout<<"Engine Started with "<<hrPower<<" hrspower"<<endl;
  }

};
class Tyre{
private :
int size;
public :
    Tyre() {
        cout<<"Tyre  created"<<endl;
    }
  ~Tyre() {
        cout<<"Tyre  expired"<<endl;
    }
  Tyre(int s) { size=s;
        cout<<"Tyre  created"<<endl;
    }
 int getSize() { return size;}
 void setSize(int s) { size=s;}
  void printSize() {
   cout<<"Tyre Size is "<<size<<" inch"<<endl;
  }

};

class Body{
private:
 char type[50];
public :
    Body() {
        cout<<"Body  created"<<endl;
    }
   ~Body() {
        cout<<"Body  expired"<<endl;
    }
  Body(char t[]) {strcpy(type,t);
        cout<<"Body  created"<<endl;
    }
 char * getType() { return type;}
 void setType(char t[]){strcpy(type,t);}
  void printType() {
cout<<"Body type is "<<type<<endl;
  }

};
class Car {
private:
int price;
Engine e;
Body b;
Tyre t;
public :
  Car () {
   cout<<"Car  created"<<endl;
 }
~Car () {
   cout<<"Car  Expired"<<endl;
 }
Car (int hp,int s, char ty[],int p):e(hp),t(s),b(ty) 
{
   price=p;
   cout<<"Car  created"<<endl;
 }
void printSpecification(){
   cout<<"Price="<<price<<endl;
   e.start();
   b.printType();
   t.printSize();
}
};
class HondaCivic:public Car{
private:
int digitalMeter;
public:
 HondaCivic() {
  cout<<"Honda Civic Created"<<endl;}
 ~HondaCivic() {
  cout<<"Honda Civic Expired"<<endl;}

HondaCivic(int hp,int s, char ty[],int pr,int dm ):Car(hp,s,ty,pr) 
{
  digitalMeter=dm;
  cout<<"Honda Civic Created"<<endl;
}


void printHondaSpecification(){
  printSpecification();
  cout<<"digitalMeter="<<digitalMeter<<endl;
}
};
void main (){
HondaCivic hc(1800,15,"Saloon",10000,240);
hc.printHondaSpecification();
}

}
.......................................................
Mixture of Composition and Inheritance
(Same problem with data)
e.g A Room must have Wall(size),Door(type),window(size)
 A house consist of rooms.
GuestHouse extends the concept of House with 20 Rooms
Junaid(a Guest) stays in room 1;
Khalid(a Guest) stays in room 2;

(see class diagram on board)


Assignment Code the above problem in java


class Wall{
private int size;

}

class Door{
private String type;
}
class Window{
private int size;
}
class Room {
private Wall wall;
private Door door;
private Window window; 
public Room ( ) { wall = new Wall();
                  door= new  Door();
                  window=new Window();
}

public Room (int s,String t, int si ) { 
             wall = new Wall(s);
                  door= new  Door(t);
                  window=new Window(si);
}
}
class House {
private Room r[];
private int roomSize;
public Room (int s) { roomSize=s;
                      r= new Room[roomSize];
} 
public void assignGuest(Guest g, int no) {
    
}

class GuestHouse extends House {
public GuestHouse(int s) { super(s);}
public void stays(Guest p,int no) {
     assignGuest(p,no);
}
}
..................................................
 Multiple Inheritance
  -no support in java
............................................................
 Object  (java defined class)

- by default all classes inherites  from object class
-The Object class is the top of the class hierarchy. All classes are descendants from this class and inherit methods from it. Useful methods inherited from Object include toString(), equals(), clone(), and getClass().




class Abc{

}

java compiler rewrites codes as


class Abc extends Object{

}

......................................................
Why Object class inheritance


1- for global gerneralization


car c= new car();
spoon sp=new spoon();
student st= new student();


Object a[]=new Object[3];

a[0]=c;
a[1]=sp;
a[2]st;
................................................

methods in object class

1- Object clone()

2- String toString()


3- boolean equals(Object )

etc...
............................................
Car c1;
{
Car c2= new Car();
c1=c2;
}

............................................
Car c1;
{
Car c2= new Car();
c1=(Car)c2.clone();
}
...............................................
See memory diagram on board
...............................................


toString  methods
String toString()


class Employee{
private String name;
private String id;
public Employee ( ){ id=10; name="Ahmed";}
public String toString() {return id + " " +name;}

}
class Test {
public static void main(String o[]){
Emplyee e= new Employee();
System.out.println(e); // 10 Ahmed
}
}
..................................................
3- equals


Car c1=new Car();
car c2=new Car();
if (c1.equals(c2))  // false

Car c1=new Car();
car c2=(Car)c1.clone();
if (c1.equals(c2))  // true
.............................
Check it yourself

Car c1=new Car();
car c2=c1;
if (c1.equals(c2))  // ?????
.................................
final class
- final can not be inherited

final class Circle{



}


class xyz extends circle { }  //compile time error

.................................................................

final Methods

- final method can not be overidden


class MyArray{

final boolean search(int key){....}

}

   

class AdvArray extends MyArray{

boolean search(int key){....} //compile time error

}
............................................................................









