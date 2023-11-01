/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import Repository.Copy_File_Repository;
import Repository.ICopy_File_Repository;
import view.Menu;

public class Copy_File_Program extends Menu <String>{

    static String[] mc = {"Input Configure File", "Exit"};
    ICopy_File_Repository ifr;

    public Copy_File_Program() {
        super("============Copy Program============", mc);
        ifr = new Copy_File_Repository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> ifr.readFileConfig();
            case 2 -> System.exit(0);
        }
    }
    
}