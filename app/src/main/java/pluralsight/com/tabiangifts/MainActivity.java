package pluralsight.com.tabiangifts;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;


import pluralsight.com.tabiangifts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // generated binding class for our activity_main layout, after adding the <layout> tag
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // to add the databinding for our layout we will use the mBinding rather than setContentView
        //setContentView(R.layout.activity_main);
        // we use the DataBindingUtil to bind our layout
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    // put the fragment in our main_container
    private void init(){
        ViewProductFragment fragment = new ViewProductFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, fragment, getString(R.string.fragment_view_product));
        transaction.commit();
    }
}
