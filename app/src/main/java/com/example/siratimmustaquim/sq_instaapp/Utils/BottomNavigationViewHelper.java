package com.example.siratimmustaquim.sq_instaapp.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.siratimmustaquim.sq_instaapp.Home.HomeActivity;
import com.example.siratimmustaquim.sq_instaapp.Notifications.NotificationActivity;
import com.example.siratimmustaquim.sq_instaapp.Profile.ProfileActivity;
import com.example.siratimmustaquim.sq_instaapp.R;
import com.example.siratimmustaquim.sq_instaapp.Search.SearchActivity;
import com.example.siratimmustaquim.sq_instaapp.Upload.UploadActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    public static void  setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    /**
     * Navigation between activity
     */
    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent1 = new Intent(context, HomeActivity.class);           //ACTIVITY_NUM = 0;
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);         //ACTIVITY_NUM = 1;
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_upload:
                        Intent intent3 = new Intent(context, UploadActivity.class);         //ACTIVITY_NUM = 2;
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_notification:
                        Intent intent4 = new Intent(context, NotificationActivity.class);   //ACTIVITY_NUM = 3;
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_user:
                        Intent intent5 = new Intent(context, ProfileActivity.class);        //ACTIVITY_NUM = 4;
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }
}
