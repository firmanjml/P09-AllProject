package sg.edu.rp.c346.listview.excercise2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.listview.R;
import sg.edu.rp.c346.listview.excercise2.adapter.CustomAdapter;
import sg.edu.rp.c346.listview.excercise2.model.Employee;
import sg.edu.rp.c346.listview.model.AndroidVersion2;

public class Excercise2 extends AppCompatActivity {

    ListView listView;
    CustomAdapter ca;
    ArrayList<Employee> employeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewMovie);

        employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Software Technical Leader", 3400.0));
        employeeList.add(new Employee("May", "Programmer", 2200.0));

        ca = new CustomAdapter(this, R.layout.custom_row2, employeeList);

        listView.setAdapter(ca);
    }
}
