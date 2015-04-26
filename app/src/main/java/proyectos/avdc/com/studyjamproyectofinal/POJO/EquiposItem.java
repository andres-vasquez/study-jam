package proyectos.avdc.com.studyjamproyectofinal.POJO;

/**
 * Created by andresvasquez on 4/25/15.
 */
public class EquiposItem {

    public int intIdEquipo;
    public String strNombreEquipo;
    public int intImgEquipo;
    //TODO: Agregar todos los atributos necesarios


    public EquiposItem(int intIdEquipo, String strNombreEquipo, int intImgEquipo) {
        this.intIdEquipo = intIdEquipo;
        this.strNombreEquipo = strNombreEquipo;
        this.intImgEquipo = intImgEquipo;
    }

    public int getIntIdEquipo() {
        return intIdEquipo;
    }

    public void setIntIdEquipo(int intIdEquipo) {
        this.intIdEquipo = intIdEquipo;
    }

    public String getStrNombreEquipo() {
        return strNombreEquipo;
    }

    public void setStrNombreEquipo(String strNombreEquipo) {
        this.strNombreEquipo = strNombreEquipo;
    }

    public int getIntImgEquipo() {
        return intImgEquipo;
    }

    public void setIntImgEquipo(int intImgEquipo) {
        this.intImgEquipo = intImgEquipo;
    }
}
