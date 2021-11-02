public class Main {

    public static void main(String[] args){

    System.out.println("main method runs."); 
    Chatbot bot1 = new Chatbot();
    Chatbot bot2 = new Chatbot();
    bot2.setName("name");
    bot2.greeting();
    bot2.setName("name2");
    bot2.greeting();
    bot2.setName("FXXX");
    }
    
}
