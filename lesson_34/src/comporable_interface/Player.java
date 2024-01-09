package comporable_interface;

public class Player implements Comparable <Player>{
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Player p) {
//        if (getRanking() - p.getRanking() > 0){
//            return 1;
//        }
//        else if (getRanking() - p.getRanking() < 0){
//            return -1;
//        }
//        return 0;
//    }

//    @Override
//    public int compareTo(Player p) {
//            return getRanking() - p.getRanking();
//    }

//    @Override
//    public int compareTo(Player p) {
//        return Integer.compare(getRanking(), p.getRanking());
//    }

//    @Override
//    public int compareTo(Player p) {
//        return getName().compareTo(p.getName());
//    }

//    @Override
//    public int compareTo(Player p) {
//
//   int playerName =  getName().compareTo(p.getName());
//
//        return playerName == 0 ? Integer.compare(getAge(), p.getAge()) : playerName;
//    }

    @Override
    public int compareTo(Player p) {
        int playerRanking = Integer.compare(getRanking(), p.getRanking());
        int playerName =  getName().compareTo(p.getName());
        int playerAge = Integer.compare(getAge(), p.getAge());

        if (playerRanking == 0){
            return playerName;
        }
        if (playerName == 0) {
            return playerAge;
        }

        return playerRanking;
    }
}
