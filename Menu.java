package rishabh.gupta34.com.myfirstapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by risha on 15-04-2017.
 */

public class Menu extends ListActivity {
    String classes[]={"MAINACTIVITY","EXAMPLE1","EXAMPLE2","EXAMPLE3","EXAMPLE4"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese=classes[position];
            Intent ourIntent = new Intent("rishabh.gupta34.com.android." + cheese);
            startActivity(ourIntent);


    }

}


