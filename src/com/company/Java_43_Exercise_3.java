package com.company;
import java.util.Scanner;
import java.security.SecureRandom;

class Game{
    private int value;
    int noOfGuesses;
    int userGuess;
    public Game(){
        SecureRandom rand = new SecureRandom();
        this.value=rand.nextInt(10);
        this.noOfGuesses = 5;
    }
    public void setLvl(String lvl){
        SecureRandom rand = new SecureRandom();

        if (lvl.equals("Hard")) { this.value= rand.nextInt(1000);}
        else if (lvl.equals("Medium")) { this.value = rand.nextInt(100);}
        else if (lvl.equals("Easy")) { this.value = rand.nextInt(10);}
    }
    public int getValue(){
        return value;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int limit){
        this.noOfGuesses = limit;
    }
    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public int isCorrectNumber(){
        this.noOfGuesses -= 1;
        if (userGuess==value) { return 1; }
        else if (userGuess<value) { return -1; }
        else if (userGuess>value){ return 2; }
        return 0;
    }
    public void printValue(){
        System.out.println(value);
    }
    public void selectLevel(){
        System.out.println("Select difficulty : Type  1 for Easy , 2 for Medium , 3 for Hard");
        int difficulty = takeUserInput();
        switch (difficulty){
            case 1: setLvl("Easy"); break;
            case 2: setLvl("Medium"); break;
            case 3: setLvl("Hard"); break;
            default: System.out.println("Enter proper difficulty next time , Start the Game again !!! "); return;
        }
    }
    public void start(){
        System.out.println(" *** The Game begins *** ");
        selectLevel();
        while (getNoOfGuesses()!=0){
            System.out.println("Enter you guess : ");
            userGuess=takeUserInput();
            int check = isCorrectNumber();
            if (check==1){
                System.out.println("Congrats You Won !!! \n You had "+ getNoOfGuesses() + " Guesses left ! ");
                System.out.println("Press 5 to play again !! ");
                int flag = takeUserInput();
                if(flag==5){
                    setNoOfGuesses(5);
                    selectLevel();
                }
                else {
                    System.out.println("Quitting !!! ");
                    return;
                }
            }
            else if (check==-1) {
                System.out.println("Guess higher !!! ");
            }
            else if (check==2) {
                System.out.println("Guess lower !!! ");
            }
        }
        System.out.println("You Lost the Value was "+getValue());


    }
}
public class Java_43_Exercise_3 {
    public static void main(String[] args) {
        Game newgame = new Game();
        newgame.start();
    }
}
