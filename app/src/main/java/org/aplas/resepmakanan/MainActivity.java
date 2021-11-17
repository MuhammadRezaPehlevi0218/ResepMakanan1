package org.aplas.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> bahan = new ArrayList<>();
    private ArrayList<String> caraMasak = new ArrayList<>();
//    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.bottom_navigasi);

        getData();
//        menu();
    }
    private void proses(){
        RecyclerView recyclerView = findViewById(R.id.recyleview);
        RecycleViewAdapter adapter = new RecycleViewAdapter(foto, nama, info, bahan, caraMasak, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
//    private void menu(){
//        tabLayout = findViewById(R.id.bottom_navigasi);
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_home),0);
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_add),1);
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_person),2);
//
//        tabLayout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.black), PorterDuff.Mode.SRC_IN);
//        tabLayout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
//        tabLayout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                tab.getIcon().setColorFilter(getResources().getColor(R.color.black),PorterDuff.Mode.SRC_IN);
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                tab.getIcon().setColorFilter(getResources().getColor(R.color.white),PorterDuff.Mode.SRC_IN);
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
    private void getData(){

        nama.add("Soto Lamongan");
        foto.add("https://4.bp.blogspot.com/-2zdY6kmMeAg/WCQu9sLjCzI/AAAAAAAAQPQ/R9VMD5qGQAYzeRV82wHximLndhX9wcrLwCLcB/s1600/soto-lamongan1.jpg");
        info.add("Soto adalah makanan yang sudah dikenal oleh masyarakat Indonesia. Namun soto lamongan adalah soto khas dari daerah Lamongan Jawa Timur. Walaupun soto ini banyak juga dijual diberbagai daerah / kota besar di Indonesia, namun ke khasan rasa dan penampilan soto lamongan menjadi variasi tersendiri serta memperkaya keanekaragaman soto di Indonesia.");
        bahan.add("1 ekor ayam ukuran sedang\n" +
                "Bumbu halus :\n" +
                "11 siung bawang merah\n" +
                "9 siung bawang putih\n" +
                "1 bh ruas kunyit bakar\n" +
                "7 butir kemiri\n" +
                "1/2 sdt lada bubuk\n" +
                "1/2 ketumbar bubuk\n" +
                "Bumbu cemplung\n" +
                "4 batang sereh (geprek)\n" +
                "4 lembar daun jeruk\n" +
                "4 lembar daun salam\n" +
                "4 ruas daun bawang");
        caraMasak.add("Bersihkan ayam lalu masak\n" +
                "Soto ayam lamongan langkah memasak 1 foto\n" +
                "Sambil menunggu ayam mendidih, siapkan bumbu halus & blender\n" +
                "Soto ayam lamongan langkah memasak 2 foto\n" +
                "Lalu tumis bumbu halus & bumbu cemplung hingga harum\n" +
                "Soto ayam lamongan langkah memasak 3 foto\n" +
                "Setelah itu masukkan bumbu kedalam kuah & masak hingga mendidih\n" +
                "Soto ayam lamongan langkah memasak 4 foto\n" +
                "Angkat daging ayam lalu goreng sebentar & suwir² sisihkan\n" +
                "Utk membuat bubuk koya, goreng kerupuk & bawang putih yg telah di iris tsb hingga krispy lalu blender kering hingga halus (me: pakai chopper) Maaf gak ke foto\uD83D\uDE01\uD83D\uDE4F\n" +
                "Lalu siapkan semua pelengkap : jeruk nipis, kacang goreng, seledri & daun bawang iris halus, kol iris, ketupat, sambel, telur rebus, ayam suwir & bawang goreng\n" +
                "Jika telah matang koreksi rasa & lalu hidangkan");


        nama.add("Pecel Madiun");
        foto.add("https://th.bing.com/th/id/OIP.4YbvSMtH4L63HZGxOVQIYgHaEK?w=263&h=180&c=7&r=0&o=5&pid=1.7");
        info.add("Makanan Khas Jawa Timur selanjutnya dikenal dengan nama pecel madiun. Sesuai dengan namanya, pecel ( pecal) ini berasal dari Madiun Jawa Timur. Pecel sendiri merupakan makanan tradisional yang dibuat dari berbagai sayuran yang direbus kemudian diberikan bumbu sambel kacang.");
        bahan.add("100 gr kacang tanah\n" +
                "50 gr gula merah\n" +
                "6 siung bawang putih\n" +
                "6 buah cabai merah keriting\n" +
                "1 ruas kencur\n" +
                "5 lembar daun jeruk, buang tulang daunnya\n" +
                "1 sdt garam\n" +
                "Minyak utk menggoreng");
        caraMasak.add("Panaskan minyak, goreng kacang tanah hingga matang. Angkat & tiriskan.\n" +
                "Sambal Pecel Madiun langkah memasak 1 foto\n" +
                "Goreng juga bawang putih, cabai keriting merah, kencur & daun jeruknya hingga matang. Angkat & tiriskan.\n" +
                "Sambal Pecel Madiun langkah memasak 2 foto\n" +
                "Setelah kacang tanah & bumbunya dingin, masukkan ke dalam chopper. Tambahkan gula merah & garam. Kemudian haluskan. Setelah halus, bisa disimpan utk persedian. Atau langsung diseduh dengan air panas & sajikan dengan sayur mayur, tempe, tahu & kerupuk.");

        nama.add("Rujak Cingur");
        foto.add("https://1.bp.blogspot.com/-YAwYSQRno4g/WCO7uDQRyhI/AAAAAAAAQOM/Va5eMCKCjNQPuWkKwdnI1MLYxnyuWA9pACLcB/s1600/rujak%2Bcingur.jpg");
        info.add("Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama di daerah asalnya Surabaya.Dalam bahasa Jawa kata cingur berarti \"mulut\", hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan dicampurkan ke dalam hidangan.");
        bahan.add("100 gram Cingur/kikil sapi\n" +
                "1 ikat kangkung\n" +
                "1 ikat kecil kacang panjang\n" +
                "1 mangkok kecil taoge\n" +
                "1 buah mentimun\n" +
                "1 buah nanas\n" +
                "bengkuang, mangga, belimbing dll\n" +
                "2 potong tempe goreng\n" +
                "2 potong tahu goreng\n" +
                "2 buah lontong siap makan (iris²)\n" +
                "Bumbu rujak :\n" +
                "5 buah cabai rawit (sesuai selera)\n" +
                "1 SDM bawang putih goreng\n" +
                "3 SDM kacang tanah goreng/sangrai\n" +
                "3 SDM petis biasa\n" +
                "1/2 buah Jambu kluthuk mentah\n" +
                "1 SDM petis spesial\n" +
                "1 sdt terasi\n" +
                "1 1/2 keping atau 25 g gula merah\n" +
                "2 SDM air asam jawa\n" +
                "100 ml (1/2 gelas kecil) air\n" +
                "1/2 sdt gula pasir\n" +
                "1 sdt garam");
        caraMasak.add("Rebus kikil dengan jahe, lengkuas, serai geprek hingga empuk. Angkat tiriskan. Potong² lalu seasoning dengan garam. Panaskan sedikit minyak lalu goreng sebentar.\n" +
                "Cuci², Potong, petik lalu rebus sayuran.\n" +
                "Goreng tahu dan tempe, potong kotak².\n" +
                "Potong buah²an. Lebih enak lagi kalau ada bengkuang, mangga mengkel, jambu air ya. Dirumah saya cuma ready dua buah ini.\n" +
                "Uleg bawang putih goreng, cabe, terasi hingga halus. Tambahkan kacang tanah, uleg sisihkan kepinggir cobek. Lalu masukkan gula merah sisir, air asam, gula, garam. Uleg hingga halus. Terakhir tambahkan air, petis aduk². Masukkan irisan lontong, tahu tempe goreng dan buah²an. Aduk² dengan bumbu.\n" +
                "Siapkan piring, tata bahan yang sudah dicampur bumbu rujak tadi. Tambahkan sayuran diatasnya.");

        nama.add("Lontong Balap");
        foto.add("https://4.bp.blogspot.com/-LgBYJqa2sOU/WCPAZMUD7LI/AAAAAAAAQOg/HCHsCU81VuARLl3C-x18ChIsXAAerpDxQCLcB/s320/lontong%2Bbalap.jpg");
        info.add("Lontong Balap adalah makanan tradisional khas Surabaya Jawa Timur. Disebut \"Balap\" konon ceritanya pada zaman dahulu para penjual lontong ini berebut pembeli dijalan dan di pasar. Sehingga para penjual terkesan balapan untuk mencapai pos terakhir (pasar wonokromo), maka terkenalah istilah lontong balap.");
        bahan.add("300 gr Toge, cuci bersih\n" +
                "1 liter Air Kaldu\n" +
                "2 btg Daun Bawang\n" +
                "1 btg Daun Seledri\n" +
                "sesuai selera Garam\n" +
                "sesuai selera Gula\n" +
                "1 sdt lada bubuk\n" +
                "2 sdm minyak goreng\n" +
                "Bumbu halus :\n" +
                "4 butir bawang merah\n" +
                "6 siung bawang putih\n" +
                "Sambal Petis :\n" +
                "2 siung bawang putih\n" +
                "15 cabe rawit\n" +
                "3 sdm petis\n" +
                "sesuai selera Garam\n" +
                "sesuai selera Gula pasir\n" +
                "3 sdm kecap manis\n" +
                "2 sdm minyak goreng\n" +
                "200 ml air\n");
        caraMasak.add("Haluskan bumbu toge, tumis hingga wangi\n" +
                "Tambahkan air aduk rata, setelah mendidih, tambahkan lada, garam dan gula, aduk rata.\n" +
                "Masukkan Toge dan Daun Bawang Seledri, aduk rata dan matikan kompor.\n" +
                "Sambal Petis : Rebus bawang putih dan cabe, ulek halus, tambahkan Petis uleg sampai tercampur rata.\n" +
                "Tambahkan air, panaskan minyak dan tumis sambal Petis, tambahkan garam, kecap dan gula, aduk rata. Masak sambal Petis hingga meletup-letup. Tes rasa.\n" +
                "Cara penyajian : siapkan piring, potong lontong, potong2 tahu dan lentho\n" +
                "Tambahkan toge dan siram kuahnya, tambahkan sambal Petis di atas toge, dan taburi bawang goreng. Lontong Balap siap dihidangkan");

        nama.add("Sate Kerang");
        foto.add("https://1.bp.blogspot.com/-3PWIvAdFd5s/WCPDDffAL6I/AAAAAAAAQOs/lgoiINvniO8WjzGa9rSbo0wIw02icekzgCLcB/s1600/Sate-Kerang-Scallop-Satay-Unique-Food-Of-Surabaya-East-Java.jpg");
        info.add("Walaupun namanya sate, tapi sate kerang khas Jawa Timur ini tidak sama dengan sate kebanyakan yang dimatangkan dengan cara dipanggang diatas bara api.");
        bahan.add("500 gr kerang\n" +
                "3 lbr daun salam\n" +
                "1 serai\n" +
                "Kecap manis\n" +
                "3 siung bawang putih\n" +
                "7 bawang merah\n" +
                "3 butir kemiri\n" +
                "3 cabai merah\n" +
                "1 sdm irisan lengkuas\n" +
                "1/2 sdt Asam jawa");
        caraMasak.add("Cuci bersih kerang\n" +
                "Haluskan bawang putih, bawang merah, kemiri, cabai merah, lengkuas.\n" +
                "Tumis bumbu yang dihaluskan, lalu masukkan serai, daun salam, asam jawa.\n" +
                "Masukkan kerang, tambahkan air. Masak hingga kerang matang/empuk dan air habis. Lalu dinginkan\n" +
                "Tusuk dengan tusukan sate. Panggang diatas teflon sampai panas. Kerang siap dihidangkan");

        nama.add("Lontong Kupang");
        foto.add("https://2.bp.blogspot.com/-T7VOuZVGRZY/WCQoAkQ9S4I/AAAAAAAAQO8/qket3Jh2Ej02SwCwkqLscDZw-ZhjzRY7gCLcB/s320/lontong%2Bkupang.jpg");
        info.add("Lontong Kupang adalah makanan khas Jawa Timur yang terkenal khususnya di daerah Surabaya, Sidoarjo dan Pasuruan. Di daerah pesisir Jawa Timur, lontong kupang atau kupang lontong yang terkenal adalah kupang keraton.");
        bahan.add("50 gram kupang kering\n" +
                "2 siung bawang putih\n" +
                "1 ruas jahe\n" +
                "500 ml air untuk Kuah\n" +
                "secukupnya Garam dan kaldu bubuk\n" +
                "Bahan pelengkap:\n" +
                "Lentho garing singkong (lihat resep)\n" +
                "Lontong (lihat resep)\n" +
                "Bawang goreng\n" +
                "Petis kupang yg sudah diberi bawang putih goreng dan cabe rawit\n" +
                "Petis udang (bisa dipilih salah satu)\n" +
                "Jeruk nipis");
        caraMasak.add("Siapkan semua bahan, rendam kupang kering dengan air panas setelah mengembang tiriskan kerang nya\n" +
                "Geprek bawang putih dan jahe lalu tumis sampai wangi kemudian masukkan air\n" +
                "Setelah mendidih masukkan kerang kupang yang sudah ditiriskan beri garam dan kaldu bubuk lalu cek rasa, siapkan piring masukkan 1 SDM petis kupang dan petis udang\n" +
                "Beri kuah kupang aduk2 sampai rata, potong2 lontong kemudian siram dengan kupang beri lentho garing singkong dan irisan jeruk,lontong kupang siap di sajikan minus sate kerang");

        nama.add("Nasi Krawu");
        foto.add("https://4.bp.blogspot.com/-HJrY0WKklA0/WCQzz-QYiBI/AAAAAAAAQPg/3j6WHZ2yq-MeYBcJv9tBIsyJ_JwlCxAPACLcB/s320/nasi-krawu.jpg");
        info.add("Nasi Krawu adalah makanan khas Jawa Timur yang berasal dari Gresik.\n" +
                "Cirinya adalah nasinya yang pulen dan disajikan dengan daun pisang. ");
        bahan.add("Bahan empal suwir\n" +
                "500 gr daging sapi\n" +
                "800 ml santan encer\n" +
                "100 gr gula merah\n" +
                "2 sdm air asam jawa\n" +
                "3 lembar daun jeruk\n" +
                "2 lembar daun salam\n" +
                "3 batang sereh geprek\n" +
                "2 ruas lengkuas\n" +
                "Bumbu yg dihaluskan\n" +
                "12 siung bawang merah\n" +
                "7 siung bawang putih\n" +
                "3 butir kemiri goreng\n" +
                "1 sdm ketumbar\n" +
                "1/2 sdt lada\n" +
                "secukupnya Garam, gula\n" +
                "Bahan koya kelapa\n" +
                "1/2 butir kelapa parut\n" +
                "3 siung bawang putih\n" +
                "2 lembar daun jeruk\n" +
                "5 buah cabe merah\n" +
                "secukupnya Gula, garam");
        caraMasak.add("Cuci bersih daging, potong besar2 krn nanti mau disuwir, masukkan santan encer, daging, bumbu halus serta bumbu lainnya masak sampai daging empuk, tambahkan santan kental sampai air menyusut.\n" +
                "Angkat daging, suwir2,lalu kembalikan ke wajan masak dengan sisa kuah sampai asat (kuah habis), daging agak kering\n" +
                "Cara memasak koya kelapa: haluskan semua bumbu campur dengan kelapa parut masak diwajan sampai kelapa kering\n" +
                "Cara penyajian :ambil selembar daun pisang, tata nasi putih panas, beri empal suwir, tata koya kelapa disamping daging, terakhir beri sambal... Sego/nasi krawu khas gresik siap disajikan.");

        nama.add("Rawon");
        foto.add("https://4.bp.blogspot.com/-YsF2e-skoEY/WCQ19-8XuaI/AAAAAAAAQPo/XD0TVqU729wZOjemn4hA4-oUVEkcUkfYQCLcB/s320/rawon.jpeg");
        info.add("Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang mengandung kluwek. Rawon dikenal sebagai masakan khas Jawa Timur, walaupun makanan ini juga terkenal di daerah Surakarta Jawa Tengah. ");
        bahan.add("10 bj kluwak, rendam air panas\n" +
                "10 bawang merah\n" +
                "5 bawang putih\n" +
                "1 telunjuk kunyit\n" +
                "5 kemiri sangrai\n" +
                "1 sdm mujung ketumbar sangrai\n" +
                "5 lombok besar\n" +
                "Sejempol jahe\n" +
                "1/2 sdt jinten\n" +
                "2 sdt merica, garam, gula, 1 penyedap rasa sapi\n" +
                "bumbu cemplungan\n" +
                "20 daun jeruk, sobek\n" +
                "4 serai, memarkan\n" +
                "2 daun salam\n" +
                "Sejempol laos, keprek");
        caraMasak.add("Potong sapi kotak2, rebus sebentar buang air\n" +
                "Tumis bumbu halus + bumbu cemplung sampai masak dan tanak\n" +
                "Masukan daging, oseng sebentar\n" +
                "Presto 20 menit\n" +
                "Koreksi rasa dan beri bawang merah goreng\n");

        nama.add("Sego Tempong");
        foto.add("https://4.bp.blogspot.com/-KVV6sP09xmU/WCQ4AXcj0dI/AAAAAAAAQP0/ThYwdHPrd6YhJ5M68AefiEDfno6pisZ1QCLcB/s320/sego%2Btempong%2Bbanyuwangi.jpg");
        info.add("Apabila kita mengenal nasi timbel makanan khas Jawa Barat, kali ini kita akan mengenal kuliner khas Banyuwangi Jawa Timur. Sego tepong atau nasi tepong adalah makanan khas Jawa Timur yang terdiri dari nasi panas, sayuran rebus, gorengan tahu, tempe, ikan asin, dadar jagung yang dilengkapi dengan sambal mentah yang super pedas.");
        bahan.add("300 gram Nasi Putih\n" +
                "400 ml Air, untuk merebus sayuran\n" +
                "1 sdt Garam, untuk merebus sayuran\n" +
                "Sambal Tempong:\n" +
                "7 buah Cabe Rawit\n" +
                "3 buah Cabe Keriting Merah\n" +
                "1 buah Tomat Merah\n" +
                "1/2 buah Jeruk Limau\n" +
                "1 sdt Terasi Sangrai\n" +
                "1/2 sdt Gula Pasir\n" +
                "1/4 sdt Garam\n" +
                "Lauk Pelengkap:\n" +
                "Bakwan Jagung (lihat resep)\n" +
                "Tempe Goreng\n" +
                "Tahu Goreng\n" +
                "Ikan Asin Goreng\n" +
                "Sayuran Pelengkap:\n" +
                "Bayam Rebus\n" +
                "Terong Rebus\n" +
                "Kubis Rebus\n" +
                "Kacang Panjang Rebus\n" +
                "Timun");
        caraMasak.add("Sambal Tempong: Ulek halus semua bahan sambal, kecuali tomat dan jeruk limau.\n" +
                "Tambahkan potongan tomat, ulek halus kembali. Terakhir, beri air perasan jeruk limau. Aduk rata.\n" +
                "Cuci bersih semua sayuran yang akan direbus. Didihkan air bersama garam. Masukkan sayuran yang akan direbus: kubis, bayam, terong, dan kacang panjang secara bergantian. Rebus sebentar saja hingga matang, angkat dan tiriskan.\n" +
                "Siapkan juga lauk pelengkap lainnya: Tempe, tahu, ikan asin, dan bakwan jagung atau pelas tuban. (lihat resep)\n" +
                "Cetak nasi putih berbentuk tumpeng kerucut sambil dipadatkan. Tata nasi di piring saji, lalu tata juga semua lauk pelengkap, sayuran pelengkap, dan sambal tempong.\n" +
                "Tumini Nasi Tempong Banyuwangi siap disajikan");

        nama.add("Rujak Soto");
        foto.add("https://upload.wikimedia.org/wikipedia/id/thumb/a/a8/Rujak_soto.jpg/800px-Rujak_soto.jpg");
        info.add("Masih di Banyunwangi, ada makanan yang dikenal dengan nama Rujak Soto. Rujak Soto adalah merupakan paduan unik antara rujak sayur dengan soto, bisa soto daging (daging sapi) atau sato babat. Bahkan ada yang memadukan dengan soto ayam atau soto ceker (kaki ayam), ini biasa dilakukan sebagai alternatif ketika ingin menikmati rujak soto tetapi harga daging sedang melambung.");
        bahan.add("1/2 kg ceker ayam\n" +
                "1 kg sayap ayam\n" +
                "2 L air\n" +
                "Secukupnya garam\n" +
                "1 buah jeruk nipis\n" +
                "Bumbu Halus (Kuah Soto) :\n" +
                "12 siung bawang merah\n" +
                "8 siung bawang putih\n" +
                "4 butir kemiri, sangrai\n" +
                "2 ruas kunyit, bakar\n" +
                "5 cm jahe\n" +
                "5 cm lengkuas\n" +
                "1 sdt ketumbar bubuk\n" +
                "1 sdt lada bubuk\n" +
                "1 sdt garam\n" +
                "Bumbu Pelengkap (Kuah Soto) :\n" +
                "1 batang daun bawang, iris\n" +
                "6 lembar daun jeruk\n" +
                "2 batang serai, geprek\n" +
                "Secukupnya gula dan kaldu jamur\n" +
                "Bahan Sayur-sayuran :\n" +
                "1 ikat kangkung, siangi\n" +
                "1 ikat genjer, siangi\n" +
                "1/2 buah kol, iris\n" +
                "100 gr taoge\n" +
                "10 buah kacang panjang, potong\n" +
                "Bumbu Kuah Pecel :\n" +
                "5 sdm kacang tanah, goreng sebentar, haluskan\n" +
                "8 buah cabe rawit merah\n" +
                "1 sdm gula merah\n" +
                "1/2 sdt garam\n" +
                "1 sdm petis\n" +
                "Secukupnya air matang\n" +
                "Bahan Pelengkap :\n" +
                "8 buah lontong, potong-potong\n" +
                "6 buah tahu goreng, potong kecil\n" +
                "6 buah tempe, potong kecil\n" +
                "2 batang seledri, iris\n" +
                "1 batang daun bawang, iris\n" +
                "1 buah timun, iris bagi 4\n" +
                "Secukupnya bawang goreng\n" +
                "Secukupnya kecap manis");
        caraMasak.add("Cuci bersih ayam, beri perasan jeruk nipis dan garam. Diamkan selama 15 menit. Bilas kembali. Siram dengan air panas mendidih, diamkan sebentar, buang air.\n" +
                "Didihkan air dalam panci. Setelah mendidih, masukkan ayam. Rebus dengan api kecil sampai mendidih.\n" +
                "Tumis bumbu halus tanpa minyak, sampai matang (krn sy blendernya pake air). Setelah matang, baru ditambahkan minyak, dan masukkan daun jeruk dan serai. Masak kembali hingga matang (sampai mengeluarkan minyak). Dijamin lebih sedap.\n" +
                "Masukkan daun bawang, tumis sebentar. Masukkan bumbu yg sudah matang ke dalam panci. Masak dengan api kecil sampai ayam lunak. Koreksi rasa dengan garam, gula dan kaldu jamur. Sisihkan.\n" +
                "Didihkan air, beri garam. Rebus sayuran satu persatu sampai layu, sayuran hijau terakhir. Kalau saya, kacang panjang - kol - taoge - kangkung. Khusus genjer gak perlu direbus, cukup direndam aja dg air sisa rebusan sampe layu.\n" +
                "Bumbu Pecel : Ulek cabe rawit, gula merah dan garam. Masukkan kacang tanah, petis dan air secukupnya. Ulek sampai halus dan tercampur rata, tekstur jangan terlalu cair.\n" +
                "Penyajian : Siapkan mangkok. Masukkan potongan lontong, tahu dan tempe. Tambahkan sayur-sayuran sesuai selera. Disusul timun, bawang goreng, seledri dan daun bawang. Beri 4 sdm bumbu pecel dan kecap sesuai selera. Siram dengan kuah soto sampai penuh. Diaduk-aduk dulu sebelum disantap, cobain deh, wuennnaaak banget.");

        nama.add("Pecel Rawon");
        foto.add("https://2.bp.blogspot.com/-CZZ312PCfuk/WCTZ66pPOvI/AAAAAAAAQQE/2RDzXLCsT1E7iqmmNlPI0SxuwQ_hxj1FgCLcB/s1600/pecel%2Brawon.jpg");
        info.add("Satu lagi makanan Khas Jawa Timur yang berasal dari daerah Banyuwangi adalah Pecel Rawon. Sesuai dengan namanya, makanan ini merupakan perpaduan antara nasi pecel dengan rawon yang sudah kita bahas diatas.");
        bahan.add("1/4 daging ayam potong dadu\n" +
                "Masako\n" +
                "Lada bubuk\n" +
                "secukupnya Daun bawang\n" +
                "Santan instan\n" +
                "Sawi hijau\n" +
                "Bamboo rawon\n" +
                "Sambel pecel jadi\n" +
                "secukupnya Garam\n");
        caraMasak.add("Rebus sawi yang telah dipotong. Tiris kan. Encerkan sambel pecel jadi, sisihkan\n" +
                "Tuangkan minyak goreng sedikit, tumis bumbu bamboo rawon tunggu hingga matang. Tambahkan air secukupnya, masukkan potongan daging ayam, santan instan, daun bawang. Tambahkan masako, lada bubuk, dan garam secukupnya. Koreksi rasa.\n" +
                "Siapkan nasi, letakkan sawi rebus dan siram dengan sambel pecel. Kemudian tuangkan rawon ayam di atasnya. Pecel Rawon khas Banyuwangi siap dinikmati.\n" +
                "Pecel Rawon Banyuwangi langkah memasak 3 foto");

        nama.add("Sego Becek");
        foto.add("https://3.bp.blogspot.com/-yOesqlGmHp0/WCTbwKTcQZI/AAAAAAAAQQM/qXuN7QkdGq4odOx7indj5u3OteWGaEe8QCLcB/s320/sego%2Bbecek.jpg");
        info.add("Sego Becek adalah makanan khas dari Nganjuk Jawa Timur. Sego dalam bahasa jawa artinya adalah Nasi. Nasi Becek atau Sego Becek ini adalah hidangan yang mirip dengan gulai, kare kambing khas wilayah Mataraman.");
        bahan.add("200 gr Daging Kambing, potong2\n" +
                "150 gr Daging jeroan kambing, rebus potong2\n" +
                "Bumbu halus Kuah :\n" +
                "5 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "4 butir Kemiri sangrai\n" +
                "1/2 sdt Ketumbar bubuk\n" +
                "1 sdt Merica bubuk\n" +
                "1/4 sdt Pala bubuk\n" +
                "1/4 sdt Jinten\n" +
                "1/2 batang kayu Manis\n" +
                "1/4 klabet\n" +
                "1/2 sdt kapulaga\n" +
                "3 cm jahe\n" +
                "3 cm Lengkuas\n" +
                "3 butir cengkeh\n" +
                "1 cm kencur\n" +
                "3 cm kunyit\n" +
                "3 Lembar daun jeruk\n" +
                "2 Lembar daun salam\n" +
                "1 sdt garam\n" +
                "1 sdt gula\n" +
                "1 sdt bubuk Kaldu sapi\n" +
                "1 Sdm Kecap manis\n" +
                "1 Sdm air perasan jeruk nipis\n" +
                "1/2 butir kelapa parut");
        caraMasak.add("Siapkan semua bumbu halus. Campurkan kelapa parut dg bumbu halus, aduk rata. Tuang 1,5 liter air ke dalamnya, peras dan sharing air kelapa bumbu. Sisihkan\n" +
                "Nyalakan kompor, masak air Santan bumbu diatasnya, tambahkan gula garam dan Kaldu bubuk. Koreksi rasa. Kemudian Masukkan jeroan rebus ke dlm nya. Aduk2, tambahkan kecap manis. Masak sampai bumbu meresap. Marinasi daging dg kecap, merica dan Ketumbar. Bakar spt sate sampai matang. Campurkan ke dlm kuah matang tambahkan 1 Sdm air perasan jeruk nipis. Sajikan bersama nasi, Seledri, kubis dan sambal kecap.\n");

        nama.add("Tahu Campur Lamongan");
        foto.add("https://3.bp.blogspot.com/-ZUr1bCEogcc/WCTqem9O89I/AAAAAAAAQQo/DdzSsJ-qYvM9v0inm9vFE4_1cP_b6zXMQCLcB/s320/tahu%2Bcampur%2Blamongan.jpg");
        info.add("Kembali ke Lamongan, ada tahu campur lamongan yang merupakan makanan khas dari daerah Lamongan Jawa Timur. ");
        bahan.add("500 gr kikil sapi\n" +
                "1 buah selada\n" +
                "1/4 toge\n" +
                "5 potong tahu\n" +
                "1 bks mie telur (bisa ditambah)\n" +
                "Petis udang (1/2sdm tiap piring) Bisa juga di skip\n" +
                "Bumbu Kuah (1)\n" +
                "5 bawang merah\n" +
                "8 bawang putih\n" +
                "1 sdt kunyit bubuk\n" +
                "2 ruas jahe\n" +
                "2 ruas kencur\n" +
                "1/2 sdt merica bubuk\n" +
                "1/2 sdt ketumbar bubuk\n" +
                "Bumbu kuah (2)\n" +
                "2 daun salam\n" +
                "2 batang sereh\n" +
                "3-4 daun jeruk\n" +
                "1 sdm gula merah\n" +
                "1/2 sdt penyedap rasa\n" +
                "Secukupnya gula & garam");
        caraMasak.add("Haluskan semua bumbu kuah (1).\n" +
                "Kemudian tumis bersama bumbu kuah (2). Tambahkan air (1ltr). Kemudian koreksi rasa hingga pas.\n" +
                "Masak sampai kuah mendidih.\n" +
                "Potong2 kikil sapi & rebus sampai empuk. Setelah empuk bisa juga di rebus bersama kuahnya.\n" +
                "Rebus mie hingga matang, lalu tiriskan.\n" +
                "Goreng tahu setengah matang.\n" +
                "Siapkan piring bubuhi petis udang sesuai selera kemudian campur merata dengan kuah. Tambahkan mie, potongan tahu, toge, selada & kikil sapi.\n" +
                "Kalau mau pedas bisa ditambah sambel cabai rebus.");

        nama.add("Gethuk Pisang");
        foto.add("https://2.bp.blogspot.com/-Tl-g4gcureo/WCTtAKA_HaI/AAAAAAAAQQs/UotR1FPwAHwy7AyI-oniyekkvAZkk1RSwCLcB/s320/gethuk-pisang.jpg");
        info.add("Gethuk pada umumnya dibuat dari Singkong, tapi makanan dan camilan khas Kediri Jawa Timur ini dibuat dari pisang.");
        bahan.add("10 bh pisang \n" +
                "3 sdm gulpas\n" +
                "2-3 sdm Tepung Beras\n" +
                "2-3 sdm Tepung tapioka\n" +
                "1-2 sdm gula merah, tambahan sy, optional\n" +
                "Topping\n" +
                "100 gr kelapa parut\n" +
                "1 sdt garam");
        caraMasak.add("Kukus pisang sekitar 15 menit, sampai matang\n" +
                "Kelapanya jg ikutan dikukus ya diatas pisang Angkat, hilangkan uapnya, kemudian kupas & ulek halus pisang dgn ditambah gula pasir selagi hangat\n" +
                "Kemudian setelah halus masukkan tepung2an, aduk rata Jika suka boleh tambahkan gula merah, aduk rata * Kukus 30 - 45 menit, hingga matang (tes tusuk)\n" +
                "Jika sdh matang, angkat di dinginkan, setelah itu potong2 sesuai selera Terakhir beri topping, kelapa kukus+garam sebelum disajikan.");

        proses();
    }
}