package ww222ag_assign1.exercise3;

public class FerryMain {
    public static void main(String[] args) {
        Ferry ferry = new Ferry();
        test(ferry, "passengers", 20);//i.e 20 person 
        test(ferry, "bus", 10);//i.e bus with 10 person
        test(ferry, "bike", 1);//one bike with 1 person 
        test(ferry, "car", 2);//a car with 2 person
        test(ferry, "lorry", 2);//a lorry with 2 person
        test(ferry, "lorry", 2);//a lorry with 2 person
        test(ferry, "lorry", 2);//a lorry with 2 person
        test(ferry, "lorry", 2);//a lorry with 2 person
        //Should give error
        test(ferry, "lorry", 2);//a lorry with 2 person

        System.out.println("===== Disembark =====");
        ferry.disembark();
        System.out.println(ferry.toString());
    }

    static void test(Ferry ferry, String vType, int numPassengers) {
        try {
            if(vType.equals("passengers")) {
                System.out.println("===== Enter "+numPassengers+" passenger(s) =====");
                for(int i = 0; i<numPassengers; i++) {
                    ferry.embark(new Passenger(nameGen()));
                }
            } else {
                Vehicle veic;
                if(vType.equals("lorry")) {
                    System.out.println("===== Enter "+vType+" with "+numPassengers+" passenger(s) =====");
                    veic = new Lorry();
                } else if(vType.equals("bus")) {
                    System.out.println("===== Enter "+vType+" with "+numPassengers+" passenger(s) =====");
                    veic = new Bus();
                } else if(vType.equals("bike")) {
                    System.out.println("===== Enter "+vType+" with "+numPassengers+" passenger(s) =====");
                    veic = new Bicycle();
                } else {
                    System.out.println("===== Enter Car with "+numPassengers+" passenger(s) =====");
                    veic = new Car();
                }
                Passenger[] pass = new Passenger[numPassengers];
                for(int i = 0; i<pass.length; i++) {
                    pass[i] = new Passenger(nameGen());
                }
                veic.addPassengers(pass);
                ferry.embark(veic);
            }
            System.out.println(ferry.toString());
        } catch (ExceptionExceedsCapacity error) {
            System.out.println("===== ERROR =====");
            System.out.println(error.toString());
        }
    }

    static String nameGen() {
    	String[] names = {"A", "B", "C", "D", "E", "G","F","H", "I"};
    //	String[] names = {"John", "Manuel", "Adam", "Pedro", "Peter", "Francis","Marco","John Doe", "Mary"};
        return names[(int)(Math.random() * names.length-1)];
    }
}
