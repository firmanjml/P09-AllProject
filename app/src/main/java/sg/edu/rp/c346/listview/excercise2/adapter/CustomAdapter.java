package sg.edu.rp.c346.listview.excercise2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import sg.edu.rp.c346.listview.R;
import sg.edu.rp.c346.listview.excercise2.model.Employee;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Employee> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<Employee> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.customView3);
        TextView tvJob = rowView.findViewById(R.id.customView4);
        TextView tvSalary = rowView.findViewById(R.id.customView5);

        Employee employee = versionList.get(position);
        tvName.setText(employee.getName());
        tvJob.setText(employee.getJob());
        tvSalary.setText("$" + String.valueOf(employee.getSalary()));

        return rowView;
    }
}
