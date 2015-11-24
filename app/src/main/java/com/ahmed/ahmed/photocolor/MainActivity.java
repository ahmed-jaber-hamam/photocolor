package com.ahmed.ahmed.photocolor;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends Activity implements View.OnClickListener ,AdapterView.OnItemClickListener  {

    ImageButton camera ,sdcard;
     Uri picUri;
   Bitmap imag;
    Uri selectedImageUri;
    String st;
    ImageView imageView;
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> list=new ArrayList<>() ;
    image_processing image_processing =new image_processing();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView adView =(AdView)this.findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        camera =(ImageButton)findViewById(R.id.imageButton2);
        sdcard =(ImageButton)findViewById(R.id.imageButton);
        camera.setOnClickListener(this);
        sdcard.setOnClickListener(this);
        imageView=(ImageView)findViewById(R.id.imageView);
        listView=(ListView)findViewById(R.id.listView);
        textView=(TextView)findViewById(R.id.textView);











    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageButton2){

            try {
                // use standard intent to capture an image
                Intent captureIntent = new Intent(
                        MediaStore.ACTION_IMAGE_CAPTURE);
                // we will handle the returned data in onActivityResult
                startActivityForResult(captureIntent, 1);
            } catch (ActivityNotFoundException anfe) {
                // display an error message
                String errorMessage = "Whoops - your device doesn't support capturing images!";
                Toast toast = Toast.makeText( MainActivity.this,errorMessage,Toast.LENGTH_SHORT);
                toast.show();
            }
        }

        else if (v.getId()==R.id.imageButton){


            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);

            startActivityForResult(Intent.createChooser(intent,"Select Picture"), 2);


        }

    }

    protected void onActivityResult( int requestCode,int resultCode, Intent data) {

        if (resultCode == Activity.RESULT_OK) {

            if (requestCode == 1) {

                // get the Uri for the captured image
                picUri = data.getData();
                // carry out the crop operation
                performCrop();
            }
            else if (requestCode == 2) {
                //Toast.makeText(getApplicationContext(), "req", Toast.LENGTH_SHORT).show();

                selectedImageUri = data.getData();
                 st = selectedImageUri.toString();
             // String s=  selectedImageUri.getEncodedPath();
               //Toast t =Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG);
                //        t.show

                try {
                    imag = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImageUri);

                    action();



/*
                    Intent i =new Intent(MainActivity.this,SecondActivity.class);
                    i.putExtra("image",st);

                    startActivity(i);
                  //  picView.setImageBitmap(imag);

*/
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();

                    e.printStackTrace();
                }


            }

            else if (requestCode == 3) {
                // get the returned data
                Bundle extras = data.getExtras();

                // get the cropped bitmap
                imag = extras.getParcelable("data");

                action();
               // String s = extras.toString();
            /*    String root = Environment.getExternalStorageDirectory().toString();
                File myDir = new File(root + "/saved_images");
                myDir.mkdirs();

                String fname = "Ahmed.jpg";
                File file = new File(myDir, fname);
                if (file.exists ()) file.delete ();
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(Bitmap.CompressFormat.JPEG, 90, out);
                    out.flush();
                    out.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }


                String s = "file://"+root+"/saved_images/Ahmed";


                Intent i =new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("image",s);
                startActivity(i);
                */
            }
        }






    }

    private void performCrop() {
        // take care of exceptions
        try {
            // call the standard crop action intent (the user device may not
            // support it)
            Intent cropIntent = new Intent("com.android.camera.action.CROP");
            // indicate image type and Uri
            cropIntent.setDataAndType(picUri, "image/*");
            // set crop properties
            cropIntent.putExtra("crop", "true");
            // indicate aspect of desired crop
            cropIntent.putExtra("scale", true);
            // cropIntent.putExtra("aspectY", 1);
            // indicate output X and Y
            cropIntent.putExtra("circleCrop", true);
            // cropIntent.putExtra("outputY", 400);
            // retrieve data on return
            cropIntent.putExtra("return-data", true);

            // start the activity - we handle returning in onActivityResult
            startActivityForResult(cropIntent, 3);
        }
        // respond to users whose devices do not support the crop action
        catch (ActivityNotFoundException anfe) {
            // display an error message
            String errorMessage = "Whoops - your device doesn't support the crop action!";
            Toast toast = Toast
                    .makeText(MainActivity.this, errorMessage, Toast.LENGTH_SHORT);
            toast.show();
        }
    }



    public void action(){

        textView.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
        listView.setVisibility(View.VISIBLE);
        camera.setVisibility(View.INVISIBLE);
        sdcard.setVisibility(View.INVISIBLE);
        imageView.setImageBitmap(imag);
        image_processing.setimg(imag);
        image_processing.processing();

        // Toast.makeText(this, image_processing.getarrayList().size()+""+image_processing.getarrayListe().size(),Toast.LENGTH_LONG).show();

        CustomListAdapter adapter=new CustomListAdapter(this, image_processing.getarrayList(), image_processing.getarrayListe());

        // adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,image_processing.getarrayList());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);





    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // int in = position;
       // image_processing.setimg(imag);
      //  image_processing.dialog_processing(position);
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Color & Code ");
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0xCC484848));

        dialog.setContentView(R.layout.dialog);
        ImageView image = (ImageView) dialog.findViewById(R.id.imagedialog);
        TextView textView =(TextView)dialog.findViewById(R.id.textView2);
        TextView textView1 =(TextView)dialog.findViewById(R.id.textView3);
       // image.setImageBitmap(image_processing.getimage());
        textView.setText("color="+image_processing.getarrayList().get(position));
        String sa = Integer.toHexString(image_processing.getarrayListe().get(position));
        textView1.setText("code="+sa);
        image.setBackgroundColor(image_processing.getarrayListe().get(position));
        dialog.show();




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                actins();
                break;


        }
        return false;
    }

    public void actins(){

        if (camera.getVisibility()==View.VISIBLE & sdcard.getVisibility()==View.VISIBLE){

            camera.setVisibility(View.INVISIBLE);
            sdcard.setVisibility(View.INVISIBLE);
        }
        else {

            camera.setVisibility(View.VISIBLE);
            sdcard.setVisibility(View.VISIBLE);

        }


    }


}
