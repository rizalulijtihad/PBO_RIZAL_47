class Display {
    // variabel objek/Data Member
    private String Nama;
    // variabel static milik class
    static String tipe = "Display";
    
    // konstruktor
    Display(String Nama) {
        this.Nama = Nama;
    }

    // method cetak
    void cetak() {
        System.out.println("Display Name : " + this.Nama);
    }
    
    // method setter 
    void settipe(String tipeInput) {
        // Mengubah nilai variabel static 'tipe'
        Display.tipe = tipeInput;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Display display1 = new Display("Monitor");
        display1.cetak();
        
        Display display2 = new Display("Smartphone");
        display2.cetak();
    
        // menampilkan isi dari static variabel
        System.out.println("Menampilkan static variabel");
        System.out.println("Objek1 : " + display1.tipe);  // Static variabel, accessed via object (not recommended)
        System.out.println("Objek2 : " + display2.tipe);  // Same as above
        System.out.println("class : " + Display.tipe);  // Recommended way
    
        // menulis ulang isi variabel static
        Display.tipe = "Tampilan";  // Static variable accessed via class
    
        // menggunakan setter 
        display1.settipe("Spanduk");

        // memanggil isi variabel static
        System.out.println("Menampilkan static variabel");
        System.out.println("Objek1 : " + display1.tipe);  // After setter
        System.out.println("Objek2 : " + display2.tipe);  // After setter
        System.out.println("Class : " + Display.tipe);  // After setter
    }
}
