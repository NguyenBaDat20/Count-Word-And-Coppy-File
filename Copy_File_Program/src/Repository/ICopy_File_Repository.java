/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import model.Config;

public interface ICopy_File_Repository {
    void readFileConfig();
    void createFileConfig();
    boolean checkConfig(Config config);
    void copyFolder(Config config);
}
