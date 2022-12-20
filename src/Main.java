import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Assalam aleikum, bolushuncha araket kyldyk, metodtordu kichine ozgortup saldym.
        // Bugun ele jiberdim, itak ele jakshy ele ubakyt berdiner okshoit. Rahmat.
        
        Scanner scanner = new Scanner(System.in);
        List<Rose> roses = new ArrayList<>();
        roses.add(new Rose("Holland", 15, "Red", 1000));
        roses.add(new Rose("France", 13, "White", 1200));
        roses.add(new Rose("Belgium", 16, "Yellow", 1500));
        RoseService roseService = new RoseService();
        roseService.getAllFlowers(roses).stream().forEach(System.out::println);
        roseService.getFlowersFinByColor(roses,scanner.nextLine()).stream().forEach(System.out::println);
        System.out.println("Total price: "+roseService.getSumAllFlowers(roses)+" som");
        System.out.println("********************************");
        System.out.println(roseService.groupingFlowersByColor(roses));
        roseService.getAllFlowersSortByPrice(roses).stream().forEach(System.out::println);
        System.out.println();
        roseService.getSortByPrice(roses).stream().forEach(System.out::println);

    }
}