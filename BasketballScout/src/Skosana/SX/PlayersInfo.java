/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Skosana.SX;

/**
 *
 * @author kayte
 */
public class PlayersInfo {
    private String nameOfPlayer;
    private String surnameOfPlayer;
    private String playersPosition;
    private String previousTeam;
    private int age;

    public PlayersInfo(String nameOfPlayer, String surnameOfPlayer, String playersPosition, String previousTeam, int age) {
        this.nameOfPlayer = nameOfPlayer;
        this.surnameOfPlayer = surnameOfPlayer;
        this.playersPosition = playersPosition;
        this.previousTeam = previousTeam;
        this.age = age;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSurnameOfPlayer() {
        return surnameOfPlayer;
    }

    public void setSurnameOfPlayer(String surnameOfPlayer) {
        this.surnameOfPlayer = surnameOfPlayer;
    }

    public String getPlayersPosition() {
        return playersPosition;
    }

    public void setPlayersPosition(String playersPosition) {
        this.playersPosition = playersPosition;
    }

    public String getPreviousTeam() {
        return previousTeam;
    }

    public void setPreviousTeam(String previousTeam) {
        this.previousTeam = previousTeam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String checkAgeGroup(String nameOfPlayer, String surnameOfPlayer, String playersPosition, String previousTeam, int age)
    {
        String msg = " ";
        if(age >= 18)
        {
            msg = "Hi, " + nameOfPlayer + " " + surnameOfPlayer + " you qualify for the institutions basketball team!";
        }
        else
        {
            msg = "Hi, " + nameOfPlayer + " " + surnameOfPlayer + " you qualify for the instituions development team!";
        }
        
        return msg;
    }

    public String toString() {
        return  nameOfPlayer +"\t\t"+ surnameOfPlayer +"\t"+ playersPosition;
    }
    

}
