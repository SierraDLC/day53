import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Create counter starting at 0");
        
        Counter count0 = new Counter();
        
        System.out.println(count0);
        
        System.out.println("Increment");
        
        count0.increase();
        
        System.out.println(count0);
        
        System.out.println("Decrement");
        
        count0.decrease();
        
        System.out.println(count0);

        
        System.out.println("Create counter with given starting value");
        
        System.out.print("Enter value: ");
        
        int startVal = Integer.parseInt(scan.nextLine());
        
        Counter countVal = new Counter(startVal);
        
        System.out.println(countVal);
        
        System.out.println("Enter value to increase by: ");
        
        int incrVal = Integer.parseInt(scan.nextLine());
        
        countVal.increase(incrVal);
        
        System.out.println(countVal);
        
        System.out.println("Enter value to decrease by: ");
        
        int decrVal = Integer.parseInt(scan.nextLine());
        
        countVal.decrease(decrVal);
        
        System.out.println(countVal);

        scan.close();
    }
}