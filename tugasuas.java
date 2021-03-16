/*
*	Nama	: Beni Setiawan
*	NIM		: 202013025
*	Prodi	: TIF 1B
*	Makul	: Algoritma Pemograman
*
*/

import java.util.*;
public class tugasuas{
	public static void main (String[]args){

// Tampilan Awal

		System.out.println();
		System.out.println("\t\t\t\t===============================");
		System.out.println("\t\t\t\t=                             =");
		System.out.println("\t\t\t\t=    Projek UAS Algoritma     =");
		System.out.println("\t\t\t\t=                             =");
		System.out.println("\t\t\t\t=/////////////////////////////=");
		System.out.println("\t\t\t\t=                             =");
		System.out.println("\t\t\t\t=     Program Perhitungan     =");
		System.out.println("\t\t\t\t=     Volume Bangun Ruang     =");
		System.out.println("\t\t\t\t=                             =");
		System.out.println("\t\t\t\t===============================");
		System.out.println();


// Masukkan Username dan Password

		String data[]={"Beni","202013025"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nUsername \t: ");
		username=masuk.nextLine();
		System.out.print("Password \t: ");
		password=masuk.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan data yang sudah kita inputkan di atas
		 */
		

		if(username.equals(data[0])&&password.equals(data[1])){
			
			System.out.println();
			System.out.println("|= = = = = = = = = = = = = = = = = = = = = = = = = = = = = |");
			System.out.println("|                                                          |");
			System.out.println("|                   Selamat Datang Di                      |");
			System.out.println("|         Aplikasi Project Uas Algoritma Pemrograman       |");
			System.out.println("| = = = = = = = = = = = = = = = = = = = = = = = = = = = = =|");
			System.out.println();
			menu();
		}else{
			System.out.print("Maaf Data Yang Kamu Inputkan Tidak Sesuai Dengan Apapun : ");
		}
		
		
	}

// Pemilihan di menu awal

	static void menu(){
		
		String menu_utama[]={"Mulai Program","Biodata Pemrogram","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
		System.out.println("3. "+menu_utama[2]);
		
		Scanner pilih=new Scanner(System.in);
		int menu;
		
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			mulai();
		}else if(menu==2){
			biodata();
		}else{
			System.out.println();
			System.out.println("Terima Kasih Telah Menggunakan Program Saya");
			System.out.println("        Semoga Harimu Menyenangkan         ");
			System.exit(0);
		}
	}

// Pemilihan bangun ruang yang ingin dihitung

	static void mulai(){

		int daftar_bangun;
		String bangun_ruang[]={"Volume Kubus","Volume Balok","Volume Kerucut","Volume Prisma Segitiga","Semua","Keluar"};
		
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_ruang[0]);
		System.out.println("2. "+bangun_ruang[1]);
		System.out.println("3. "+bangun_ruang[2]);
		System.out.println("4. "+bangun_ruang[3]);
		System.out.println("5. "+bangun_ruang[4]);
		System.out.println("6. "+bangun_ruang[5]);
		
		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.print("Silahkan Pilih Bangun Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1 :

					System.out.println();
					System.out.println("=======================");
					System.out.println("Menghitung Volume Kubus");
					System.out.println("=======================");
					System.out.println();
					System.out.print("Masukkan Sisi = ");

					double sisi,volume_kubus;

					Scanner terimasisi=new Scanner(System.in);
					sisi=terimasisi.nextDouble();

					volume_kubus=sisi*sisi*sisi;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Kubus Adalah "+volume_kubus);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Telah Selesai");
					menu();
					break;

			case 2:

					System.out.println();
					System.out.println("Menghitung Volume Balok");
					System.out.println("=======================");
					System.out.println();
					System.out.print("Masukkan Panjang = ");

					double panjang_balok,lebar_balok,tinggi_balok,volume_balok;

					Scanner terimapanjang=new Scanner(System.in);
					panjang_balok=terimapanjang.nextDouble();

					System.out.println();
					System.out.print("Masukkan Lebar = ");
					Scanner terimalebar=new Scanner(System.in);
					lebar_balok=terimalebar.nextDouble();

					System.out.println();
					System.out.print("Masukkan Tinggi = ");
					Scanner terimatinggi=new Scanner(System.in);
					tinggi_balok=terimatinggi.nextDouble();

					volume_balok=panjang_balok*lebar_balok*tinggi_balok;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Balok Adalah "+volume_balok);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Telah Selesai");
					menu();
					break;

