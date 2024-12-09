package com.tutorial;

class player {
    //variabel
    private String nama;

    //Konstruktor
    player(String nama){
        this.nama = nama;
    }

    //method cetak
    void cetak(){
        System.out.println("nama : " + this.nama);
    }
    
}
