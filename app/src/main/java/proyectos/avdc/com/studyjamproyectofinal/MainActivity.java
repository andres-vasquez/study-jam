package proyectos.avdc.com.studyjamproyectofinal;

import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import proyectos.avdc.com.studyjamproyectofinal.adapters.TabsAdapter;
import proyectos.avdc.com.studyjamproyectofinal.fragments.Equipos;
import proyectos.avdc.com.studyjamproyectofinal.fragments.Home;
import proyectos.avdc.com.studyjamproyectofinal.fragments.Posiciones;


public class MainActivity extends ActionBarActivity {

    private static Typeface fontAwesome;
    private TabHost mTabHost;
    private ViewPager mViewPager;
    private TabsAdapter mTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fontAwesome = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup();

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mTabsAdapter = new TabsAdapter(this, mTabHost, mViewPager);

        mTabsAdapter.addTab(mTabHost.newTabSpec(getString(R.string.home)).setIndicator(getString(R.string.home)), Home.class, null);
        mTabsAdapter.addTab(mTabHost.newTabSpec(getString(R.string.posiciones)).setIndicator(getString(R.string.posiciones)), Posiciones.class, null);
        mTabsAdapter.addTab(mTabHost.newTabSpec(getString(R.string.equipos)).setIndicator(getString(R.string.equipos)), Equipos.class, null);

        for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
            View view = mTabHost.getTabWidget().getChildAt(i);
            view.setBackgroundResource(R.drawable.tab_indicator);
            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTypeface(fontAwesome);
            tv.setTextColor(getResources().getColor(R.color.actionbar));
        }
    }


}