			case 3 :

					System.out.println();
					System.out.println("Menghitung Volume Kerucut");
					System.out.println("=======================");
					System.out.println();
					System.out.print("Masukkan Luas Alas = ");

					double luas_alas_kerucut,tinggi_kerucut,volume_kerucut;

					Scanner terimaalaskerucut=new Scanner(System.in);
					luas_alas_kerucut=terimaalaskerucut.nextDouble();

					System.out.println();
					System.out.print("Masukkan Tinggi = ");
					Scanner terimatinggikerucut=new Scanner(System.in);
					tinggi_kerucut=terimatinggikerucut.nextDouble();

					volume_kerucut=luas_alas_kerucut*tinggi_kerucut/3;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Kerucut Adalah "+volume_kerucut);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Telah Selesai");
					menu();
					break;

			case 4 :

					System.out.println();
					System.out.println("Menghitung Volume Prisma Segitiga");
					System.out.println("=================================");
					System.out.println();
					System.out.print("Masukkan Luas Alas = ");

					double luas_alas_prisma,tinggi_prisma,volume_prisma;

					Scanner terimaalasprisma=new Scanner(System.in);
					luas_alas_prisma=terimaalasprisma.nextDouble();

					System.out.println();
					System.out.print("Masukkan Tinggi = ");
					Scanner terimatinggiprisma=new Scanner(System.in);
					tinggi_prisma=terimatinggiprisma.nextDouble();

					volume_prisma=luas_alas_prisma*tinggi_prisma/2;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Prisma Segitiga Adalah "+volume_prisma);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Telah Selesai");
					menu();
					break;

			case 5 :

				// Kubus

					System.out.println();
					System.out.println("= = = = = = = = = = = = ");
					System.out.println("Menghitung Volume Kubus");
					System.out.println("= = = = = = = = = = = = ");
					System.out.println();
					System.out.print("Masukkan Sisi = ");

					double sisi1,volume_kubus1;

					Scanner terimasisi1=new Scanner(System.in);
					sisi1=terimasisi1.nextDouble();

					volume_kubus1=sisi1*sisi1*sisi1;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Kubus Adalah "+volume_kubus1);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Kubus Telah Selesai");

				// Balok 

					System.out.println();
					System.out.println("= = = = = = = = = = = = ");
					System.out.println("Menghitung Volume Balok");
					System.out.println("= = = = = = = = = = = = ");
					System.out.println();
					System.out.print("Masukkan Panjang = ");

					double panjang_balok1,lebar_balok1,tinggi_balok1,volume_balok1;

					Scanner terimapanjang1=new Scanner(System.in);
					panjang_balok1=terimapanjang1.nextDouble();

					System.out.println();
					System.out.print("Masukkan Lebar = ");
					Scanner terimalebar1=new Scanner(System.in);
					lebar_balok1=terimalebar1.nextDouble();

					System.out.println();
					System.out.print("Masukkan Tinggi = ");
					Scanner terimatinggi1=new Scanner(System.in);
					tinggi_balok1=terimatinggi1.nextDouble();

					volume_balok1=panjang_balok1*lebar_balok1*tinggi_balok1;

					System.out.println();
					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Balok Adalah "+volume_balok1);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Balok Telah Selesai");

				// Kerucut

					System.out.println();
					System.out.println("= = = = = = = = = = = = = ");
					System.out.println("Menghitung Volume Kerucut");
					System.out.println("= = = = = = = = = = = = = ");
					System.out.println();
					System.out.print("Masukkan Luas Alas = ");

					double luas_alas_kerucut1,tinggi_kerucut1,volume_kerucut1;

					Scanner terimaalaskerucut1=new Scanner(System.in);
					luas_alas_kerucut1=terimaalaskerucut1.nextDouble();

					System.out.println();
					System.out.print("Masukkan Tinggi = ");
					Scanner terimatinggikerucut1=new Scanner(System.in);
					tinggi_kerucut1=terimatinggikerucut1.nextDouble();

					volume_kerucut1=luas_alas_kerucut1*tinggi_kerucut1/3;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Kerucut Adalah "+volume_kerucut1);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Kerucut Telah Selesai");

				// Prisma Segitiga

					System.out.println();
					System.out.println("= = = = = = = = = = = = = = = = = ");
					System.out.println("Menghitung Volume Prisma Segitiga");
					System.out.println("= = = = = = = = = = = = = = = = = ");
					System.out.println();
					System.out.print("Masukkan Luas Alas = ");

					double luas_alas_prisma1,tinggi_prisma1,volume_prisma1;

					Scanner terimaalasprisma1=new Scanner(System.in);
					luas_alas_prisma1=terimaalasprisma1.nextDouble();

					System.out.println();
					System.out.print("Masukkan Tinggi = ");
					Scanner terimatinggiprisma1=new Scanner(System.in);
					tinggi_prisma1=terimatinggiprisma1.nextDouble();

					volume_prisma1=luas_alas_prisma1*tinggi_prisma1/2;

					System.out.println();
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Volume Prisma Segitiga Adalah "+volume_prisma1);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println();
					System.out.println("Proses Menghitung Prisma Segitiga Telah Selesai");

					double hasil[]={volume_kubus1,volume_balok1,volume_kerucut1,volume_prisma1};//array
		double penampung=0;

	
		for(int h=0; h<(hasil.length); h++){
			for(int i=0; i<(hasil.length-1); i++){
				if(hasil[i]>hasil[i+1]){
				penampung=hasil[i];
				hasil[i]=hasil[i+1];
				hasil[i+1]=penampung;
		}
		 }
		System.out.print(h+1+" = ");
		for(int d=0; d<hasil.length; d++){
			System.out.print(hasil[d]+" ");
		}
		System.out.println();
		}

	System.out.print("Data pada array a [] setelah di urutkan = {");
	for(int i=0; i<hasil.length; i++){
	System.out.print(hasil[i]+" , ");
	}
	System.out.println("}");
	menu();
					break;

			case 6 :

					System.out.println();
					System.out.println("========Terima Kasih Telah Berkunjung========");
					System.out.println("          Proses Telah Selesai               ");
					System.out.println("==========Keluar Dari Sistem=================");
					System.exit(0);

			default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menu2+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Sekarang Akan Keluar");
					System.exit(0);


		}

		

	}

// Biodata Pemrogram

	static void biodata(){
        System.out.println("======================================================================|");
		System.out.println("                            Biodata                                   |");
		System.out.println("======================================================================|");
		System.out.println("Nama Saya : Beni Setiawan                                             |");
		System.out.println("TTL       : T2 purwakarya, 12 Desember 2001                           |");
		System.out.println("Umur      : 20 Tahun                                                  |");
		System.out.println("Asal      : kec.Tugumulyo, kab. Musi Rawas, Prov. Sumatera Selatan    |");
		System.out.println("Fakultas  : TIF 1B Politeknik Kampar                                  |");
		System.out.println("Status    : Mahasiswa (Aktif)                                         |");
		System.out.println("======================================================================|");
		System.out.println();
		System.out.println("<><><><><><<>><><><><>><><><> Terima Kasih ><><><><><>><<>>><<><><><<<><<");
		System.out.println("<><><><><><<>><><> Telah Mengunjungi Program Saya ><><><><><>><<>>><<><><");
		System.out.println();
		menu();
	}
		


	}