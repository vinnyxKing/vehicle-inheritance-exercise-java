public abstract class vehicle {
    protected String type;
    protected String model;

    public vehicle(){

    }
    public  vehicle(String m, String t){
        this.model = m;
        this.type = t;
    }

    public String getType(){
        return type;
    }
    public String getModel(){
        return model;
    }

    public void move(){
    }

    public abstract void move(String start, String end);
}
