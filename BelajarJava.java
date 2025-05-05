/**
 * PANDUAN LENGKAP BELAJAR JAVA
 * 
 * File ini berisi contoh komprehensif berbagai konsep dasar dan lanjutan dalam
 * pemrograman Java. Disusun sebagai panduan belajar untuk mahasiswa Teknik Informatika.
 * 
 * @author Claude
 * @version 1.0
 */

// Package declaration selalu muncul di baris pertama kode
package com.belajarjava;

// Import statements untuk berbagai library yang akan digunakan
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Static import untuk menggunakan method/field static langsung
import static java.lang.Math.PI;
import static java.lang.System.out;

/**
 * Kelas utama yang berisi berbagai contoh konsep Java
 */
public class BelajarJava {

    /**
     * Metode main - entry point untuk aplikasi Java
     * @param args argumen command line
     */
    public static void main(String[] args) {
        // Memanggil metode untuk menampilkan judul program
        tampilkanJudul();
        
        // Sesi 1: Dasar-dasar Java
        belajarDasarJava();
        
        // Sesi 2: Struktur Kontrol
        belajarStrukturKontrol();
        
        // Sesi 3: Array dan Collections
        belajarArrayDanCollections();
        
        // Sesi 4: OOP
        belajarPemrogramanBerorientasiObjek();
        
        // Sesi 5: Exception Handling
        belajarExceptionHandling();
        
        // Sesi 6: File I/O
        belajarFileIO();
        
        // Sesi 7: Fitur Java Modern
        belajarFiturJavaModern();
        
        // Sesi 8: Multi-threading
        belajarMultithreading();
        
        // Sesi 9: Database (JDBC)
        belajarJDBC();
        
        // Sesi 10: Spring Framework (dasar)
        pengenalaSpringFramework();
    }
    
    /**
     * Menampilkan judul program
     */
    private static void tampilkanJudul() {
        out.println("=========================================");
        out.println("  PANDUAN LENGKAP BELAJAR JAVA");
        out.println("  Untuk Mahasiswa Teknik Informatika");
        out.println("=========================================");
        out.println();
    }

