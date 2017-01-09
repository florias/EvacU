package com.example.EvacU;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pwsapp.R;

import java.util.Scanner;
public class MainActivity extends Activity {

    private Button btnGo;
    private EditText EditLokaal;
    private Bitmap bitmap;
    private Canvas canvas;
    float Schaalx, Schaaly, Gexit1x, Gexit1y, Dexit1x, Dexit1y, Gexit2x, Gexit2y, Dexit2x, Dexit2y, Gexit3x, Gexit3y, Dexit3x, Dexit3y, Gexit4x, Gexit4y, Dexit4x, Dexit4y, Gexit5x, Gexit5y, Dexit5x, Dexit5y, Dexit6x, Dexit6y, Gexit6x, Gexit6y,
            LLKx, LLKy, GLKx, GLKy, L007x, L007y, G007x, G007y, L009x, L009y, G009x, G009y, L011x, L011y, G011x, G011y, L013x, L013y, G013x, G013y, L015x, L015y, G015x, G015y, L017x, L017y, G017x, G017y, L019x, L019y, G019x, G019y, L021x, L021y, G021x, G021y, L027x, L027y, G027x, G027y, L029x, L029y, G029x, G029y, L031x, L031y, G031x, G031y, L033x,L033y,G033x,G033y,L037x,L037y,G037x,G037y, L043x, L043y, G043x, G043y, L044x, L044y, G044x, G044y, L045x, L045y, G045x, G045y, L046x, L046y, G046x, G046y;
    float Dtrap1x, Dtrap1y, Dtrap2x,Dtrap2y,Dtrap3x,Dtrap3y,Dtrap4x,Dtrap4y,Dtrap5x,Dtrap5y,Gtrap1x,Gtrap1y,Gtrap2x,Gtrap2y,Gtrap3x,Gtrap3y,Gtrap4x,Gtrap4y,Gtrap5x,Gtrap5y,G125x,G125y,G130x,G130y,G131x,G131y,G133x,G133y,G135x,G135y,G136x,G136y,G137x,G137y,G138x,G138y,G139x,G139y,G141x,G141y,G143x,G143y,G144x,G144y,G145x,G145y,G150x,G150y,G152x,G152y,G156x,G156y,L125x,L125y,L130x,L130y,L131x,L131y,L133x,L133y,L135x,L135y,L136x,L136y,L137x,L137y,L138x,L138y,L139x,L139y,L141x,L141y,L143x,L143y,L144x,L144y,L145x,L145y,L150x,L150y,L152x,L152y,L156x,L156y,G101x,G101y,G103x,G103y,G104x,G104y,G107x,G107y,G108x,G108y,G109x,G109y,G110x,G110y,G111x,G111y,G115x,G115y,G116x,G116y,G117x,G117y,G118x,G118y,G120x,G120y,G122x,G122y,G123x,G123y,G126x,G126y,L101x,L101y,L103x,L103y,L104x,L104y,L107x,L107y,L108x,L108y,L109x,L109y,L110x,L110y,L111x,L111y,L115x,L115y,L116x,L116y,L117x,L117y,L118x,L118y,L120x,L120y,L122x,L122y,L123x,L123y,L126x,L126y;
    float D2trap1x,D2trap1y,D2trap2x,D2trap2y,D2trap3x,D2trap3y,D2trap4x,D2trap4y,G2trap1x,G2trap1y,G2trap2x,G2trap2y,G2trap3x,G2trap3y,G2trap4x,G2trap4y,G252x,G252y,L252x,L252y,G250x,G250y,L250x,L250y, G227x,G227y,L227x,L227y, G225x,G225y,L225x,L225y,G223x,G223y,L223x,L223y,G217x,G217y,L217x,L217y,G244x,G244y,L244x,L244y,G242x,G242y,L242x,L242y,G215x,G215y,L215x,L215y, G236x,G236y,L236x,L236y, G212x,G212y,G212x2,G212y2,L212x,L212y, G228x,G228y,L228x,L228y,G209x,G209y,L209x,L209y,G218x,G218y,L218x,L218y,L207x,L207y,G205x,G205y,L205x,L205y, G211x,G211y,G211x2,G211y2,L211x,L211y,G204x,G204y,L204x,L204y,G202x,G202y,L202x,L202y,G200x,G200y,L200x,L200y,G201x,G201y,G201x2,G201y2,L201x,L201y;
    Paint paint = new Paint();

