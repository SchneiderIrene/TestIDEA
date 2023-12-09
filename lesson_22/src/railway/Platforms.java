package railway;

import java.util.Arrays;

public class Platforms {

    public static int platforms (int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int current = 0;
        int max = 0;

            int i = 0;
            int j = 0;
            while (i<arrival.length && j<departure.length){

                if(arrival[i]<departure[j]) {
                    current++;
                    i++;
                    if (current>max) {
                        max = current;
                    }
                }
                else {
                    current--;
                    j++;
                }
            }

        return max;
    }

    public static void main(String[] args) {
        int [] arrival = {100, 140, 150, 200, 215, 400};
        int [] departure = {110, 300, 220, 230, 315, 600};

        System.out.println(platforms(arrival,departure));
    }
}

