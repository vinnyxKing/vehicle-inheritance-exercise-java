import javax.swing.*;

public class train extends vehicle{

    private int capacity;

    public train(String m, String t) {
        super(m, t);
    }

    @Override
    public void move(String start, String end) {

    }

    public void setCapacity(int c){
        this.capacity = c;
    }
    public int getCapacity(){
        return capacity;
    }

    public void printModelAndCapacity(){
        JOptionPane.showMessageDialog(null,"model of the train is: " + getModel() +
                " train capacity is: " + getCapacity());
    }
}
