package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,
    img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,
    img23,img24,img25,img26,img27,img28,img29,img30,img31,img32,img33,img34,img35;
    Button btn1,btn2,btn3,btn4;
    Button btn1Alm0,btn2Alm,btn3Alm,btn4Alm,btn5Alm,btn6Alm,btn7Alm,btn8Alm,
            btn1Desk,btn2Desk,btn3Desk,btn4Desk,btn5Desk,btn6Desk,btn7Desk,btn8Desk,
            btn1ZG,btn2ZG,btn3ZG,btn4ZG,btn5ZG,btn6ZG,btn7ZG,btn8ZG,
            btn1Lap,btn2Lap,btn3Lap,btn4Lap,btn5Lap,btn6Lap;






    public void initComponentPantalla5(){ //Bebidas
        img28 = (ImageView)findViewById(R.id.img28);
        img29 = (ImageView)findViewById(R.id.img29);
        img30 = (ImageView)findViewById(R.id.img30);
        img31 = (ImageView)findViewById(R.id.img31);
        img32 = (ImageView)findViewById(R.id.img32);
        img33 = (ImageView)findViewById(R.id.img33);
        img34 = (ImageView)findViewById(R.id.img34);
        img35 = (ImageView)findViewById(R.id.img35);
        btn1Alm0 = (Button) findViewById(R.id.btn1Alm);
        btn2Alm = (Button)findViewById(R.id.btn2Alm);
        btn3Alm = (Button)findViewById(R.id.btn3Alm);
        btn4Alm = (Button)findViewById(R.id.btn4Alm);
        btn5Alm = (Button)findViewById(R.id.btn5Alm);
        btn6Alm = (Button)findViewById(R.id.btn6Alm);
        btn7Alm = (Button)findViewById(R.id.btn7Alm);
        btn8Alm = (Button)findViewById(R.id.btn8Alm);
        btn1Alm0.setOnClickListener(this);
        btn2Alm.setOnClickListener(this);
        btn3Alm.setOnClickListener(this);
        btn4Alm.setOnClickListener(this);
        btn5Alm.setOnClickListener(this);
        btn6Alm.setOnClickListener(this);
        btn7Alm.setOnClickListener(this);
        btn8Alm.setOnClickListener(this);

        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Picasso.get().load("https://i.linio.com/p/806e8d9ad843b3cb1b33b6355a13b149-catalog.webp").into(img28);
        Picasso.get().load("https://i.linio.com/p/093951622bf1f48b87ad0133901ed2d2-catalog.webp").into(img29);
        Picasso.get().load("https://i.linio.com/p/e0d5ee1f705d059afb3fca47fb6196cd-catalog.webp").into(img30);
        Picasso.get().load("https://i.linio.com/p/710857d15c83dcb389204c7b848d7b8b-catalog.webp").into(img31);
        Picasso.get().load("https://i.linio.com/p/260ac5386a366c4f8de0c09c35439921-catalog.webp").into(img32);
        Picasso.get().load("https://i.linio.com/p/78f52187b7fbedba08b1499e4de758e2-catalog.webp").into(img33);
        Picasso.get().load("https://i.linio.com/p/79e38d367a303b9b88d381a3b4dad3fb-catalog.webp").into(img34);
        Picasso.get().load("https://i.linio.com/p/97272dd9fe03d0c488f392ffeee19094-catalog.webp").into(img35);


    }



    public void initComponentPantalla4(){ //Postre
        img20=(ImageView)findViewById(R.id.img20);
        img21=(ImageView)findViewById(R.id.img21);
        img22=(ImageView)findViewById(R.id.img22);
        img23=(ImageView)findViewById(R.id.img23);
        img24=(ImageView)findViewById(R.id.img24);
        img25=(ImageView)findViewById(R.id.img25);
        img26=(ImageView)findViewById(R.id.img26);
        img27=(ImageView)findViewById(R.id.img27);
        btn1Desk= (Button)findViewById(R.id.btn1Desk);
        btn2Desk= (Button)findViewById(R.id.btn2Desk);
        btn3Desk= (Button)findViewById(R.id.btn3Desk);
        btn4Desk= (Button)findViewById(R.id.btn4Desk);
        btn5Desk= (Button)findViewById(R.id.btn5Desk);
        btn6Desk= (Button)findViewById(R.id.btn6Desk);
        btn7Desk= (Button)findViewById(R.id.btn7Desk);
        btn8Desk= (Button)findViewById(R.id.btn8Desk);
        btn1Desk.setOnClickListener(this);
        btn2Desk.setOnClickListener(this);
        btn3Desk.setOnClickListener(this);
        btn4Desk.setOnClickListener(this);
        btn5Desk.setOnClickListener(this);
        btn6Desk.setOnClickListener(this);
        btn7Desk.setOnClickListener(this);
        btn8Desk.setOnClickListener(this);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/09/Torta-de-chocolate-con-lucuma-DC-1-300x300.jpg").into(img20);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/09/Tres-leches-DC-1.jpg").into(img21);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/12/x9.jpg").into(img22);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/12/x6.jpg").into(img23);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/12/x7.jpg").into(img24);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/12/x8.jpg").into(img25);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/09/CHEESECAKE-DE-FRESA-DC-1-300x300.jpg").into(img26);
        Picasso.get().load("https://dc.com.pe/wp-content/uploads/2021/09/CHEESECAKE-DE-OREO-DC-1-300x300.jpg").into(img27);
        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

