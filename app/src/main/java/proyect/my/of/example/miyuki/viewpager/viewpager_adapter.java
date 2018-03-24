package proyect.my.of.example.miyuki.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hazexirs on 24/03/2018.
 */

public class viewpager_adapter extends FragmentPagerAdapter{

    private List<Fragment> list = new ArrayList<>();
    private List<String> titulos = new ArrayList();


    public viewpager_adapter(FragmentManager fm) {
        super(fm);
    }

    public  void addFragment(Fragment mifragment,String titulo) {

        list.add(mifragment);
        titulos.add(titulo);


    }

    @Override
    public Fragment getItem(int position) {
    //recupera el fragmente de la Lista de fragment
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
    //retorna el titulo en la misma pasada del fragment
        return titulos.get(position);
    }
}
