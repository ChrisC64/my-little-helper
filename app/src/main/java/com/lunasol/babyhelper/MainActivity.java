package com.lunasol.babyhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lunasol.babyhelper.databinding.MainActivityBinding;
import com.lunasol.babyhelper.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main_activity);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        NavController controller = Navigation.findNavController( this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(binding.bottomNavigationView, controller);
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.nav_home)
                {
                    navigateTo(R.id.action_global_home);
                }
                else if (menuItem.getItemId() == R.id.nav_profile)
                {
                    navigateTo(R.id.action_global_profile);
                }
                else if (menuItem.getItemId() == R.id.nav_logs)
                {
                    navigateTo(R.id.action_global_logs);
                }
                else if (menuItem.getItemId() == R.id.nav_baby)
                {
                    navigateTo(R.id.action_global_baby);
                }
                return false;
            }
        });
    }

    public void navigateTo(int id)
    {
        Navigation.findNavController(this, R.id.nav_host_fragment).navigate(id);
    }
}
