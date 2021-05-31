package com.example.eduecon.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.eduecon.Model.Question;
import com.example.eduecon.Model.QuizConstract.*;

import java.util.ArrayList;

public class QuizDbHelper1 extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyQuiz1.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper1(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTIONS + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION5 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("Kata ekonomi berasal dari 'oikonomia', yang berarti...", "Kebutuhan manusia", "Pengaturan rumah tangga", "Pengaturan kekayaan", "Kelangkaan", "Kemakmuran", 2);
        addQuestion(q1);
        Question q2 = new Question("Ilmu ekonomi adalah studi tentang cara masyarakat ...", "Mengelola sumber-sumber daya yang langka", "Mengelola pembuatan barang industri", "Melakukan konsumsi yang ideal", "Mengelola sumber daya ekonomi", "Menentukan satu pilihan", 5);
        addQuestion(q2);
        Question q3 = new Question("Ilmu ekonomi menurut Alfred W. Stonier dan Douglas C. Hague dapat dibagi menjadi kelompok ekonomi ...", "Deskriptif, teori, dan terapan", "Pertanian, industri, dan publik", "Makro, mikro, dan terapan", "Pertanian, industri, dan terapan", "Induk, cabang, dan lanjutan", 1);
        addQuestion(q3);
        Question q4 = new Question("Ilmu ekonomi positif sering disebut sebagai ilmu ekonomi ...", "Terapan", "Teori", "Kualitatif", "Deskriptif", "Sosial", 4);
        addQuestion(q4);
        Question q5 = new Question("Yang termasuk pernyataan ekonomi positif adalah ...", "Pajak harus dipungut atas dasar pengeluaran", "Sebaiknya pendapatan negara dari pajak digunakan untuk membiayai orang miskin", "Seharusnya pendapatan nasional dibagi secara merata", "Sebagian pendapatan orang kaya harus didistribusikan pada orang miskin", "Sebaiknya masyarakat yang menjadi pemilik sumber daya ekonomi", 1);
        addQuestion(q5);
        Question q6 = new Question("Bagian dari ilmu ekonomi secara khusus mempelajari fungsi, sifat, peranan, permasalahan mekanisme moneter, dan pengaruh uang terhadap aktivitas perekonomian suatu negara disebut imu ekonomi ...", "Syariah", "Moneter", "Perdagangan", "Internasional", "Pembangunan", 2);
        addQuestion(q6);
        Question q7 = new Question("Ilmu ekonomi yang meneliti bagaimana berbagai keputusan dan perilaku kegiatan ekonomi dapat memengaruhi penawaran dan permintaan atas barang dan jasa sehingga dapat menentukan harga disebut ilmu ekonomi ...", "Mikro", "Makro", "Moneter", "Perusahaan", "Pembangunan", 1);
        addQuestion(q7);
        Question q8 = new Question("Cabang ilmu ekonomi yang mempelajari tentang keterkaitan antara struktur industri, perilaku industri, dan kinerja industri disebut ilmu ekonomi ...", "Mikro", "Makro", "Moneter", "Industri", "Perdagangan", 4);
        addQuestion(q8);
        Question q9 = new Question("Ilmu ekonomi adalah ilmu yang mempelajari pemanfaatan sumber daya yang langka untuk memenuhi keinginan yang tidak terbatas. Pengertian ilmu ekonomi tersebut dikemukakan oleh ...", "N. Gregory Mankiw", "Richard G. Lipsey", "Paul A. Samuelson", "Robert B. Ekelund", "Alfred Marshall", 1);
        addQuestion(q9);
        Question q10 = new Question("Permasalahan kenaikan harga bahan pokok dan kelangkaan BBM di berbagai daerah termasuk dalam lingkup pembahasan ilmu ekonomi ...", "Moneter", "Mikro", "Regional", "Makro", "Publik", 2);
        addQuestion(q10);
        Question q11 = new Question("Kelangkaan adalah ...", "Suatu kondisi ketika sesuatu barang atau jasa banyak tersedia saat musim panen tetapi tidak ada saat bukan musim panen", "Suatu kondisi dimana sesuatu barang tersedia dalam jumlah tidak terbatas di suatu tempat, tetapi barang tersebut sulit dicari pada tempat lain", "Suatu kondisi ketika manusia memiliki sumber daya ekonomi yang terbatas untuk memenuhi kebutuhan yang tidak terbatas", "Suatu keadaan dimana barang tersedia dalam jumlah tidak terbatas, namun sulit terbeli karena tidak memiliki uang", "Suatu keadaan dimana banyak uang yang tersedia tetapi barang dan jasa yang akan dibeli tidak ada", 3);
        addQuestion(q11);
        Question q12 = new Question("Ilmu ekonomi adalah studi tentang cara masyarakat ...", "Melimpahnya sumber daya alam yang tersedia", "Seimbangnya antara kemajuan ilmu pengetahuan dan teknologi dengan peningkatan kebutuhan", "Terbatasnya kemampuan yang dimiliki manusia dalam mengolah sumber daya alam yang ada", "Melimpahnya tenaga ahli", "Kreativitas manusia dalam penciptaan kebutuhan baru", 3);
        addQuestion(q12);
        Question q13 = new Question("Mayoritas penduduk Indonesia mengkonsumsi beras, tetapi produksi beras saat ini menurun. Di kota-kota tertentu sudah terasa kelangkaan terjadi sehingga beras melambung tinggi. Hasil penelitian sementara menyatakan permasalahan ini diakibatkan mahalnya bibit padi. Untuk pemecahan masalah kelangkaan tersebut yang tepat adalah ...", "Berhenti berproduksi padi, beralih kepada produksi pangan alternatif", "Memberikan penyuluhan kepada petani cara meningkatkan produksi padi", "Memberikan subsidi kepada petani dan mengurangi konsumsi beras", "Memberikan subsidi kepada petani untuk membeli bibit dan membuka lahan pertanian baru", "Memberlakukan program transmigrasi ke daerah yang kosong atau baru", 4);
        addQuestion(q13);
        Question q14 = new Question("Di beberapa daerah, terjadi kelangkaan BBM bersubsidi karena terhambatnya pasokan sehingga beberapa SPBU terlihat antrean panjang kendaraan yang ingin mengisi bahan bakar. Cara yang paling tepat untuk mengatasi kelangkaan tersebut dalam jangka pendek adalah ...", "Mengurangi pasokan bbm bersubsidi agar masyarakat tidak tergantung", "Memperbanyak bbm nonsubsidi agar masyarakat pindah dari bbm bersubsidi", "Atasi pembelian oleh masyarakat agar tidak lagi terjadi kelangkaan", "Memperbaiki saluran distribusi sehingga tidak terjadi keterlambatan", "Mendatangkan pasokan bbm bersubsidi dari daerah lain yang berlebih", 5);
        addQuestion(q14);
        Question q15 = new Question("Barang inferior adalah barang ...", "Yang sangat diperlukan", "Yang permintaannya berkurang saat pendapatan bertambah", "Berdasarkan penggunaan", "Berdasarkan kepentingan", "Berdasarkan hubungan pemakaian", 2);
        addQuestion(q15);
        Question q16 = new Question("Berikut ini adalah pasangan barang-barang\n" +
                                            "(1) Gula dan kopi\n" +
                                            "(2) Mobil dan ban\n" +
                                            "(3) Kemeja dan dasi\n" +
                                            "(4) Beras dan jagung\n" +
                                            "(5) Ikan-daging dan tahu-tempa\n" +
                                            "Pasangan barang yang termasuk barang komplementer adalah ...", "(1), (2), dan (3)", "(1), (2), dan (4)", "(1), (4), dan (5)", "(2). (4), dan (5)", "(3), (4), dan (5)", 1);
        addQuestion(q16);
        Question q17 = new Question("Kebutuhan menurut intensitas adalah kebituhan dibedakan menurut ...", "Waktu pemenuhannya", "Pelaku yang menggunakan alat pemenuhannya", "Pemenuhan fisik dan jiwa", "Tingkat pendidikan dan peradaban", "Tingkat keutamaan pemenuhannya", 5);
        addQuestion(q17);
        Question q18 = new Question("Keluarga Pak Anton memenuhi beberapa kebutuhan, diantaranya:\n" +
                                        "(1) Membeli kebutuhan pokok sehari-hari\n" +
                                        "(2) Pergi nonton wayang kulit dengan dalang Ki Anom Suroto\n" +
                                        "(3) Makan bakso sapi dengan keluarga\n" +
                                        "(4) Pergi rekreasi ke Candi prambanan\n" +
                                        "(5) Membeli jaket saat musim dingin\n" +
                                        "Jika ditinjau dari sifatnya, yang termasuk kebutuhan jasmani adalah ...", "(1), (2), dan (3)", "(1), (3), dan (5)", "(2), (3), dan (4)", "(2), (4), dan (5)", "(3), (4), dan (5)", 2);
        addQuestion(q18);
        Question q19 = new Question("Demonstration effect adalah ...", "Memecahkan masalah perekonomian", "Keinginan untuk memenuhi kebutuhan", "Efek kelangkaan yang tidak dapat dicegah", "Cara untuk menanggulangi efek negatif dari konsumsi", "Sifat dan kebiasaan meniru tingkah laku orang lain", 5);
        addQuestion(q19);
        Question q20 = new Question("Ibu ke dokter saat sakit. Ibu ke dokter termasuk kebutuhan ...", "rohani", "tersier", "sekarang", "jasmani", "akan datang", 3);
        addQuestion(q20);
        Question q21 = new Question("Prinsip ekonomi yang diterapkan dalam produksi adalah dengan ...", "modal yang kecil memperoleh keuntungan yang besar", "pekerja yang sedikit memproduksi barang dalam jumlah banyak", "cara produksi tertentu membuat konsumen rugi", "modal maksimal memperoleh hasil yang maksimal", "modal usaha tertentu memperoleh hasil maksimal", 5);
        addQuestion(q21);
        Question q22 = new Question("Penggunaan uang yang diberikan orangtua dengan cara bijak terlihat dalam contoh ...", "Irma menggunakan sebagian uang jajannya untuk menabung di koperasi sekolah", "Raisa mentraktir teman-teman sekelasnya dengan uang yang diberikan ayahnya", "Karin membeli makanan sehat di kantin sekolah setiap hari", "Nino menggunakan uangnya untuk bermain games online di rental dekat sekolahnya", "Andri meminjamkan uangnya pada Sandi untuk membayar iuran sekolah", 1);
        addQuestion(q22);
        Question q23 = new Question("Hadi membuka usaha pangkas rambut. Pada akhir bulan ia menghitung seluruh penerimaan yang didapatkan selama 1 bulan dan pengeluaran termasuk biaya untuk tempat usahanya, walaupun ia buka usaha di garasi rumahnya. Biaya yang dihitung Hadi merupakan biaya ...", "eksplisit", "sesungguhnya", "peluang", "sehari-hari", "implisit", 4);
        addQuestion(q23);
        Question q24 = new Question("Sanusi memutuskan untuk pergi berlibur ke Ancol. Dibutuhkan biaya transportasi Rp200.000,00. Untuk biaya jajan diperlukan Rp100.000,00. Untuk kunjungan stand-stand yang dipilih perlu biaya Rp250.000,00. Jika sekiranya Sanusi tidak berlibur ke Ancol maka ia dapat bekerja di suatu konveksi dengan pendapatan Rp300.000,00. Biaya peluang dari liburan Sanusi ke Ancol adalah ...", "Rp300.000,00", "Rp250.000,00", "Rp200.000,00", "Rp100.000,00", "Rp50.000,00", 1);
        addQuestion(q24);
        Question q25 = new Question("Berikut adalah kegiatan dalam tindakan ekonomi\n" +
                "(1) Pengusaha warteg Suminah membeli ayam langsung ke peternak ayam\n" +
                "(2) Berbelanja di pasar tradisional\n" +
                "(3) Berbelanja di pasar modern super mewah\n" +
                "(4) Membeli barang tanpa tawar menawar di Pasar tradisional\n" +
                "(5) Selalu berusaha terlebih dahulu memenuhi kebutuhan primer\n" +
                "Pernyataan di atas yang termasuk tindakan yang berdasarkan prinsip ekonomi ditunjukkan nomor ...", "(1), (2), dan (3)", "(1), (2), dan (4)", "(1), (2), dan (5)", "(2), (3), dan (5)", "(3), (4), dan (5)", 3);
        addQuestion(q25);
        Question q26 = new Question("Motif ekonomi yang paling tinggi nilainya adalah ...", "membuka usaha 24 jam", "membuka cabang usaha untuk menambah omset penjualan", "membuka usaha untuk dapat menampung keluarga bekerja", "membuka cabang baru untuk dapat menampung masyarakat umum bekerja", "mengusahakan segala cara agar dapat menghasilkan untung", 2);
        addQuestion(q26);
        Question q27 = new Question("Setiap tindakan yang dilandasi oleh pilihan yang paling baik dan menguntungkan disebut ...", "tindakan ekonomi rasional", "tindakan ekonomi irasional", "motif ekonomi", "prinsip ekonomi", "keuntungan ekonomi", 4);
        addQuestion(q27);
        Question q28 = new Question("Berikut ini yang merupakan contoh tindakan efisien adalah ...", "Fitri lebih suka belanja di pasar daripada di supermarket karena harganya lebih murah dengan kualitas yang sama", "Dini berangkat ke sekolah menggunakan taksi padahal masih ada angkutan umum", "Hadi tidak pernah menawar harga barang setiap kali berbelanja", "Gani setiap hari membeli mainan baru", "Dedi tidak dapat berhemat dalam menggunakan uang jajannya", 1);
        addQuestion(q28);
        Question q29 = new Question("Fani seorang tenaga kerja berpeluang menjadi penjaga toko dengan gaji Rp1.500.000,00/bulan, menjadi sales barang kosmetik dengan gaji Rp1.200.000,00/bulan, dan berpeluang menjadi karyawan swasta dengan gaji Rp2.000.000,00. Apabila Tuan Fani memilih menjadi wirausaha, maka biaya peluang yang dikorbankan adalah ...", "Rp1.200.000,00", "Rp1.500.000,00", "Rp2.000.000,00", "Rp3.500.000,00", "Rp4.700.000,00", 3);
        addQuestion(q29);
        Question q30 = new Question("Tn. Abu ingin membuka usaha dari uang pensiunan. Jika ia membuka usaha sablon dengan omset Rp 80.000,00/hari, usaha foto copy dengan omset Rp 60.000,00/hari dan usaha salon dengan omset Rp70.000,00/hari. (1 bulan = 30 hari). Tn Abu harus memilih salah satu dari semua kemungkinan karena ada keterbatasan modal.\n" +
                "Setelah dipertimbangkan, Tn Abu ingin membuka usaha sablon. Besar biaya peluang perbulan adalah ...", "Rp1.800.000,00", "Rp2.100.000,00", "Rp2.400.000,00", "Rp4.500.000,00", "Rp6.300.000,00", 2);
        addQuestion(q30);
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTIONS, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionsTable.COLUMN_OPTION5, question.getOption5());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTIONS)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setOption5(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION5)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
