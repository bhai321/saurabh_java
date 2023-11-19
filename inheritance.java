import java.util.Scanner;

public class Main {
    String name;
    int player_no;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Main mainPlayer = new Main();

        System.out.print("Enter player name: ");
        mainPlayer.name = scanner.nextLine();

        System.out.print("Enter player number: ");
        mainPlayer.player_no = scanner.nextInt();

        CricketPlayer cricketPlayer = new CricketPlayer();
        cricketPlayer.cricket(mainPlayer);

        HockeyPlayer hockeyPlayer = new HockeyPlayer();
        hockeyPlayer.hockey(mainPlayer);

        // Close the scanner
        scanner.close();
    }
}

// CricketPlayer is a child/subclass of the parent/super class Main
class CricketPlayer extends Main {
    // cricket() is a method defined in the CricketPlayer class
    public void cricket(Main mainPlayer) {
        System.out.println("Name is: " + mainPlayer.name + " and player no. is: " + mainPlayer.player_no);
        System.out.println("Cricket field diameter is 137-150m");
    }
}

// FootballPlayer is a child/subclass of the parent/super class Main
class FootballPlayer extends Main {
    // football() method
    public void football(Main mainPlayer) {
        System.out.println("Name is: " + mainPlayer.name + " and player no. is: " + mainPlayer.player_no);
        System.out.println("Football field is about 1.32 acres");
    }
}

// HockeyPlayer is a child/subclass of the parent/super class Main
class HockeyPlayer extends Main {
    // hockey() method
    public void hockey(Main mainPlayer) {
        System.out.println("Name is: " + mainPlayer.name + " and player no. is: " + mainPlayer.player_no);
        System.out.println("Hockey field is of 5027 sq.m area");
    }
}
