public class Main {
    public static void main(String[] args){

        // Instance a class about component
        Window screen = new Window("Calculator BB");
        Panel painel1 = new Panel();

        screen.add(painel1);
        screen.setVisible(true);
    }
}