    /**
     * Sesi 1: Belajar Dasar-dasar Java
     */
    private static void belajarDasarJava() {
        out.println("== SESI 1: DASAR-DASAR JAVA ==");
        
        // 1. Variabel dan Tipe Data
        out.println("\n1. Variabel dan Tipe Data:");
        
        // Primitif
        byte b = 127;                // 8-bit, -128 to 127
        short s = 32767;             // 16-bit, -32,768 to 32,767
        int i = 2147483647;          // 32-bit, -2^31 to 2^31-1
        long l = 9223372036854775807L; // 64-bit, -2^63 to 2^63-1
        float f = 3.14159f;          // 32-bit floating point
        double d = 3.14159265358979; // 64-bit floating point
        boolean bool = true;         // true atau false
        char c = 'A';                // 16-bit Unicode karakter
        
        out.println("byte: " + b);
        out.println("short: " + s);
        out.println("int: " + i);
        out.println("long: " + l);
        out.println("float: " + f);
        out.println("double: " + d);
        out.println("boolean: " + bool);
        out.println("char: " + c);
        
        // Tipe data referensi
        String str = "Halo, saya sedang belajar Java!";
        Integer objInt = 100;      // Wrapper class untuk int
        Double objDouble = 3.14;   // Wrapper class untuk double
        
        out.println("\nString: " + str);
        out.println("Integer object: " + objInt);
        out.println("Double object: " + objDouble);
        
        // BigInteger dan BigDecimal untuk presisi tinggi
        BigInteger bigInt = new BigInteger("9999999999999999999999");
        BigDecimal bigDec = new BigDecimal("3.1415926535897932384626433832795");
        
        out.println("\nBigInteger: " + bigInt);
        out.println("BigDecimal: " + bigDec);
        
        // Type inference dengan var (Java 10+)
        var nama = "Budi";
        var umur = 20;
        
        out.println("\nType inference dengan var:");
        out.println("nama: " + nama + " (tipe: " + nama.getClass().getName() + ")");
        out.println("umur: " + umur + " (tipe: " + ((Object)umur).getClass().getName() + ")");
        
        // 2. Konstanta
        out.println("\n2. Konstanta:");
        final double PI_VALUE = 3.14159;
        final String KAMPUS = "Universitas Teknologi Indonesia";
        out.println("PI: " + PI_VALUE);
        out.println("KAMPUS: " + KAMPUS);
        
        // 3. Operator
        out.println("\n3. Operator:");
        
        // Aritmatika
        out.println("5 + 3 = " + (5 + 3));
        out.println("5 - 3 = " + (5 - 3));
        out.println("5 * 3 = " + (5 * 3));
        out.println("5 / 3 = " + (5 / 3));
        out.println("5 % 3 = " + (5 % 3));
        
        // Increment dan Decrement
        int x = 5;
        out.println("\nx = " + x);
        out.println("++x = " + (++x)); // Pre-increment
        out.println("x++ = " + (x++)); // Post-increment
        out.println("x setelah x++ = " + x);
        out.println("--x = " + (--x)); // Pre-decrement
        out.println("x-- = " + (x--)); // Post-decrement
        out.println("x setelah x-- = " + x);
        
        // Perbandingan
        out.println("\n5 == 3: " + (5 == 3));
        out.println("5 != 3: " + (5 != 3));
        out.println("5 > 3: " + (5 > 3));
        out.println("5 < 3: " + (5 < 3));
        out.println("5 >= 3: " + (5 >= 3));
        out.println("5 <= 3: " + (5 <= 3));
        
        // Logika
        out.println("\ntrue && false: " + (true && false));
        out.println("true || false: " + (true || false));
        out.println("!true: " + (!true));
        
        // Bitwise
        out.println("\n5 & 3: " + (5 & 3));  // AND
        out.println("5 | 3: " + (5 | 3));    // OR
        out.println("5 ^ 3: " + (5 ^ 3));    // XOR
        out.println("~5: " + (~5));          // NOT
        out.println("5 << 1: " + (5 << 1));  // Left shift
        out.println("5 >> 1: " + (5 >> 1));  // Right shift
        out.println("5 >>> 1: " + (5 >>> 1));// Zero fill right shift
        
        // 4. String
        out.println("\n4. Manipulasi String:");
        String firstName = "John";
        String lastName = "Doe";
        
        // Concat
        String fullName = firstName + " " + lastName;
        out.println("Nama lengkap: " + fullName);
        
        // Method String
        out.println("Panjang: " + fullName.length());
        out.println("Huruf besar: " + fullName.toUpperCase());
        out.println("Huruf kecil: " + fullName.toLowerCase());
        out.println("Substring: " + fullName.substring(0, 4));
        out.println("Karakter pada indeks 0: " + fullName.charAt(0));
        out.println("Indeks huruf 'o': " + fullName.indexOf('o'));
        out.println("Replace: " + fullName.replace("John", "Jane"));
        
        // StringBuilder untuk manipulasi string yang efisien
        StringBuilder sb = new StringBuilder();
        sb.append("Halo");
        sb.append(" ");
        sb.append("Dunia");
        sb.append("!");
        out.println("\nStringBuilder: " + sb.toString());
        sb.insert(5, ",");
        out.println("Setelah insert: " + sb.toString());
        sb.reverse();
        out.println("Setelah reverse: " + sb.toString());
        
        // 5. Date dan Time (Java 8+)
        out.println("\n5. Date dan Time (Java 8+):");
        
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();
        
        out.println("Tanggal hari ini: " + today);
        out.println("Waktu sekarang: " + timeNow);
        out.println("Tanggal dan waktu sekarang: " + dateTimeNow);
        
        // Format tanggal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss");
        out.println("Tanggal terformat: " + dateTimeNow.format(formatter));
        
        out.println();
    }

    /**
     * Sesi 2: Belajar Struktur Kontrol
     */
    private static void belajarStrukturKontrol() {
        out.println("== SESI 2: STRUKTUR KONTROL ==");
        
        // 1. If-Else Statement
        out.println("\n1. If-Else Statement:");
        
        int nilai = 85;
        
        if (nilai >= 90) {
            out.println("Nilai A");
        } else if (nilai >= 80) {
            out.println("Nilai B");
        } else if (nilai >= 70) {
            out.println("Nilai C");
        } else if (nilai >= 60) {
            out.println("Nilai D");
        } else {
            out.println("Nilai E");
        }
        
        // Ternary operator
        String hasil = (nilai >= 70) ? "Lulus" : "Tidak Lulus";
        out.println("Status: " + hasil);
        
        // 2. Switch Statement
        out.println("\n2. Switch Statement:");
        
        int day = 3;
        switch (day) {
            case 1:
                out.println("Senin");
                break;
            case 2:
                out.println("Selasa");
                break;
            case 3:
                out.println("Rabu");
                break;
            case 4:
                out.println("Kamis");
                break;
            case 5:
                out.println("Jumat");
                break;
            case 6:
                out.println("Sabtu");
                break;
            case 7:
                out.println("Minggu");
                break;
            default:
                out.println("Hari tidak valid");
        }
        
        // Switch expression (Java 12+)
        out.println("\nSwitch expression (Java 12+):");
        String dayName = switch (day) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jumat";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Hari tidak valid";
        };
        out.println("Hari: " + dayName);
        
        // 3. Loop
        out.println("\n3. Loop:");
        
