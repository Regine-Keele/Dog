
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    String breed = "Jack Russell";
    String tagNumber = "001";
    String color = "Brown and White";
    
    public void printInfo(){
       System.out.println("Breed: "+breed); 
       System.out.println("Tag Number: " +tagNumber); 
       System.out.println("Color" +color);
    }
    public void Dog(){
       
    }
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.printInfo();
    }
    
    
    
}