//

    }


    public void initComponentPantalla3(){ //Hamburguesa
        img12=(ImageView)findViewById(R.id.img12);
        img13=(ImageView)findViewById(R.id.img13);
        img14=(ImageView)findViewById(R.id.img14);
        img15=(ImageView)findViewById(R.id.img15);
        img16=(ImageView)findViewById(R.id.img16);
        img17=(ImageView)findViewById(R.id.img17);
        img18=(ImageView)findViewById(R.id.img18);
        img19=(ImageView)findViewById(R.id.img19);
        btn1ZG= (Button)findViewById(R.id.btn1ZG);
        btn2ZG= (Button)findViewById(R.id.btn2ZG);
        btn3ZG= (Button)findViewById(R.id.btn3ZG);
        btn4ZG= (Button)findViewById(R.id.btn4ZG);
        btn5ZG= (Button)findViewById(R.id.btn5ZG);
        btn6ZG= (Button)findViewById(R.id.btn6ZG);
        btn7ZG= (Button)findViewById(R.id.btn7ZG);
        btn8ZG= (Button)findViewById(R.id.btn8ZG);
        btn1ZG.setOnClickListener(this);
        btn2ZG.setOnClickListener(this);
        btn3ZG.setOnClickListener(this);
        btn4ZG.setOnClickListener(this);
        btn5ZG.setOnClickListener(this);
        btn6ZG.setOnClickListener(this);
        btn7ZG.setOnClickListener(this);
        btn8ZG.setOnClickListener(this);
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/DC_202109_14869_SmokyBLTQuarterPounderwithCheese_832x472:1-4-product-tile-desktop").into(img12);
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/DC_202109_14866_SmokyBLTDoubleQuarterPounderwithCheese_832x472:1-4-product-tile-desktop").into(img13);
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/DC_201907_0005_BigMac_832x472:1-4-product-tile-desktop").into(img14);
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/DC_202201_0007-005_QuarterPounderwithCheese_832x472:1-4-product-tile-desktop").into(img15);
        //https://i.linio.com/p/f693702354171c11710bb798d09bd230-catalog.webp
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/202201_3426-005_DoubleQuarterPounderwithCheese_832x472:1-4-product-tile-desktop").into(img16);
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/DC_202201_4282_QuarterPounderCheeseDeluxe_Shredded_832x472:1-4-product-tile-desktop").into(img17);
        //https://i.linio.com/p/aa82482459e3fdcc4b56cf4af3c308ca-catalog.webp
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/202002_0592_McDouble_Alt_832x472:1-4-product-tile-desktop").into(img18);
        Picasso.get().load("https://s7d1.scene7.com/is/image/mcdonalds/DC_202201_4295-005_BaconQPC_832x472:1-4-product-tile-desktop").into(img19);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);



    }


    public void initComponentPantalla2(){ //Pizza
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        btn1Lap= (Button)findViewById(R.id.btn1Lap);
        btn2Lap= (Button)findViewById(R.id.btn2Lap);
        btn3Lap= (Button)findViewById(R.id.btn3Lap);
        btn4Lap= (Button)findViewById(R.id.btn4Lap);
        btn5Lap= (Button)findViewById(R.id.btn5Lap);
        btn6Lap= (Button)findViewById(R.id.btn6Lap);
        btn1Lap.setOnClickListener(this);
        btn2Lap.setOnClickListener(this);
        btn3Lap.setOnClickListener(this);
        btn4Lap.setOnClickListener(this);
        btn5Lap.setOnClickListener(this);
        btn6Lap.setOnClickListener(this);
        Picasso.get().load("https://static.phdvasia.com/pe/img/singles/americana-desktop-thumbnail.jpg").into(img6);
        Picasso.get().load("https://static.phdvasia.com/pe/img/singles/hawaiana-desktop-thumbnail.jpg").into(img7);
        Picasso.get().load("https://static.phdvasia.com/pe/img/singles/pepperoni-desktop-thumbnail.jpg").into(img8);
        Picasso.get().load("https://static.phdvasia.com/pe/img/singles/mozzarella-desktop-thumbnail.jpg").into(img9);
        Picasso.get().load("https://static.phdvasia.com/pe/img/singles/continental-desktop-thumbnail.jpg").into(img10);
        Picasso.get().load("https://static.phdvasia.com/pe/img/singles/vegetariana-desktop-thumbnail.jpg").into(img11);
        btn1=(Button)findViewById(R.id.btnRegresar);
        btn1.setOnClickListener(this);
    }


    public void initComponentPantalla1(){ //Categorias
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        //img5=(ImageView)findViewById(R.id.img5);
        Picasso.get().load("https://tvpacifico.mx/recetas/intranet/images/recipes/330-349.jpg").into(img1);
        Picasso.get().load("https://estaticos-cdn.sport.es/clip/4aaceb6f-6ed8-43a0-86b3-59a19603260c_alta-libre-aspect-ratio_default_0.jpg").into(img2);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrup-1dBkFEOBDsoY1IYaqE_RZcN90bNmhzw&usqp=CAU").into(img3);
        Picasso.get().load("https://imgmedia.buenazo.pe/650x358/buenazo/original/2020/08/07/5f29d430f135df357305e991.jpg").into(img4);


        img1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    setContentView(R.layout.activity_pizza);
                    initComponentPantalla2();
                }
                return true;
            }
        });
        img2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    setContentView(R.layout.activity_hamburguesa);
                    initComponentPantalla3();
                }
                return true;
            }
        });
        img3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    setContentView(R.layout.activity_postre);
                    initComponentPantalla4();
                }
                return true;
            }
        });
        img4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    setContentView(R.layout.activity_bebidas);
                    initComponentPantalla5();
                }
                return true;
            }
        });




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponentPantalla1();


    }

    @Override
    public void onClick(View view) {

        if(view == btn1){
            setContentView(R.layout.activity_main);
            initComponentPantalla1();

        }
        if(view == btn2){
            setContentView(R.layout.activity_main);
            initComponentPantalla1();
        }

        if(view == btn3){
            setContentView(R.layout.activity_main);
            initComponentPantalla1();
        }

        if(view == btn4){
            setContentView(R.layout.activity_main);
            initComponentPantalla1();
        }

        if(view == btn1Alm0){ //Bebidas
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }
        if(view == btn2Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn3Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }
        if(view == btn4Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }

        if(view == btn5Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn6Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn7Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn8Alm){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }

        if(view == btn1Desk){ //Postre
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn2Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn3Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }
        if(view == btn4Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }if(view == btn5Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }
        if(view == btn6Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn7Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);

        }
        if(view == btn8Desk){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }

        if(view == btn1ZG){ //Hamburguesa
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn2ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn3ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }if(view == btn4ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn5ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn6ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn7ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn8ZG){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }

        if(view == btn1Lap){ //Pizza
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn2Lap){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn3Lap){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }if(view == btn4Lap){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn5Lap){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }
        if(view == btn6Lap){
            Intent intent = new Intent(MainActivity.this,Comprar.class);
            startActivity(intent);
        }


    }
}