        // For loop
        out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            out.println("Iterasi ke-" + i);
        }
        
        // While loop
        out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            out.println("Count: " + count);
            count++;
        }
        
        // Do-While loop
        out.println("\nDo-While Loop:");
        int j = 1;
        do {
            out.println("Nilai j: " + j);
            j++;
        } while (j <= 5);
        
        // For-each loop
        out.println("\nFor-each Loop:");
        String[] fruits = {"Apel", "Jeruk", "Pisang", "Mangga", "Anggur"};
        for (String fruit : fruits) {
            out.println("Buah: " + fruit);
        }
        
        // Break dan Continue
        out.println("\nBreak dan Continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                out.println("Continue pada i = " + i);
                continue; // Skip iterasi saat ini
            }
            if (i == 8) {
                out.println("Break pada i = " + i);
                break; // Keluar dari loop
            }
            out.println("Nilai i = " + i);
        }
        
        // Nested loop dengan label
        out.println("\nNested Loop dengan Label:");
        outerLoop: 
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3; k++) {
                if (i == 2 && k == 2) {
                    out.println("Break outerLoop pada i=" + i + ", k=" + k);
                    break outerLoop; // Keluar dari outer loop
                }
                out.println("i=" + i + ", k=" + k);
            }
        }
        
        out.println();
    }

    /**
     * Sesi 3: Belajar Array dan Collections
     */
    private static void belajarArrayDanCollections() {
        out.println("== SESI 3: ARRAY DAN COLLECTIONS ==");
        
        // 1. Array
        out.println("\n1. Array:");
        
        // Deklarasi dan inisialisasi array
        int[] numbers = new int[5]; // Array dengan 5 elemen
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        out.println("Elemen ke-3: " + numbers[2]);
        out.println("Panjang array: " + numbers.length);
        
        // Inisialisasi langsung
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        out.println("\nDaftar nama:");
        for (String name : names) {
            out.println("- " + name);
        }
        
        // Array 2D
        out.println("\nArray 2D:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                out.print(num + " ");
            }
            out.println();
        }
        
        // Mengurutkan array
        out.println("\nArray sebelum diurutkan:");
        int[] unsorted = {5, 1, 8, 3, 9, 2};
        for (int num : unsorted) {
            out.print(num + " ");
        }
        
        Arrays.sort(unsorted);
        
        out.println("\nArray setelah diurutkan:");
        for (int num : unsorted) {
            out.print(num + " ");
        }
        out.println();
        
        // 2. Collections Framework
        out.println("\n2. Collections Framework:");
        
        // List
        out.println("\nArrayList:");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        
        out.println("Ukuran list: " + list.size());
        out.println("Elemen index 1: " + list.get(1));
        
        out.println("\nIterasi list:");
        for (String item : list) {
            out.println("- " + item);
        }
        
        out.println("\nList setelah remove 'C++':");
        list.remove("C++");
        for (String item : list) {
            out.println("- " + item);
        }
        
        // Set
        out.println("\nHashSet (tidak ada duplikat):");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplikat, akan diabaikan
        set.add("Orange");
        
        for (String item : set) {
            out.println("- " + item);
        }
        
        // Map
        out.println("\nHashMap:");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 95);
        map.put("Bob", 80);
        map.put("Charlie", 85);
        map.put("David", 90);
        
        out.println("Nilai Bob: " + map.get("Bob"));
        
        out.println("\nIterasi map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Queue
        out.println("\nQueue:");
        Queue<String> queue = new LinkedList<>();
        queue.add("Pertama");
        queue.add("Kedua");
        queue.add("Ketiga");
        
        out.println("Elemen pertama: " + queue.peek());
        out.println("Mengambil dan menghapus: " + queue.poll());
        out.println("Sekarang elemen pertama: " + queue.peek());
        
        // Stack
        out.println("\nStack:");
        Stack<String> stack = new Stack<>();
        stack.push("Pertama");
        stack.push("Kedua");
        stack.push("Ketiga");
        
        out.println("Elemen teratas: " + stack.peek());
        out.println("Pop elemen teratas: " + stack.pop());
        out.println("Sekarang elemen teratas: " + stack.peek());
        
        out.println();
    }

    /**
     * Sesi 4: Belajar Pemrograman Berorientasi Objek
     */
    private static void belajarPemrogramanBerorientasiObjek() {
        out.println("== SESI 4: PEMROGRAMAN BERORIENTASI OBJEK ==");
        
        // 1. Class dan Object
        out.println("\n1. Class dan Object:");
        
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("M001", "Budi", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("M002", "Ani", "Sistem Informasi");
        
        out.println("Data Mahasiswa 1:");
        mhs1.tampilkanInfo();
        
        out.println("\nData Mahasiswa 2:");
        mhs2.tampilkanInfo();
        
        // Mengubah data dengan setter
        mhs1.setNama("Budi Santoso");
        out.println("\nSetelah perubahan nama:");
        mhs1.tampilkanInfo();
        
        // 2. Inheritance (Pewarisan)
        out.println("\n2. Inheritance (Pewarisan):");
        
        MahasiswaPascasarjana mhsPasca = new MahasiswaPascasarjana("P001", "Deni", "Ilmu Komputer", "Machine Learning");
        out.println("Data Mahasiswa Pascasarjana:");
        mhsPasca.tampilkanInfo();
        
        // 3. Polymorphism
        out.println("\n3. Polymorphism:");
        
        Mahasiswa mhs3 = new MahasiswaPascasarjana("P002", "Rini", "Informatika", "Data Science");
        out.println("\nPolymorphism - Data Mahasiswa 3:");
        mhs3.tampilkanInfo(); // Memanggil method yang di-override
        
        // 4. Abstract Class dan Interface
        out.println("\n4. Abstract Class dan Interface:");
        
        Pegawai dosen = new Dosen("D001", "Dr. Ahmad", "Algoritma");
        Pegawai staff = new Staff("S001", "Budi", "Administrasi");
        
        out.println("\nInfo Dosen:");
        dosen.tampilkanInfo();
        ((Dosen) dosen).mengajar();
        
        out.println("\nInfo Staff:");
        staff.tampilkanInfo();
        
        // Interface example
        out.println("\nInterface example:");
        BankAccount account = new SavingsAccount("12345", "John Doe", 1000000.0);
        account.deposit(500000.0);
        account.withdraw(200000.0);
        out.println("Saldo saat ini: " + account.getBalance());
        
        // 5. Enum
        out.println("\n5. Enum:");
        
        Level level = Level.MEDIUM;
        out.println("Level: " + level);
        
        switch (level) {
            case LOW:
                out.println("Level rendah - skor: " + level.getScore());
                break;
            case MEDIUM:
                out.println("Level menengah - skor: " + level.getScore());
                break;
            case HIGH:
                out.println("Level tinggi - skor: " + level.getScore());
                break;
        }
        
        // 6. Static keyword
        out.println("\n6. Static Keyword:");
        
        out.println("Jumlah mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
        
        // 7. Final keyword
        out.println("\n7. Final Keyword:");
        final int NILAI_MAKSIMAL = 100; // Final variable
        out.println("Nilai maksimal: " + NILAI_MAKSIMAL);
        
        // 8. Nested Class
        out.println("\n8. Nested Class:");
        
        Outer outer = new Outer("Data luar");
        Outer.Inner inner = outer.new Inner("Data dalam");
        inner.display();
        
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();
        
        out.println();
    }

    /**
     * Sesi 5: Belajar Exception Handling
     */
    private static void belajarExceptionHandling() {
        out.println("== SESI 5: EXCEPTION HANDLING ==");
        
        // 1. Try-catch
        out.println("\n1. Try-catch:");
        
        try {
            int result = 10 / 0; // Akan menghasilkan ArithmeticException
            out.println("Hasil: " + result); // Baris ini tidak akan dieksekusi
        } catch (ArithmeticException e) {
            out.println("Error aritmatika: " + e.getMessage());
        }
        
        // 2. Multiple catch
        out.println("\n2. Multiple catch:");
        
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            out.println("Error aritmatika: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Error index array: " + e.getMessage());
        } catch (Exception e) {
            out.println("Error umum: " + e.getMessage());
        }
        
        // 3. Finally block
        out.println("\n3. Finally block:");
        
        try {
            out.println("Try block dieksekusi");
            int result = 10 / 2;
            out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            out.println("Error aritmatika: " + e.getMessage());
        } finally {
            out.println("Finally block selalu dieksekusi");
        }
        
        // 4. Throws dan Throw
        out.println("\n4. Throws dan Throw:");
        
        try {
            validateAge(15);
            validateAge(-5); // Akan melempar exception
        } catch (IllegalArgumentException e) {
            out.println("Error validasi: " + e.getMessage());
        }
        
        // 5. Try-with-resources (Java 7+)
        out.println("\n5. Try-with-resources:");
        
        try (Scanner scanner = new Scanner(System.in)) {
            out.println("Scanner dibuka (tetapi tidak menunggu input dalam contoh ini)");
            // Scanner akan otomatis ditutup setelah blok try selesai
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
        
        // 6. Custom Exception
        out.println("\n6. Custom Exception:");
        
        try {
            withdraw(1000, 500);
            withdraw(1000, 1500); // Akan melempar InsufficientFundsException
        } catch (InsufficientFundsException e) {
            out.println("Error saldo: " + e.getMessage());
        }
        
        out.println();
    }

    /**
     * Method validasi umur
     */
    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif");
        }
        out.println("Umur valid: " + age);
    }
    
    /**
     * Method withdraw dengan custom exception
     */
    private static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Saldo tidak mencukupi. Saldo: " + balance + ", Jumlah: " + amount);
        }
        out.println("Penarikan berhasil. Jumlah: " + amount + ", Saldo baru: " + (balance - amount));
    }
    
    /**
     * Sesi 6: Belajar File I/O
     */
    private static void belajarFileIO() {
        out.println("== SESI 6: FILE I/O ==");
        
        // 1. File I/O dengan kelas lama (java.io)
        out.println("\n1. File I/O dengan java.io:");
        
        // Menulis file
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Halo, ini adalah file output dari Java!\n");
            writer.write("Baris kedua.\n");
            writer.write("Baris ketiga.");
            out.println("File berhasil ditulis.");
        } catch (IOException e) {
            out.println("Error menulis file: " + e.getMessage());
        }
        
        // Membaca file
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            out.println("\nMembaca isi file:");
            String line;
            while ((line = reader.readLine()) != null) {
                out.println(line);
            }
        } catch (IOException e) {
            out.println("Error membaca file: " + e.getMessage());
        }
        
        // 2. File I/O dengan NIO (Java 7+)
        out.println("\n2. File I/O dengan java.nio:");
        
        try {
            // Menulis file
            Path path = Paths.get("nio_output.txt");
            List<String> lines = Arrays.asList(
                "Baris pertama dari NIO",
                "Baris kedua dari NIO",
                "Baris ketiga dari NIO"
            );
            Files.write(path, lines);
            out.println("File NIO berhasil ditulis.");
            
            // Membaca file
            out.println("\nMembaca isi file NIO:");
            List<String> readLines = Files.readAllLines(path);
            for (String line : readLines) {
                out.println(line);
            }
            
            // Membaca file sebagai stream
            out.println("\nMembaca file sebagai stream:");
            try (Stream<String> stream = Files.lines(path)) {
                stream.forEach(out::println);
            }
            
        } catch (IOException e) {
            out.println("Error file NIO: " + e.getMessage());
        }
        
        // 3. Serialisasi dan Deserialisasi
        out.println("\n3. Serialisasi dan Deserialisasi:");
        
        Mahasiswa mhs = new Mahasiswa("S001", "Alex", "Teknik Komputer");
        
        // Serialisasi
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("mahasiswa.ser"))) {
            out.writeObject(mhs);
            out.println("Objek mahasiswa berhasil diserialisasi");
        } catch (IOException e) {
            out.println("Error serialisasi: " + e.getMessage());
        }
        
        // Deserialisasi
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("mahasiswa.ser"))) {
            Mahasiswa mhsRead = (Mahasiswa) in.readObject();
            out.println("\nObjek mahasiswa berhasil dideserialisi:");
            mhsRead.tampilkanInfo();
        } catch (IOException | ClassNotFoundException e) {
            out.println("Error deserialisasi: " + e.getMessage());
        }
        
        out.println();
    }

    /**
     * Sesi 7: Belajar Fitur Java Modern
     */
    private static void belajarFiturJavaModern() {
        out.println("== SESI 7: FITUR JAVA MODERN ==");
        
        // 1. Lambda Expression (Java 8+)
        out.println("\n1. Lambda Expression (Java 8+):");
        
        // Lambda sebagai implementasi interface fungsional
        Runnable runnable = () -> out.println("Hello dari lambda!");
        runnable.run();
        
        // Lambda dengan parameter
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        out.println("Compare 'a' dan 'b': " + comparator.compare("a", "b"));
        
        // Method reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(out::println); // Setara dengan names.forEach(name -> out.println(name))
        
        // 2. Stream API (Java 8+)
        out.println("\n2. Stream API (Java 8+):");
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter: ambil angka genap
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        out.println("Angka genap: " + evenNumbers);
        
        // Map: kuadratkan semua angka
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        out.println("Angka dikuadratkan: " + squaredNumbers);
        
        // Reduce: jumlahkan semua angka
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        out.println("Jumlah: " + sum);
        
        // Parallel stream
        long count = numbers.parallelStream()
                .filter(n -> n > 5)
                .count();
        out.println("Jumlah angka > 5: " + count);
        
        // Stream dari range
        int sumOfRange = IntStream.rangeClosed(1, 100)
                .sum();
        out.println("Sum dari 1-100: " + sumOfRange);
        
        // 3. Optional (Java 8+)
        out.println("\n3. Optional (Java 8+):");
        
        // Optional.of - objek tidak boleh null
        Optional<String> optional1 = Optional.of("Hello");
        out.println("optional1: " + optional1.get());
        
        // Optional.ofNullable - objek bisa null
        String nullableValue = null;
        Optional<String> optional2 = Optional.ofNullable(nullableValue);
        out.println("optional2 isPresent: " + optional2.isPresent());
        
        // Optional.orElse - nilai default jika tidak ada
        String result = optional2.orElse("Default Value");
        out.println("orElse result: " + result);
        
        // Optional.orElseGet - supplier untuk nilai default
        String result2 = optional2.orElseGet(() -> "Generated Default");
        out.println("orElseGet result: " + result2);
        
        // 4. Default Method di Interface (Java 8+)
        out.println("\n4. Default Method di Interface (Java 8+):");
        
        Vehicle car = new Car();
        car.honk();
        car.info(); // Memanggil default method
        
        // 5. Text Block (Java 15+)
        out.println("\n5. Text Block (Java 15+):");
        
        String htmlOld = "<html>\n" +
                         "    <body>\n" +
                         "        <p>Hello, World!</p>\n" +
                         "    </body>\n" +
                         "</html>";
        out.println("HTML tanpa text block:\n" + htmlOld);
        
        String htmlNew = """
                <html>
                    <body>
                        <p>Hello, World!</p>
                    </body>
                </html>
                """;
        out.println("\nHTML dengan text block:\n" + htmlNew);
        
        // 6. Records (Java 16+)
        out.println("\n6. Records (Java 16+):");
        
        PersonRecord person = new PersonRecord("John Doe", 30);
        out.println("Person: " + person);
        out.println("Name: " + person.name());
        out.println("Age: " + person.age());
        
        // 7. Pattern Matching for instanceof (Java 16+)
        out.println("\n7. Pattern Matching for instanceof (Java 16+):");
        
        Object obj = "Hello, World!";
        
        // Cara lama
        if (obj instanceof String) {
            String s = (String) obj;
            out.println("Panjang string: " + s.length());
        }
        
        // Pattern matching
        if (obj instanceof String s) {
            out.println("Panjang string (pattern matching): " + s.length());
        }
        
        // 8. Switch Expressions (Java 14+)
        out.println("\n8. Switch Expressions (Java 14+):");
        
        Day day = Day.WEDNESDAY;
        
        String result3 = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> "Hari sibuk";
            case TUESDAY -> "Hari produktif";
            case THURSDAY, SATURDAY -> "Hari santai";
            case WEDNESDAY -> "Hari di tengah minggu";
            default -> "Hari tidak valid";
        };
        
        out.println("Result: " + result3);
        
        // 9. Sealed Classes (Java 17+)
        out.println("\n9. Sealed Classes (Java 17+):");
        out.println("Sealed classes membatasi class mana yang dapat meng-extend class tertentu.");
        out.println("Contoh: 'public sealed class Shape permits Circle, Rectangle, Triangle'");
        
        out.println();
    }

    /**
     * Sesi 8: Belajar Multithreading
     */
    private static void belajarMultithreading() {
        out.println("== SESI 8: MULTITHREADING ==");
        
        // 1. Membuat Thread dengan extends Thread
        out.println("\n1. Membuat Thread dengan extends Thread:");
        
        MyThread thread1 = new MyThread("Thread-1");
        thread1.start();
        
        // 2. Membuat Thread dengan implements Runnable
        out.println("\n2. Membuat Thread dengan implements Runnable:");
        
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");
        thread2.start();
        
        // 3. Thread dengan Lambda Expression
        out.println("\n3. Thread dengan Lambda Expression:");
        
        Thread thread3 = new Thread(() -> {
            try {
                out.println("Thread-3 sedang berjalan");
                Thread.sleep(500);
                out.println("Thread-3 selesai");
            } catch (InterruptedException e) {
                out.println("Thread-3 interrupted: " + e.getMessage());
            }
        });
        thread3.start();
        
        // 4. Thread Synchronization
        out.println("\n4. Thread Synchronization:");
        
        Counter counter = new Counter();
        
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "IncrementThread");
        
        Thread readThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                out.println("Counter value: " + counter.getValue());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "ReadThread");
        
        incrementThread.start();
        readThread.start();
        
        try {
            // Menunggu thread selesai
            thread1.join();
            thread2.join();
            thread3.join();
            incrementThread.join();
            readThread.join();
        } catch (InterruptedException e) {
            out.println("Main thread interrupted: " + e.getMessage());
        }
        
        // 5. Executor Service
        out.println("\n5. Executor Service:");
        
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                out.println("Task " + taskId + " dijalankan oleh " + Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            out.println("Executor interrupted: " + e.getMessage());
        }
        
        // 6. Callable dan Future
        out.println("\n6. Callable dan Future:");
        
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        
        Future<Integer> future = executor2.submit(() -> {
            out.println("Calculating...");
            Thread.sleep(1000);
            return 42;
        });
        
        try {
            out.println("Future result: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            out.println("Error getting future result: " + e.getMessage());
        }
        
        executor2.shutdown();
        
        // 7. Thread Pools
        out.println("\n7. Thread Pools:");
        
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        
        out.println("Fixed thread pool size: 3");
        out.println("Cached thread pool: dynamically adjusts the number of threads");
        out.println("Single thread executor: uses a single worker thread");
        
        fixedPool.shutdown();
        cachedPool.shutdown();
        singleThreadExecutor.shutdown();
        
        out.println();
    }

    /**
     * Sesi 9: Belajar JDBC
     */
    private static void belajarJDBC() {
        out.println("== SESI 9: DATABASE (JDBC) ==");
        
        out.println("\nJDBC (Java Database Connectivity) adalah API untuk koneksi dan manipulasi database.");
        out.println("Berikut adalah langkah-langkah penggunaan JDBC:");
        
        out.println("\n1. Load driver JDBC");
        out.println("   Class.forName(\"com.mysql.cj.jdbc.Driver\");");
        
        out.println("\n2. Buat koneksi");
        out.println("   Connection conn = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/database\", \"user\", \"password\");");
        
        out.println("\n3. Buat statement");
        out.println("   Statement stmt = conn.createStatement();");
        out.println("   atau");
        out.println("   PreparedStatement pstmt = conn.prepareStatement(\"INSERT INTO table VALUES (?, ?)\");");
        
        out.println("\n4. Eksekusi query");
        out.println("   ResultSet rs = stmt.executeQuery(\"SELECT * FROM table\");");
        out.println("   atau");
        out.println("   int rows = stmt.executeUpdate(\"UPDATE table SET column = value\");");
        
        out.println("\n5. Proses hasil");
        out.println("   while(rs.next()) {");
        out.println("       String data = rs.getString(\"column_name\");");
        out.println("       // Process data");
        out.println("   }");
        
        out.println("\n6. Tutup resources");
        out.println("   rs.close();");
        out.println("   stmt.close();");
        out.println("   conn.close();");
        
        out.println("\nContoh kode lengkap JDBC:");
        out.println("""
        try {
            // 1. Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Buka koneksi
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "username", "password");
            
            // 3. Eksekusi query
            Statement stmt = conn.createStatement();
            String sql = "SELECT id, name, age FROM students";
            ResultSet rs = stmt.executeQuery(sql);
            
            // 4. Proses hasil query
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            
            // 5. Tutup resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
        """);
        
        out.println("\nContoh Transaction Management dengan JDBC:");
        out.println("""
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Set auto-commit ke false
            conn.setAutoCommit(false);
            
            Statement stmt = conn.createStatement();
            
            // Update pertama
            String sql1 = "UPDATE accounts SET balance = balance - 100 WHERE id = 1";
            stmt.executeUpdate(sql1);
            
            // Update kedua
            String sql2 = "UPDATE accounts SET balance = balance + 100 WHERE id = 2";
            stmt.executeUpdate(sql2);
            
            // Commit transaction
            conn.commit();
            
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Jika terjadi error, rollback
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException se2) {
                    se2.printStackTrace();
                }
            }
            se.printStackTrace();
        }
        """);
        
        out.println();
    }

    /**
     * Sesi 10: Pengenalan Spring Framework
     */
    private static void pengenalaSpringFramework() {
        out.println("== SESI 10: PENGENALAN SPRING FRAMEWORK ==");
        
        out.println("\nSpring Framework adalah framework Java populer untuk membangun aplikasi enterprise.");
        out.println("Berikut beberapa fitur utama Spring Framework:");
        
        out.println("\n1. Dependency Injection (DI)");
        out.println("   Spring menggunakan konsep IoC (Inversion of Control) untuk injeksi dependensi.");
        
        out.println("\n2. Spring MVC");
        out.println("   Framework web untuk membangun aplikasi web dengan pola Model-View-Controller.");
        
        out.println("\n3. Spring Data");
        out.println("   Menyederhanakan akses data dan integrasi dengan berbagai database.");
        
        out.println("\n4. Spring Security");
        out.println("   Menyediakan keamanan untuk aplikasi Spring.");
        
        out.println("\n5. Spring Boot");
        out.println("   Framework untuk mempercepat dan menyederhanakan pengembangan aplikasi Spring.");
        
        out.println("\nContoh Spring Boot Application:");
        out.println("""
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        
        @SpringBootApplication
        @RestController
        public class HelloApplication {
            
            public static void main(String[] args) {
                SpringApplication.run(HelloApplication.class, args);
            }
            
            @GetMapping("/hello")
            public String hello() {
                return "Hello, Spring Boot!";
            }
        }
        """);
        
        out.println("\nContoh Spring Bean:");
        out.println("""
        import org.springframework.stereotype.Component;
        
        @Component
        public class UserService {
            
            public String getWelcomeMessage(String username) {
                return "Welcome, " + username + "!";
            }
        }
        """);
        
        out.println("\nContoh Controller dengan Dependency Injection:");
        out.println("""
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RestController;
        
        @RestController
        public class UserController {
            
            @Autowired
            private UserService userService;
            
            @GetMapping("/user/{username}")
            public String welcomeUser(@PathVariable String username) {
                return userService.getWelcomeMessage(username);
            }
        }
        """);
        
        out.println("\nContoh Entity dan Repository:");
        out.println("""
        import jakarta.persistence.Entity;
        import jakarta.persistence.Id;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        
        @Entity
        public class User {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String username;
            private String email;
            
            // Getters and setters
        }
        
        import org.springframework.data.jpa.repository.JpaRepository;
        
        public interface UserRepository extends JpaRepository<User, Long> {
            User findByUsername(String username);
        }
        """);
        
        out.println("\nContoh application.properties untuk konfigurasi Spring Boot:");
        out.println("""
        # Server port
        server.port=8080
        
        # Database configuration
        spring.datasource.url=jdbc:mysql://localhost:3306/dbname
        spring.datasource.username=root
        spring.datasource.password=password
        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        
        # JPA/Hibernate properties
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.format_sql=true
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
        """);
        
        out.println();
    }
}

