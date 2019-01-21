# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
Jawab : Hibernate merupakan salah satu aplikasi dari ORM, yang berfungsi sebagai jembatan berbeda antara
        dua paradigma Database Relational dan Pemrogrman Berorientasi Objek.

2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity``` : merupakan proses kelas yang dipetakan ke sebuah tabel.
    - ```@Table```  : menentukan detail tabel yang akan digunakan pada entitas ke dalam database.
    - ```@Column``` : menentukan detail kolom properti yang akan dipetakan.
    - ```@OneToOne``` : relasi dua entitas yang memunkingkan hanya tabel A yang dapat dihubungkan ke tabel B.
    - ```@ManyToOne```: relasi entitas tabel B yang dapat menghubungkan ke banyak elemen tabel A, Sedangkan
                        tabel hanya bisa mengirimkan 1 elemen saja ke tabel B.
    - ```@OneToMany```: relasi antar entitas tabel A yang dapat menghubungkan ke banyak elemen di tabel B, sedangkan
                        tabel B hanya bisa mengirimkan 1 elemen saja ke tabel A.
    - ```@JoinColumn```: Proses menentukan bergabungnya kolom dengan asosiasi entitas atau koleksi elemen.
    - ```@JoinTable``` : proses menentukan bergabungan tabel pada asosasi, koleksi elemen, dan relasi antar tabel.
    - ```@GeneratedValue```: Menyediakan spesifikasi strategi pembangkitan untuk kunci nilai-nilai utama, dan dapat diterapkan
                             ke properti kunci utama/ bidang entitas atau superclass yang dipetakan dengan anotasi Id.

3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
    Jawab : proses sistemisasi yang dapat memudahkan user untuk berinteraksi antar muka dan
            menyuntikkan elemen tabel ke elemen tabel lainnya.

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
    Jawab : Sebagai wadah untuk intruksi objek yang akan dipakai, dikonfigurasikan, dan ditampung
            pada konfigurasi metadata. konfigurasi metadata direspresentasikan ke dalam XML, anotasi Java/
            atau code Java.

5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```: salah satu metode untuk mendeteksi kompone yang di kelola springboot.
    - ```@Autowired```: salah satu dari depedency injection yang digunakan pada properti, setter, dan constructor.
    - ```@Bean``` : metode analog langsung dari elemen XML, bean memiliki fitur yang ditawarkan yaitu init-method,
                    destroy-method, autowiring, lazy-init, depedency-check, depends-on, dan scope.
    - ```@Component```: digunakan untuk mendeteksi dan konfigurasi beans secara otomatis melalui pemindaian kelas.
    - ```@Repository```: merepresentasikan akses database ke dalam suatu aplikasi.
    - ```@Service```: anotasi dari @component pada service layar.
    - ```@Controller```: anotasi dari @service yang menandakan bahwa kelas tersebut sebagai controller.
    - ```@RestController```: merupakan versi khusus dari @controller.
    - ```@RequestMapping```: merupakan anotasi paling umum pada spring, berfungsi sebagai pemetaan dari
                             HTTP ke metode MVC dan Rest Controller.
    - ```@GetMapping```: merupakan anotasi dari @RequestMapping yang digunakan untuk memetakan HTTP melalui
                         request Get.
    - ```@PostMapping```: merupakan anotasi dari @RequestMapping yang digunakan untuk memetakan HTTP melalui
                          request Post.
    - ```@PutMapping```: merupakan anotasi dari @RequestMapping yang digunakan untuk memetakan HTTP melalui
                         request Put.
    - ```@DeleteMapping```: merupakan anotasi dari @RequestMapping yang digunakan untuk memetakan HTTP melalui
                            request Delete.

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
