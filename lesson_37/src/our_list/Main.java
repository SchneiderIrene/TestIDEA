package our_list;

public class Main {
    public static void main(String[] args) {
        OurList<Integer> ourList = new OurArrayList<>();
        ourList.append(2);
        ourList.append(4);
        ourList.append(1);
        ourList.append(7);

        for (int i = 0; i<ourList.size(); i++){
            System.out.println(ourList.get(i));
        }

        System.out.println("------------------");

        ourList.set(8765, 2);

        for (int i = 0; i<ourList.size(); i++){
            System.out.println(ourList.get(i));
        }
        System.out.println("------------------");

        ourList.removeByID(1);
        for (int i = 0; i<ourList.size(); i++){
            System.out.println(ourList.get(i));
        }
        System.out.println("------------------");

        ourList.remove(8765);
        for (int i = 0; i<ourList.size(); i++){
            System.out.println(ourList.get(i));
        }
        System.out.println("------------------");

        ourList.clear();
        for (int i = 0; i<ourList.size(); i++){
            System.out.println(ourList.get(i));
        }
        System.out.println("------------------");






    }
}
