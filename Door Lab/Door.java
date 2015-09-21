
public class Door
{
    private String nameOfDoor;
    private String stateOfDoor;
    public Door(String stateOfDoor,String nameOfDoor)
    {
        this.nameOfDoor=nameOfDoor;
        this.stateOfDoor=stateOfDoor;
    }
    public void open()
    {
        this.stateOfDoor="open";
    }
    public void close()
    {
        this.stateOfDoor="close";
    }
    public String getNameOfDoor()
    {
        // put your code here
        return this.nameOfDoor;
    }
    public String getStateofDoor()
    {
        // put your code here
        return this.stateOfDoor;
    }
    public void setName(String newName)
    {
        // put your code here
        this.nameOfDoor = newName;
    }
    public void setState(String newState)
    {
        // put your code here
        this.stateOfDoor = newState;
    }
}

