package de.hirola.braintrain.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import de.hirola.braintrain.R;

/**
 * Copyright 2023 by Michael Schmidt, Hirola Consulting
 * This software us licensed under the AGPL-3.0 or later.
 *
 * The fragment for the play.
 *
 * @author Michael Schmidt (Hirola)
 * @since v0.1
 */
public class PlaygroundFragment extends Fragment {

    // Required empty public constructor
    public PlaygroundFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.playground, container, false);
    }
}