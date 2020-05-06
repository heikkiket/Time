/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heikki.timeUtils;

/**
 *
 * @author heikki
 */
public class Main {
    public static void main(String[] args) {
        int aika = 3665;
        String tulos = TimeUtils.secToTime(aika);
        System.out.println("Aika: " + tulos);


    }
 
}
