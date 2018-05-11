package solar.cs58.sdu.myapplicationsolar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private int[] ints = new int[]{R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s5,R.drawable.s6,R.drawable.s7,R.drawable.s8,R.drawable.s9,};

    private  String[] titleStrings, detailStrings ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        //ดึงค่า XML ที่ไฟล์ my_content มาเเสดงผล
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints,titleStrings, detailStrings);
        listView.setAdapter((ListAdapter) myAdapter);

        //เมื่อ Click เเต่ละ Item ใน ListView จะเชื่อมโยงไปหน้า Detail
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("Title", titleStrings[i]);
                detailIntent.putExtra("Detail", detailStrings[i]);
                detailIntent.putExtra("Image", ints[i]);
                startActivity(detailIntent);
            }
        });

    }//End Oncreate Method

    public void clickLink(View view)
    {
        Intent linkIntent = new Intent(Intent.ACTION_VIEW);
        linkIntent.setData(Uri.parse("https://www.dlt.go.th/th/"));
        startActivity(linkIntent);

    }//end clickLink Method


    public void clickAboutMe(View view) {
        Intent aboutmeIntent = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(aboutmeIntent);
    }
}//End Class
