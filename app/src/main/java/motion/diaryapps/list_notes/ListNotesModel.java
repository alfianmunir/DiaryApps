package motion.diaryapps.list_notes;

import java.io.Serializable;

/**
 * Class ini digunakan untuk sebagai Model data pada layout item
 */
public class ListNotesModel {

    private String id;
    private String image_url;
    private String judul;
    private String tanggal;
    // TODO: 4/12/19 -> Buat Attribute title dan date disini
    // hint: untuk date gunakan tipe data string, lakukan seperti contoh diatas

    // TODO: 4/12/19 -> Buat Constructor disini
    // hint: Gunakan alt+insert

    public ListNotesModel(String id, String image_url, String judul, String tanggal) {
        this.id = id;
        this.image_url = image_url;
        this.judul = judul;
        this.tanggal = tanggal;
    }


    // TODO: 4/12/19 -> Buat Getter dan Setternya disini
    // hint: Gunakan alt+insert

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


}
