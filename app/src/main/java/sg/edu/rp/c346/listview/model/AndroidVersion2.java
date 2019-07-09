package sg.edu.rp.c346.listview.model;

public class AndroidVersion2 {
    private String name;
    private String[] version = new String[2];

    public AndroidVersion2(String name, String[] version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion(int id) {
        return version[id];
    }

    public int getVersionLength() {
        return version.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(int arrId, String verion) {
        this.version[arrId] = verion;
    }

    @Override
    public String toString() {
        return String.format("AndroidVersion[\n%s%-15s\n%s%-15s]", "name", this.name, "version", this.version);
    }
}
