package garden;

public  class Garden {
    public static void main(String[] args) {
        Plant flower = new Flower("Tulane", 0, 0);
        Plant tree = new Tree("Birch", 10, 0);

        Plant []plants = {flower,tree};
        for (Plant plant: plants){

            plant.growPlants(10);
            System.out.println("-----------");
        }


    }


}
