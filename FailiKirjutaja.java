import java.io.*;

class FailiKirjutaja {
    // kui puudub katsendidirektiiv ja puudub faili sulgemine enne programmi lõppu, siis programm lõppeb enne, kui puhverdatud andmed kirjutatakse faili

    public static void main(String[] args) throws IOException {
        try (BufferedWriter kirjutaja = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0]), "UTF-8"))) {
            kirjutaja.write("Hello World!");
        }
    }

}