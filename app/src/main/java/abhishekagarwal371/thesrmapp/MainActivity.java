package abhishekagarwal371.thesrmapp;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private final String String_intent="hello";
    private CollapsingToolbarLayout layout;
    private DrawerLayout drawerLayout;
    private ImageView imageView;
    private SubjectLab subjectLab;
    private RecyclerView recyclerView;
    private List<Subjects> list;
    private adapter a;
    @Override
    public void onCreate(Bundle g){
        super.onCreate(g);
        setContentView(R.layout.activity_main);
        subjectLab=SubjectLab.getInstance(this);
        list=subjectLab.getSublist();
        recyclerView=(RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        if(a==null) {
            a = new adapter(list, this);

            recyclerView.setAdapter(a);
        }
        else a.notifyDataSetChanged();
        toolbar=(Toolbar)findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        imageView=(ImageView)findViewById(R.id.img);
        Glide.with(this).load(R.drawable.androidwithbag).centerCrop().into(imageView);
        layout=(CollapsingToolbarLayout)findViewById(R.id.collapse);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        toolbar.setNavigationIcon(R.drawable.ic_action_navigation);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });




    }
    public void fab(View view){
        Subjects s=new Subjects();
        subjectLab.addSubject(s);
        Intent intent=new Intent(this,SubAct.class);
        intent.putExtra(String_intent,s.getUid());
        startActivity(intent);
    }
    public class VH extends RecyclerView.ViewHolder{

        TextView t1;
        TextView t2;
        public VH(View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.txt1);
            t2=(TextView)itemView.findViewById(R.id.txt2);
        }
    }
    public class adapter extends RecyclerView.Adapter<VH>{
List<Subjects>subs;
        Context c;
        public adapter(List<Subjects>s,Context context){
            subs=s;
            c=context;
        }
        @Override
        public VH onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(c);
            View v=inflater.inflate(R.layout.recyclerviewlayout,parent,false);
            return new VH(v);
        }

        @Override
        public void onBindViewHolder(VH holder, int position) {
        Subjects s=subs.get(position);
            holder.t1.setText(s.getSubject_name());
            holder.t2.setText(s.getSubject_room());
        }

        @Override
        public int getItemCount() {
            return subs.size();
        }
    }




    }


