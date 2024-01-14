class train {

    private String trainName;
    private int trainNumber;
    private String trainType;
    private int noOfCoaches;
    private String locomotiveType;
    /* Setters */

    public void setTrainNumber(int train_number) {

        trainNumber = train_number;

    }

    public void setTrainName(String train_name) {

        trainName = train_name;
    }

    public void setTrainType(String train_type) {
        trainType = train_type;
    }

    public void setNoOfCoaches(int coaches) {
        noOfCoaches = coaches;
    }

    public void setLocomotiveType(String locomotive_type) {

        locomotiveType = locomotive_type;
    }

    /* Getters */

    public String getTrainInformation() {

        return "Train No " + trainNumber + " " + trainName + " " + trainType + " " + " is hauled by " + locomotiveType
                + " locomotive with " + noOfCoaches + " coaches";
    }

    public String getTrainName() {

        return trainName;
    }

}

public class classDemo2 {

    public static void main(String[] args) {

        train t1 = new train();
        t1.setTrainType("Super Fast Express");
        t1.setTrainNumber(12401);
        t1.setTrainName("Nanda Devi");
        t1.setLocomotiveType("Electric");
        t1.setNoOfCoaches(22);

        System.out.println(t1.getTrainInformation());
        System.out.println(t1.getTrainName());
    }

}
