package sg.edu.rp.c346.listview.excercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.listview.R;
import sg.edu.rp.c346.listview.excercise1.adapter.CustomAdapter;
import sg.edu.rp.c346.listview.excercise1.model.Todo;

public class Excercise1 extends AppCompatActivity {

    ListView listView;
    CustomAdapter ca;
    ArrayList<Todo> todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewMovie);

        todoList = new ArrayList<>();
        todoList.add(new Todo("MSA", "10/10/1996"));
        todoList.add(new Todo("Haircut", "07/08/1996"));

        ca = new CustomAdapter(this, R.layout.custom_row, todoList);
        listView.setAdapter(ca);
    }
}