/**
 * Custom exception class
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/**
 * Kelas Mahasiswa - contoh class dasar
 */
class Mahasiswa implements Serializable {
    private String nim;
    private String nama;
    private String jurusan;
    private static int jumlahMahasiswa = 0;
    
    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        jumlahMahasiswa++;
    }
    
    // Getter dan Setter
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }
    
    // Static method
    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }
}

/**
 * MahasiswaPascasarjana - contoh inheritance
 */
class MahasiswaPascasarjana extends Mahasiswa {
    private String bidangPenelitian;
    
    public MahasiswaPascasarjana(String nim, String nama, String jurusan, String bidangPenelitian) {
        super(nim, nama, jurusan);
        this.bidangPenelitian = bidangPenelitian;
    }
    
    public String getBidangPenelitian() {
        return bidangPenelitian;
    }
    
    public void setBidangPenelitian(String bidangPenelitian) {
        this.bidangPenelitian = bidangPenelitian;
    }
    
    // Override method dari parent class
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bidang Penelitian: " + bidangPenelitian);
    }
}

/**
 * Abstract class Pegawai
 */
abstract class Pegawai {
    protected String id;
    protected String nama;
    protected String departemen;
    
    public Pegawai(String id, String nama, String departemen) {
        this.id = id;
        this.nama = nama;
        this.departemen = departemen;
    }
    
