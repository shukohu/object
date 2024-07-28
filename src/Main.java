//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author DeBeamount = new Author("Jeanne Marie", "Leprince De Beamount");
        Book beautyAndTheBeast = new Book("Beauty and The Beast", 1740, DeBeamount);


        Author Tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", 1873, Tolstoy);

        beautyAndTheBeast.setPublished(1756);
        System.out.println();

        System.out.println("Название: " + beautyAndTheBeast.getName() + " Автор: " + DeBeamount.getNameAuthor() + " " + DeBeamount.getSurnameAuthor() + " Год издания: " + beautyAndTheBeast.getPublished());
        System.out.println();
        System.out.println("Название: " + warAndPeace.getName() + " Автор: " + Tolstoy.getNameAuthor() + " " + Tolstoy.getSurnameAuthor() + " Год издания: " + warAndPeace.getPublished());

    }

}