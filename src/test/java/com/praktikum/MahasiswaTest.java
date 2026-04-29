package com.praktikum;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MahasiswaTest {

    private Mahasiswa mahasiswaLulus;
    private Mahasiswa mahasiswaTidakLulus;

    @BeforeEach
    void setUp() {
        // Inisialisasi objek sebelum setiap test
        mahasiswaLulus = new Mahasiswa("Budi", 75);
        mahasiswaTidakLulus = new Mahasiswa("Siti", 45);
    }

    // ✅ Test 1: Mahasiswa dengan nilai >= 60 harus lulus
    @Test
    @DisplayName("Mahasiswa dengan nilai 75 seharusnya LULUS")
    void testNilaiLulus() {
        assertTrue(mahasiswaLulus.isLulus(),
            "Mahasiswa dengan nilai 75 seharusnya lulus");
    }

    // ✅ Test 2: Mahasiswa dengan nilai < 60 tidak lulus
    @Test
    @DisplayName("Mahasiswa dengan nilai 45 seharusnya TIDAK LULUS")
    void testNilaiTidakLulus() {
        assertFalse(mahasiswaTidakLulus.isLulus(),
            "Mahasiswa dengan nilai 45 seharusnya tidak lulus");
    }

    // 🔘 Test 3: Nilai tepat di batas (boundary value 60)
    @Test
    @DisplayName("Mahasiswa dengan nilai tepat 60 seharusnya LULUS (batas bawah)")
    void testNilaiBatasLulus() {
        Mahasiswa batas = new Mahasiswa("Andi", 60);
        assertTrue(batas.isLulus(),
            "Nilai 60 tepat di batas, seharusnya lulus");
    }

    // 🔘 Test 4: Nilai 59 (tepat di bawah batas) tidak lulus
    @Test
    @DisplayName("Mahasiswa dengan nilai 59 seharusnya TIDAK LULUS")
    void testNilaiBatasTidakLulus() {
        Mahasiswa bawahBatas = new Mahasiswa("Dewi", 59);
        assertFalse(bawahBatas.isLulus(),
            "Nilai 59 seharusnya tidak lulus");
    }

    // 🔘 Test 5: Verifikasi nama dan nilai tersimpan dengan benar
    @Test
    @DisplayName("Atribut nama dan nilai tersimpan dengan benar")
    void testAtributMahasiswa() {
        assertEquals("Budi", mahasiswaLulus.getNama());
        assertEquals(75.0, mahasiswaLulus.getNilai());
    }

    @AfterEach
    void tearDown() {
        // Cleanup setelah setiap test (opsional)
        mahasiswaLulus = null;
        mahasiswaTidakLulus = null;
    }
}
