package com.example.tvshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String API_KEY="b2b10e1a4cd126c641eb8f73577ae2ad";
    ArrayList<Shows> show= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchshow();

    }

    private void fetchshow() {

        final TextView textview= (TextView) findViewById(R.id.textview);

        ApiInterface apiInterface= ApiClient.getApiInterface();

        Call<TVResponse> call= apiInterface.getPopularShows(API_KEY);

        call.enqueue(new Callback<TVResponse>() {
            @Override
            public void onResponse(Call<TVResponse> call, Response<TVResponse> response) {
                if (response.isSuccessful()) {

                    ArrayList<Shows> showList = response.body().getResults();
                    show.clear();
                    showList.addAll(showList);
                    Log.d("ll","array list :"+showList);
                 //   showAdapter= new ShowAdapter(showList,R.layout.list_item,v.getContext());
                   // shows_view.setAdapter(showAdapter);
                    //showAdapter.setClickListener((TabMainLayout) getActivity());


                    textview.setText(showList.get(0).getName());
                    Log.d("mama", "Number of movies received: " + showList.size());



                    //movieadapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<TVResponse> call, Throwable t) {
                Log.d("fail","shows not recvd");
            }


        });




    }



    }
