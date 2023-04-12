package es.tierno.dam;

import java.io.FileOutputStream;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextArea textArea;

    @FXML
    private void guardarFichero() throws IOException {

        String texto = textArea.getText();
        escribirFichero(texto.getBytes());

    }

    private void escribirFichero(byte[] contenido) throws IOException{

        FileOutputStream fo = new FileOutputStream("salida.txt");
        fo.write(contenido);
        fo.close();

    }
}
