package com.example.assignment1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment1.R;
import com.example.assignment1.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    ArrayList<Movie> movie;
    TextView title, ratings, description;
    ImageView imageView;

    public MovieAdapter(ArrayList<Movie> movie) {
        this.movie = movie;
    }


    @Override
    public int getCount() {
        return movie.size();
    }

    @Override
    public Object getItem(int position) {
        return movie.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh;
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_details_layout, null);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
            return null;
        }
        else
        {
             vh = (ViewHolder) convertView.getTag();
        }

        Movie movie = (Movie) getItem(position);
        vh.movieTitle.setText(movie.getMovie_title());
        vh.movieDescription.setText(movie.getDescription());
        vh.movieRating.setText(movie.getRatings());
        vh.movieImage.setImageResource(position);

        return convertView;

    }

    class ViewHolder{

        TextView movieTitle;
        TextView movieRating;
        TextView movieDescription;
        ImageView movieImage;
        private Integer[] movieImg = {R.drawable.movie1,R.drawable.movie2,R.drawable.movie3,R.drawable.movie4,R.drawable.movie5,R.drawable.movie6,R.drawable.movie7,R.drawable.movie8,R.drawable.movie9,R.drawable.movie10};


        public ViewHolder(View view)
        {
            movieTitle = view.findViewById(R.id.movie_titile_textview);
            movieRating = view.findViewById(R.id.ratings_textview) ;
            movieDescription =  view.findViewById(R.id.description_textview);
            movieImage = view.findViewById(R.id.movieimage_imageView);
        }
    }
}
