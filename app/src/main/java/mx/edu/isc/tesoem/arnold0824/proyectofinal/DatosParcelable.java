package mx.edu.isc.tesoem.arnold0824.proyectofinal;

import android.os.Parcel;
import android.os.Parcelable;

public class DatosParcelable implements Parcelable {

    String maricula,nombre,correo,calificacion;

    public DatosParcelable(String maricula, String nombre, String correo, String calificacion) {
        this.maricula = maricula;
        this.nombre = nombre;
        this.correo = correo;
        this.calificacion = calificacion;
    }

    protected DatosParcelable(Parcel in) {
        maricula = in.readString();
        nombre = in.readString();
        correo = in.readString();
        calificacion = in.readString();
    }

    public static final Creator<DatosParcelable> CREATOR = new Creator<DatosParcelable>() {
        @Override
        public DatosParcelable createFromParcel(Parcel in) {
            return new DatosParcelable(in);
        }

        @Override
        public DatosParcelable[] newArray(int size) {
            return new DatosParcelable[size];
        }
    };

    public String getMaricula() {
        return maricula;
    }

    public void setMaricula(String maricula) {
        this.maricula = maricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(maricula);
        dest.writeString(nombre);
        dest.writeString(correo);
        dest.writeString(calificacion);
    }
}
