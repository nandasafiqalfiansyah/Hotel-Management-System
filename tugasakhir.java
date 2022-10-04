import java.io.*;
import java.util.Scanner; 
public class tugasakhir {
    public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);

    int menuprogram ;
    do{
        System.out.println("");
        System.out.println("================================================="); 
        System.out.println("--**-- SELAMAT DATANG DI SISTEM PERHOTELAN --**--");
        System.out.println("--**----- HOTEL NANDA SAFIQ ALFIANSYAH ------**--");
        System.out.println("--**---------------- 21533401----------------**--");
        System.out.println("=================================================");
        System.out.println("1. mengecek hotel");
        System.out.println("2. fasilitas");
        System.out.println("3. pesan sekarang");
        System.out.println("4. cetak nota pemesanan");
        System.out.println("5. keluar dari program");
        System.out.println("	");
        System.out.print("masukan pilihan anda : "); 
        
        menuprogram = in.nextInt();
        switch(menuprogram){
        case 1 :mengecekhotel();
        break;
        case 2 :fasilitas();
        break;
        case 3 :pesanhotel();
        break; 
        case 4 :cetak();
        break; 
        case 5 :	
        System.out.println("");
        System.out.println (" ...:::TERIMAKASIH TELAH BERKUNJUNG:::... ") ;
        System.out.println("");
        break;
        
        default : System.out.println("maaf input yang anda masukkan tidak ada di MENU\n");
        }
        }while(menuprogram!=5);
        }

 
    private static void mengecekhotel()throws IOException{
    String lagi = "Y";
    while(lagi.equals("Y")){

        //Inisialisasi Objek dan Mendefinisikan Path Lokasi
        File file = new File("datapesanan.txt");
        if (!file.exists() || !file.canRead()){
        System.out.println("Can’t read " + file);
        return;
         }
        try {
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("--**----- HOTEL NANDA SAFIQ ALFIANSYAH ------**--");
        System.out.println("--**---------------- 21533401----------------**--");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("--**---NOTA RIWAYAT PEMESANAN HOTEL NANDA----**--");
        int i=0;

        //Membuat Statement Try-Resource-Statement
         BufferedReader fIn = new BufferedReader(new FileReader(file));
         String line;
         while((line=fIn.readLine())!= null){
         i++;
         System.out.println(line);
        }

        // perhitungan kondisi hotel
        if(i>0){
            System.out.println("");
            System.out.println("--**-- MOHON MAAF HOTEL SUDAH PENUH --**--");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("mohon maaf riwayat pemesanan tidak ada");
            System.out.println("");
            System.out.println("--**-- HOTEL MASIH MEMILIKI KAMAR KOSONG --**--");
            System.out.println("");
        }
         }
         //menampilkan jika file tidak  ditemukan
         catch (FileNotFoundException e){
         System.out.println("data pemesanan tidak ada ");
        }

    //mengulangi program jika masukan y jika x program stop
    System.out.println("=================================================");
    System.out.print("apakah anda Ingin mengecek kamar lagi (Y/T) ?");
                    Scanner x = new Scanner(System.in);
                    lagi = x.nextLine().toUpperCase(); 

    //menampilkan program jika masukan x 
    }while(lagi.equals("T"))
    {
    System.out.println("");
    System.out.println("=================================================");
    System.out.println("** TERIMAKASIH TELAH MELAKUKAN PENGECEKAN KAMAR **");
    System.out.println("=================================================");
    break;
}
}
     
  
    private static void fasilitas(){ 

     //output penjelasan 
		System.out.println("");
        System.out.println("=================================================");
        System.out.println("--**----- HOTEL NANDA SAFIQ ALFIANSYAH ------**--");
        System.out.println("--**---------------- 21533401----------------**--");
        System.out.println("=================================================");
		System.out.println("");
		System.out.println("--**-- FASILITAS HOTEL NANDA --**--");                                                           
		System.out.println("- 35 kamar");
		System.out.println("- AC");
		System.out.println("- Air Panas/Dingin");
		System.out.println("- TV  LCD 19 ");
		System.out.println("- Area Parkir Luas");
		System.out.println("- Handuk,Sabun,Selimut,Bantal,Guling");
		System.out.println("- Welcome Drink");
		System.out.println("- Breakfeast");
		System.out.println("- Parkir Luas");
		System.out.println("- Mini Resto");
		System.out.println("- Motor rental khusus tamu Hotel Bener");
		System.out.println("");
		System.out.println("");
		System.out.println(" Hotel NANDA");
		System.out.println(" Jl.bener no:9 (sebelah/barat pom bensin Jati kencana masuk ke utara 50 m)ponorogo55112 ");
		System.out.println(" Hubungi Divisi Pemasaran Hotel Bener");
		System.out.println(" nanda safiq .a");
		System.out.println(" Telepon  087738626286");
		System.out.println(" e-mail : ritomg@yahoo.co.id");
		System.out.println(" BRI Cab Mataram No Rek 3015-01-001045-50-8");
		System.out.println("");

    }
    private static void pesanhotel()throws IOException{
    String lagi = "Y";

    //Membuat looping while
    while(lagi.equals("Y"))
    {
    
     // variabe 
    String nama="",kamar="",alamat="",noktp="",notlpn="";
    int jenis=0,status=0,lama=0,tarif=0;
    double diskon=0,bayar=0;
    Scanner input = new Scanner(System.in); 
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            
    
    System.out.println("	");
    System.out.println("=================================================");
    System.out.println("------**-- SISTEM PEMESANAN HOTEL NANDA--**------");
    System.out.println("=================================================");
    System.out.println("	");

     //Input lama data pelanggan
    System.out.println();
    System.out.print("Masukan No ktp\t\t\t: ");
    noktp = input.next();
    System.out.print("Nama Pelanggan\t\t\t: ");
    nama = br.readLine();
    System.out.print("Alamat Pelanggan\t\t: ");
    alamat = input.next();
    System.out.print("Masukan No Telepon\t\t: ");
    notlpn = input.next();

     //Input jenis kamar        
    System.out.println("\nPilih Jenis Kamar");
    System.out.println("1. single Rp. 175.000/hari");
    System.out.println("2. double Rp. 225.000/hari");
    System.out.println("3. suite Rp. 300.000/ hari");
    System.out.print("Jenis kamar yang dipesan \t: ");
    jenis = Integer.parseInt(br.readLine());
     
     //Input lama menginap
    System.out.print("\nLama Menginap /hari \t\t: ");
    lama = Integer.parseInt(br.readLine());
    
     //Input status pelanggan
    System.out.println("\nStatus Pelanggan");
    System.out.println("1. Member");
    System.out.println("2. Non Member");
    System.out.print("Pilih status pelanggan \t\t: ");
    status = Integer.parseInt(br.readLine());
            
    //proses perhitungan
    if (jenis==1){
    tarif = lama*175000;
    kamar="single Room";
    }else if (jenis==2){
    tarif = lama*225000;
    kamar="double Room";
    }else if (jenis==3){
    tarif = lama*300000;
    kamar="suite Room";
    }

    //diskon membership <7-4 hari = 20%
    //diskon membership >7 hari = 35%
    if (status==1){
    if(lama>=4 && lama<=7){
    diskon = 0.20 * tarif;
     }else if (lama>7) {
    diskon = 0.35 * tarif;
    }
    
    //diskon non membership <7-4 hari = 10%
    //diskon non membership >7 hari = 15%
    }else if (status==2){
    if (lama>=4 && lama<=7){
    diskon = 0.10 * tarif;
    }else if (lama>7){
    diskon = 0.15 * tarif;
    }
    }
            
    bayar = tarif-diskon;
            
    //output
    
    System.out.println("\n\n---***--- NOTA PEMBAYARAN HOTEL NANDA ---***---");
    System.out.println("nomor ktp Pelanggan\t\t: " +noktp);
    System.out.println("Nama Pelanggan\t\t\t: " + nama);
    System.out.println("Alamat pelanggan\t\t: " + alamat);
    System.out.println("nomor Telepon Pelanggan\t\t: "+notlpn);
    System.out.println("Jenis Kamar \t\t\t: " + kamar);
    System.out.println("Tarif Penginapan \t\t: Rp " + tarif + ",-");
    System.out.println("Diskon Menginap \t\t: Rp " + diskon + ",-");
    System.out.println("Nominal yang harus dibayar \t: Rp " + bayar + ",-");
    System.out.println("====================================================");

    //Inisialisasi Objek dan Mendefinisikan Path Lokasi
    File file = new File("datapesanan.txt");
   
    //Membuat Statement Try-Resource-Statement
    BufferedWriter bw = null;
    try{

        bw = new BufferedWriter(new FileWriter(
            file,
            true));
        //Menulis data String
        bw.write("\n\n---***--- NOTA PEMBAYARAN HOTEL NANDA ---***---");
        bw.newLine();
        bw.write("nomor ktp Pelanggan\t\t\t: " +noktp);
        bw.newLine();
        bw.write("Nama Pelanggan\t\t\t\t: " + nama);
        bw.newLine();
        bw.write("Alamat pelanggan\t\t\t: " + alamat);
        bw.newLine();
        bw.write("nomor Telepon Pelanggan\t\t\t: "+notlpn);
        bw.newLine();
        bw.write("Jenis Kamar \t\t\t\t: " + kamar);
        bw.newLine();
        bw.write("Tarif Penginapan\t \t\t: Rp " + tarif + ",-");
        bw.newLine();
        bw.write("Diskon Menginap \t\t\t: Rp " + diskon + ",-");
        bw.newLine();
        bw.write("Nominal yang harus dibayar\t\t: Rp " + bayar + ",-");
        bw.newLine();
        bw.write("====================================================");
        
        //Membuat Baris Baru
        bw.newLine();
        bw.write("NANDA HOTEL SWEET");
        bw.newLine();
        bw.write("universitas ponorogo");
        bw.newLine();
        bw.close();
    
    }catch(FileNotFoundException ex){

        //Menampilkan pesan jika file tidak ditemukan
        System.out.println("File "+file.getName()+" mohon maaf nota tidak tersedia"); 

    }catch(IOException ex){
        ex.printStackTrace();

        //Menampilkan pesan jika terjadi error atau file tidak dapat dibaca
        System.out.println("File "+file.getName()+" Tidak Dapat DIbaca");
    }
    finally {
        if (bw != null){
            try {
                bw.close();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    //mengulangi program jika masukan y jika x program stop
    System.out.print("apakah anda Ingin memesan lagi (Y/T) ?");
                    Scanner x = new Scanner(System.in);
                    lagi = x.nextLine().toUpperCase(); 
    }

    //Menampilkan pesan jika memasukan x
    while(lagi.equals("T"))
    {
    System.out.println("====================================================");
    System.out.println("***--- TERIMAKASIH TELAH MELAKUKAN PEMESANAN ---***");
    System.out.println("====================================================");


    break;
    }
    }


    //Program untuk menampilkan cetak nota ke datapesanan
    private static void cetak()throws IOException{ 
    System.out.println("");
    System.out.println("***------- NOTA PEMESANAN SUDAH DI CETAK -------***");
    System.out.println("***------- SILAKAN NOTA BISA DIAMBIL DI -------***");
    System.out.println("***------- KOLOM KIRI ATAS NAMA FILE -------***");
    System.out.println("***--------- nota_pesanan_anda.txt -----------***");
    System.out.println("***--- TERIMAKASIH TELAH MELAKUKAN TRANSAKSI ---***");
    System.out.println("");

    //Inisialisasi Objek dan Mendefinisikan Path Lokasi
    File fileIn = new File("datapesanan.txt");
    File fileOut = new File("nota_pesanan_anda.txt");

    //Menampilkan pesan jika file tidak ditemukan
    if (!fileIn.exists() || !fileIn.canRead()){ 
    System.out.println("teks pada file tidak terbaca" + fileIn); 
    return;
    }

    //Membuat Statement Try-Resource-Statement
    try {
    int i=0;
    BufferedReader fIn=new BufferedReader(new FileReader(fileIn)); 
    BufferedWriter fOut=new BufferedWriter(new FileWriter(fileOut)); 
    String line;
    while((line = fIn.readLine()) != null){ 
    i++;
    fOut.write(line); 
    fOut.newLine();
    }
    fOut.close(); 
    fIn.close();
    }

     //Menampilkan pesan jika terjadi error atau file tidak dapat dibaca
    catch (FileNotFoundException e){ 
    System.out.println("File tidak ditemukan");
    }
}
}


    




    
     

    

