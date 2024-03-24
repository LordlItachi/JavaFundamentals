package com.company;
interface Camera{
    void snapshot();
    void recordVideo();
    default void panorama(){
        System.out.println("Capturing an panorama please move camera pov ");
    }
}
interface Wifi{
    String[] getAvailableNetworks();
    void connectNetworks(String network);
    void disconnect();
}
class Phone{
    void callNumber(int number){
        System.out.println("Calling ... "+ number);
    }
    void pickCall(){
        System.out.println("Connecting ... ");
    }
}
class SmartPhone extends Phone implements Camera , Wifi{
    String connectedWifi;
    public void snapshot(){
        System.out.println("Taking snapshot !!! ");
    }
    public void recordVideo(){
        System.out.println("Recording Video !!! ");
    }
    public String [] getAvailableNetworks(){
        String [] availabeNetworks = {"Home","office1","Neighbour","Public wifi",};
        return availabeNetworks;
    }
    public void connectNetworks(String network) {
        this.connectedWifi=network;
    }
    public void disconnect(){
        this.connectedWifi=null;
    }

    @Override
    void pickCall() {
        String line = "Secured Connection establishing ...";
        System.out.println(line);
    }
}
public class Java_57_Interfaces_and_defaultMethods {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        for (String network : myPhone.getAvailableNetworks()){
            if (network.equals("Home")){
                myPhone.connectNetworks(network);
            }
        }
        System.out.println("You are connected to the Wifi : "+myPhone.connectedWifi);
        myPhone.callNumber(123456789);
        myPhone.recordVideo();
        myPhone.panorama();


    }
}
