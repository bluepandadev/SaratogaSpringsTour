package com.example.android.saratogaspringstour;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SitesFragment extends Fragment {

    public SitesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //ArrayList of Location objects
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.sites1_name), getString(R.string.sites1_address)));
        locations.add(new Location(getString(R.string.sites2_name), getString(R.string.sites2_address)));

        //Creat a {@link LocationAdapter}, whose data source is a list of
        //{@link Location}s. The adapter knows how to create list item views for each item in the list
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Get a reference to the ListView, and attach the adapter to the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
