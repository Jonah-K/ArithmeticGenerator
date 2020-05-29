

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Overseer {

    //INSTANCE VARIABLES
    private Window _w;
    private Sign _s;
    private Work.Numbers _n;
    String y;
    int ans;
    int x;
    int xx;
    double quesNum = 1.0D;
    double corr = 0.0D;
    String k;
    String u;
    int ques;
    JPanel panel = new JPanel();
    JLabel lbl = new JLabel("How Mant Questions");
    JTextField txt = new JTextField(10);
    double q;
    private Icon clara = new ImageIcon(getClass().getResource("clara.jpg"));
    private Icon clara2 = new ImageIcon(getClass().getResource("clara2.jpg"));
    private Icon clara3 = new ImageIcon(getClass().getResource("clara3.jpg"));


    //CONSTRUCTOR
    public Overseer() {
        this._s = new Sign();
        this._w = new Window();
        this._w.msg("Welcome to Mrs. Jauregui's Arithmetic Problem Generator. Complete problems involving mutiplying, adding, subtracting, and raisng numbers to a power\nto avoid Clara's wrath and find a way to pass pre-calculus. If you ever want to escape from Mrs. Jauregui's game and her opressive rule, just type the word exit, and you'll be able to\nrun away. Answer as many questions as you want, but don't worry since you'll never find a way to pass her exams anyway. Don't try to type anything you aren't\nsupposed to otherwise you'll spend more time with our lord and savior, Mrs. Jauregui. If you're up to the challenge complete all the questions and check your percentage to see if\nClara will be pleased with you");
        JOptionPane.showMessageDialog(null, "BEFORE YOU START\nBOW TO YOUR RULER. THE SAVIOR OF ALL STUDENTS, THE SECOND COMING OF CHRIST, CLARA JAUREGUI", "The Ruler Of All", -1, this.clara);
        display();
    }


    //method that creates an inut asking how many questions, then loops for that many times, creating a question and determining if its correct and adding it to the total score, then displays total score and a message
    public void display() {
        this.u = JOptionPane.showInputDialog("How many Questions");
        this.panel.add(this.lbl);
        this.panel.add(this.txt);
        exitQues();
        this.ques = Integer.parseInt(this.u);
        for (int i = 0; i < this.ques; i++) {
            this._n = new Work.Numbers();
            this.x = this._n.getNum1();
            this.xx = this._n.getNum2();
            this._s = new Sign();
            checkSub();
            this.y = "Question #" + this.quesNum + ":  " + this.x + this._s.getSign() + this.xx;
            this.k = JOptionPane.showInputDialog(this.y);
            exit();
            this.ans = Integer.parseInt(this.k);
            checkCorrect();
            this.quesNum++;
        }
        returnPercent();
        ClaraMsg();
    }


    //method that checks what the sign is, then checks if when perfomring the proper operation, that the answer is correct
    public void checkCorrect() {
        if (this._s.getSign().equals("+") && this.ans == this.x + this.xx) {
            this._w.msg("Thats correct!");
            this.corr++;
        } else if (this._s.getSign().equals("-") && this.ans == this.x - this.xx) {
            this._w.msg("Thats correct!");
            this.corr++;
        } else if (this._s.getSign().equals("*") && this.ans == this.x * this.xx) {
            this._w.msg("Thats correct!");
            this.corr++;
        } else if (this._s.getSign().equals("^") && this.ans == Math.pow(this.x, this.xx)) {
            this._w.msg("Thats correct!");
            this.corr++;
        } else {
            this._w.msg("That's gonna be a check minus on your log\nTry harder next time!!");
        }
    }

    //checks if the subtraction is negative
    public void checkSub() {
        while (this._s.getSign().equals("-") && this.x < this.xx) {
            this.x = (int)(Math.random() * 10.0D);
            this.xx = (int)(Math.random() * 10.0D);
        }
    }

    //returns the percentage of correct answers
    public void returnPercent() {
        this.q = this.corr / this.ques * 100.0D;
        this._w.msg("You got " + this.q + "%");
    }

    //diffrent ways to exit out of the JOptionPane, including hitting the buttons to exit, or if someone types exit, or if the person does not type a number
    // IN HINDSIGHT, A TRY CATCH WOULDVE BEEN A LOT BETTER HERE, BUT AT THE TIME, I DIDNT KNOW WHAT IT WAS!
    public void exit() {
        while (this.k == null) {
            int x = JOptionPane.showConfirmDialog(null,
                    "Would you like to close the program?\nif no, you will restart because you're stupid and pressed the cancel button",
                    "Exit?", 0);
            if (x == 0) {
                System.exit(0);
                continue;
            }
            if (x == 1) {
                display();
                System.exit(0);
            }
        }
        if (this.k.equalsIgnoreCase("exit"))
            System.exit(0);
        if (this.k.equals("")) {
            int x = JOptionPane.showConfirmDialog(null,
                    "Would you like to close the program?\nif no, you will restart because you're stupid and pressed the ok button",
                    "Exit?", 0);
            if (x == 0) {
                System.exit(0);
            } else if (x == 1) {
                display();
                System.exit(0);
            }
        }
        if (this.k.toLowerCase().contains("a") || this.k.toLowerCase().contains("b") || this.k.toLowerCase().contains("c") || this.k.toLowerCase().contains("d") || this.k.toLowerCase().contains("e") || this.k.toLowerCase().contains("f") || this.k.toLowerCase().contains("g") || this.k.toLowerCase().contains("h") || this.k.toLowerCase().contains("i") || this.k.toLowerCase().contains("j") || this.k.toLowerCase().contains("k") || this.k.toLowerCase().contains("l") || this.k.toLowerCase().contains("m") || this.k.toLowerCase().contains("n") || this.k.toLowerCase().contains("o") || this.k.toLowerCase().contains("p") || this.k.toLowerCase().contains("q") || this.k.toLowerCase().contains("r") || this.k.toLowerCase().contains("s") || this.k.toLowerCase().contains("t") || this.k.toLowerCase().contains("u") || this.k.toLowerCase().contains("v") || this.k.toLowerCase().contains("w") || this.k.toLowerCase().contains("x") || this.k.toLowerCase().contains("y") || this.k.toLowerCase().contains("z") || this.k.contains("<") || this.k.contains(",") || this.k.contains(">") || this.k.contains(".") || this.k.contains("?") || this.k.contains("/") || this.k.contains(";") || this.k.contains(":") || this.k.contains("'") || this.k.contains("{") || this.k.contains("[") || this.k.contains("}") || this.k.contains("]") || this.k.contains("|") || this.k.contains("\\") || this.k.contains("\"") || this.k.contains("+") || this.k.contains("=") || this.k.contains("-") || this.k.contains("_") || this.k.contains(")") || this.k.contains("(") || this.k.contains("*") || this.k.contains("&") || this.k.contains("^") || this.k.contains("%") || this.k.contains("$") || this.k.contains("#") || this.k.contains("@") || this.k.contains("!") || this.k.contains("`") || this.k.contains("~")) {
            this._w.msg("Now thats not a number. Due to you not knowing what a number is, you're gonna have to restart her exercise so that you can\nlearn your numbers and spend more time with Mrs. Jauregui. ");
            display();
            System.exit(0);
        }
    }
    //diffrent ways to exit out of the JOptionPane for the intial amount of questions to be asked, including hitting the buttons to exit, or if someone types exit, or if the person does not type a number
    // IN HINDSIGHT, A TRY CATCH WOULDVE BEEN A LOT BETTER HERE, BUT AT THE TIME, I DIDNT KNOW WHAT IT WAS!
    public void exitQues() {
        while (this.u == null) {
            this._w.msg("Nope, Mrs. Jauregui doesn't like people who try her games.");
            display();
            System.exit(0);
        }
        if (this.u.equalsIgnoreCase("exit"))
            System.exit(0);
        if (this.u.equals("")) {
            this._w.msg("Nope, Mrs. Jauregui doesn't like people who try her games.");
            display();
            System.exit(0);
        }
        if (this.u.equals("0")) {
            this._w.msg("Nope, Mrs. Jauregui doesn't like people who try her games.");
            display();
            System.exit(0);
        }
        if (this.u.toLowerCase().contains("a") || this.u.toLowerCase().contains("b") || this.u.toLowerCase().contains("c") || this.u.toLowerCase().contains("d") || this.u.toLowerCase().contains("e") || this.u.toLowerCase().contains("f") || this.u.toLowerCase().contains("g") || this.u.toLowerCase().contains("h") || this.u.toLowerCase().contains("i") || this.u.toLowerCase().contains("j") || this.u.toLowerCase().contains("k") || this.u.toLowerCase().contains("l") || this.u.toLowerCase().contains("m") || this.u.toLowerCase().contains("n") || this.u.toLowerCase().contains("o") || this.u.toLowerCase().contains("p") || this.u.toLowerCase().contains("q") || this.u.toLowerCase().contains("r") || this.u.toLowerCase().contains("s") || this.u.toLowerCase().contains("t") || this.u.toLowerCase().contains("u") || this.u.toLowerCase().contains("v") || this.u.toLowerCase().contains("w") || this.u.toLowerCase().contains("x") || this.u.toLowerCase().contains("y") || this.u.toLowerCase().contains("z") || this.u.contains("<") || this.u.contains(",") || this.u.contains(">") || this.u.contains(".") || this.u.contains("?") || this.u.contains("/") || this.u.contains(";") || this.u.contains(":") || this.u.contains("'") || this.u.contains("{") || this.u.contains("[") || this.u.contains("}") || this.u.contains("]") || this.u.contains("|") || this.u.contains("\\") || this.u.contains("\"") || this.u.contains("+") || this.u.contains("=") || this.u.contains("-") || this.u.contains("_") || this.u.contains(")") || this.u.contains("(") || this.u.contains("*") || this.u.contains("&") || this.u.contains("^") || this.u.contains("%") || this.u.contains("$") || this.u.contains("#") || this.u.contains("@") || this.u.contains("!") || this.u.contains("`") || this.u.contains("~")) {
            this._w.msg("Now thats not a number. Due to you not knowing what a number is, you're gonna have to spend more time with Mrs. Jauregui.");
            display();
            System.exit(0);
        }
    }

    //displays a message depending on the percentage learned
    public void ClaraMsg() {
        if (this.q >= 85.0D) {
            JOptionPane.showMessageDialog(null, "Clara is proud of you. Keep up the good work and maybe you'll be able to pass her class.", "Clara Is Happy", -1, this.clara3);
        } else {
            JOptionPane.showMessageDialog(null, "Clara thinks of you as a stupid monkey, you should have done better to not upset our ruler. She will now guarantee you fail her class by killing you and your family", "Clara Isn't Happy", -1, this.clara2);
        }
    }
}