    // Abstract method yang harus diimplementasikan oleh subclass
    public abstract void tampilkanInfo();
}

/**
 * Dosen - implementasi abstract class
 */
class Dosen extends Pegawai {
    public Dosen(String id, String nama, String departemen) {
        super(id, nama, departemen);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Dosen: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
    }
    
    public void mengajar() {
        System.out.println("Dosen " + nama + " sedang mengajar.");
    }
}

/**
 * Staff - implementasi abstract class
 */
class Staff extends Pegawai {
    public Staff(String id, String nama, String departemen) {
        super(id, nama, departemen);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Staff: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
    }
}

/**
 * Interface BankAccount
 */
interface BankAccount {
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}

/**
 * SavingsAccount - implementasi interface
 */
class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    
    public SavingsAccount(String accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialBalance;
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        }
        return false;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
}

/**
 * Enum Level
 */
enum Level {
    LOW(1),
    MEDIUM(5),
    HIGH(10);
    
    private final int score;
    
    Level(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
}

/**
 * Enum Day
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/**
 * Kelas outer untuk demonstrasi nested class
 */
class Outer {
    private String data;
    
    public Outer(String data) {
        this.data = data;
    }
    
    // Inner class (non-static)
    class Inner {
        private String innerData;
        
        public Inner(String innerData) {
            this.innerData = innerData;
        }
        
