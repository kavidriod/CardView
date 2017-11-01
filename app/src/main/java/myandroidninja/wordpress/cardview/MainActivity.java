package myandroidninja.wordpress.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    private AlbumAdapter adapter;
    private List<Album> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumAdapter(this, albumList);


        RecyclerView.LayoutManager reLayoutManager = new GridLayoutManager(this,2);
        recycler_view.setLayoutManager(reLayoutManager);
        recycler_view.setAdapter(adapter);
        
       generateAlbum();

    }

    private void generateAlbum() {
        int[] covers = new int[]{
                R.drawable.kerala,
                R.drawable.onam,
                R.drawable.k9,
                R.drawable.k10,
                R.drawable.k3,
                R.drawable.kerala,
                R.drawable.k5,
                R.drawable.k6,
                R.drawable.kerala,
                R.drawable.k8,
                R.drawable.k10,
                R.drawable.onam};

        Album a = new Album("Kerala", 13, covers[0]);
        albumList.add(a);

        a = new Album("Onam", 8, covers[1]);
        albumList.add(a);

        a = new Album("Kerala ", 11, covers[2]);
        albumList.add(a);

        a = new Album("God's Own Country", 12, covers[3]);
        albumList.add(a);

        a = new Album("Onam", 14, covers[4]);
        albumList.add(a);

        a = new Album("Kerala", 1, covers[5]);
        albumList.add(a);

        a = new Album("Onam", 11, covers[6]);
        albumList.add(a);

        a = new Album("Kerala", 14, covers[7]);
        albumList.add(a);

        a = new Album("Onam", 11, covers[8]);
        albumList.add(a);

        a = new Album("Kerala", 17, covers[9]);
        albumList.add(a);

//        adapter.notifyDataSetChanged();

    }
}
