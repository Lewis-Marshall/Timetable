package com.example.timetable;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class WeekAFragment extends Fragment implements View.OnClickListener {

	TextView tv1;
	public WeekAFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_weeka, container, false);

		tv1 = (TextView) rootView.findViewById(R.id.editText6);
		tv1.setOnClickListener(this);

		ImageButton FAB;
		FAB = (ImageButton)rootView.findViewById(R.id.FAB1);
		FAB.setOnClickListener(new View.OnClickListener() {

			@Override
			 public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), AddSubject.class);
				startActivity(intent);
			}
		});

		return rootView;


	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(v.getContext(), LessonActivity.class);
		//intent.putExtra(label, this);
		startActivity(intent);
	}

}
