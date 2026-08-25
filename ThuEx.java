interface sportsperson{
void playsports();
}
interface NSSVolunteer{
void dosocialwork();
}
class student implements sportsperson,NSSVolunteer{
String name;
student(String name){
this.name=name;
}
public void playsports(){
System.out.println(name +" is at play ground");
}
public void dosocialwork(){
System.out.println(name +" is at blood donation camp");
}
}
class ThuEx{
public static void main(String args[]){
student s1= new student("sirimalli");
s1.playsports();
s1.dosocialwork();
}
}