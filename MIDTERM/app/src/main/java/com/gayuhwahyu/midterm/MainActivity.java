package com.gayuhwahyu.midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("RX-KING");
        model.setDescription("Yamaha RX-135 (juga dikenal dengan nama RX-King atau RX-K atau hanya RX di Asia Tenggara, terutama India & Indonesia) adalah sepeda motor dengan mesin dua tak yang diproduksi oleh Yamaha sejak 1990-an. Di Indonesia RX-135 masih diproduksi hingga akhir 2007, tetapi produksi dihentikan oleh persyaratan peraturan EURO3. Model akhir RX-135 di Indonesia menggunakan catalytic converter sebagai bagian dari knalpot, yang membuatnya melewati peraturan EURO2.");
        model.setImg(R.drawable.rxking);
        models.add(model);

        model = new Model();
        model.setTitle("AEROX");
        model.setDescription("Versi baru Aerox ini diluncurkan di Sirkuit Internasional Sepang di Malaysia pada Oktober 2016. [3] Ini adalah versi Aerox yang paling kuat. Mobil ini ditenagai oleh 4-langkah 4-katup 125 cc liquid-cooled (tidak terkait dengan mesin yang digunakan di Indonesia Aerox 125 LC saja) atau mesin 155 cc Blue Core bosan yang dilengkapi dengan Actuation Variable Valve yang menghasilkan output daya yang diklaim dari 11,8 hp (8,8 kW) atau 15 hp (11 kW). Mesin ini dibagi dengan NMAX. Ini dijual dengan nama Aerox 155 di Indonesia dan Thailand, Mio Aerox 155 di Filipina, [4] NVX 155 di Malaysia dan NVX 125/155 di Vietnam.");
        model.setImg(R.drawable.aerox);
        models.add(model);

        model = new Model();
        model.setTitle("VI-Xion");
        model.setDescription("Yamaha V-Ixion adalah merek sepeda motor bertipe sport yang diproduksi oleh Yamaha Motor Indonesia. Sepeda Motor ini diluncurkan pada tahun 2007. Yamaha V-Ixion merupakan sepeda motor pertama yang diproduksi oleh Yamaha Motor Company dengan menggunakan teknologi sistem injeksi bahan bakar. Sepeda Motor ini bersaing di kelas motor sport 150 cc untuk mengimbangi kompetitor dari produsen lainnya.");
        model.setImg(R.drawable.vixion);
        models.add(model);

        model = new Model();
        model.setTitle("N-Max");
        model.setDescription("Yamaha NMAX adalah model skuter matik (skutik) yang dibuat oleh Yamaha Indonesia Motor Manufacturing (YIMM), anak perusahaan Yamaha Motor Company di Indonesia. Skuter ini diluncurkan secara resmi pada bulan Februari 2015 di Sirkuit Sentul, Bogor, sebagai sebuah model global yang akan berbasis produksi di Indonesia dan akan diekspor ke mancanegara. NMAX diperkenalkan sebagai anggota terbaru dari seri MAX, yang merupakan jajaran maksi-skuter sporty dari Yamaha. Model yang populer dari seri MAX yang cukup populer di Eropa dan Amerika antara lain TMAX dan XMAX.");
        model.setImg(R.drawable.nmax);
        models.add(model);

        model = new Model();
        model.setTitle("Fiz-R");
        model.setDescription("Yamaha Force 1 ini merupakan penerus dari Yamaha Alfa bermesin 105cc yang lebih dahulu diperkenalkan pada akhir tahun 1980-an. Model Force 1 pertama yang diluncurkan tahun 1992 ini masih menggunakan model rem teromol di depan dan belakang. Motor ini adalah motor bebek pertama Yamaha di Indonesia yang sudah mengadopsi sistem pendingin YPCS (Yamaha Performance Cooling System). Sistem YPCS sendiri merupakan sistem pendingin mesin dengan mengandalkan kipas. Kipas ini berfungsi menyedot udara dari luar untuk mendinginkan bagian mesin. Jadi karena suhu tetap terjaga, kinerja mesin bisa terus optimal. Pada masanya, Suzuki sebenarnya telah lebih dahulu menggunakan teknologi sejenis di Suzuki RC series, yang dikenal dengan nama Suzuki Jet Cooled, tetapi perbedaannya Jet Cooled dilengkapi tambahan berupa nozzle yang menyemprotkan oli ke blok mesin. Pada tahun 1994 diperkenalkan facelift yang diberi nama Force 1 Z. Secara bentuk tidak terlalu banyak perubahan, yang mencolok model ini telah menggunakan sistem pengereman disc brake di bagian depan. Hingga tahun 1996, F1Z masih bertahan dengan model yang ditawarkannya. Namun ada beberapa model spesial yang diluncurkan. Perbedaannya, hanya ada pada bagian behel yang dilengkapi lampu, serta penambahan krom dibeberapa komponennya. Generasi terakhir telah adopsi full clutch. Tahun 1997 baru diluncurkan Yamaha F1ZR yang sudah dilengkapi kopling manual, tetapi koplingnya masih semi otomatis; dimana banyak orang menyebutnya dengan julukan \"kopling banci\".\n" +
                "\n" +
                "Pada tahun 2000, PT. Yamaha Indonesia Motor Manufacturing (YIMM) sebagai produsen, melakukan perombakan besar di F1ZR. Desainnya terlihat lebih modern yang didukung dengan penggunaan pelek bermodel racing. Selain itu, model ini sudah mengaplikasi full clutch atau kopling manual konvensional.\n" +
                "\n" +
                "Yamaha F1ZR diskontinu pada tahun 2004, dan digantikan oleh Yamaha Vega R, yang sudah menggunakan mesin 4-tak.");
        model.setImg(R.drawable.fixr);
        models.add(model);

        model = new Model();
        model.setTitle("SCORPIO-Z");
        model.setDescription("Yamaha Scorpio Z adalah salah satu merk dagang sepeda motor sport touring yang diproduksi oleh Yamaha Motor Indonesia. Kepolisian Daerah Metropolitan Jakarta Raya mulai menggunakan sepeda motor ini sebagai motor dinas sejak generasi ketiga. Generasi ketiga sepeda motor Yamaha ini adalah generasi terakhir yang menggunakan knalpot vernekel (yang telah lolos uji banjir sewaktu banjir pada Januari - Februari 2007). Generasi keempat sepeda motor Yamaha menggunakan jenis knalpot monocrom (jenis knalpot anti panas, namun secara kualitas knalpot turun 2 - 3 tingkat).");
        model.setImg(R.drawable.scorpio);
        models.add(model);

        model = new Model();
        model.setTitle("R15");
        model.setDescription("Yamaha YZF-R15, sering disebut juga sebagai Yamaha R15, adalah sebuah sepeda motor sport bermesin 150 cc yang diperkenalkan tahun 2008 di India. Pada September 2011, versi berikutnya yang dinamai v2.0 diperkenalkan di India. Sepeda motor ini juga diperkenalkan di Indonesia pada April 2014.");
        model.setImg(R.drawable.r15);
        models.add(model);

        model = new Model();
        model.setTitle("LEXI");
        model.setDescription("Yamaha Lexi adalah sebuah skuter bertransmisi otomatis yang diproduksi oleh Yamaha sejak April 2018. Skuter ini pertama kali diluncurkan pada tanggal 26 Januari 2018 di Hotel Four Seasons, Jakarta Selatan, Indonesia. Skuter ini merupakan produk kelima yang berada di dalam deretan seri skuter \"MAXI Yamaha\" di Indonesia, setelah TMAX, XMAX 250, NMAX 155 dan Aerox 155. Skuter ini menggunakan basis mesin yang serupa dengan NMAX 125.");
        model.setImg(R.drawable.lexi);
        models.add(model);

        model = new Model();
        model.setTitle("X-MAX");
        model.setDescription("Skutik bergaya bongsor memang sedang kekinian di Tanah Air. Yamaha XMax yang berada di kelas 250cc ini menawarkan desain agresif dengan bentuk lebih sporty dan tampak gagah. Yamaha XMax yang merupakan versi mesin lebih tinggi dari NMax, yang sudah beberapa tahun lebih dulu di Indonesia.");
        model.setImg(R.drawable.xmax);
        models.add(model);

        return models;
    }
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);


        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, profile.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
