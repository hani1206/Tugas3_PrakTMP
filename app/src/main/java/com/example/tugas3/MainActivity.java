package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> foto =  new ArrayList<>();
    private ArrayList<String> nama =  new ArrayList<>();
    private ArrayList<String> date =  new ArrayList<>();
    private ArrayList<String> info =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.rvData);
        AdapterData adapterData = new AdapterData(foto, nama, date, info,this);

        recyclerView.setAdapter(adapterData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        date.add("July 9, 2021");
        nama.add("Black Widow");
        foto.add("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/4/41/Black_Widow_November_6_Poster.jpg/revision/latest/scale-to-width-down/619?cb=20200403193641");
        info.add("Black Widow adalah film pahlawan super Amerika Serikat tahun 2021 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-24 Marvel Cinematic Universe (MCU). Film ini disutradarai Cate Shortland, ditulis Jac Schaeffer dan Ned Benson, serta dibintangi Scarlett Johansson, David Harbour, Florence Pugh, O-T Fagbenle, dan Rachel Weisz. Film ini dijadwalkan akan ditayangkan di Amerika Serikat pada 7 Mei 2021 dan Indonesia dua hari sebelumnya. Pada Februari 2004, Lionsgate mendapatkan hak alih wahana film atas Black Widow dan dua bulan kemudian, David Hayter diumumkan sebagai sutradara dan penulis film ini, manakala Avi Arad dari Marvel Studios menjadi produser. Pada Juni 2006, Lionsgate meninggalkan proyek ini dan hak alih wahana dikembalikan kepada Marvel Studios. David dan Marvel mencoba mencari pendana lain untuk mengembangkan proyek ini, tetapi David mengaku tidak pernah merasa nyaman. Ini membuatnya patah hati, tetapi ia berharap film itu akan diproduksi suatu haru nanti. Pada Januari 2009, Marvel memulai perbincangan awal dengan Emily Blunt untuk memerankan Black Widow di Iron Man 2, walau ia menolak karena sedang terlibat dalam Gulliver's Travels. Pada Maret 2009, Scarlett Johansson dipastikan memerankan Natasha Romanoff/Black Widow, dengan kesepakatannya termasuk pilihan untuk memerankan beberapa film. Pada September 2010, ketika mempromosikan peluncuran media rumahan Iron Man 2, Presiden Marvel Studios Kevin Feige menyatakan bahwa perbincangan mengenai film Black Widow yang berdiri sendiri dengan Scarlett sudah dilakukan, tetapi Marvel lebih memilih berfokus kepada The Avengers. Scarlett memerankan Black Widow di film itu, Setelah penayangan Avengers: Age of Ultron, Scarlett mengungkapkan bahwa jumlah film yang tertera dalam kontraknya telah disesuaikan sejak pertama kali menandatangani kontrak itu untuk menyesuaikan dengan keterlibatan Black Widow dalam film MCU. Marvel sendiri tidak menyadari tanggapan yang bagus dari penonton kepada Black Widow berikut penampilannya.");

        date.add("January 15, 2021");
        nama.add("WandaVision");
        foto.add("https://cdn.popmama.com/content-images/community/20210324/community-5a77083ebb8a006769a6545d95b28076.jpeg?1618158463");
        info.add("WandaVision adalah miniseri televisi web mendatang untuk Disney+ oleh Jac Schaeffer, berdasarkan karakter Marvel Comics Wanda Maximoff/Scarlet Witch dan Vision. Mengambil tempat dalam Marvel Cinematic Universe dan berbagi kontinuitas dengan film-film didalamnya, film ini akan berlatar waktu setelah Avengers: Endgame. Serial ini diproduksi oleh Marvel Studios, dengan Schaeffer sebagai penulis kepala dan Matt Shakman sebagai sutradara. WandaVision dijadwalkan untuk tayang perdana pada Desember 2020, dan akan terdiri dari 6 episode. Serial ini akan menjadi bagian dari Marvel Cinematic Universe: Fase Empat. Berlatar setelah peristiwa Avengers: Endgame (2019), Wanda Maximoff dan Vision mulai curiga bahwa hal-hal tidak seperti yang terlihat ketika keduanya menjalani kehidupan pinggiran kota yang ideal. Pada September 2018, Marvel Studios mengembangkan beberapa miniseri untuk layanan streaming, Disney+ dari perusahaan induknya, Disney, yang akan berpusat pada karakter pendukung Marvel Cinematic Universe yang belum memiliki film solo mereka sendiri, seperti Wanda dan Vision. Para pemeran yang membintangi karakter-karakter difilm diharapkan untuk mengulangi peran mereka untuk miniseri, seperti Elizabeth Olsen sebagai Scarlet Witch[3] dan Paul Bettany sebagai Vision. Serial yang masing-masing memiliki 6 hingga 8 episode ini akan diproduksi Marvel Studios, bukannya Marvel Television, yang memproduksi serial tv MCU sebelumnya. Presiden Marvel Studios, Kevin Feige dipercaya akan berperan langsung dalam pengembangan masing-masing serial, berfokus pada kontinuitas cerita antar film dan mengurus para pemeran yang akan mengulangi peran mereka dari film-film. Pada akhir Oktober, Vision diharapkan untuk memainkan peran signifikan didalam serial, yang akan berfokus pada hubungan Wanda dan Vision. Pada bulan-bulan berikutnya, judul Vision and the Scarlet Witch\" dan The Vision and the Scarlet Witch dilaporkan.");

        date.add("March 19, 2021");
        nama.add("The Falcon and the Winter Soldier");
        foto.add("https://img-highend.okezone.com/okz/900/pictureArticle/images_01D4nQr1_N8jI24.jpg");
        info.add(" The Falcon and The Winter Soldier akan menjadi serial Marvel kedua di layanan streaming Disney+ setelah serial WandaVision. Serial ini dijadwalkan tayang setiap Jumat di Disney+ Hotstar. The Falcon and The Winter Soldier mengisahkan kehidupan Sam Wilson alias Falcon (Anthony Mackie) dan Bucky Barnes alias Winter Soldier (Sebastian Stan) setelah kejadian dalam film Avengers: Endgame (2019). Sam dan Bucky dikisahkan bekerja sama untuk melakukan hal yang baik. Terlebih, Steve Rogers alias Captain America telah memberikan tameng kepada Sam dan meminta melanjutkan apa yang sudah ia lakukan. Meski menerima tameng tersebut, Sam ragu bahwa ia bisa menjadi sosok secakap Captain America. Namun, ia tetap berlatih menggunakan tameng tersebut dengan melemparnya ke pohon. Pada saat yang sama, mereka harus berhadapan dengan penjahat super perempuan bernama Flag-Smasher. Ia memiliki nama asli Karli Morgenthau yang diperankan aktris Erin Kellyman. Flag-Smasher yang muncul dalam serial ini berbeda dengan Flag-Smasher dalam komik. Pasalnya, dalam komik sosok penjahat ini merupakan laki-laki yang memiliki nama asli Karl Morgenthau. Karakter tersebut pertama kali muncul dalam komik Captain America #312 yang rilis pada Desember 1985. Flag-Smasher yang ahli membuat strategi dan pertarungan jarak dekat ini dibuat oleh penulis Mark Gruenwald dan komikus Paul Neary. Meski bukan film, serial ini masih berkaitan dengan Marvel Cinematic Universe (MCU) fase keempat. Oleh karena itu ada kemunculan lain yang sebelumnya dikenal lewat MCU, salah satunya Sharon Carter alias Agent 13. Anthony Mackie yang memerankan Falcon mengatakan serial ini akan membuat penonton lebih kenal dengan karakter Sam dan Bucky sebagai manusia biasa, bukan pahlawan super dengan nama Falcon dan Winter Soldier.");
        date.add("April 20, 2010");
        nama.add("Iron Man 2");
        foto.add("https://static.wikia.nocookie.net/ironman/images/d/df/P3546118_v_v8_af.jpg/revision/latest/scale-to-width-down/666?cb=20191202171556");
        info.add("Iron Man 2 adalah film pahlawan super Amerika Serikat tahun 2010 karya Jon Favreau. Ini adalah film ketiga di Marvel Cinematic Universe. Diangkat dari komik Iron Man karya Stan Lee, film ini dibintangi oleh Robert Downey Jr., Gwyneth Paltrow, Don Cheadle, Scarlett Johansson, dan Mickey Rourke.");

        date.add("April 22, 2015");
        nama.add("Avengers: Age of Ultron");
        foto.add("https://miro.medium.com/max/1536/1*xvU7rLO4sGBe-3TQxb-Vzw.jpeg");
        info.add("Avengers: Age of Ultron adalah sebuah film pahlawan super berdasarkan komik Avengers, produksi Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Film ini merupakan sekuel dari The Avengers dan merupakan film kesebelas dari seri Marvel Cinematic Universe.");

        date.add("April 25, 2018");
        nama.add("Avengers: Infinity War");
        foto.add("https://assets-a2.kompasiana.com/items/album/2019/05/22/selasarcom-5ce4555895760e675e017f75.jpg?t=o&v=760");
        info.add("The Avengers dan sekutu mereka harus bersedia mengorbankan segalanya dalam upaya untuk mengalahkan Thanos yang kuat sebelum ia berhasil menghancurkan alam semesta.");

        date.add("April 27, 2016");
        nama.add("Captain America: Civil War");
        foto.add("https://assets-a2.kompasiana.com/items/album/2019/05/23/kacamatikacom-5ce698f83ba7f71b6b0964c3.jpg?t=o&v=760");
        info.add("Captain America: Civil War merupakan sebuah film pahlawan super Amerika Serikat yang dirilis pada tahun 2016. Ini adalah film ketiga belas di Marvel Cinematic Universe.");

        date.add("July 24, 2014");
        nama.add("Guardians Of The Galaxy");
        foto.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmjqEAJ4yWbMsiJOxCxGQm6JBEWEmAj8Sl_x7jNIhzJO2fpLip");
        info.add("Guardians of the Galaxy adalah film pahlawan super Amerika Serikat yang diadaptasi dari kelompok pahlawan super Guardians of the Galaxy terbitan Marvel Comics. Ini adalah film kesepuluh di Marvel Cinematic Universe. Film ini disutradarai dan ditulis oleh James Gunn, cerita ditulis bersama Nicole Perlman.");

        date.add("July 19, 2011");
        nama.add("Captain America: The First Avenger");
        foto.add("https://static.wikia.nocookie.net/ironman/images/c/ca/P8205710_v_v8_aj.jpg/revision/latest/scale-to-width-down/666?cb=20191202172249");
        info.add("Captain America: The First Avenger merupakan sebuah film pahlawan super Amerika Serikat yang dirilis pada tahun 2011. Ini adalah film kelima di Marvel Cinematic Universe. Film yang disutradarai oleh Joe Johnston ini pemainnya antara lain oleh Chris Evans, Tommy Lee Jones dan masih banyak lagi.");

        date.add("June 28, 2017");
        nama.add("Spider-Man: Homecoming");
        foto.add("https://upload.wikimedia.org/wikipedia/id/f/f9/Spider-Man_Homecoming_poster.jpg");
        info.add("Spider-Man: Homecoming adalah film superhero Amerika 2017 berdasarkan karakter Marvel Comics Spider-Man, diproduksi bersama oleh Columbia Pictures dan Marvel Studios, dan didistribusikan oleh Sony Pictures Releasing. Ini adalah reboot film Spider-Man kedua dan film keenam belas di Marvel Cinematic Universe.");

        prosesRecyclerViewAdapter();

    }

}