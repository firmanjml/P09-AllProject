package sg.edu.rp.c346.listview.excercise1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.listview.R;
import sg.edu.rp.c346.listview.excercise1.model.Todo;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Todo> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<Todo> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.customView);
        TextView tvVersion = rowView.findViewById(R.id.customView2);

        Todo todo = versionList.get(position);

        tvName.setText(todo.getName());
        tvVersion.setText(todo.getDate());

        return rowView;
    }
}
