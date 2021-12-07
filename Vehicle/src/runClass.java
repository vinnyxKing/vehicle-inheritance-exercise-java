import javax.swing.*;

public class runClass {
    public static void main(String[] args) {

        train newtrain = new train("Bachman","Transport Train");
        newtrain.setCapacity(170);
        newtrain.move("Koln","Amsterdam");

        JOptionPane.showMessageDialog(null,"type of the train is "+newtrain.model);


        bus newBus = new bus("Double decker 400","Arrival Bus");
        newBus.setKms(40000);
        newBus.isGas(true);
        newBus.move("london Bridge","Greenwich");

    }
}
