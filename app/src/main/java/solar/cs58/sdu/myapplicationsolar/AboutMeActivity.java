package solar.cs58.sdu.myapplicationsolar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }


    public void clickFacebook(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/yo.ouammiang"));
        startActivity(fbIntent);
    }

    public void clickMobile(View view) {
        Intent moblieIntent=new  Intent(Intent.ACTION_DIAL);
        moblieIntent.setData(Uri.parse("tel:0991201075"));
        startActivity(moblieIntent);
    }

    public void clickMap(View view) {
        String lat ="3.776233";
        String lng = "100.510757";
        String label = "มหาวิทยาลัยสวนดุสิต";
        Uri location = Uri.parse("http://map.google.com/maps?z=10&q=loc:" + lat + "," + lng + "(" + label + ")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        ///mapIntent.setPackage("com.google.android.app.maps");
        startActivity(mapIntent);


    }

    public void link1(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/yo.ouammiang"));
        startActivity(fbIntent);
    }

    public void link2(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/firstz.stg"));
        startActivity(fbIntent);
    }

    public void link3(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/ppanich"));
        startActivity(fbIntent);
    }

    public void link4(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/nithikan.nonsee.5"));
        startActivity(fbIntent);
    }

    public void link5(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("http://comsci.sci.dusit.ac.th/"));
        startActivity(fbIntent);

    }

    public void link7(View view) {Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/yo.ouammiang"));
        startActivity(fbIntent);
    }
}
