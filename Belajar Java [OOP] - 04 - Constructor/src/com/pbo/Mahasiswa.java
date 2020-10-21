package com.pbo;

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