    ImageView drawingImageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final ImageView drawingImageView = (ImageView) findViewById(R.id.DrawingImageView);
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);


        // paint (app): pixels op X as maal: 1,3525
        // paint (app): pixels op Y as maal: 1.246488764
        // Line
        paint = new Paint();
        paint.setColor(Color.rgb(255, 153, 51));
        paint.setStrokeWidth(9);

        Schaalx = canvas.getWidth() / 800f;                       // (float) 1.3525;
        Schaaly = canvas.getHeight() / 1425f;

        //canvas.drawRect(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        //eerste verdieping
        Gexit1x = 120 * Schaalx;
        Gexit1y = 955 * Schaaly;
        Dexit1x = 210 * Schaalx;
        Dexit1y = 955 * Schaaly;

        Gexit2x = 97 * Schaalx;
        Gexit2y = 715 * Schaaly;
        Dexit2x = 15 * Schaalx;
        Dexit2y = 715 * Schaaly;

        Gexit3x = 150 * Schaalx;
        Gexit3y = 560 * Schaaly;
        Dexit3x = 45 * Schaalx;
        Dexit3y = 454 * Schaaly;

        Gexit4x = 288 * Schaalx;
        Gexit4y = 530 * Schaaly;
        Dexit4x = 288 * Schaalx;
        Dexit4y = 440 * Schaaly;

        Gexit5x = 552 * Schaalx;
        Gexit5y = 586 * Schaaly;
        Dexit5x = 580 * Schaalx;
        Dexit5y = 695 * Schaaly;

        Gexit6x = 695 * Schaalx;
        Gexit6y = 435 * Schaaly;
        Dexit6x = 640 * Schaalx;
        Dexit6y = 370 * Schaaly;

        LLKx = 750 * Schaalx;
        LLKy = 395 * Schaaly;
        GLKx = 695 * Schaalx;
        GLKy = 435 * Schaaly;

        L007x = 580 * Schaalx;
        L007y = 475 * Schaaly;
        G007x = 560 * Schaalx;
        G007y = 490 * Schaaly;

        L009x = 560 * Schaalx;
        L009y = 450 * Schaaly;
        G009x = 545 * Schaalx;
        G009y = 475 * Schaaly;

        L011x = 500 * Schaalx;
        L011y = 470 * Schaaly;
        G011x = 500 * Schaalx;
        G011y = 530 * Schaaly;

        L013x = 445 * Schaalx;
        L013y = 470 * Schaaly;
        G013x = 445 * Schaalx;
        G013y = 530 * Schaaly;

        L015x = 363 * Schaalx;
        L015y = 470 * Schaaly;
        G015x = 363 * Schaalx;
        G015y = 530 * Schaaly;

        L017x = 260 * Schaalx;
        L017y = 470 * Schaaly;
        G017x = 260 * Schaalx;
        G017y = 530 * Schaaly;

        L019x = 190 * Schaalx;
        L019y = 470 * Schaaly;
        G019x = 190 * Schaalx;
        G019y = 530 * Schaaly;

        L021x = 153 * Schaalx;
        L021y = 470 * Schaaly;
        G021x = 153 * Schaalx;
        G021y = 530 * Schaaly;

        L027x = 45 * Schaalx;
        L027y = 560 * Schaaly;
        G027x = 150 * Schaalx;
        G027y = 560 * Schaaly;

        L029x = 45 * Schaalx;
        L029y = 690 * Schaaly;
        G029x = 97 * Schaalx;
        G029y = 690 * Schaaly;

        L031x = 45 * Schaalx;
        L031y = 770 * Schaaly;
        G031x = 97 * Schaalx;
        G031y = 770 * Schaaly;

        L033x = 45 * Schaalx;
        L033y = 800 * Schaaly;
        G033x = 97 * Schaalx;
        G033y = 800 * Schaaly;

        L037x = 45 * Schaalx;
        L037y = 905 * Schaaly;
        G037x = 120 * Schaalx;
        G037y = 905 * Schaaly;

        L043x = 45 * Schaalx;
        L043y = 955 * Schaaly;
        G043x = 120 * Schaalx;
        G043y = 955 * Schaaly;

        L044x = 180 * Schaalx;
        L044y = 915 * Schaaly;
        G044x = 120 * Schaalx;
        G044y = 915 * Schaaly;

        L045x = 45 * Schaalx;
        L045y = 1045 * Schaaly;
        G045x = 120 * Schaalx;
        G045y = 1045 * Schaaly;

        L046x = 180 * Schaalx;
        L046y = 990 * Schaaly;
        G046x = 120 * Schaalx;
        G046y = 990 * Schaaly;

        //tweede verdieping
        Gtrap1x = 480 * Schaalx;
        Gtrap1y = 1133 * Schaaly;
        Dtrap1x = 530 * Schaalx;
        Dtrap1y = 1065 * Schaaly;

        Gtrap2x = 320 * Schaalx;
        Gtrap2y = 1012 * Schaaly;
        Dtrap2x = 270 * Schaalx;
        Dtrap2y = 1070 * Schaaly;

        Gtrap3x = 305 * Schaalx;
        Gtrap3y = 790 * Schaaly;
        Dtrap3x = 240 * Schaalx;
        Dtrap3y = 745 * Schaaly;

        Gtrap4x = 435 * Schaalx;
        Gtrap4y = 615 * Schaaly;
        Dtrap4x = 570 * Schaalx;
        Dtrap4y = 655 * Schaaly;

        Gtrap5x = 445 * Schaalx;
        Gtrap5y = 470 * Schaaly;
        Dtrap5x = 370 * Schaalx;
        Dtrap5y = 470 * Schaaly;

        L101x = 445 * Schaalx;
        L101y = 420 * Schaaly;
        G101x = 445 * Schaalx;
        G101y = 470 * Schaaly;

        L103x = 395 * Schaalx;
        L103y = 510 * Schaaly;
        G103x = 445 * Schaalx;
        G103y = 510 * Schaaly;

        L104x = 490 * Schaalx;
        L104y = 550 * Schaaly;
        G104x = 445 * Schaalx;
        G104y = 550 * Schaaly;

        L107x = 375 * Schaalx;
        L107y = 620 * Schaaly;
        G107x = 405 * Schaalx;
        G107y = 645 * Schaaly;

        L108x = 412 * Schaalx;
        L108y = 674 * Schaaly;
        G108x = 383 * Schaalx;
        G108y = 651 * Schaaly;

        L109x = 320 * Schaalx;
        L109y = 680 * Schaaly;
        G109x = 360 * Schaalx;
        G109y = 710 * Schaaly;

        L110x = 460 * Schaalx;
        L110y = 680 * Schaaly;
        G110x = 460 * Schaalx;
        G110y = 635 * Schaaly;

        L111x = 300 * Schaalx;
        L111y = 705 * Schaaly;
        G111x = 350 * Schaalx;
        G111y = 740 * Schaaly;

        L115x = 240 * Schaalx;
        L115y = 790 * Schaaly;
        G115x = 280 * Schaalx;
        G115y = 816 * Schaaly;

        L116x = 405 * Schaalx;
        L116y = 747 * Schaaly;
        G116x = 367 * Schaalx;
        G116y = 721 * Schaaly;

        L117x = 205 * Schaalx;
        L117y = 830 * Schaaly;
        G117x = 250 * Schaalx;
        G117y = 860 * Schaaly;

        L118x = 385 * Schaalx;
        L118y = 770 * Schaaly;
        G118x = 345 * Schaalx;
        G118y = 745 * Schaaly;

        L120x = 350 * Schaalx;
        L120y = 815 * Schaaly;
        G120x = 320 * Schaalx;
        G120y = 789 * Schaaly;

        L122x = 170 * Schaalx;
        L122y = 870 * Schaaly;
        G122x = 222 * Schaalx;
        G122y = 908 * Schaaly;

        L123x = 164 * Schaalx;
        L123y = 895 * Schaaly;
        G123x = 198 * Schaalx;
        G123y = 924 * Schaaly;

        L126x = 305 * Schaalx;
        L126y = 875 * Schaaly;
        G126x = 260 * Schaalx;
        G126y = 844 * Schaaly;

        L125x = 160 * Schaalx;
        L125y = 945 * Schaaly;
        G125x = 195 * Schaalx;
        G125y = 900 * Schaaly;

        L130x = 307 * Schaalx;
        L130y = 917 * Schaaly;
        G130x = 262 * Schaalx;
        G130y = 974 * Schaaly;

        L131x = 220 * Schaalx;
        L131y = 1000 * Schaaly;
        G131x = 252 * Schaalx;
        G131y = 960 * Schaaly;

        L133x = 270 * Schaalx;
        L133y = 1040 * Schaaly;
        G133x = 300 * Schaalx;
        G133y = 1000 * Schaaly;

        L135x = 323 * Schaalx;
        L135y = 1080 * Schaaly;
        G135x = 355 * Schaalx;
        G135y = 1043 * Schaaly;

        L136x = 362 * Schaalx;
        L136y = 965 * Schaaly;
        G136x = 325 * Schaalx;
        G136y = 1010 * Schaaly;

        L137x = 370 * Schaalx;
        L137y = 1120 * Schaaly;
        G137x = 400 * Schaalx;
        G137y = 1078 * Schaaly;

        L138x = 390 * Schaalx;
        L138y = 990 * Schaaly;
        G138x = 355 * Schaalx;
        G138y = 1038 * Schaaly;

        L139x = 423 * Schaalx;
        L139y = 1160 * Schaaly;
        G139x = 455 * Schaalx;
        G139y = 1115 * Schaaly;

        L141x = 473 * Schaalx;
        L141y = 1195 * Schaaly;
        G141x = 505 * Schaalx;
        G141y = 1150 * Schaaly;

        L143x = 500 * Schaalx;
        L143y = 1220 * Schaaly;
        G143x = 530 * Schaalx;
        G143y = 1170 * Schaaly;

        L144x = 500 * Schaalx;
        L144y = 1060 * Schaaly;
        G144x = 460 * Schaalx;
        G144y = 1117 * Schaaly;

        L145x = 550 * Schaalx;
        L145y = 1200 * Schaaly;
        G145x = 475 * Schaalx;
        G145y = 1140 * Schaaly;

        L150x = 541 * Schaalx;
        L150y = 1100 * Schaaly;
        G150x = 505 * Schaalx;
        G150y = 1150 * Schaaly;

        L152x = 567 * Schaalx;
        L152y = 1120 * Schaaly;
        G152x = 530 * Schaalx;
        G152y = 1170 * Schaaly;

        L156x = 565 * Schaalx;
        L156y = 1180 * Schaaly;
        G156x = 490 * Schaalx;
        G156y = 1120 * Schaaly;

        //tweede verdieping
        G2trap1x = 340 * Schaalx;
        G2trap1y = 1080 * Schaaly;
        D2trap1x = 305 * Schaalx;
        D2trap1y = 1125 * Schaaly;

        G2trap2x = 307 * Schaalx;
        G2trap2y = 804 * Schaaly;
        D2trap2x = 259 * Schaalx;
        D2trap2y = 768 * Schaaly;

        G2trap3x = 485 * Schaalx;
        G2trap3y = 590 * Schaaly;
        D2trap3x = 647 * Schaalx;
        D2trap3y = 635 * Schaaly;

        G2trap4x = 497 * Schaalx;
        G2trap4y = 395 * Schaaly;
        D2trap4x = 430 * Schaalx;
        D2trap4y = 395 * Schaaly;

        L252x = 425 * Schaalx;
        L252y = 1045 * Schaaly;
        G252x = 395 * Schaalx;
        G252y = 1079 * Schaaly;

        L250x = 360 * Schaalx;
        L250y = 1000 * Schaaly;
        G250x = 310 * Schaalx;
        G250y = 1060 * Schaaly;

        L244x = 295 * Schaalx;
        L244y = 960 * Schaaly;
        G244x = 250 * Schaalx;
        G244y = 1016 * Schaaly;

        L242x = 295 * Schaalx;
        L242y = 935 * Schaaly;
        G242x = 240 * Schaalx;
        G242y = 890 * Schaaly;

        L236x = 385 * Schaalx;
        L236y = 845 * Schaaly;
        G236x = 315 * Schaalx;
        G236y = 790 * Schaaly;

        L228x = 445 * Schaalx;
        L228y = 750 * Schaaly;
        G228x = 398 * Schaalx;
        G228y = 713 * Schaaly;

        L227x = 430 * Schaalx;
        L227y = 1130 * Schaaly;
        G227x = 350 * Schaalx;
        G227y = 1070 * Schaaly;

        L225x = 340 * Schaalx;
        L225y = 1145 * Schaaly;
        G225x = 370 * Schaalx;
        G225y = 1103 * Schaaly;

        L223x = 280 * Schaalx;
        L223y = 1100 * Schaaly;
        G223x = 312 * Schaalx;
        G223y = 1060 * Schaaly;

        L218x = 505 * Schaalx;
        L218y = 645 * Schaaly;
        G218x = 520 * Schaalx;
        G218y = 615 * Schaaly;

        L217x = 190 * Schaalx;
        L217y = 945 * Schaaly;
        G217x = 235 * Schaalx;
        G217y = 890 * Schaaly;

        L215x = 195 * Schaalx;
        L215y = 855 * Schaaly;
        G215x = 240 * Schaalx;
        G215y = 888 * Schaaly;

        L212x = 570 * Schaalx;
        L212y = 525 * Schaaly;
        G212x = 487 * Schaalx;
        G212y = 525 * Schaaly;

        L211x = 315 * Schaalx;
        L211y = 700 * Schaaly;
        G211x = 376 * Schaalx;
        G211y = 745 * Schaaly;
        G211x2 = 330 * Schaalx;
        G211y2 = 805 * Schaaly;

        L209x = 390 * Schaalx;
        L209y = 610 * Schaaly;
        G209x = 435 * Schaalx;
        G209y = 643 * Schaaly;

        L207x = 425 * Schaalx;
        L207y = 570 * Schaaly;

        L205x = 425 * Schaalx;
        L205y = 525 * Schaaly;
        G205x = 487 * Schaalx;
        G205y = 525 * Schaaly;

        L204x = 570 * Schaalx;
        L204y = 395 * Schaaly;
        G204x = 497 * Schaalx;
        G204y = 395 * Schaaly;

        L202x = 570 * Schaalx;
        L202y = 365 * Schaaly;
        G202x = 497 * Schaalx;
        G202y = 365 * Schaaly;

        L201x = 460 * Schaalx;
        L201y = 320 * Schaaly;
        G201x = 460 * Schaalx;
        G201y = 367 * Schaaly;
        G201x2 = 497 * Schaalx;
        G201y2 = 367 * Schaaly;

        L200x = 497 * Schaalx;
        L200y = 315 * Schaaly;
        G200x = 497 * Schaalx;
        G200y = 395 * Schaaly;

        //de tekeningen

        EditLokaal = (EditText) findViewById(R.id.EditLokaal);
        btnGo = (Button) findViewById(R.id.button);
        final int radius;
        radius = 15;
        paint.setStyle(Paint.Style.FILL);
        btnGo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            String lokaalString = EditLokaal.getText().toString();
            switch (lokaalString){
                case "666":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.teemo);
                    break;
                case "001":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(LLKx, LLKy, radius, paint);
                    canvas.drawLine(LLKx, LLKy, GLKx, GLKy, paint);
                    canvas.drawLine(GLKx, GLKy, Gexit6x, Gexit6y, paint);
                    canvas.drawLine(Gexit6x, Gexit6y, Dexit6x, Dexit6y, paint);
                    break;
                case "007":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L007x, L007y, radius, paint);
                    canvas.drawLine(L007x, L007y, G007x, G007y, paint);
                    canvas.drawLine(G007x, G007y, Gexit5x, Gexit5y, paint);
                    canvas.drawLine(Gexit5x, Gexit5y, Dexit5x, Dexit5y, paint);
                    break;
                case "009":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L009x, L009y, radius, paint);
                    canvas.drawLine(L009x, L009y, G009x, G009y, paint);
                    canvas.drawLine(G009x, G009y, Gexit5x, Gexit5y, paint);
                    canvas.drawLine(Gexit5x, Gexit5y, Dexit5x, Dexit5y, paint);
                    break;
                case "011":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L011x, L011y, radius, paint);
                    canvas.drawLine(L011x, L011y, G011x, G011y, paint);
                    canvas.drawLine(G011x, G011y, Gexit5x, Gexit5y, paint);
                    canvas.drawLine(Gexit5x, Gexit5y, Dexit5x, Dexit5y, paint);
                    break;
                case "013":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L013x, L013y, radius, paint);
                    canvas.drawLine(L013x, L013y, G013x, G013y, paint);
                    canvas.drawLine(G013x, G013y, Gexit4x, Gexit4y, paint);
                    canvas.drawLine(Gexit4x, Gexit4y, Dexit4x, Dexit4y, paint);
                    break;
                case "015":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L015x, L015y, radius, paint);
                    canvas.drawLine(L015x, L015y, G015x, G015y, paint);
                    canvas.drawLine(G015x, G015y, Gexit4x, Gexit4y, paint);
                    canvas.drawLine(Gexit4x, Gexit4y, Dexit4x, Dexit4y, paint);
                    break;
                case "017":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L017x, L017y, radius, paint);
                    canvas.drawLine(L017x, L017y, G017x, G017y, paint);
                    canvas.drawLine(G017x, G017y, Gexit4x, Gexit4y, paint);
                    canvas.drawLine(Gexit4x, Gexit4y, Dexit4x, Dexit4y, paint);
                    break;
                case "019":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L019x, L019y, radius, paint);
                    canvas.drawLine(L019x, L019y, G019x, G019y, paint);
                    canvas.drawLine(G019x, G019y, Gexit4x, Gexit4y, paint);
                    canvas.drawLine(Gexit4x, Gexit4y, Dexit4x, Dexit4y, paint);
                    break;
                case "021":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L021x, L021y, radius, paint);
                    canvas.drawLine(L021x, L021y, G021x, G021y, paint);
                    canvas.drawLine(G021x, G021y, Gexit3x, Gexit3y, paint);
                    canvas.drawLine(Gexit3x, Gexit3y, Dexit3x, Dexit3y, paint);
                    break;
                case "027":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L027x, L027y, radius, paint);
                    canvas.drawLine(L027x, L027y, G027x, G027y, paint);
                    canvas.drawLine(G027x, G027y, Gexit3x, Gexit3y, paint);
                    canvas.drawLine(Gexit3x, Gexit3y, Dexit3x, Dexit3y, paint);
                    break;
                case "029":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L029x, L029y, radius, paint);
                    canvas.drawLine(L029x, L029y, G029x, G029y, paint);
                    canvas.drawLine(G029x, G029y, Gexit2x, Gexit2y, paint);
                    canvas.drawLine(Gexit2x, Gexit2y, Dexit2x, Dexit2y, paint);
                    break;
                case "031":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L031x, L031y, radius, paint);
                    canvas.drawLine(L031x, L031y, G031x, G031y, paint);
                    canvas.drawLine(G031x, G031y, Gexit2x, Gexit2y, paint);
                    canvas.drawLine(Gexit2x, Gexit2y, Dexit2x, Dexit2y, paint);
                    break;
                case "033":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L033x, L033y, radius, paint);
                    canvas.drawLine(L033x, L033y, G033x, G033y, paint);
                    canvas.drawLine(G033x, G033y, Gexit2x, Gexit2y, paint);
                    canvas.drawLine(Gexit2x, Gexit2y, Dexit2x, Dexit2y, paint);
                    break;
                case "037":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L037x, L037y, radius, paint);
                    canvas.drawLine(L037x, L037y, G037x, G037y, paint);
                    canvas.drawLine(G037x, G037y, Gexit1x, Gexit1y, paint);
                    canvas.drawLine(Gexit1x, Gexit1y, Dexit1x, Dexit1y, paint);
                    break;
                case "043":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L043x, L043y, radius, paint);
                    canvas.drawLine(L043x, L043y, G043x, G043y, paint);
                    canvas.drawLine(G043x, G043y, Gexit1x, Gexit1y, paint);
                    canvas.drawLine(Gexit1x, Gexit1y, Dexit1x, Dexit1y, paint);
                    break;
                case "044":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L044x, L044y, radius, paint);
                    canvas.drawLine(L044x, L044y, G044x, G044y, paint);
                    canvas.drawLine(G044x, G044y, Gexit1x, Gexit1y, paint);
                    canvas.drawLine(Gexit1x, Gexit1y, Dexit1x, Dexit1y, paint);
                    break;
                case "045":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L045x, L045y, radius, paint);
                    canvas.drawLine(L045x, L045y, G045x, G045y, paint);
                    canvas.drawLine(G045x, G045y, Gexit1x, Gexit1y, paint);
                    canvas.drawLine(Gexit1x, Gexit1y, Dexit1x, Dexit1y, paint);
                    break;
                case "046":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.begaandegrond);
                    canvas.drawCircle(L046x, L046y, radius, paint);
                    canvas.drawLine(L046x, L046y, G046x, G046y, paint);
                    canvas.drawLine(G046x, G046y, Gexit1x, Gexit1y, paint);
                    canvas.drawLine(Gexit1x, Gexit1y, Dexit1x, Dexit1y, paint);
                    break;
                case "102":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L101x, L101y, radius, paint);
                    canvas.drawLine(L101x, L101y, G101x, G101y, paint);
                    canvas.drawLine(G101x, G101y, Gtrap5x, Gtrap5y, paint);
                    canvas.drawLine(Gtrap5x, Gtrap5y, Dtrap5x, Dtrap5y, paint);
                case "101":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L101x, L101y, radius, paint);
                    canvas.drawLine(L101x, L101y, G101x, G101y, paint);
                    canvas.drawLine(G101x, G101y, Gtrap5x, Gtrap5y, paint);
                    canvas.drawLine(Gtrap5x, Gtrap5y, Dtrap5x, Dtrap5y, paint);
                    break;
                case "103":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L103x, L103y, radius, paint);
                    canvas.drawLine(L103x, L103y, G103x, G103y, paint);
                    canvas.drawLine(G103x, G103y, Gtrap5x, Gtrap5y, paint);
                    canvas.drawLine(Gtrap5x, Gtrap5y, Dtrap5x, Dtrap5y, paint);
                    break;
                case "104":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L104x, L104y, radius, paint);
                    canvas.drawLine(L104x, L104y, G104x, G104y, paint);
                    canvas.drawLine(G104x, G104y, Gtrap5x, Gtrap5y, paint);
                    canvas.drawLine(Gtrap5x, Gtrap5y, Dtrap5x, Dtrap5y, paint);
                    break;
                case "107":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L107x, L107y, radius, paint);
                    canvas.drawLine(L107x, L107y, G107x, G107y, paint);
                    canvas.drawLine(G107x, G107y, Gtrap4x, Gtrap4y, paint);
                    canvas.drawLine(Gtrap4x, Gtrap4y, Dtrap4x, Dtrap4y, paint);
                    break;
                case "108":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L108x, L108y, radius, paint);
                    canvas.drawLine(L108x, L108y, G108x, G108y, paint);
                    canvas.drawLine(G108x, G108y, Gtrap4x, Gtrap4y, paint);
                    canvas.drawLine(Gtrap4x, Gtrap4y, Dtrap4x, Dtrap4y, paint);
                    break;
                case "109":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L109x, L109y, radius, paint);
                    canvas.drawLine(L109x, L109y, G109x, G109y, paint);
                    canvas.drawLine(G109x, G109y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "110":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L110x, L110y, radius, paint);
                    canvas.drawLine(L110x, L110y, G110x, G110y, paint);
                    canvas.drawLine(G110x, G110y, Gtrap4x, Gtrap4y, paint);
                    canvas.drawLine(Gtrap4x, Gtrap4y, Dtrap4x, Dtrap4y, paint);
                    break;
                case "111":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L111x, L111y, radius, paint);
                    canvas.drawLine(L111x, L111y, G111x, G111y, paint);
                    canvas.drawLine(G111x, G111y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "115":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L115x, L115y, radius, paint);
                    canvas.drawLine(L115x, L115y, G115x, G115y, paint);
                    canvas.drawLine(G115x, G115y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "116":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L116x, L116y, radius, paint);
                    canvas.drawLine(L116x, L116y, G116x, G116y, paint);
                    canvas.drawLine(G116x, G116y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "117":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L117x, L117y, radius, paint);
                    canvas.drawLine(L117x, L117y, G117x, G117y, paint);
                    canvas.drawLine(G117x, G117y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "118":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L118x, L118y, radius, paint);
                    canvas.drawLine(L118x, L118y, G118x, G118y, paint);
                    canvas.drawLine(G118x, G118y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "120":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L120x, L120y, radius, paint);
                    canvas.drawLine(L120x, L120y, G120x, G120y, paint);
                    canvas.drawLine(G120x, G120y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "122":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L122x, L122y, radius, paint);
                    canvas.drawLine(L122x, L122y, G122x, G122y, paint);
                    canvas.drawLine(G122x, G122y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "123":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L123x, L123y, radius, paint);
                    canvas.drawLine(L123x, L123y, G123x, G123y, paint);
                    canvas.drawLine(G123x, G123y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "125":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L125x, L125y, radius, paint);
                    canvas.drawLine(L125x, L125y, G125x, G125y, paint);
                    canvas.drawLine(G125x, G125y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "126":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L126x, L126y, radius, paint);
                    canvas.drawLine(L126x, L126y, G126x, G126y, paint);
                    canvas.drawLine(G126x, G126y, Gtrap3x, Gtrap3y, paint);
                    canvas.drawLine(Gtrap3x, Gtrap3y, Dtrap3x, Dtrap3y, paint);
                    break;
                case "130":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L130x, L130y, radius, paint);
                    canvas.drawLine(L130x, L130y, G130x, G130y, paint);
                    canvas.drawLine(G130x, G130y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "131":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L131x, L131y, radius, paint);
                    canvas.drawLine(L131x, L131y, G131x, G131y, paint);
                    canvas.drawLine(G131x, G131y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "133":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L133x, L133y, radius, paint);
                    canvas.drawLine(L133x, L133y, G133x, G133y, paint);
                    canvas.drawLine(G133x, G133y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "135":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L135x, L135y, radius, paint);
                    canvas.drawLine(L135x, L135y, G135x, G135y, paint);
                    canvas.drawLine(G135x, G135y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "136":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L136x, L136y, radius, paint);
                    canvas.drawLine(L136x, L136y, G136x, G136y, paint);
                    canvas.drawLine(G136x, G136y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "137":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L137x, L137y, radius, paint);
                    canvas.drawLine(L137x, L137y, G137x, G137y, paint);
                    canvas.drawLine(G137x, G137y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "138":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L138x, L138y, radius, paint);
                    canvas.drawLine(L138x, L138y, G138x, G138y, paint);
                    canvas.drawLine(G138x, G138y, Gtrap2x, Gtrap2y, paint);
                    canvas.drawLine(Gtrap2x, Gtrap2y, Dtrap2x, Dtrap2y, paint);
                    break;
                case "139":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L139x, L139y, radius, paint);
                    canvas.drawLine(L139x, L139y, G139x, G139y, paint);
                    canvas.drawLine(G139x, G139y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "141":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L141x, L141y, radius, paint);
                    canvas.drawLine(L141x, L141y, G141x, G141y, paint);
                    canvas.drawLine(G141x, G141y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "143":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L143x, L143y, radius, paint);
                    canvas.drawLine(L143x, L143y, G143x, G143y, paint);
                    canvas.drawLine(G143x, G143y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "144":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L144x, L144y, radius, paint);
                    canvas.drawLine(L144x, L144y, G144x, G144y, paint);
                    canvas.drawLine(G144x, G144y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "145":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L145x, L145y, radius, paint);
                    canvas.drawLine(L145x, L145y, G145x, G145y, paint);
                    canvas.drawLine(G145x, G145y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "150":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L150x, L150y, radius, paint);
                    canvas.drawLine(L150x, L150y, G150x, G150y, paint);
                    canvas.drawLine(G150x, G150y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "152":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L152x, L152y, radius, paint);
                    canvas.drawLine(L152x, L152y, G152x, G152y, paint);
                    canvas.drawLine(G152x, G152y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "156":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.eersteverdieping);
                    canvas.drawCircle(L156x, L156y, radius, paint);
                    canvas.drawLine(L156x, L156y, G156x, G156y, paint);
                    canvas.drawLine(G156x, G156y, Gtrap1x, Gtrap1y, paint);
                    canvas.drawLine(Gtrap1x, Gtrap1y, Dtrap1x, Dtrap1y, paint);
                    break;
                case "252":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L252x, L252y, radius, paint);
                    canvas.drawLine(L252x, L252y, G252x, G252y, paint);
                    canvas.drawLine(G252x, G252y, G2trap1x, G2trap1y, paint);
                    canvas.drawLine(G2trap1x, G2trap1y, D2trap1x, D2trap1y, paint);
                    break;
                case "250":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L250x, L250y, radius, paint);
                    canvas.drawLine(L250x, L250y, G250x, G250y, paint);
                    canvas.drawLine(G250x, G250y, G2trap1x, G2trap1y, paint);
                    canvas.drawLine(G2trap1x, G2trap1y, D2trap1x, D2trap1y, paint);
                    break;
                case "244":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L244x, L244y, radius, paint);
                    canvas.drawLine(L244x, L244y, G244x, G244y, paint);
                    canvas.drawLine(G244x, G244y, G2trap1x, G2trap1y, paint);
                    canvas.drawLine(G2trap1x, G2trap1y, D2trap1x, D2trap1y, paint);
                    break;
                case "242":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L242x, L242y, radius, paint);
                    canvas.drawLine(L242x, L242y, G242x, G242y, paint);
                    canvas.drawLine(G242x, G242y, G2trap2x, G2trap2y, paint);
                    canvas.drawLine(G2trap2x, G2trap2y, D2trap2x, D2trap2y, paint);
                    break;
                case "236":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L236x, L236y, radius, paint);
                    canvas.drawLine(L236x, L236y, G236x, G236y, paint);
                    canvas.drawLine(G236x, G236y, G2trap2x, G2trap2y, paint);
                    canvas.drawLine(G2trap2x, G2trap2y, D2trap2x, D2trap2y, paint);
                    break;
                case "228":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L228x, L228y, radius, paint);
                    canvas.drawLine(L228x, L228y, G228x, G228y, paint);
                    canvas.drawLine(G228x, G228y, G211x, G211y, paint);
                    canvas.drawLine(G211x, G211y, G211x2, G211y2, paint);
                    canvas.drawLine(G211x2, G211y2, G2trap2x, G2trap2y, paint);
                    canvas.drawLine(G2trap2x, G2trap2y, D2trap2x, D2trap2y, paint);
                    break;
                case "227":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L227x, L227y, radius, paint);
                    canvas.drawLine(L227x, L227y, G227x, G227y, paint);
                    canvas.drawLine(G227x, G227y, G2trap1x, G2trap1y, paint);
                    canvas.drawLine(G2trap1x, G2trap1y, D2trap1x, D2trap1y, paint);
                    break;
                case "225":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L225x, L225y, radius, paint);
                    canvas.drawLine(L225x, L225y, G225x, G225y, paint);
                    canvas.drawLine(G225x, G225y, G2trap1x, G2trap1y, paint);
                    canvas.drawLine(G2trap1x, G2trap1y, D2trap1x, D2trap1y, paint);
                    break;
                case "223":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L223x, L223y, radius, paint);
                    canvas.drawLine(L223x, L223y, G223x, G223y, paint);
                    canvas.drawLine(G223x, G223y, G2trap1x, G2trap1y, paint);
                    canvas.drawLine(G2trap1x, G2trap1y, D2trap1x, D2trap1y, paint);
                    break;
                case "218":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L218x, L218y, radius, paint);
                    canvas.drawLine(L218x, L218y, G218x, G218y, paint);
                    canvas.drawLine(G218x, G218y, D2trap3x, D2trap3y, paint);
                    break;
                case "217":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L217x, L217y, radius, paint);
                    canvas.drawLine(L217x, L217y, G217x, G217y, paint);
                    canvas.drawLine(G217x, G217y, G2trap2x, G2trap2y, paint);
                    canvas.drawLine(G2trap2x, G2trap2y, D2trap2x, D2trap2y, paint);
                    break;
                case "215":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L215x, L215y, radius, paint);
                    canvas.drawLine(L215x, L215y, G215x, G215y, paint);
                    canvas.drawLine(G215x, G215y, G2trap2x, G2trap2y, paint);
                    canvas.drawLine(G2trap2x, G2trap2y, D2trap2x, D2trap2y, paint);
                    break;
                case "212":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L212x, L212y, radius, paint);
                    canvas.drawLine(L212x, L212y, G212x, G212y, paint);
                    canvas.drawLine(G212x, G212y, G2trap3x, G2trap3y, paint);
                    canvas.drawLine(G2trap3x, G2trap3y, D2trap3x, D2trap3y, paint);
                    break;
                case "211":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L211x, L211y, radius, paint);
                    canvas.drawLine(L211x, L211y, G211x, G211y, paint);
                    canvas.drawLine(G211x, G211y, G211x2, G211y2, paint);
                    canvas.drawLine(G211x2, G211y2, G2trap2x, G2trap2y, paint);
                    canvas.drawLine(G2trap2x, G2trap2y, D2trap2x, D2trap2y, paint);
                    break;
                case "209":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L209x, L209y, radius, paint);
                    canvas.drawLine(L209x, L209y, G209x, G209y, paint);
                    canvas.drawLine(G209x, G209y, G2trap3x, G2trap3y, paint);
                    canvas.drawLine(G2trap3x, G2trap3y, D2trap3x, D2trap3y, paint);
                    break;
                case "207":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L207x, L207y, radius, paint);
                    canvas.drawLine(L207x, L207y, G2trap3x, G2trap3y, paint);
                    canvas.drawLine(G2trap3x, G2trap3y, D2trap3x, D2trap3y, paint);
                    break;
                case "205":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L205x, L205y, radius, paint);
                    canvas.drawLine(L205x, L205y, G205x, G205y, paint);
                    canvas.drawLine(G205x, G205y, G2trap3x, G2trap3y, paint);
                    canvas.drawLine(G2trap3x, G2trap3y, D2trap3x, D2trap3y, paint);
                    break;
                case "204":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L204x, L204y, radius, paint);
                    canvas.drawLine(L204x, L204y, G204x, G204y, paint);
                    canvas.drawLine(G204x, G204y, G2trap4x, G2trap4y, paint);
                    canvas.drawLine(G2trap4x, G2trap4y, D2trap4x, D2trap4y, paint);
                    break;
                case "202":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L202x, L202y, radius, paint);
                    canvas.drawLine(L202x, L202y, G202x, G202y, paint);
                    canvas.drawLine(G202x, G202y, G2trap4x, G2trap4y, paint);
                    canvas.drawLine(G2trap4x, G2trap4y, D2trap4x, D2trap4y, paint);
                    break;
                case "201":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L201x, L201y, radius, paint);
                    canvas.drawLine(L201x, L201y, G201x, G201y, paint);
                    canvas.drawLine(G201x, G201y, G201x2, G201y2, paint);
                    canvas.drawLine(G201x2, G201y2, G2trap4x, G2trap4y, paint);
                    canvas.drawLine(G2trap4x, G2trap4y, D2trap4x, D2trap4y, paint);
                    break;
                case "200":
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    drawingImageView.setBackgroundResource(R.drawable.tweedeverdieping);
                    canvas.drawCircle(L200x, L200y, radius, paint);
                    canvas.drawLine(L200x, L200y, G200x, G200y, paint);
                    canvas.drawLine(G200x, G200y, G2trap4x, G2trap4y, paint);
                    canvas.drawLine(G2trap4x, G2trap4y, D2trap4x, D2trap4y, paint);
                    break;
                }
            }
        });
    }
}
