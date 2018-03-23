package pe.edu.tecsup.lab06.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pe.edu.tecsup.lab06.models.Person;

/**
 * Created by Alumno on 23/03/2018.
 */

public class PersonAdapter extends  RecyclerView.Adapter<PersonAdapter.ViewHolder>{
    public void setPeople(List<Person> people) {
        this.people = people;
    }

    private  List<Person> people;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }


}
