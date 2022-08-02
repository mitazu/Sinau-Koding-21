import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mahasiswa{
    String nama,nim,jurusan;
    Integer nilai;

    public Mahasiswa(String nama, String nim, String jurusan, Integer nilai) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public Integer getNilai() {
        return nilai;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        
        Integer jumlah,nilai;
        String nama,nim,jurusan,status;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();

        List<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

        for(int i=0;i<jumlah;i++){
            System.out.println("Mahasiswa ke "+ (i+1));
            System.out.print("Nama    : "); nama = input2.nextLine();
            System.out.print("Nim     : "); nim = input2.nextLine();
            System.out.print("Jurusan : "); jurusan = input2.nextLine();
            System.out.print("Nilai   : "); nilai = input.nextInt();

            mhs.add(new Mahasiswa(nama,nim,jurusan,nilai));
        }

        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("======================");
        System.out.println("No\tNama\tNIM\tJurusan\tNilai\tStatus");
        Integer i=0;
        for(Mahasiswa a: mhs){
            i++;
            System.out.print( i+ "\t" + a.getNama() + "\t" + a.getNim() + "\t" + a.getJurusan() + "\t" + a.getNilai() + "\t");
            if(a.getNilai()>=65) {
                System.out.println("Lulus");
            }else{
                System.out.println("Tidak Lulus");
            }

        }
    }
}
