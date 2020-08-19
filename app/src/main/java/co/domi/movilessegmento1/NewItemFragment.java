package co.domi.movilessegmento1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class NewItemFragment extends Fragment implements View.OnClickListener{

    //Globales

    //State


    //Views
    private EditText newtaskET;
    private Button addBtn;

    public NewItemFragment() {
        // Required empty public constructor
    }

    public static NewItemFragment newInstance() {
        NewItemFragment fragment = new NewItemFragment();
        Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }


    //El fragment se vuelve visible
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_new_item, container, false);
        newtaskET = root.findViewById(R.id.newtaskET);
        addBtn = root.findViewById(R.id.addBtn);
        addBtn.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.addBtn:
                Toast.makeText(getContext(), newtaskET.getText().toString(), Toast.LENGTH_LONG).show();
                break;

        }
    }


    public EditText getNewtaskET(){
        return this.newtaskET;
    }

}