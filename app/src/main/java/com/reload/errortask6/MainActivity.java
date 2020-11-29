package com.reload.errortask6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    TextView tv1,tv2;
    String mTitle[] = {"Microsoft", "Apple", "Google", "Oracle", "Facebook", "Twitter","WhatsApp","Amazon"};
    String mDescription[] = {"Bill Gates", "Steve Jobs", "Serge Brin", "Larry Ellison", "Mark Zukerberg", "Dorsey & Odeo","Brian Action","Jeffrey Bezos"};

    int images[] = {R.drawable.microsoft, R.drawable.apple, R.drawable.google, R.drawable.oracle1, R.drawable.facebook, R.drawable.twitter,R.drawable.whatsapp,R.drawable.amazon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        tv1=findViewById(R.id.textview1);
        tv2=findViewById(R.id.textview2);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(MainActivity.this,"Microsoft Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"Apple Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"Google Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"Oracle Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"Facebook Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"Twitter Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"WhatsApp Description",Toast.LENGTH_SHORT).show();
                }
                if(i==0){
                    Toast.makeText(MainActivity.this,"Amazon Description",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    /*
            Companies microsoft=new Companies("Microsoft","bill gates","microsoft");
            Companies apple=new Companies("Apple","Steve Jobs","apple");
            Companies google=new Companies("Google","Serge Brin","google");
            Companies oracle=new Companies("Oracle","Larry Ellison","oracle");
            Companies facebook=new Companies("Facebook","Mark Zukerberg","facebook");
            Companies twitter=new Companies("Twitter","Dorsey & Odeo","twitter");
    Companies[] companies={microsoft,apple,google,oracle,facebook,twitter};
    CompaniesAddapter addapter=new CompaniesAddapter(MainActivity.this,R.layout.item,companies);
    list.setAdapter(addapter);

            list=findViewById(R.id.list);
            ArrayList<String> values=new ArrayList<>();
            values.add("user 1");
            values.add("user 2");
            values.add("user 3");
            values.add("user 4");
            values.add("user 5");
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.item,values);
    */
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rimages[];


        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.item, R.id.textview1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rimages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View item = layoutInflater.inflate(R.layout.item, parent, false);
            ImageView images = item.findViewById(R.id.image);
            TextView myTitle = (TextView) item.findViewById(R.id.textview1);
            TextView myDescription = (TextView) item.findViewById(R.id.textview2);

            images.setImageResource(rimages[position]);
           myTitle.setText(rTitle [position]);
            myDescription.setText(rDescription [position]);

            return item;
        }
    }
}

