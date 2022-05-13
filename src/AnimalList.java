import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {

    private String name;
    private boolean isDog;

    public AnimalList(){}

    public AnimalList(boolean isDog){
        this.isDog = isDog;
    }
    public AnimalList(String name){
        this.name = name;
    }
    public AnimalList(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDog() {
        return isDog;
    }

    public void setDog(boolean isDog) {
        this.isDog = isDog;
    }
    public boolean getIsDog(){
        return this.isDog;
    }

    public String toString() {
        return "AnimalList [isDog=" + isDog() + ", name=" + getName() + "]";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<AnimalList> animal = new ArrayList<AnimalList>();

        for (int i = 0; i < animal.size() + 1; i++) {

            System.out.println("Animal Menu");

            System.out.println("Entering nothing will stop the loop");
           
            System.out.println("Please enter a name: ");
            
            String animalPut = input.nextLine();
            
            System.out.println("Is it a dog? true or false");
            
            Boolean DogPut = input .nextBoolean();
            
            animal.add(new AnimalList(animalPut, DogPut));

            System.out.println("Add another? ");
            String fixABug = input
            .nextLine();
            String push = input
            .nextLine();

            if (push.equals("N")) {
               
                for (AnimalList AnimalList : animal) {
                    
                    
                    System.out.println(AnimalList.toString());
                }
                break;
            }
        }
    }

}