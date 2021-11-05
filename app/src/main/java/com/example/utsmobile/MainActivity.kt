package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.wetonan,"Seluruh Jawa Tengah","Tradisi Wetonan","RTradisi Jawa Tengah yang pertama adalah tradisi wetonan. Wetonan dalam bahasa Jawa memiliki arti keluar.\n" +
                "\n" +
                "Namun, wetonan yang dimaksud di sini berhubungan dengan kelahiran orang.\n" +
                "\n" +
                "Tradisi wetonan adalah upacara yang dilakukan guna menyambut bayi yang baru lahir.\n" +
                "\n" +
                "Tradisi wetonan ini dilakukan supaya nantinya bayi tersebut akan terhindar dari bahaya serta bisa mendapatkan rezeki serta keberuntungan yang lebih." +
                "dalam waktu lama menggunakan aneka rempah-rempah dan santan"))

        data?.add(DataModel(R.drawable.ruwatan,"Dieng, Wonosobo","Upacara Ruwatan", "Upacara ruwatan juga masih dilestarikan hingga sekarang sebagai tradisi Jawa Tengah.\n" +
                "\n" +
                "Sebagai contoh, di daerah Dieng Wonosobo, bagi anak-anak yang memiliki rambut ikal gimbal biasanya dianggap mirip dengan buto ijo sehingga harus diadakan upacara ruwatan.\n" +
                "\n" +
                "Hal ini dilakukan guna mengusir hawa jahat dan hal-hal buruk yang dibawa oleh buto ijo."))

        data?.add(DataModel(R.drawable.larungsaji,"Pesisir Selatan dan Utara Jawa Tengah","Upacara Larung Saji", "Tradisi Jawa Tengah ini bisa dengan mudah dijumpai di daerah-daerah yang ada di pinggir pantai, terutama di pesisir utara dan Selatan.\n" +
                "\n" +
                "Upacara larung saji dilakukan dengan cara menghanyutkan beberapa bahan makanan berupa hasil panen dan hewan sembelihan ke lautan dengan menggunakan perahu.\n" +
                "\n" +
                "Hal ini dilakukan sebagai bentuk rasa syukur pada Sang Pencipta akan hasil laut yang telah diberikan kepada para nelayan.\n" +
                "\n" +
                "Selain itu, upacara ini juga dilakukan guna mendoakan keselamatan para nelayan agar bisa melaut dengan selamat."))

        data?.add(DataModel(R.drawable.popokan,"Semarang","Tradisi Popokan", "ITradisi Jawa Tengah yang satu ini hingga sekarang masih tetap dilakukan.\n" +
                "\n" +
                "Tradisi popokan adalah upacara yang dilakukan masyarakat di Semarang.\n" +
                "\n" +
                "Tradisi ini dilakukan dengam cara melempar lumpur pada saat hari Jumat Kliwon di bulan Agustus.\n" +
                "\n" +
                "Tradisi popokan mulai dilakukan oleh masyarakat daerah Beringin tapi sekarang dilakukan oleh banyak masyarakat di daerah Semarang.\n" +
                "\n" +
                "Masyarakat setempat melakukan tradisi ini untuk menghilangkan kejahatan serta tolak bala yang ada di daerah tempat tinggal mereka."))

        data?.add(DataModel(R.drawable.syawalan,"Seluruh Jawa Tengah","Tradisi Syawalan", "Tradisi syawalan adalah salah satu tradisi yangdilakukan selama tujuh hari setelah merayakan hari raya Idul Fitri.\n" +
                "\n" +
                "Masyarakat setempat menjuluki tradisi syawalan dengan nama tradisi lebaran ketupat karena pada tidak seperti daerah lain di Indonesia yang menyajikan ketupat pada saat hari raya Idul Fitri, masyarakat Jawa Tengah justru menyajikan nasi kuning saat lebaran.\n" +
                "\n" +
                "Kuliner ketupat baru akan disajikan pada saat tradisi syawalan."))

        data?.add(DataModel(R.drawable.sadranan,"Seluruh Jawa Tengah","Tradisi Sadranan", "Tradisi Jawa Tengah yang berikutnya adalah tradisi sadranan atau yang lebih dikenal dengan nama nyadran.\n" +
                "\n" +
                "Tradisi ini dilakukan untuk menyambut datangnya bulan Ramadhan.\n" +
                "\n" +
                "Tradisi sadranan dilakukan dengan cara menggelar doa untuk para leluhur dan kerabat yang sudah meninggal supaya dosa-dosa mereka bisa diampuni dan amal baiknya bisa diterima dengan baik.\n" +
                "\n" +
                "Tradisi ini dilakukan dengan cara merapikan dan membersihkan makam dan membuat kue tradisional seperti kue apem, kolak, dan ketan yang nantinya akan dibagikan kepada para kerabat."))

        data?.add(DataModel(R.drawable.tingkeban,"Seluruh Jawa Tengah","Upacara Tingkeban", "Tradisi Jawa Tengah berikutnya adalah upacara tingkeban.\n" +
                "\n" +
                "Upacara ini juga disebut dengan nama upacara mitoni.\n" +
                "\n" +
                "Upacara tingkeban adalah upacara yang dilakukan usia kandungan baru berusia tujuh bulan.\n" +
                "\n" +
                "Mungkin Moms lebih mengenal tradisi ini dengan nama tradisi “nujuh bulan”.\n" +
                "\n" +
                "Tradisi Jawa Tengah ini dilakukan dengan cara memandikan Moms, lalu kemudian membacakan doa yang bisa memberikan keberkahan pada sang jabang bayi.\n" +
                "\n" +
                "Pada saat memandikan, akan ada acar pengguyuran yang harus dilakukan oleh tujuh orang tua atau sesepuh yang dituakan."))


        data?.add(DataModel(R.drawable.brobosan,"Seluruh Jawa Tengah","Tradisi Brobosan", "Tradisi Jawa Tengah yang berikutnya adalah tradisi brobosan.\n" +
                "\n" +
                "Tradisi ini terbilang cukup unik tapi anehnya masih bisa dijumpai hingga sekarang karena memang sudah menjadi kebiasaan atau adat istiadat yang selalu dilakukan.\n" +
                "\n" +
                "Tradisi brobosan adalah tradisi di mana ketika ada saudara atau kerabat yang meninggal, maka kita harus menerobos melewati bawah jenazah.\n" +
                "\n" +
                "Jadi, nantinya jenazah harus diangkat dengan tandu atau peti matinya harus diangkat tinggi.\n" +
                "\n" +
                "Kemudian, anak dan cucu dari orang yang sudah meninggal tersebut diharuskan untuk menerobos ke bawah kolong melewati jenazah.\n" +
                "\n" +
                "Hal ini harus dilakukan sebanyak tiga kali.\n" +
                "\n" +
                "Tujuannya adalah guna menghormati kepergian jenazah dan mengikhlaskan kepergiannya."))

        data?.add(DataModel(R.drawable.tedaksiten,"Seluruh Jawa Tengah","Upacara Tedak Siten", "Tradisi Jawa Tengah ini juga bisa dijumpai di daerah Jawa Timur.\n" +
                "\n" +
                "Upacara Tedak Siten adalah tradisi yang dilakukan oleh orang tua saat anaknya sudah menginjak usia tujuh bulan.\n" +
                "\n" +
                "Upacara ini juga dikenal dengan nama upacara turun tanah karena bertujuan untuk mengenalkan anak tanah yang ia pijak.\n" +
                "\n" +
                "Upacara ini dilakukan di pagi hari sesuai dengan tanggal dan hari kelahiran anak.\n" +
                "\n" +
                "Tradisi tedak siten selalu dilengkapi dengan aneka kuliner yang disajikan seperti nasi kuning, jenang boro-boro, dan lain sebagainya."))

        data?.add(DataModel(R.drawable.mubengbenteng,"Seluruh Jawa Tengah","Mubeng Benteng", "Tradisi Jawa Tengah yang terakhir adalah mubeng benteng.\n" +
                "\n" +
                "Tradisi ini selalu dilakukan pada malam satu suro sehingga sering dinamakan dengan nama tradisi malam satu suro.\n" +
                "\n" +
                "Tradisi Jawa Tengah ini ada di Yogyakarta dan dilakukan dengan cara mengelilingi benteng atau keraton Yogyakarta.\n" +
                "\n" +
                "Hal ini dilakukan sebagai simbol refleksi dan intropeksi diri.\n" +
                "\n" +
                "Saat melakukan mubeng benteng, Moms tak boleh berbicara dan makan atau minum selama melakukannya hingga selesai."))




        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.daerah)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}