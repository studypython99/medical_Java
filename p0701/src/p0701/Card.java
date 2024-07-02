package p0701;

public class Card {
    private String password;
    private int number;
    private String kind;
    
    public Card(int number, String kind) {
        this.number = number;
        this.kind = kind;
    }
    
    public Card(String password, int number, String kind) {
        this.password = password;
        this.number = number;
        this.kind = kind;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getKind() {
        return kind;
    }
    
    public void setKind(String kind) {
        this.kind = kind;
    }
    
    @Override
    public String toString() {
        return "Card{" +
        		", kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }
}
