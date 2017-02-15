package abhishekagarwal371.timetable;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    private static String KEYZZ="Keyee";
    private int pos;
    private RecyclerView recyclerView;
    private List<Subjects> sub;
    private int a=0;
    private String time;
    private String[] timearr={"-","-","-","-","-","-","-","-","-","-"};
    private String[] timings={"-","-","-","-","-","-","-","-","-","-"};
    private ad add;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_display, container, false);
        pos=getArguments().getInt(KEYZZ);

        recyclerView=(RecyclerView)v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

       setupadapter();


        return v;
    }

    private void setupadapter() {
        sub=SubjectLab.getInstance(getActivity()).getDayorderSubjectsList(pos+1);
        if(add==null){
            add=new ad();
            recyclerView.setAdapter(add);
        }
        else add.notifyDataSetChanged();
    }


    public static DisplayFragment getInstance(int position){
        Bundle args=new Bundle();
        args.putInt(KEYZZ,position);
        DisplayFragment displayFragment=new DisplayFragment();
        displayFragment.setArguments(args);
        return displayFragment;

    }

    @Override
    public void onResume() {
        super.onResume();
        time=PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(Stringss.StringSetd,"-");
        if (time != "-") {


        timearr=time.split("/");}
        timings=timearr;
       setupadapter();
    }

    public class VHolder extends RecyclerView.ViewHolder{

        FrameLayout i;
        TextView t1;
        TextView t2;
        TextView t3;
        TextView t4;
        ImageView imageView;
        public VHolder(View itemView) {
            super(itemView);
            //i=(FrameLayout) itemView.findViewById(R.id.imgg);
            t1=(TextView)itemView.findViewById(R.id.textinput1);
            t2=(TextView)itemView.findViewById(R.id.textinput2);
            t3=(TextView)itemView.findViewById(R.id.textinput3);
            t4=(TextView)itemView.findViewById(R.id.textinput4);
            imageView=(ImageView)itemView.findViewById(R.id.imgedit);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getActivity(),EditActivity.class);
                    intent.putExtra(EditActivity.Day_order,pos+1);
                    intent.putExtra(EditActivity.Hr_no,getAdapterPosition());

                    Bundle bundle= null;
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
                        startActivity(intent,bundle);
                    }
                    else {
                        startActivity(intent);
                    }

                }
            });
        }
    }
    public class ad extends RecyclerView.Adapter<VHolder>{

        @Override
        public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(getActivity());
            View view=inflater.inflate(R.layout.finalrecyclerinflate,parent,false);
            return new VHolder(view);
        }

        @Override
        public void onBindViewHolder(VHolder holder, int position) {
        Subjects subjects=sub.get(position);
            a=position;

          //  holder.i.setBackgroundColor(ContextCompat.getColor(getActivity(),subjects.getImg()));
            //Glide.with(getActivity()).load(subjects.getImg()).centerCrop().into(holder.i);
            holder.t1.setText("Hour "+(a+1)+"");
            holder.t2.setText(subjects.getSubject_name());
            holder.t3.setText(subjects.getSubject_room());
            holder.t4.setText(timings[position]);
        }

        @Override
        public int getItemCount() {
            return sub.size();
        }
    }

}
