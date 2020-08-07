public class Sabuj {
    // default constructor, no parameters
    public Sabuj(){
        System.out.println("I am default constructor");
    }
    // Second constructor, you need to have one or more parameters
    public Sabuj(String nameOfPhoneColor){
        System.out.println("Build a phone of " + nameOfPhoneColor + "color");
    }
    public Sabuj(String typePhoneMemory, int memorySize){
        System.out.println("Build a phone with " + typePhoneMemory + "and size " + memorySize + " GB");
    }
    public Sabuj(int memorySize, String typePhoneMemory){
        System.out.println("Build a phone with " + typePhoneMemory + "and size " + memorySize + " GB");
    }

    public static void main(String[] args) {
        // Declaration of a variable
        String firstName;
        // initialization
        firstName = "Don";
        Sabuj myPhone = new Sabuj();
        myPhone.call("John");
        // myPhone.sendText() == Hello!!! How are you?
        // String textMessage = myPhone.sendText();
        // System.out.println(textMessage);
        Sabuj myBlueColorPhone = new Sabuj("Blue");
        // call your friend Sadaf using myBlueColorPhone
        myBlueColorPhone.call("Sadaf");
        Sabuj phoneWithLargeMemory = new Sabuj("Sand Disk", 256);
        phoneWithLargeMemory.call("Kiran");
        phoneWithLargeMemory.sendText();
    }
    public void call(String name){
        System.out.println("Calling....." + name);
    }
    public String sendText(){
        int numberOfText = 3;
        String textMessage = "Hello!!! How are you?";
        return textMessage;
    }
    public void takePhoto(){
        System.out.println("Taking photo using built in 24MP camera");
    }
    public void listenMusic(){
        System.out.println("Playing music");
    }
}
