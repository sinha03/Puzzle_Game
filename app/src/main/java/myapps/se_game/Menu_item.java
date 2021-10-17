package myapps.se_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static myapps.se_game.R.id.but11;

/**
 * Created by comsol on 19-Apr-17.
 */
public class Menu_item extends Activity {
    Button button, button1, button2, button3, button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        button = (Button) findViewById(R.id.butt);
        button2 = (Button) findViewById(R.id.but5);
        button3 = (Button) findViewById(R.id.but3);
        button4 = (Button) findViewById(R.id.but4);


        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                Intent intent = new Intent(Menu_item.this, Game.class);
                startActivity(intent);

            }


        });



        button2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                Intent intent = new Intent(Menu_item.this, View_ins.class);
                startActivity(intent);

            }


        });

        button3.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                Intent intent = new Intent(Menu_item.this, About.class);
                startActivity(intent);

            }


        });
        button4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                button4 = (Button) findViewById(R.id.but4);
                finish();



            }


        });


    }
}
