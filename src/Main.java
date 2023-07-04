public class Main {
    public static void main(String[] args) {
        Book harrypotter = new Book();
        System.out.println(harrypotter.getContents());
        harrypotter.updateContents("Hi, Harry");
        System.out.println(harrypotter.getContents());
    }

}