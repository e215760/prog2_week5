public class Chatbot {
    private String name1;
    
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }

    public Chatbot(String _name){
        this.name1 = _name;
        System.out.println("cunstructing the bot2");
    }

    public void greeting(){
        System.out.println("Hello My name is "+ this.name1 + " yoro!");
    }

    public void setName(String name2){
        if( name2.equals("FXXX")){
            System.out.println("禁止されています");
        }
        else{
            if (name1 == null){
                System.out.println("bot name change to " + name2);
            }
            else{
                System.out.println("bot name change "+name1 + " to " +name2);
                this.name1 = name2;
            }
            

        }
        
    }

    
}
