package sg.edu.rp.c346.listview.model;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String verion) {
        this.version = verion;
    }

    @Override
    public String toString() {
        return String.format("AndroidVersion[\n%s%-15s\n%s%-15s]", "name", this.name, "version", this.version);
    }
}
