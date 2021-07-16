package com.example.eduecon.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.eduecon.Model.Question;
import com.example.eduecon.Model.QuizConstract;

import java.util.ArrayList;

import static com.example.eduecon.Model.Question.CATEGORY_QUIZ3;
import static com.example.eduecon.Model.Question.CATEGORY_QUIZ4;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "GoQuiz.db";
    private static final int DATBASE_VERSION = 5;
    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATBASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizConstract.QuestionsTable.TABLE_NAME + " ( " +
                QuizConstract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizConstract.QuestionsTable.COLUMN_QUESTIONS + " TEXT, " +
                QuizConstract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizConstract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizConstract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizConstract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizConstract.QuestionsTable.COLUMN_OPTION5 + " TEXT, " +
                QuizConstract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuizConstract.QuestionsTable.COLUMN_CATEGORY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuizConstract.QuestionsTable.TABLE_NAME);
        onCreate(db);

    }

    private void fillQuestionsTable() {

        Question q1 = new Question("Kata ekonomi berasal dari 'oikonomia', yang berarti...", "Kebutuhan manusia", "Pengaturan rumah tangga", "Pengaturan kekayaan", "Kelangkaan", "Kemakmuran", 2, Question.CATEGORY_QUIZ1);
        addQuestion(q1);
        Question q2 = new Question("Ilmu ekonomi adalah studi tentang cara masyarakat ...", "Mengelola sumber-sumber daya yang langka", "Mengelola pembuatan barang industri", "Melakukan konsumsi yang ideal", "Mengelola sumber daya ekonomi", "Menentukan satu pilihan", 5, Question.CATEGORY_QUIZ1);
        addQuestion(q2);
        Question q3 = new Question("Ilmu ekonomi menurut Alfred W. Stonier dan Douglas C. Hague dapat dibagi menjadi kelompok ekonomi ...", "Deskriptif, teori, dan terapan", "Pertanian, industri, dan publik", "Makro, mikro, dan terapan", "Pertanian, industri, dan terapan", "Induk, cabang, dan lanjutan", 1, Question.CATEGORY_QUIZ1);
        addQuestion(q3);
        Question q4 = new Question("Ilmu ekonomi positif sering disebut sebagai ilmu ekonomi ...", "Terapan", "Teori", "Kualitatif", "Deskriptif", "Sosial", 4, Question.CATEGORY_QUIZ1);
        addQuestion(q4);
        Question q5 = new Question("Yang termasuk pernyataan ekonomi positif adalah ...", "Pajak harus dipungut atas dasar pengeluaran", "Sebaiknya pendapatan negara dari pajak digunakan untuk membiayai orang miskin", "Seharusnya pendapatan nasional dibagi secara merata", "Sebagian pendapatan orang kaya harus didistribusikan pada orang miskin", "Sebaiknya masyarakat yang menjadi pemilik sumber daya ekonomi", 1, Question.CATEGORY_QUIZ1);
        addQuestion(q5);
        Question q6 = new Question("Berikut ini contoh pernyataan ekonomi positif dan pernyataan ekonomi normatif.\n" +
                "(1) Nilai upah minimum yang rendah mengakibatkan tingginya jumlah pengangguran.\n" +
                "(2) Pendapatn rakyat miskin harus dijamin oleh pemerintah\n" +
                "(3) Untuk lebih memperbaiki kinerja ekonomi negara, kegiatan ekonomi harus ditingkatkan\n" +
                "(4) Pemanfaatan pendapatan negara dari pajak harus diarahkan untuk menolong orang miskin\n" +
                "Pernyataan ekonomi positif ditunjukkan nomor ....", "(1), (2), dan (3)", "(1), (3), dan (4)", "(1), (3), dan (5)", "(2), (3), dan (4)", "(2), (3), dan (4)", 4, Question.CATEGORY_QUIZ1);
        addQuestion(q6);
        Question q7 = new Question("Bidang bahasan ekonomi deskriptif adalah ....", "cara pemerintah menggunakan sumber daya demi kemakmuran rakyat", "cara individu dan masyarakat mengelola sumber daya ekonomi untuk mencapai kemakmuran", "pengumpulan informasi-informasi faktual mengenai masalah ekonomi", "mengkritik peran swasta dan pemerintah dalam menghadapi kelangkaan", "asumsi bahwa setiap individu bekerja secara rasional", 3, Question.CATEGORY_QUIZ1);
        addQuestion(q7);
        Question q8 = new Question("Cara kerja ilmu ekonomi terapan adalah ....", "memanfaatkan hasil-hasil pemikiran teori ekonomi untuk memberi penjelasan atas fakta-fakta yang telah dikumpulkan oleh ekonomi deskriptif", "memberi nasihat kepada pengambil keputusan berdasarkan analisis data atau gejala yang diolah oleh ekonomi deskriptif", "mengambil kesimpulan dari teori-teori ekonomi dengan cara menganalisis masalah dan menggunakan data", "menerapkan solusi dan kesimpulan terhadap suatu masalah ekonomi", "menerapkan kesimpulan dari teori ekonomi terhadap situasi ekonomi yang tidak menentu", 1, Question.CATEGORY_QUIZ1);
        addQuestion(q8);
        Question q9 = new Question("Manfaat mempelajari ilmu ekonomi adalah untuk....", "Memenuhi kebutuhan manusia yang beragam jumlah dan kualitasnya", "Membuat daftar prioritas kebutuhan yang harus dipenuhi terlebih dahulu", "Memanfaatkan sumber-sumber daya yang ada dalam memenuhi kebutuhan", "Menekan dan mengurangi jumlah kebutuhan manusia yang makin beragam", "Dipergunakan dalam berbagai alternatif pilihan untuk memenuhi kebutuhan", 5, Question.CATEGORY_QUIZ1);
        addQuestion(q9);
        Question q10 = new Question("Ilmu ekonomi syariah adalah bagian dari ilmu ekonomi yang mempelajari masalah-masalah ekonomi rakyat yang dilandasi oleh nilai-nilai islam. Ekonomi syariah merupakan bagian dari ekonomi ....", "teori", "positif", "terapan", "normatif", "pembangunan", 3, Question.CATEGORY_QUIZ1);
        addQuestion(q10);
        Question q11 = new Question("Kelangkaan adalah ...", "Suatu kondisi ketika sesuatu barang atau jasa banyak tersedia saat musim panen tetapi tidak ada saat bukan musim panen", "Suatu kondisi dimana sesuatu barang tersedia dalam jumlah tidak terbatas di suatu tempat, tetapi barang tersebut sulit dicari pada tempat lain", "Suatu kondisi ketika manusia memiliki sumber daya ekonomi yang terbatas untuk memenuhi kebutuhan yang tidak terbatas", "Suatu keadaan dimana barang tersedia dalam jumlah tidak terbatas, namun sulit terbeli karena tidak memiliki uang", "Suatu keadaan dimana banyak uang yang tersedia tetapi barang dan jasa yang akan dibeli tidak ada", 3, Question.CATEGORY_QUIZ2);
        addQuestion(q11);
        Question q12 = new Question("Ilmu ekonomi adalah studi tentang cara masyarakat ...", "Melimpahnya sumber daya alam yang tersedia", "Seimbangnya antara kemajuan ilmu pengetahuan dan teknologi dengan peningkatan kebutuhan", "Terbatasnya kemampuan yang dimiliki manusia dalam mengolah sumber daya alam yang ada", "Melimpahnya tenaga ahli", "Kreativitas manusia dalam penciptaan kebutuhan baru", 3, Question.CATEGORY_QUIZ2);
        addQuestion(q12);
        Question q13 = new Question("Mayoritas penduduk Indonesia mengkonsumsi beras, tetapi produksi beras saat ini menurun. Di kota-kota tertentu sudah terasa kelangkaan terjadi sehingga beras melambung tinggi. Hasil penelitian sementara menyatakan permasalahan ini diakibatkan mahalnya bibit padi. Untuk pemecahan masalah kelangkaan tersebut yang tepat adalah ...", "Berhenti berproduksi padi, beralih kepada produksi pangan alternatif", "Memberikan penyuluhan kepada petani cara meningkatkan produksi padi", "Memberikan subsidi kepada petani dan mengurangi konsumsi beras", "Memberikan subsidi kepada petani untuk membeli bibit dan membuka lahan pertanian baru", "Memberlakukan program transmigrasi ke daerah yang kosong atau baru", 4, Question.CATEGORY_QUIZ2);
        addQuestion(q13);
        Question q14 = new Question("Di beberapa daerah, terjadi kelangkaan BBM bersubsidi karena terhambatnya pasokan sehingga beberapa SPBU terlihat antrean panjang kendaraan yang ingin mengisi bahan bakar. Cara yang paling tepat untuk mengatasi kelangkaan tersebut dalam jangka pendek adalah ...", "Mengurangi pasokan bbm bersubsidi agar masyarakat tidak tergantung", "Memperbanyak bbm nonsubsidi agar masyarakat pindah dari bbm bersubsidi", "Atasi pembelian oleh masyarakat agar tidak lagi terjadi kelangkaan", "Memperbaiki saluran distribusi sehingga tidak terjadi keterlambatan", "Mendatangkan pasokan bbm bersubsidi dari daerah lain yang berlebih", 5, Question.CATEGORY_QUIZ2);
        addQuestion(q14);
        Question q15 = new Question("Barang inferior adalah barang ...", "Yang sangat diperlukan", "Yang permintaannya berkurang saat pendapatan bertambah", "Berdasarkan penggunaan", "Berdasarkan kepentingan", "Berdasarkan hubungan pemakaian", 2, Question.CATEGORY_QUIZ2);
        addQuestion(q15);
        Question q16 = new Question("Berikut ini adalah C:\n" +
                "1) Warna uang terlihat terang dan jelas\n" +
                "2) Terdapat benang pengaman yang ditanam pada kertas uang\n" +
                "3) Pada setiap uang terdapat tanda air (watermark)\n" +
                "4) Pada uang pecahan Rp100.000,00, Rp50.000.00, Rp20.000.00 dan\n" +
                "Rp10.000.00 terdapat cetak pelangi (rainbow printing)\n" +
                "5) Pada setiap uang kertas terdapat gambar saling isi (rectoverso), yaitu logo BI\n" +
                "yang akan terlihat secara utuh\n" +
                "Yang menjadi cara untuk melihat keaslian uang dengan cara diterawang adalah ...", "1) dan 2)", "1) dan 5)", "2) dan 4)", "3) dan 5)", "4) dan 5)", 4, Question.CATEGORY_QUIZ2);
        addQuestion(q16);
        Question q17 = new Question("Berikut ini adalah fungsi uang:\n" +
                "1) Alat pembayaran utang\n" +
                "2) Alat satuan hitung\n" +
                "3) Alat tukar\n" +
                "4) Alat pemindah kekayaan\n" +
                "5) Alat penimbun kekayaan\n" +
                "Berdasarkan data di atas, fungsi turunan adalah ..", "1, 2, dan 3", "1, 4, dan 5", "1, 2, dan 5", "1, 3, dan 4", "1, 3, dan 5", 2, Question.CATEGORY_QUIZ2);
        addQuestion(q17);
        Question q18 = new Question("Uang yang berbentuk saldo rekening di bank milik nasabah, yang dapat digunakan\n" +
                "sebagai alat pembayaran. Cara pembayaran dapat menggunakan cek, giro,\n" +
                "telegraphic transfer, travel chek (cek dengan perjanjian). Jenis uang yang\n" +
                "dimaksud adalah:", "Uang kartal", "Uang giral", "Uang logam", "Uang kertas", "Full bodied money", 2, Question.CATEGORY_QUIZ2);
        addQuestion(q18);
        Question q19 = new Question("Uang bernilai penuh (full bodied money) adalah ...", "Untuk membuat uang Rp10.000,00 dibutuhkan biaya Rp9.000,00", "Untuk membuat uang Rp15.000,00 dibutuhkan biaya Rp15.000,00", "Untuk membuat uang Rp15.000,00 dibutuhkan biaya Rp5.000,00", "Untuk membuat uang Rp5.000,00 dibutuhkan biaya Rp6.000,00", "Untuk membuat uang Rp5.000,00 dibutuhkan biaya Rp9.000,00", 2, Question.CATEGORY_QUIZ2);
        addQuestion(q19);
        Question q20 = new Question("Salah satu contoh badan usaha milik swasta adalah ....", "PT Garuda Indonesia Airways", "PT Kereta Api Indonesia", "PT Pegadaian", "Bank Jabar", "CV Makmur Jaya", 5, Question.CATEGORY_QUIZ2);
        addQuestion(q20);
        Question q21 = new Question("Bu Andri adalah produsen kerupuk udang yang berusaha menekan biaya produksi sehingga menghasilkan kerupuk udang dengan harga murah namun tetap berkualitas. Hal ini dilakukan karena daya beli masyarakat yang menurun. Dari ilustrasi tersebut, masalah ekonomi yang dihadapi adalah ....", "Untuk siapa barang diproduksi?", "Berapa barang yang diproduksi?", "Barang apa yang akan diproduksi?", "Mengapa barang diproduksi?", "Bagaimana cara memproduksi?", 5, Question.CATEGORY_QUIZ3);
        addQuestion(q21);
        Question q22 = new Question("Pak Hadi adalah pengusaha tas mengalami penurunan omzet karena tidak ada pesanana akibat dampak dari Pembatasan Sosial Berskala Besar (PSBB). Cara mengatasi agar karyawannya tetap bisa bekerja dan usahanya tetap bisa berjalan adalah ....", "menambah barang yang diproduksi", "memperluas daerah pemasaran", "membuka usaha baru di bidang makanan", "memproduksi masker selama masa pandemi", "meminjam modal tambahan usaha", 4, Question.CATEGORY_QUIZ3);
        addQuestion(q22);
        Question q23 = new Question("Perhatikan pernyataan berikut.\n" +
                "(1) Penerbit mencetak buku cerita berwarna agar menarik minat anak-anak\n" +
                "(2) Bu Anis menjual kebutuhan pokok di tokonya karena jauh dari pasar\n" +
                "(3) Deni menjual Yoguht buatannya langsung ke konsumen.\n" +
                "(4) Selain menjadi petani pisang, Pak Agus menjadi produsen keripik pisang.\n" +
                "(5) Pak Aris menggunakan mesin baru untuk mengembangkan usahanya\n" +
                "Masalah pokok ekonomi klasik terdapat pada pernyataan nomor ....", "(1), (2), dan (3)", "(1), (2), dan (4)", "(2), (3), dan (4)", "(2), (3), dan (5)", "(3), (4), dan (5)", 3, Question.CATEGORY_QUIZ3);
        addQuestion(q23);
        Question q24 = new Question("Saat ini persaingan usaha sangat ketat, terutama di bidang produksi plastik. Plastik dari Cina di pasar dalam negeri dijual dengan harga yang sangat murah. Pak Yuda seorang pengusaha plastik ingin mengembangkan usaha agar dapat bersaing dan meningkatkan keuntungan perusahaannya. Masalah ekonomi modern yang dihadapi Pak Yuda adalah ....", "Untuk siapa barang tersebut diproduksi", "Berapa banyak dana untuk produksi", "Kapan barang akan diproduksi", "Barang apa yang harus diproduksi", "Bagaimana cara memproduksi barang", 5, Question.CATEGORY_QUIZ3);
        addQuestion(q24);
        Question q25 = new Question("Berikut ini beberapa masalah yang dihadapi oleh pelaku ekonomi\n" +
                "(1) Bapak Suhadi sedang berfikir barang apa yang akan diproduksi dalam rangka membuka usaha baru\n" +
                "(2) Ibu Mimin sedang memilih-milih barang apa yang akan ia beli sewaktu berbelanja di Mall\n" +
                "(3) Bapat Toto sedang menghitung-hitung berapa jumlah pesanan kaos pada bulan ini, untuk menetukan jumlah kaos yang akan dibuat\n" +
                "(4) Pabrik Sepeda sedang merencanakan bagaimana dapat memproduksi sepeda dengan harga di bawah Rp5.000.000,00 agar terjangkau untuk masyarakat lapisan terbawah\n" +
                "(5) CV Kenari sedang melaksanakan rapat pimpinan untuk memprediksi jumlah keuntungan yang akan diraih tahun ini\n" +
                "Yang merupakan masalah ekonomi modern adalah ....", "(1), (2), dan (3)", "(1), (3), dan (4)", "(1), (3), dan (5)", "(2), (3), dan (4)", "(3), (4), dan (5)", 2, Question.CATEGORY_QUIZ3);
        addQuestion(q25);
        Question q26 = new Question("Berikut ini bukan merupakan tujuan koperasi yang tercantum dalam UU No 25 tahun 1992 pasal 3 ... .", "Memajukan kesejahteraan anggota", "Memajukan kesejahteraan masyarakat", "Memajukan kesejahteraan pengurus", "Membangun tatanan perekonomian nasional", "Mewujudkan masyarakat maju, adil, dan makmur", 3, Question.CATEGORY_QUIZ3);
        addQuestion(q26);
        Question q27 = new Question("Untuk menjadi anggota koperasi tidak ada paksaan, ini merupakan prinsip ... .", "Mandiri", "Demokratis", "Kerjasama", "Sukarela", "Pendidikan", 4, Question.CATEGORY_QUIZ3);
        addQuestion(q27);
        Question q28 = new Question("Saat musim panen mangga, koperasi Pertaniaan Subur membeli seluruh hasil panen mangga dari petani. Agar hasil panen dapat dimanfaatkan seluruhnya dan petani tidak rugi, usaha yang paling tepat dilakukan Koperasi Subur adalah ... .", "melakukan kerjasama antar koperasi untuk memasarkan hasil panen mangga ke wilayah lain", "membeli seluruh hasil panen mangga dan menjualnya dengan harga tinggi", "membuat unit usaha produksi olahan mangga menjadi beraneka produk", "menjual hasil panen mangga kepada pemasok dengan harga lebih murah", "membeli hasil panen mangga hanya sebagian", 3, Question.CATEGORY_QUIZ3);
        addQuestion(q28);
        Question q29 = new Question("Di musim pandemi seperti sekarang ini permintaan masyarakat akan masker meningkat. Bu Isti tidak dapat memenuhi seluruh pesanan yang datang karena keterbatasan modal. Berdasarkan ilustrasi tersebut sebaiknya Bu Isti menjadi anggota koperasi ... .", "jasa", "produksi", "komsumsi", "simpan pinjam", "serba usaha", 4, Question.CATEGORY_QUIZ3);
        addQuestion(q29);
        Question q30 = new Question("Koperasi yang anggotanya minimal tiga koperasi pusat adalah koperasi ... .", "Primer", "Gabungan", "Induk", "Pusat", "sentral", 2, Question.CATEGORY_QUIZ3);
        addQuestion(q30);
        Question q31 = new Question("Masalahan ekonomi modern yang dihadapi oleh setiap masyarakat atau suatu negara adalah ....", "ketidakseimbangan antara permintaan dan penawaran", "barang atau jasa apa yang diproduksi, bagaimana cara memproduksi, dan untuk siapa diproduksi", "stabilitas harga dan kesempatan kerja", "ketidakstabilan kurs mata uang dalam negeri terhadap valuta asing", "ketidakmerataan distribusi pendapatan nasional", 2, Question.CATEGORY_QUIZ4);
        addQuestion(q31);
        Question q32 = new Question("Pemerintah daerah berupaya membangun perumahan bersubsidi yang harganya terjangkau bagi masyarakat berpenghasilan menengah ke bawah. Hal tersebut dilakukan untuk mengatasi permasalahan yang terkait dengan masih banyaknya warga masyarakat yang belum memiliki tempat tinggal. Kegiatan tersebut menunjukkan adanya upaya pemecahan permasalahan pokok ekonomi modern yaitu....", "untuk siapa barang diproduksi", "barang apa yang harus diproduksi", "bagaimana cara memproduksi", "di mana barang akan diproduksi", "berapa banyak jumlah yang diproduksi", 1, Question.CATEGORY_QUIZ4);
        addQuestion(q32);
        Question q33 = new Question("Chandra baru memulai usaha berupa sepatu olahraga. Chandra hanya melayani pembelian dalam jumlah besar yang dilakukan oleh pedagang besar. Pedagang besar akan menjual kepada pengecer dan pengecer akan menjual kepada konsumen. Hal tersebut mengakibatkan harga sepatu olahraga menjadi tinggi ketika sampai kepada konsumen. Masalah pokok ekonomi klasik yang dihadapi Chandra adalah ....", "Mahalnya harga yang diberikan pihak pengecer kepada konsumen", "Barang yang diproduksi tidak sesuai dengan kebutuhan masyarakat", "Chandra tidak tepat dalam memilih jenis barang yang diproduksi", "Saluran distribusi yang panjang menyebabkan penurunan jumlah penjualan", "Murahnya harga sepatu olahraga yang dijual chandra kepada pedagang besar", 4, Question.CATEGORY_QUIZ4);
        addQuestion(q33);
        Question q34 = new Question("Bapak Untung merupakan produsen tas dan sepatu lukis. Dalam memasarkan produknya ia menitipkan hasil produksinya di outlet-outlet pusat perbelanjaan dan toko. Akan tetapi, harga barang menjadi tinggi sehingga jumlah konsumen menurun. Oleh karena terjadi penurunan keuntungan, Bapak Untung memutuskan untuk memasarkan produknya secara online. Berdasarkan ilustrasi tersebut, masalah pokok ekonomi klasik yang dihadapi Bapak Untung adalah ....", "Distributor kurang menguasai teknik pemasaran yang baik", "Harga yang ditawarkan produsen dan distributor terlalu mahal", "Produsen tidak memanfaatkan kemajuan teknologi secara baik", "Penyaluran barang dari produsen kepada konsumen tidak tepat", "Barang tidak sesuai dengan selera pengunjung", 4, Question.CATEGORY_QUIZ4);
        addQuestion(q34);
        Question q35 = new Question("Dewasa ini di dunia praktis hanya tinggal beberapa negara yang masih menjalankan sistem ekonomi komando atau terpusat, yaitu....", "Kuba dan Rusia", "Korea Utara dan Kuba", "Rusia dan Inggris", "Korea utara dan Vietnam", "Kuba, Rusia, Korea Utara, dan Malaysia", 2, Question.CATEGORY_QUIZ4);
        addQuestion(q35);
        Question q36 = new Question("Jenjang jabatan dalam suatu organisasi sering digambarkan dengan garis-garis rapi dalam bagab organisasi. Hal ini merupakan prinsip manajemen ….", "Autority", "Unity of command", "Hierarchy", "Equty", "Centralization", 3, Question.CATEGORY_QUIZ4);
        addQuestion(q36);
        Question q37 = new Question("Sistem pengawasan dengan cara membandingkan hasil dengan rencana, adalah metode ….", "Inspektif", "Verifikatif", "Investigative", "Korektif", "Komparatif", 5, Question.CATEGORY_QUIZ4);
        addQuestion(q37);
        Question q38 = new Question("Perhatikan pernyataan berikut berhubungan dengan tingkatan manajemen:\n" +
                "1) Bertanggung jawab dengan keputusan dan rencana yang telah dibuat\n" +
                "2) Melaksanakan strategi dan perencanaan yang telah ditetapkan manajemen\n" +
                "3) Memiliki keterampilan konsep dalam rangka jalannya kegiatan perusahana\n" +
                "4) Memiliki keterampilan konsep yang sebanding dengan keterampilan teknis\n" +
                "5) Bertugas memimpin dan mengawasi para kepal seksi atau kepala divisi\n" +
                "Yang merupakan kegiatan manajemen menengah (middle management) adalah", "1, 2 dan 3", "1, 3, dan 5", "2, 3, dan 4", "2, 4, dan 5", "3, 4, dan 5", 4, Question.CATEGORY_QUIZ4);
        addQuestion(q38);
        Question q39 = new Question("Dalam tingkatan manajemen berikut diperlukan kerja pikir yang lebih besar dibandingkan dengan kerja fisik, yaitu pada tingkatan ….", "Top managament", "Midlle management", "Lower management", "Lini management", "Medium management", 1, Question.CATEGORY_QUIZ4);
        addQuestion(q39);
        Question q40 = new Question("Memiliki daya tarik yang besar, bersedia menerima saran, mengutamakan Kerjasama, merupakan ciri model pemimpin …", "Militeristis", "Paternalistis", "Demokratis", "Kharismatik", "Otokratis", 4, Question.CATEGORY_QUIZ4);
        addQuestion(q40);
        Question q41 = new Question("Kegiatan ekonomi yang dilakukan rumah tangga produsen adalah ....", "membayar pajak rumah tangga", "memiliki tabungan", "menggunakan faktor produksi untuk berproduksi", "membeli barang jadi untuk karyawannya", "menginvestasikan dana pada lembaga keuangan", 3, Question.CATEGORY_QUIZ5);
        addQuestion(q41);
        Question q42 = new Question("Secara ekstensifikasi usaha, peningkatan hasil dapat dilakukan dengan ....", "memanfaatkan teknologi pasca panen", "membentuk kelompok-kelompok tani yang berkualitas", "mengadakan bimbingan dan penyuluhan kepada para petani", "memberantas hama dengan menggunakan obat-obat pemberantas hama", "mencetak lahan pertanian seluas mungkin", 5, Question.CATEGORY_QUIZ5);
        addQuestion(q42);
        Question q43 = new Question("Perhatikan faktor-faktor produksi berikut ini:\n" +
                "(1) Alam\n" +
                "(2) Tenaga kerja\n" +
                "(3) Modal\n" +
                "(4) Kewirausahaan\n" +
                "Yang termasuk faktor produksi sekunder adalah ....", "(1) dan (2)", "(1) dan (3)", "(1) dan (4)", "(2) dan (3)", "(3) dan (4)", 5, Question.CATEGORY_QUIZ5);
        addQuestion(q43);
        Question q44 = new Question("Syarat laba maksimum adalah ....", "TR = TC", "AR = AC", "MR = MC", "P = AR", "MR = AR", 1, Question.CATEGORY_QUIZ5);
        addQuestion(q44);
        Question q45 = new Question("Untuk memproduksi 5 unit barang digunakan biaya produksi Rp1.000.000,00. Adapun untuk memproduksi 6 unit barang digunakan biaya produksi Rp1.100.000,00. Jumlah biaya Rp100.000,00 disebut biaya ....", "rata-rata", "marginal", "produksi", "variabel", "total", 2, Question.CATEGORY_QUIZ5);
        addQuestion(q45);
        Question q46 = new Question("Kurva isokuan adalah suatu kurva ....", "yang menunjukkan pertambahan hasil produksi yang semakin menurun", "yang menunjukkan bahwa proses produksi tidak menghasilkan tambahan produksi jika tidak menambah faktor produksi variabel", "yang menunjukkan bahwa penambahan produksi tidak dapat dilakukan tanpa menambah faktor produksi tetap", "yang menunjukkan produksi yang sama dengan semua kombinasi jenis faktor produksi", "yang menghasilkan pertambahan produk hanya dengan menyusun kembali mesin-mesin", 4, Question.CATEGORY_QUIZ5);
        addQuestion(q46);
        Question q47 = new Question("Total Product akan bergeser ke kanan (Bertambah) apabila ....", "teknologi produksi makin canggih, modal bertambah, dan sebagian pekerja pensiun", "modal bertambah, teknologi terapan makin canggih, dan luas lahan berkurang", "luas lahan bertambah, modal bertambah, dan jumlah mesin dikurangi", "karyawan lembur, luas lahan bertambah, dan modal berkurang", "modal bertambah, mesin ditambah, dan karyawan dilemburkan", 5, Question.CATEGORY_QUIZ5);
        addQuestion(q47);
        Question q48 = new Question("Upaya untuk meningkatkan hasil produksi dengan cara mengembangkan atau menambah keanekaragaman jenis hasil produksi....", "intensifikasi", "ekstensifikasi", "diversifikasi", "spesialisasi", "mekanisasi", 3, Question.CATEGORY_QUIZ5);
        addQuestion(q48);
        Question q49 = new Question("Analisis perilaku konsumen dan perilaku produsen berikut:\n" +
                "(1) Bu Widati membuka usaha warung makan di sekitar pabrik garmen dekat rumahnya\n" +
                "(2) Pak Endun mencari alternatif bahan baku untuk menekan harga pokok usahanya\n" +
                "(3) Bu Mira membandingkan harga-harga bahan sembako beberapa kios yang ada di pasar\n" +
                "(4) Untuk mempersiapkan masa pensiun, Pak Wahyu menyisihkan sebagian pendapatannya setiap bulan\n" +
                "(5) Sebagai pengusaha, Henry memberikan apresiasi kepada karyawannya yang memiliki dedikasi tinggi\n" +
                "Perilaku-perilaku produsen ditunjukkan nomor ....", "(1), (2), dan (3)", "(1), (2), dan (5)", "(1), (3), dan (4)", "(2), (3), dan (4)", "(3), (4), dan (5)", 2, Question.CATEGORY_QUIZ5);
        addQuestion(q49);
        Question q50 = new Question("Pada umumnya, pendistribusian hasil pertanian memakai saluran pendek sebab ....", "konsumen ingin segera membeli", "barang-barang yang disalurkan tidak tahan lama", "barangnya sangat dibutuhkan pembeli", "barang yang disalurkan banyak", "untuk kepentingan penghematan biaya distribusi", 3, Question.CATEGORY_QUIZ5);
        addQuestion(q50);
        Question q51 = new Question("Berikut ini yang merupakan kegiatan konsumsi adalah ....", "memperbanyak jenis barang", "mengurangi penghasilan konsumen", "menambah nilai guna barang dan jasa", "menggunakan barang dan jasa untuk memenuhi kebutuhan", "mengurangi jumlah barang yang dimiliki", 4, Question.CATEGORY_QUIZ6);
        addQuestion(q51);
        Question q52 = new Question("Perantara dalam perdagangan untuk menjualkan atau membelikan barang atas nama orang lain disebut ....", "makelar", "agen", "komisioner", "eksportir", "importir", 1, Question.CATEGORY_QUIZ6);
        addQuestion(q52);
        Question q53 = new Question("Amati ilustrasi berikut:\n" +
                "(1) Keluarga Sutan mengajak berlibur ke Ancol\n" +
                "(2) Pak Subandi menanam jagung di kebun\n" +
                "(3) Pak Surya mengendarai sepeda motor ke tempat kerja\n" +
                "(4) Pak Sukarno berjualan di kiosnya\n" +
                "Dari ilustrasi tersebut, yang merupakan kegiatan konsumsi adalah ....", "(1) dan (2)", "(1) dan (3)", "(1) dan (4)", "(2) dan (3)", "(2) dan (4)", 2, Question.CATEGORY_QUIZ6);
        addQuestion(q53);
        Question q54 = new Question("Berikut ini beberapa analisis perilaku konsumen:\n" +
                "(1) Perilaku konsumen dalam mengonsumsi barang dapat diukur\n" +
                "(2) Pendapatan memegang peranan penting dalam mengonsumsi barang\n" +
                "(3) Analisis konsumen dapat menggunakan peta indifferent\n" +
                "(4) Besarnya nilai kepuasan tergantung pada pendapatan konsumen\n" +
                "(5) Konsumen berusaha untuk mendapatkan kepuasan maksimal konsumsi\n" +
                "Analisis perilaku konsumen dengan menggunakan pendekatan kardinal adalah ....", "(1), (2), dan (3)", "(1), (2), dan (4)", "(1), (3), dan (5)", "(2), (3), dan (4)", "(2), (3), dan (5)", 2, Question.CATEGORY_QUIZ6);
        addQuestion(q54);
        Question q55 = new Question("Berikut ini beberapa pernyataan tentang Kurva indiferen\n" +
                "(1) menurun dari kiri ke kanan bawah\n" +
                "(2) cembung ke arah titik origin\n" +
                "(3) menunjukkan tingkat kepuasan sama bagi seorang konsumen\n" +
                "(4) tidak akan saling berpotongan Yang menunjukkan ciri kurva indiferen adalah ....", "(1) dan (2)", "(1) dan (3)", "(1) dan (4)", "(2) dan (3)", "(2) dan (4)", 3, Question.CATEGORY_QUIZ6);
        addQuestion(q55);
        Question q56 = new Question("Perhatikan fungsi distributor berikut!\n" +
                "(1) Pengangkutan\n" +
                "(2) Penjualan\n" +
                "(3) Penyimpanan\n" +
                "(4) Pengemasan\n" +
                "(5) Membei informasi\n" +
                "Yang termasuk fungsi pokok distribusi adalah ....", "(1), (2), dan (3)", "(1), (3), dan (4)", "(1), (4), dan (5)", "(2), (3), dan (4)", "(3), (4), dan (5)", 1, Question.CATEGORY_QUIZ6);
        addQuestion(q56);
        Question q57 = new Question("Hukum Gossen II berdasarkan pada perkiraan bahwa ....", "kebutuhan manusia banyak macamnya dan tidak harus selalu dipenuhi", "kebutuhan manusia banyak macamnya sehingga tidak mungkin memuaskan satu kebutuhan pada titik jenuh", "kebutuhan manusia banyak macamnya, seandainya belum memungkinkan untuk dipenuhi harus dilakukan pemilihan terlebih dahulu", "kebutuhan manusia banyak macamnya dan harus dipenuhi secara terus menerus", "kebutuhan manusia banyak sehingga jika dipenuhi bersamaan akan menemukan kepuasan pada titik yang sama", 5, Question.CATEGORY_QUIZ6);
        addQuestion(q57);
        Question q58 = new Question("Teori nilai yang menyatakan bahwa nilai suatu barang ditentukan oleh biaya yang diperlukan untuk memproduksi kembali barang tersebut, dikemukakan oleh ....", "Adam Smith", "Carey", "David Ricardo", "Humme & Locke", "HH Gossen", 2, Question.CATEGORY_QUIZ6);
        addQuestion(q58);
        Question q59 = new Question("Kurva yang menjelaskan kombinasi dua jenis barang yang membutuhkan anggaran yang sama adalah ....", "Consumer behaviour curve", "Isoquant curve", "Indifference curve", "Isocost curve", "Budget line curve", 5, Question.CATEGORY_QUIZ6);
        addQuestion(q59);
        Question q60 = new Question("Berikut perilaku yang dilakukan beberapa orang\n" +
                "(1) Pak Zainal membeli mobil baru karena banyak warga di sekitar tempat tinggalnya yang membutuhkan antar jemput anak sekolah\n" +
                "(2) Pak Arief membuat perencanaan anggaran belanja usaha kateringnya\n" +
                "(3) Bu Anisa selalu membuat daftar belanja setiap melakukan belanja rumah tangga\n" +
                "(4) Surahman membeli sepeda motor baru meskipun sepeda motor lama masih layak digunakan\n" +
                "(5) Pak Hartawan menyisihkan sebagian keuntungan dari usaha restorannya dengan tujuanmemperluas usaha kelak\n" +
                "Berdasarkan pernyataan tersebut yang termasuk perilaku produsen ditunjukkan nomor ....", "(1), (2), dan (3)", "(1), (2), dan (4)", "(1), (2), dan (5)", "(2), (3), dan (5)", "(3), (4), dan (5)", 3, Question.CATEGORY_QUIZ6);
        addQuestion(q60);
        Question q61 = new Question("Pengertian permintaan dalam konsep ekonomi adalah ….", "umlah keseluruhan barang dan jasa yang ingin dibeli oleh konsumen pada berbagai macam tingkat harga.", "Keinginan terhadap suatu barang yang disertai dengan kemampuan untuk membayar harga barang tersebut.", "Keinginan terhadap suatu barang yang tidak disertai dengan kemampuan untuk membayar harga barang tersebut.", "Jumlah keseluruhan barang yang akan dijual.", "Keinginan konsumen untuk membayar barang atau jasa.", 1, Question.CATEGORY_QUIZ7);
        addQuestion(q61);
        Question q62 = new Question("Berikut ini yang tidak termasuk faktor yang dapat memengaruhi permintaan seseorang, yaitu ….", "pendapatan", "selera", "harga barang lain yang berkaitan", "teknologi", "harga barang itu sendiri", 4, Question.CATEGORY_QUIZ7);
        addQuestion(q62);
        Question q63 = new Question("Pada saat harga sebuah lampu Rp15.000,00, permintaan terhadap lampu tersebut adalah 4.000, dan setiap kenaikan harga Rp1.000,00 permintaan turun 500 untuk setiap lampu. Dari data tersebut, maka fungsi permintaannya adalah ….", "Q = -½P + 11.500", "Q = 5P + 11.500", "Q = 11.500 + ½ P", "Q = -5P + 11.500", "Q = -11.500 + ½ P", 1, Question.CATEGORY_QUIZ7);
        addQuestion(q63);
        Question q64 = new Question("Berikut ini adalah faktor-faktor yang memengaruhi perubahan jumlah permintaan suatu barang, kecuali....", "Harga barang itu sendiri", "Perubahan harga barang substitusi", "Perubahan pendapatan", "Perubahan selera", "Naiknya biaya produksi", 5, Question.CATEGORY_QUIZ7);
        addQuestion(q64);
        Question q65 = new Question("Permintaan efektif adalah....", "Jumlah keseluruhan barang dan jasa yang ingin dibeli oleh konsumen pada berbagai macam tingkat harga", "Permintaan terhadap suatu barang yang disertai dengan kemampuan untuk membayar harga barang tersebut", "Permintaan terhadap suatu barang yang tidak disertai dengan kemampuan untuk membayar harga barang tersebut", "Permintaan terhadap suatu barang/jasa yang disertai daya beli/kemampuan, tapi tidak dilaksanakan", "Keinginan konsumen untuk membayar barang atau jasa", 2, Question.CATEGORY_QUIZ7);
        addQuestion(q65);
        Question q66 = new Question("Penawaran suatu barang akan dipengaruhi banyak faktor, yang diantaranya seperti berikut ini, kecuali ….", "Selera calon konsumen", "Harga barang lain", "Biaya produksi", "Harga bahan baku", "Kebijakan pemerintah", 1, Question.CATEGORY_QUIZ7);
        addQuestion(q66);
        Question q67 = new Question("Beberapa faktor yang memengaruhi permintaan dan penawaran diantaranya.\n" +
                "1) Ekspektasi\n" +
                "2) Biaya produksi\n" +
                "3) Tingkat Pendapatan konsumen\n" +
                "4) Kemajuan teknologi\n" +
                "5) Selera\n" +
                "Yang merupakan faktor-faktor yang memengaruhi penawaran ….", "1, 2, dan 3", "1, 2, dan 4", "2, 3, dan 4", "2, 4, dan 5", "3, 4, dan 5", 2, Question.CATEGORY_QUIZ7);
        addQuestion(q67);
        Question q68 = new Question("Faktor-faktor yang memengaruhi permintaan dan penawaran, diantaranya.\n" +
                "1) Teknologi\n" +
                "2) Harga barang\n" +
                "3) Biaya produksi\n" +
                "4) Selera konsumen\n" +
                "5) Tingkat pendapatan\n" +
                "Merupakan faktor-faktor yang memengaruhi penawaran, yaitu ….", "1, 2, dan 3", "2, 4, dan 5", "1, 3, dan 5", "2, 3, dan 5", "2, 3, dan 4", 1, Question.CATEGORY_QUIZ7);
        addQuestion(q68);
        Question q69 = new Question("Hukum penawaran mengatakan bahwa ….", "Jumlah barang yang ditawarkan akan selalu berbanding terbalik dengan harganya.", "Jumlah barang yang ditawarkan akan selalu berbanding lurus dengan harganya", "Jika harga barang naik, maka jumlah barang yang ditawarkan akan naik", "Jika harga barang turun, maka jumlah barang yang ditawarkan akan turun", "Jika jumlah barang yang ditawarkan turun, maka harga akan naik", 2, Question.CATEGORY_QUIZ7);
        addQuestion(q69);
        Question q70 = new Question("Pada saat harga Rp2,00, jumlah barang yang ditawarkan 5 unit dan pada saat harga Rp3,00 jumlah barang yang ditawarkan 8 unit. Fungsi penawarannya adalah ….", "Q = 3P - 1", "Q = -3P + 1", "Q = -3P + 2", "Q = 3P + 4", "Q = 3P + 6", 1, Question.CATEGORY_QUIZ7);
        addQuestion(q70);
        Question q71 = new Question("Harga yang menunjukkan jumlah permintaan dan jumlah penawaran seimbang adalah ….", "Harga permintaan", "Inflasi", "Harga Equilibrium", "Deflasi", "Profit", 3, Question.CATEGORY_QUIZ8);
        addQuestion(q71);
        Question q72 = new Question("Diketahui fungsi permintaan Qd = 75 – P dan fungsi penawaran Qs = 8P – 105. Maka harga keseimbangannya adalah ….", "5", "6", "8", "9", "20", 5, Question.CATEGORY_QUIZ8);
        addQuestion(q72);
        Question q73 = new Question("Fungsi permintaan Q = 210 – 3P dan fungsi penawaran Q = -40 + 2P maka harga keseimbangannya, adalah ….", "40", "70", "50", "80", "60", 3, Question.CATEGORY_QUIZ8);
        addQuestion(q73);
        Question q74 = new Question("Tingkat kepekaan permintaan atau penawaran terhadap harga disebut ….", "elastisitas", "tren", "fluktuasi", "hubungan pararel", "hubungan vertikal", 1, Question.CATEGORY_QUIZ8);
        addQuestion(q74);
        Question q75 = new Question("Pasaran motor di Indonesia dikuasai oleh “Tiga Besar” produk yaitu Honda, Suzuki, dan Yamaha. Pasar sepeda motor di Indonesia menunjukkan bentuk pasar....", "Oligopoli", "Monopsoni", "Oligopsoni", "Persaingan sempurna", "Monopoli", 1, Question.CATEGORY_QUIZ8);
        addQuestion(q75);
        Question q76 = new Question("Pada saat harga Rp500,00 per kg, jumlah yang diminta 100 kuintal. Ketika harga naik menjadi Rp560,00 per kg jumlah yang diminta menjadi 90 kuintal. Koefisien elastisitas permintaannya adalah sebesar ....", "0,70", "0,73", "0,75", "0,80", "0,83", 5, Question.CATEGORY_QUIZ8);
        addQuestion(q76);
        Question q77 = new Question("Meskipun harga beras naik, orang akan tetap membutuhkan beras sebagai makanan pokok. Karenanya, meskipun mungkin dapat dihemat penggunaannya namun tidak akan sebesar kenaikan harga yang terjadi. Sebaliknya pula, jika harga beras turun konsumen tidak akan menambah konsumsinya sebesar penurunan harga. Karakteristik produk yang seperti ini mengakibatkan permintaan menjadi ….", "Elastis", "Elastis sempurna", "Inelastis", "Elastis rata-rata", "Elastis uniter", 3, Question.CATEGORY_QUIZ8);
        addQuestion(q77);
        Question q78 = new Question("Pada harga Rp2,00, maka jumlah barang yang ditawarkan 5, dan pada harga Rp4,00 jumlah barang yang ditawarkan 7. Koefisien elastisitas penawarannya ….", "0,1", "0,2", "0,3", "0,4", "0,5", 4, Question.CATEGORY_QUIZ8);
        addQuestion(q78);
        Question q79 = new Question("Ciri dari pasar monopoli ialah apabila seorang penjual atau pembeli menguasai pasar sehingga dapat mempengaruhi penetapan harga pasar. Sedangkan ciri dari pasar persaingan sempurna ….", "suatu pasar dengan kelompok penjual yang menjual barang-barang yang sejenis, tetapi terdapat perbedaan-perbedaan hasil produksi.", "terdapatnya campur tangan pemerintah dalam kehidupan ekonomi dengan maksud melindungi kepentingan masyarakat", "jumlah pembeli dan penjual sangat banyak sehingga pembeli atau penjual secara perorangan tidak dapat mempengaruhi situasi pasar", "terdapatnya keterbatasan baik keterbatasan jumlah penjual maupun keterbatasan harga", "terdapatnya kecenderungan persaingan antara pembeli dan penjual dalam menetapkan harga serendah mungkin", 3, Question.CATEGORY_QUIZ8);
        addQuestion(q79);
        Question q80 = new Question("Di bawah ini adalah ciri sebuah pasar:\n" +
                "1. Penyalahgunaan kekuatan ekonomi\n" +
                "2. Menghindari produk-produk tiruan\n" +
                "3. Terjadi perang harga karena tindakan seorang penjual dibalas penjual lain\n" +
                "4. Tidak adanya persaingan\n" +
                "Yang merupakan kekurangan pasar monopoli adalah pernyataan .…", "1 dan 2", "dan 3", "1 dan 4", "2 dan 3", "2 dan 4", 3, Question.CATEGORY_QUIZ8);
        addQuestion(q80);
        Question q81 = new Question("Perhatikan ciri-ciri pasar:\n" +
                "1) Terdapat beberapa produsen yang menguasai pasar\n" +
                "2) Satu diantaranya merupakan price leader\n" +
                "3) Barang yang diperjualbelikan dapat homogen dan dapat pula berbeda corak (differentiated product)\n" +
                "4) Tidak ada persaingan\n" +
                "5) Harga ditentukan oleh permintaan dan penawaran pasar\n" +
                "Yang merupakan ciri pasar oligopoli adalah ….", "1), 2), dan 3)", "1), 3), dan 4)", "1), 3), dan 5)", "2), 4), dan 5)", "3), 4), dan 5)", 1, Question.CATEGORY_QUIZ9);
        addQuestion(q81);
        Question q82 = new Question("Berikut ini adalah ciri-ciri Pasar Monopoli dan Pasar Persaingan Sempurna:\n" +
                "1) Ada satu penjual atau produsen yang menguasai produk tertentu\n" +
                "2) Ada satu pembeli atau konsumen yang menguasai produk tertentu\n" +
                "3) Penjual dan produsennya banyak\n" +
                "4) Pembeli atau konsumennya banyak\n" +
                "5) Baik penjual atau pembelinya sama-sama banyak\n" +
                "6) Produsen bisa bertindak sebagai price maker\n" +
                "Ciri-ciri yang tepat bagi Perusahaan Listrik Negara (PLN) adalah ….", "1), 2), dan 3)", "1), 4), dan 6)", "2), 3), dan 5)", "3), 5), dan 6)", "4), 5), dan 6)", 2, Question.CATEGORY_QUIZ9);
        addQuestion(q82);
        Question q83 = new Question("Bank umum membantu BI mewujudkan tujuan dalam menjalankan kebijakan moneter, yaitu:\n" +
                "1) mencapai pertumbuhan ekonomi yang tinggi\n" +
                "2) memberikan pinjaman pada nasabah\n" +
                "3) memberikan kredit kepada nasabah\n" +
                "4) mengatur bank umum\n" +
                "5) menghimpun dana dari masyarakat\n" +
                "Yang menjadi tugas bank umum adalah:", "1), 2), dan 3)", "1), 3), dan 5)", "2), 3), dan 5)", "2), 4), dan 5)", "3), 4), dan 5)", 3, Question.CATEGORY_QUIZ9);
        addQuestion(q83);
        Question q84 = new Question("Di bawah ini adalah tugas-tugas Bank.\n" +
                "1) Menerima simpanan dalam bentuk tabungan dan deposito\n" +
                "2) Memelihara kestabilan uang\n" +
                "3) Memberi kredit jangka panjang\n" +
                "4) Pembina dari bank-bank\n" +
                "5) Mendorong kelancaran produksi masyarakat dengan memberikan kredit lunak\n" +
                "Tugas Bank Umum adalah:", "1), 2), dan 3)", "2), 3), dan 4)", "1), 3), dan 5)", "2), 4), dan 5)", "1), 2), dan 5)", 3, Question.CATEGORY_QUIZ9);
        addQuestion(q84);
        Question q85 = new Question("Bank Central Asia adalah bank yang melaksanakan kegiatan usaha secara konvensional yang dalam kegiatannya memberikan jasa lalu lintas pembayaran. BCA termasuk jenis:", "Bank Sentral", "BPR", "Bank Syariah", "Bank Devisa", "Bank Umum", 5, Question.CATEGORY_QUIZ9);
        addQuestion(q85);
        Question q86 = new Question("Bank Amanah Tambun adalah sebuah Bank Perkreditan Rakyat yang tidak boleh memiliki kegiatan:", "Menghimpun dana dari masyarakat sekitar dalam bentuk tabungan", "Memberikan kredit kepada masyarakat sekitar", "Menyediakan pembiayaan dalam bentuk syariah", "Melakukan kegiatan usaha dalam valuta asing", "Menempatkan dananya dalam bentuk SBI", 4, Question.CATEGORY_QUIZ9);
        addQuestion(q86);
        Question q87 = new Question("Fungsi bank antara lain adalah:\n" +
                "1) Menjaga kestabilan nilai rupiah\n" +
                "2) Menghimpun dana dari masyarakat\n" +
                "3) Mengawasi dan menilai bank\n" +
                "4) Memberi pinjaman kepada masyarakat\n" +
                "5) Mengatur lalu lintas pembayaran\n" +
                "Fungsi Bank Perkreditan Rakyat adalah", "1) dan 2)", "2) dan 4)", "1) dan 3)", "2) dan 5)", "1) dan 5)", 2, Question.CATEGORY_QUIZ9);
        addQuestion(q87);
        Question q88 = new Question("Bu Ratna membeli motor Honda di Dealer Honda Motor Abadi Tambun. Pembelian dilakukan secara angsuran namun setelah kontrak ditandatangani, segala fasilitas dan kegunaan motor sudah bisa dinikmati Bu Ratna. Motor Bu Ratna sudah dibayar oleh Adira secara tunai, sehingga Bu Ratna membayar angsurannya ke Adira Finance.\n" +
                "Adira Finance merupakan jenis:", "Modal Ventura", "Perusahaan Sewa Guna / Leasing", "Koperasi", "Asuransi", "Bursa efek", 2, Question.CATEGORY_QUIZ9);
        addQuestion(q88);
        Question q89 = new Question("Berikut ini adalah bank dan lembaga keuangan :\n" +
                "1) Bank Central Asia\n" +
                "2) Asuransi Prudential\n" +
                "3) Bank Rakyat Indonesia\n" +
                "4) Adira Finance\n" +
                "5) PT. Pegadaian\n" +
                "Yang merupakan Lembaga Keuangan Non-Bank adalah:", "1), 2), dan 3)", "2), 4), dan 5)", "2), 3), dan 4)", "1), 3), dan 5)", "3), 4), dan 5)", 2, Question.CATEGORY_QUIZ9);
        addQuestion(q89);
        Question q90 = new Question("Perhatikan tugas lembaga keuangan berikut ini.\n" +
                "1) Melayani jasa penaksiran\n" +
                "2) Melayani jasa titipan barang\n" +
                "3) Pengambilalihan tagihan suatu perusahaan dengan fee tertentu.\n" +
                "4) Memberikan pinjaman dengan jaminan\n" +
                "5) Pembelian piutang perusahaan dalam suatu transaksi perdagangan dengan harga sesuai kesepakatan.\n" +
                "Yang merupakan tugas anjak piutang adalah nomor ….", "1) dan 2)", "2) dan 3)", "5) dan 4)", "2) dan 3)", "3) dan 5)", 5, Question.CATEGORY_QUIZ9);
        addQuestion(q90);
        Question q91 = new Question("Perusahaan Humida adalah melakukan pembiayaan kepada perusahaan kecil yang belum memiliki bentuk badan hukum Perseroan Terbatas. Usaha yang dilakukannya termasuk dalam:", "Modal ventura", "Pegadaian", "Anjak piutang", "Asuransi", "Leasing", 1, Question.CATEGORY_QUIZ10);
        addQuestion(q91);
        Question q92 = new Question("Masalahan ekonomi modern yang dihadapi oleh setiap masyarakat atau suatu negara adalah ....", "ketidakseimbangan antara permintaan dan penawaran", "barang atau jasa apa yang diproduksi, bagaimana cara memproduksi, dan untuk siapa diproduksi", "stabilitas harga dan kesempatan kerja", "ketidakstabilan kurs mata uang dalam negeri terhadap valuta asing", "ketidakmerataan distribusi pendapatan nasional", 2, Question.CATEGORY_QUIZ10);
        addQuestion(q92);
        Question q93 = new Question("Pemerintah daerah berupaya membangun perumahan bersubsidi yang harganya terjangkau bagi masyarakat berpenghasilan menengah ke bawah. Hal tersebut dilakukan untuk mengatasi permasalahan yang terkait dengan masih banyaknya warga masyarakat yang belum memiliki tempat tinggal. Kegiatan tersebut menunjukkan adanya upaya pemecahan permasalahan pokok ekonomi modern yaitu....", "untuk siapa barang diproduksi", "barang apa yang harus diproduksi", "bagaimana cara memproduksi", "di mana barang akan diproduksi", "berapa banyak jumlah yang diproduksi", 1, Question.CATEGORY_QUIZ10);
        addQuestion(q93);
        Question q94 = new Question("Perhatikan wacana berikut:\n" +
                "BI menjamin ketersediaan uang layak edar yang higienis dan mendorong\n" +
                "penggunaan pembayaran nontunai termasuk melalui perpanjangan masa\n" +
                "berlakunya MDR 0% untuk QRIS dari Mei menjadi September 2020, yang disepakati\n" +
                "bersama ASPI dan PJSP.\n" +
                "Dari wacana di atas, tugas yang diperankan Bank Indonesia adalah", "Menetapkan dan menjalankan kebijakan moneter", "Mengatur dan menjaga kelancaran sistem pembayaran", "Stabilitas sistem keuangan", "Menerima tabungan masyarakat demi keuangan negara", "Mencetak dan mengedarkan uang kertas", 2, Question.CATEGORY_QUIZ10);
        addQuestion(q94);
        Question q95 = new Question("Perhatikan kesulitan barter dan kesulitan menyimpan uang barang :\n" +
                "1) Sulit menemukan barang untuk kebutuhan yang mendesak\n" +
                "2) Sulit menentukan perbandingan barang yang ditukarkan\n" +
                "3) Sukar disimpan\n" +
                "4) Sukar dibawa keana-mana\n" +
                "5) Tidak tahan lama\n" +
                "6) Sulit memenuhi kebutuhan yang bermacam-macam\n" +
                "Yang menjadi kesulitan barter adalah:", "1, 2, dan 6", "3, 4, dan 5", "1,5, dan 6", "4, 5, dan 6", "2, 3, dan 4", 1, Question.CATEGORY_QUIZ10);
        addQuestion(q95);
        Question q96 = new Question("Selain sebagai sarana pemenuhan kebutuhan siswa, koperasi sekolah juga berfungsi sebagai ... .", "Sarana pengembangan ekonomi siswa", "Sarana pendidikan bagi siswa", "Sarana rekreasi bagi siswa", "Sumber keuangan bagi siswa", "Tempat penitipan barang dagangan siswa", 2, Question.CATEGORY_QUIZ10);
        addQuestion(q96);
        Question q97 = new Question("Pemegang kekuasaan tertinggi pada koperasi sekolah adalah ... .", "Kepala sekolah", "Guru ekonomi", "Rapat anggota", "Ketua koperasi", "pengurus", 3, Question.CATEGORY_QUIZ10);
        addQuestion(q97);
        Question q98 = new Question("SMA Bina Bangsa, melakukan terobosan dengan menggunakan absen online untuk memantau kehadiran peserta didik. Begitu perserta didik absen, saat itu juga laporan terkirim ke server dan telepon orang tua. Jadi orang tua bisa memantau jam berapa anaknya masuk dan pulang sekolah. Hal ini merupakan salah satu cara untuk bisa menyampaikan informasi pada orang tua. Kegiatan ini bagian dari manajemen sekolah bidang ….", "Kurikulum", "Humas", "Layanan khusus", "Tenaga kependidikan", "Kesiswaan", 2, Question.CATEGORY_QUIZ10);
        addQuestion(q98);
        Question q99 = new Question("OSIS sedang mengadakan kegiatan dalam rangka ulang tahun sekolah. Kegiatan rapat diadakan sebelum kegiatan dimulai, saat kegiatan berjalan dan setelah kegiatan selesai. Rapat yang diadakan saat kegiatan berjalan tujuannya untuk memantau apakah kegiatan berjalan sesuai rencana, bila ada penyimpangan akan segera diambil Tindakan. Dalam manajemen hal ini termasuk fungsi …", "Planning", "Organizing", "Actuating", "Controlling", "Staffing", 4, Question.CATEGORY_QUIZ10);
        addQuestion(q99);
        Question q100 = new Question("Jumlah masyarakat yang menggadaikan barang ke pegadaian meningkat. Peningkatan ini diduga karena kebutuhan mendekati Idul Fitri, serta ekonomi yang sulit akibat pandemi corona.\n" +
                "Berdasarkan wacana di atas, tugas pokok yang diemban pegadaian adalah:", "Membina perekonomian rakyat kecil dengan menyalurkan kredit atas dasar hukum gadai", "Ikut serta mencegah adanya pemberian pinjaman yang tidak wajar, ijon, pegadaian gelap dan praktik riba lainnya", "Menyalurkan kredit maupun usaha-usaha lainnya yang bermanfaat terutama", "Membina pola perkreditan supaya benar-benar terarah dan bermanfaat", "Memberikan pinjaman kepada nasabah", 2, Question.CATEGORY_QUIZ10);
        addQuestion(q100);

    }



    private void addQuestion(Question question) {

        ContentValues cv = new ContentValues();
        cv.put(QuizConstract.QuestionsTable.COLUMN_QUESTIONS, question.getQuestion());
        cv.put(QuizConstract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuizConstract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuizConstract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuizConstract.QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuizConstract.QuestionsTable.COLUMN_OPTION5, question.getOption5());
        cv.put(QuizConstract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuizConstract.QuestionsTable.COLUMN_CATEGORY, question.getCategory());
        db.insert(QuizConstract.QuestionsTable.TABLE_NAME, null, cv);

    }

    public ArrayList<Question> getAllQuestions() {

        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();


        String Projection[] = {

                QuizConstract.QuestionsTable._ID,
                QuizConstract.QuestionsTable.COLUMN_QUESTIONS,
                QuizConstract.QuestionsTable.COLUMN_OPTION1,
                QuizConstract.QuestionsTable.COLUMN_OPTION2,
                QuizConstract.QuestionsTable.COLUMN_OPTION3,
                QuizConstract.QuestionsTable.COLUMN_OPTION4,
                QuizConstract.QuestionsTable.COLUMN_OPTION5,
                QuizConstract.QuestionsTable.COLUMN_ANSWER_NR
        };


        Cursor c = db.query(QuizConstract.QuestionsTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_QUESTIONS)));
                question.setOption1(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION4)));
                question.setOption5(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION5)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_ANSWER_NR)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }


    public ArrayList<Question> getAllQuestionsWithCategory(String category) {

        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();


        String Projection[] = {

                QuizConstract.QuestionsTable._ID,
                QuizConstract.QuestionsTable.COLUMN_QUESTIONS,
                QuizConstract.QuestionsTable.COLUMN_OPTION1,
                QuizConstract.QuestionsTable.COLUMN_OPTION2,
                QuizConstract.QuestionsTable.COLUMN_OPTION3,
                QuizConstract.QuestionsTable.COLUMN_OPTION4,
                QuizConstract.QuestionsTable.COLUMN_OPTION5,
                QuizConstract.QuestionsTable.COLUMN_ANSWER_NR,
                QuizConstract.QuestionsTable.COLUMN_CATEGORY
        };


        String selection = QuizConstract.QuestionsTable.COLUMN_CATEGORY + " = ? ";
        String selectionArgs[] = {category};


        Cursor c = db.query(QuizConstract.QuestionsTable.TABLE_NAME,
                Projection,
                selection,
                selectionArgs,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_QUESTIONS)));
                question.setOption1(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION4)));
                question.setOption5(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_OPTION5)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuizConstract.QuestionsTable.COLUMN_CATEGORY)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }
}
