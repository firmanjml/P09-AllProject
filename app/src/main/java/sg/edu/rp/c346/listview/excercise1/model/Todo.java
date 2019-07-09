package sg.edu.rp.c346.listview.excercise1.model;

public class Todo {
    private String name;
    private String date;


    public Todo (String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String s) {
        name = s;
    }

    public void setDate(String d) {
        date = d;
    }
}
