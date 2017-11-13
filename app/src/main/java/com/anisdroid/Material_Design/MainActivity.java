package com.anisdroid.Material_Design;

import android.app.*;
import android.os.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.support.v4.widget.*;

public class MainActivity extends ActionBarActivity 
{
	private Toolbar ttt;
	DrawerLayout dl;
	ActionBarDrawerToggle abdt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		ttt = (Toolbar) findViewById(R.id.app_bar);
		setSupportActionBar(ttt);
		
		dl = (DrawerLayout) findViewById(R.id.drawer_layout);
		
		abdt = new ActionBarDrawerToggle(this,dl,ttt,R.string.drawer_open,R.string.drawer_close);
		
		dl.setDrawerListener(abdt);
    }

	@Override
	protected void onPostCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onPostCreate(savedInstanceState);
		abdt.syncState();
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu aaa)
	{
		MenuInflater bbb = getMenuInflater();
		bbb.inflate(R.menu.my_menu,aaa);
		
		// TODO: Implement this method
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem ccc)
	{
		if(ccc.getItemId() == R.id.about){
			startActivity(new Intent(this,About.class));
		}
		
		// TODO: Implement this method
		return true;
	}
	
	
	
}
