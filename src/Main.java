//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author DeBeamount = new Author("Jeanne Marie", "Leprince De Beamount");
        Book beautyAndTheBeast = new Book("Beauty and The Beast", 1740, DeBeamount);


        Author Tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", 1873, Tolstoy);

        System.out.println("beautyAndTheBeast = " + beautyAndTheBeast);
        System.out.println("warAndPeace = " + warAndPeace);
    }

}