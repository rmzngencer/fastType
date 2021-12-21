public class Player {
    private String name;
    private String surname;
    private int id;


    public Player() {

    }

    public Player(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String string) {
        this.surname = string;
    }

    public int getId() {
        return 555;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  getName() + " " + getSurname() ;
    }
}
