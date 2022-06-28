package dominio;

public class verificarCorreo {
    public static boolean email(String correo){
        String cooreoValidado = "ufromail.cl";
        return cooreoValidado.equals(correo);
    }
}