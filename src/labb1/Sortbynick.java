/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb1;

import java.util.Comparator;

/**
 * @author André Nordlund
 * @date 2021-02-10
 * @course name Java 2
 * @Lab number 1
 */
public class Sortbynick implements Comparator<Friend>{
    @Override
    public int compare(Friend a, Friend b){
        return a.getNick().compareTo(b.getNick());
    }
}
