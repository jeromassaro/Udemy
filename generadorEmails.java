public class generadorEmails {
    public static void main(String[] args) {
        var nombre = "Jeronimo Massaro";
        var nombreNormalizado = nombre.strip().toLowerCase().replaceAll(" ", ".");

        var empresa = "Udemy UNLP";
        var dominio = "com.ar";
        var dominioNormalizado = empresa.toLowerCase().replaceAll(" ", "") + "." + dominio.toLowerCase();

        var email = nombreNormalizado + "@" + dominioNormalizado;
        System.out.println(email);
    }
}
