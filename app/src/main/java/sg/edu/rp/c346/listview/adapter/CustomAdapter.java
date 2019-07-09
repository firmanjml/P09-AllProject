package sg.edu.rp.c346.listview.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.listview.R;
import sg.edu.rp.c346.listview.model.AndroidVersion;
import sg.edu.rp.c346.listview.model.AndroidVersion2;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion2> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion2> objects) {
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

        AndroidVersion2 av = versionList.get(position);
        tvName.setText(av.getName());

        String version = "";
        if (av.getVersionLength() > 1) {
            version = av.getVersion(0) + " - " + av.getVersion(1);
        } else {
            version = av.getVersion(0);
        }

        tvVersion.setText(version);

        return rowView;
    }
}
