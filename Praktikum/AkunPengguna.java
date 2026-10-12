public class AkunPengguna {
    public String username;          // Bebas diakses
    protected String email;          // Akses package & subclass
    String role;                     // Default (Package-private)
    private String password;         // Hanya di dalam class ini

    // Constructor
    public AkunPengguna(String username, String email, String role, String password) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.password = password;   
    }

    // Public method untuk akses terkontrol ke data private
    public boolean ubahPassword(String passLama, String passBaru) {
        if (this.password.equals(passLama)) {
            this.password = passBaru;
            System.out.println("Password berhasil diubah!");
            return true;
        }
        System.out.println("Password lama salah!");
        return false;
    }

    public void infoAkun() {
        // Semua level modifier bisa diakses dari DALAM class yang sama
        System.out.println("User: " + username + " | Email: " + email + " | Role: " + role);
    }
}

