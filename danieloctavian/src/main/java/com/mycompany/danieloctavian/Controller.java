/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danieloctavian;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controller {
    ArrayList<Model> ArrayData;
    DefaultTableModel tabelModel;
    
    public Controller(){
        ArrayData = new ArrayList<Model>();
    }
    
    public void InsertData(String nama, String jabatan, String id, boolean jenkel){
        Model karyawan = new Model(nama, jabatan, id, jenkel);
        ArrayData.add(karyawan);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"NAMA", "JABATAN", "ID", "JENIS KELAMIN"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(Model n : ArrayData){
            String[] arrData = {n.getNama(), n.getJabatan(), n.getId(), (n.isJenkel()) ? "Perempuan" : "Laki-Laki"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            public boolean isCellEdittable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tabelModel;     
    }
        public static void main(String[] args) {
    }
    
}
