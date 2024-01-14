class train {

    private int trainNumber;
    private String trainName;
    private String trainType;
    private String locomotiveType;

    // public train() {

    // // System.out.println("Default Constructor!");

    // trainNumber = 12303;
    // trainName = "Poorva ";
    // trainType = "Superfast Express";
    // locomotiveType = "Electric";

    // }

    public train(String train_name, int train_number, String train_type, String locomotive_type) {

        trainName = train_name;
        trainNumber = train_number;
        trainType = train_type;
        locomotiveType = locomotive_type;

    }

    public String getDescription() {
        return "Train Number " + trainNumber + " " + trainName + " " + trainType + " is hauled by a " + locomotiveType
                + " locomotive";
    }

}

public class classDemo3 {

    public static void main(String[] args) {

        train t2 = new train("Barmer", 12323, "Superfast Express", "Electric");
        System.out.println(t2.getDescription());

    }

}
