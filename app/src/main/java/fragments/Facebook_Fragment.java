package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.prasharma.NavigationDrawerDemo.MainActivity;
import com.example.prasharma.facebookdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by prasharma on 1/21/2017.
 */

public class Facebook_Fragment extends Fragment {


    Button btnTest;
    private View rootView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_facebook, container, false);

        return  rootView;

    }

    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnTest=(Button)rootView.findViewById(R.id.btnTest);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });
    }


    private void changeFragment(View v){

        ((MainActivity)getActivity()).replaceFragment(new testFragment());

        Toast.makeText(getActivity(),"clicked",Toast.LENGTH_LONG).show();

    }
}
