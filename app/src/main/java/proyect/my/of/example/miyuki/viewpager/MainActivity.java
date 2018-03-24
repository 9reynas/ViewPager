package proyect.my.of.example.miyuki.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabID);
        viewPager = findViewById(R.id.vpID);



        viewpager_adapter adapter = new viewpager_adapter(getSupportFragmentManager());
        adapter.addFragment(new BlankFragment1(),"Frag 1");
        adapter.addFragment(new BlankFragment2(),"Frag 2");
        adapter.addFragment(new BlankFragment3(),"Frag 3");


        viewPager.setAdapter(adapter);

        //esto sincroniza el viewpager  con el tablayout

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_check_circle_black_24dp);

    }
}
