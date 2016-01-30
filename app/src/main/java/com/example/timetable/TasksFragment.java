package com.example.timetable;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TasksFragment extends Fragment {

	private ArrayAdapter<String> mTaskAdapter;
	public TasksFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_tasks, container, false);


		String[] fakeData = {"Bob","Bill","Ben"};
		mTaskAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, fakeData);
		ListView listView = (ListView) rootView.findViewById(R.id.task_list);
		listView.setAdapter(mTaskAdapter);




		return rootView;
	}

}
