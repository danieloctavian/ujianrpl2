/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danieloctavian;


public class Model {

    private String nama;
    private String jabatan;
    private String id;
    private boolean jenkel;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isJenkel() {
        return jenkel;
    }

    public void setJenkel(boolean jenkel) {
        this.jenkel = jenkel;
    }
    
    public Model(String nama, String jabatan, String id, boolean jenkel){
        this.nama = nama;
        this.jabatan = jabatan;
        this.id = id;
        this.jenkel = jenkel;
    }
}
