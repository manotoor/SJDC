package comsitemanotoorhome.google.httpssites.sjdc.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import comsitemanotoorhome.google.httpssites.sjdc.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    ImageView deltaCollege,southCampus;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        deltaCollege = (ImageView)view.findViewById(R.id.mainCampus);
        southCampus = (ImageView)view.findViewById(R.id.southCampus);

        setImageViewListener(deltaCollege,southCampus);


        return  view;
    }

    private void setImageViewListener(ImageView ... imageViews){
        imageViews[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*TODO --- Open up a new event to tour Main Campus*/
            }
        });
        imageViews[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*TODO --- Open up a new event to tour South Campus*/
            }
        });
    }

}
