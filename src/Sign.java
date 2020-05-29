
public class Sign {
    //INSTANCE VARIABLES
    String sign;
    int x = (int)(Math.random() * 4.0D);

    //CONSTRUCTOR that determines a the sign depending on the random number
    public Sign() {
        if (this.x == 0) {
            this.sign = "+";
        } else if (this.x == 1) {
            this.sign = "-";
        } else if (this.x == 2) {
            this.sign = "*";
        } else if (this.x == 3) {
            this.sign = "^";
        }
    }

    //GETTER
    public String getSign() {
        return this.sign;
    }
}
