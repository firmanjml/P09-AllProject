package sg.edu.rp.c346.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.listview.adapter.CustomAdapter;
import sg.edu.rp.c346.listview.model.AndroidVersion;
import sg.edu.rp.c346.listview.model.AndroidVersion2;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    //ArrayAdapter<String> aaMovie;
    CustomAdapter caMovie;
    //ArrayList<String> movieList;
    ArrayList<AndroidVersion2> avList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        //movieList = new ArrayList<>();
        //movieList.add("Avengers Infinity War Release Date: 2019.04");
        //movieList.add("Justice League Release Date: 2017.11");

        avList = new ArrayList<>();
        avList.add(new AndroidVersion2("Pie", new String[] {"9.0"}));
        avList.add(new AndroidVersion2("Oreo", new String[] {"8.0", "8.1"}));
        avList.add(new AndroidVersion2("Nougat", new String[] {"7.0", "7.1.2"}));
        avList.add(new AndroidVersion2("Marshmallow", new String[] {"6.0", "6.0.1"}));
        avList.add(new AndroidVersion2("Lollipop", new String[] {"5.0", "5.1.1"}));
        avList.add(new AndroidVersion2("KitKat", new String[] {"4.4", "4.4.4"}));
        avList.add(new AndroidVersion2("Jelly Bean", new String[] {"4.1", "4.3.1"}));

        caMovie = new CustomAdapter(this, R.layout.custom_row, avList);
        //aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, movieList);
        //lvMovie.setAdapter(aaMovie);
        lvMovie.setAdapter(caMovie);
    }
}
