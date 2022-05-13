import java.util.Scanner;
import java.util.ArrayList;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<TvShow> showList = new ArrayList<TvShow>();

        
        while (true) {
            System.out.println("name of show:");
            
            String showName = input.nextLine();
            
            if (showName.isBlank()) {
                for (TvShow TvShow : showList) {
                    System.out.println("The show is called " + TvShow.showName() + ". It has " + TvShow.numberOfEpisodes()+ " episodes. The genre is " + TvShow.genre());
                }
                break;
            }
            
            System.out.println("how many episodes?");
            
            int numberOfEpisodes = input.nextInt();
            
            System.out.println("what is the genre?");
            
            String fixABug = input.nextLine();
            
            String genre = input.nextLine();

            showList.add(new TvShow(showName, numberOfEpisodes, genre));

        }
    }
    
}