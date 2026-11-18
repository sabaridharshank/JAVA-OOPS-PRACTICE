/*
 * PROJECT: Java OOP Concepts
 * AUTHOR: Sabari
 *
 * Topics Covered:
 * 1. Encapsulation
 * 2. Composition
 * 3. Aggregation
 * 4. Inheritance
 * 5. Upcasting and Downcasting
 * 6. Polymorphism
 * 7. Method Overloading
 * 8. Constructor Overloading
 * 9. Method Overriding
 * 10. Abstraction
 * 11. Interfaces
 */

public class JavaOOPConcepts {

    public static void main(String[] args) {

        System.out.println("Java OOP Concepts Practice");

    }
}

// Add your OOP example classes below.
//1.
//encapluaction
//getter and setter
public class oops {
    private String name ="sabari";
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
}
class encap{
    public static void main(String[] args) {
        oops e = new oops();
        System.out.println(e.getname());
        e.setname("hari");
        System.out.println(e.getname());
    }
}
//2.Composition
//one to one composition
class owner{
    private int id;
    private String name;
    private String email;
    owner(int id,String  name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    pet p = new pet(1,"bunny");
    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getemail(){
        return email;
    }
}
class pet{
    private  int id;
    private String name;
    pet(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getpid(){
        return id;
    }
    public String getpname(){
        return name;
    }
}
class Main1{
    public static void main(String[] args) {
    owner o = new owner(1,"sabari","sabaridharshank123@gmail.com");
    System.out.println(o.p.getpname());
    }
}
//one to many compostion
class owner{
    int id;
    String name;
    owner(int id,String name){
        this.id=id;
        this.name=name;
    }
    pet [] p={new pet(1,"bunny"),new pet (2,"kitty"),new pet(3,"puppy")} ;
}
class pet{
    int pid;
    String pname;
    pet(int pid,String pname){
     this.pid=pid;
     this.pname=pname;
    }
}
class Main1{
    public static void main(String[] args) {
        owner o = new owner(1,"sabari");
        for (int i =0;i<o.p.length;i++){
            System.out.println(o.p[i].pid+":"+o.p[i].pname);
        }
    }
}
//3.Aggrestion
class owner{
    private int id;
    private String name;
    private String email;
    owner(int id,String  name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    pet p;
    public void getpet(pet p){
        this.p=p;
    }
    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getemail(){
        return email;
    }
}
class pet{
    private  int id;
    private String name;
    pet(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getpid(){
        return id;
    }
    public String getpname(){
        return name;
    }
}
class Main1{
    public static void main(String[] args) {
        owner o = new owner(1,"sabari","sabaridharshank123@gmail.com");
        pet p1 = new pet(1,"bunny");
        o.getpet(p1);
        System.out.println(o.p.getpname());
    }
}
//4.Inheritance
//Generalzation
class cab{
    cab c = null;
}
class mini extends cab{
    mini(){
        super();
        System.out.println("mini bokeed");
    }
}
class sedan extends cab{
    sedan(){
        super();
        System.out.println("sedan booked");
    }
}
class lux extends cab{
    lux(){
        super();
        System.out.println("lux");
    }
}
class Main1{
    public static void main(String[] args) {
        cab c = new cab();
        int key=1;
        switch (key){
            case 1:{
               c=new mini();
                break;
            }
        }
    }
}
//Instance of
class A{
    int a =10;
}
class B extends A{
    int b = 20;
}
class C extends A{
    int c =30;
}
class D extends A{
    static int d=40;
}
class Main1{
    public static void main(String[] args) {
        A aa = new D();
        System.out.println( aa instanceof D);
    }
}
//5.
//upcasting & downcasting
class man{
    String name;
    man(String name) {
        this.name = name;
    }
}
class woman extends man{
    int id;
    woman(int id,String name){
        this.id=id;
        super(name);
    }
}
class Main1{
    public static void main(String[] args) {
        man m = new woman(1,"sabari");
        System.out.println(m.id);
    }
}
//6.polymorphisim
//variable shodwoing
class Daddy{
     String String ="krishan ";
}
class Son extends Daddy{
    String String  ="sabari";
}
class Main1 {
    public static void main(String[] args) {
        Daddy d = new Son();
        System.out.println("Daddy name:"+d.String);
        Son s = (Son)d;
        System.out.println("Son name:"+s.String);
    }
}
//method shadowing
class Base{
    public static void samemethod(){
        System.out.println("I am parent menthod");
    }
}
class Derived extends Base{
    public static void samemethod(){
          System.out.println("I am child method");
    }
}
class Main1{
    public static void main(String[] args) {
        Base b = new Derived();
        b.samemethod();
        Derived d = (Derived)b;
        d.samemethod();

    }
}
//7. method overloading
class Base {
    public static void descrpition(String name,String role){
        System.out.println("name:"+name+"role:"+role);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b,int c){
        return a+b+c;
        }
        public static int mult(int a,byte b,int  c){
        return a * b * c;
        }
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =30;
        byte b1=0;
        String name ="sabari";
        String role ="java developer";
        descrpition(name,role);
        System.out.println("Addition:"+add(a,b));
        System.out.println("subraction:"+sub(a,b,c));
        System.out.println("multiplecation:"+mult(a,b1,c));
    }
}
//8.constator overloading
class constatoroverloading{
    int id;
    String name ;
    String email;
    constatoroverloading(int id){
        this.id=id;
    }
    constatoroverloading(int id,String name){
        this(id);
        this.name=name;
    }
    constatoroverloading(int id,String name,String email){
        this(id,name);
        this.email=email;
    }
    public static void main(String[] args) {
        constatoroverloading constatoroverloading = new constatoroverloading(1);
        constatoroverloading constatoroverloading1 = new constatoroverloading(1,"sabri");
        constatoroverloading constatoroverloading2 = new constatoroverloading(1,"sabri","saabridharshnak2006@gmail.com");
        System.out.println("Id:"+constatoroverloading.id);
        System.out.println("Id:"+constatoroverloading1.id+" Name:"+ constatoroverloading1.name);
        System.out.println("Id:"+constatoroverloading2.id+" Name:"+ constatoroverloading2.name+"Email:"+constatoroverloading2.email);

    }
}
//9.Method Overriding
class Base{
    public void samemethod(){
        System.out.println("this is Base class:");
    }
}
class Derived extends Base{
    public void samemethod(){
        System.out.println("this is a derived :");
    }
}
class Main1{
    public static void main(String[] args) {
        Base b = new Derived();
        b.samemethod();
    }
}
//10.Absraction
abstract class Base{
    public abstract void add();
}
class Derived extends Base{
    @Override
    public void add() {
        System.out.println(10+20);
    }
    public static void main(String[] args) {
        Derived d = new Derived();
        d.add();
    }
}
//11.Interface
interface add{
    void add();
}
class addition implements add{
    @Override
    public void add() {
        System.out.println(10+20);
    }

    public static void main(String[] args) {
        addition a = new addition();
        a.add();
    }
}
//interface with private and default
interface demo{
    private String securecode(){
        return "screct";
    }
    default String getsecurecode(){
         return securecode();
    }
}
class getdata implements demo
{
    public static void main(String[] args) {
        demo d = new getdata();
        System.out.println(d.getsecurecode());
    }
}