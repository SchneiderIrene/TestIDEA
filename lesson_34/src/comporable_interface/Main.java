package comporable_interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] ints = {1,45,6,7,8,2,43,90,56};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String [] strings = {"John", "Ann", "David"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Player player1 = new Player(3, "Jack", 22);
        Player player2 = new Player(1, "Simon", 19);
        Player player6 = new Player(1, "Simon", 35);
        Player player5 = new Player(1, "Igor", 18);
        Player player3 = new Player(2, "Alex", 24);
        Player player4 = new Player(2, "Alex", 26);

        Player[]players = {player1, player2, player3, player4, player5, player6};

        for (Player player: players){
            System.out.println(player);
        }

        System.out.println(player2.compareTo(player1));
        Arrays.sort(players);
//        System.out.println(Arrays.toString(players));
        for (Player player: players){
            System.out.println(player);
        }


    }

}
