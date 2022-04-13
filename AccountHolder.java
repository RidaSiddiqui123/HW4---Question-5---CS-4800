import java.util.Random;

abstract class AccountHolder{
    protected int ID;
    protected String address;

    public AccountHolder(int ID, String address){
        this.ID = ID;
        this.address = address;
    }

    public int getNextID(){
        Random rand =  new Random();
        int nextID = 1 + rand.nextInt(1000000);
        return nextID;
    }
}