        public void display() {
            System.out.println("Outer data: " + data);
            System.out.println("Inner data: " + innerData);
        }
    }
    
    // Static nested class
    static class StaticNested {
        public void display() {
            System.out.println("Ini adalah static nested class");
            // Tidak bisa mengakses data non-static dari outer class
        }
    }
}

/**
 * Interface Vehicle
 */
interface Vehicle {
    void honk();
    
    // Default method (Java 8+)
    default void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

/**
 * Car - implementasi interface dengan default method
 */
class Car implements Vehicle {
    @Override
    public void honk() {
        System.out.println("Beep beep!");
    }
}

/**
 * Thread class dengan extends Thread
 */
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        try {
            System.out.println(getName() + " sedang berjalan");
            Thread.sleep(500);
            System.out.println(getName() + " selesai");
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted: " + e.getMessage());
        }
    }
}

/**
 * Runnable implementation
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " sedang berjalan");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " selesai");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted: " + e.getMessage());
        }
    }
}

/**
 * Counter class untuk thread synchronization
 */
class Counter {
    private int count = 0;
    
    // Synchronized method
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incrementing: " + count);
    }
    
    public synchronized int getValue() {
        return count;
    }
}

/**
 * Record class (Java 16+) - immutable data class
 */
record PersonRecord(String name, int age) {
    // Compact constructor
    public PersonRecord {
        if (age < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif");
        }
    }
    
    // Additional methods
    public boolean isAdult() {
        return age >= 18;
    }
}