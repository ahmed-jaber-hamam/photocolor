package com.ahmed.ahmed.photocolor;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by root on 15/07/15.
 */
public class image_processing {


protected Bitmap bitmap=null;
private Bitmap    thePic=null,be=null;
private     int[] Array;
    private String Arrays;

   private ArrayList<String> list =new ArrayList<>();
    private ArrayList<Integer> liste = new ArrayList<>();


    public void setimg(Bitmap b){
         thePic=b;


    }

    public ArrayList<Integer> getarrayListe(){

        return liste;


    }

    public ArrayList<String> getarrayList(){

        return list;


    }
    public String getArrays(){

        return Arrays;
    }

    public Bitmap getimage(){

        return be;
    }

    protected void processing(){


        list.clear();
        liste.clear();
        //if (requestCode == 2) {thePic = imag.copy(Bitmap.Config.ARGB_8888, true);}
        //else {
       bitmap = thePic.copy(Bitmap.Config.ARGB_8888, true);

        Array = new int[bitmap.getWidth()*bitmap.getHeight()];
        int cont =bitmap.getWidth()*bitmap.getHeight();

        bitmap.getPixels(Array, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());


        for(int i=0;i<cont;i++){
            String Hex=Integer.toHexString(Array[i]);
            if(Hex.equals("ffff0000")){list.add("red");}
            else	if(Hex.equals("ffffffff")){list.add("white");}
            else	if(Hex.equals("ff000000")){list.add("black");}
            else	if(Hex.equals("ff00ff00")){list.add("lime");}
            else	if(Hex.equals("ff0000ff")){list.add("blue");}
            else	if(Hex.equals("ff000080")){list.add("Navy");}
            else	if(Hex.equals("ff808080")){list.add("Gray");}
            else	if(Hex.equals("ffc0c0c0")){list.add("Silver");}
            else	if(Hex.equals("ffff00ff")){list.add("magenta / fuchsia");}
            else	if(Hex.equals("ff808000")){list.add("Olive");}
            else	if(Hex.equals("ff8b0000")){list.add("dark red");}
            else	if(Hex.equals("ffa52a2a")){list.add("brown");}
            else	if(Hex.equals("ffb22222")){list.add("firebrick");}
            else	if(Hex.equals("ffdc143c")){list.add("crimson");}
            else	if(Hex.equals("ffff6347")){list.add("tomato");}
            else	if(Hex.equals("ffff7f50")){list.add("coral");}
            else	if(Hex.equals("ffff08080")){list.add("light coral");}
            else	if(Hex.equals("ffe9967a")){list.add("dark salmon");}
            else	if(Hex.equals("fffa8072")){list.add("salmon");}
            else	if(Hex.equals("ffffa07a")){list.add("light salmon");}
            else	if(Hex.equals("ffff4500")){list.add("orange red");}
            else	if(Hex.equals("ffff8c00")){list.add("dark orange");}
            else	if(Hex.equals("ffffd700")){list.add("gold");}
            else	if(Hex.equals("ffb8860b")){list.add("dark golden rod");}
            else	if(Hex.equals("ffdaa520")){list.add("golden rod");}
            else	if(Hex.equals("ffeee8aa")){list.add("pale golden rod");}
            else	if(Hex.equals("ffbdb76b")){list.add("dark khaki");}
            else	if(Hex.equals("fff0e68c")){list.add("khaki");}
            else	if(Hex.equals("ff9acd32")){list.add("yellow green");}
            else	if(Hex.equals("ff556b2f")){list.add("dark olive green");}
            else	if(Hex.equals("ff6b8e23")){list.add("olive drab");}
            else	if(Hex.equals("ff7cfc00")){list.add("lawn green");}
            else	if(Hex.equals("ff7fff00")){list.add("chart reuse");}
            else	if(Hex.equals("ffadff2f")){list.add("green yellow");}
            else	if(Hex.equals("ff006400")){list.add("dark green");}
            else	if(Hex.equals("ff228b22")){list.add("forest green");}
            else	if(Hex.equals("ff32cd32")){list.add("lime green");}
            else	if(Hex.equals("ff90ee90")){list.add("light green");}
            else	if(Hex.equals("ff98fb98")){list.add("pale green");}
            else	if(Hex.equals("ff8fbc8f")){list.add("dark sea green");}
            else	if(Hex.equals("ff00fa9a")){list.add("medium spring green");}
            else	if(Hex.equals("ff00ff7f")){list.add("spring green");}
            else	if(Hex.equals("ff2e8b57")){list.add("sea green");}
            else	if(Hex.equals("ff66cdaa")){list.add("medium aqua marine");}
            else	if(Hex.equals("ff3cb371")){list.add("medium sea green");}
            else	if(Hex.equals("ff20b2aa")){list.add("light sea green");}
            else	if(Hex.equals("ff2f4f4f")){list.add("dark slate gray");}
            else	if(Hex.equals("ff008080")){list.add("teal");}
            else	if(Hex.equals("ff008b8b")){list.add("dark cyan");}
            else	if(Hex.equals("ffe0ffff")){list.add("light cyan");}
            else	if(Hex.equals("ff00ced1")){list.add("dark turquoise");}
            else	if(Hex.equals("ff40ed0")){list.add("turquoise");}
            else	if(Hex.equals("ff48d1cc")){list.add("medium turquoise");}
            else	if(Hex.equals("ffAfeeee")){list.add("pale turquoise");}
            else	if(Hex.equals("ff7fffd4")){list.add("aqua marine");}
            else	if(Hex.equals("ffb0e0e6")){list.add("powder blue");}
            else	if(Hex.equals("ff5f9ea0")){list.add("cadet blue");}
            else	if(Hex.equals("ff4682b4")){list.add("steel blue");}
            else	if(Hex.equals("ff6495ed")){list.add("corn flower blue");}
            else	if(Hex.equals("ff00bfff")){list.add("deep sky blue");}
            else	if(Hex.equals("ff1e90ff")){list.add("dodger blue");}
            else	if(Hex.equals("ffadd8e6")){list.add("light blue");}
            else	if(Hex.equals("ff87ceeb")){list.add("sky blue");}
            else	if(Hex.equals("ff87cefa")){list.add("light sky blue");}
            else	if(Hex.equals("ff191970")){list.add("midnight blue");}
            else	if(Hex.equals("ff00008b")){list.add("dark blue");}
            else	if(Hex.equals("ff0000cd")){list.add("medium blue");}
            else	if(Hex.equals("ff4169e1")){list.add("royal blue");}
            else	if(Hex.equals("ff8a2be2")){list.add("blue violet");}
            else	if(Hex.equals("ff4b0082")){list.add("indigo");}
            else	if(Hex.equals("ff483d8b")){list.add("dark slate blue");}
            else	if(Hex.equals("ff6a5acd")){list.add("slate blue");}
            else	if(Hex.equals("ff7b68ee")){list.add("medium slate blue");}
            else	if(Hex.equals("ff9370db")){list.add("medium purple");}
            else	if(Hex.equals("ff8b008b")){list.add("dark magenta");}
            else	if(Hex.equals("ff9400d3")){list.add("dark violet");}
            else	if(Hex.equals("ff9932cc")){list.add("dark orchid");}
            else	if(Hex.equals("ffba55d3")){list.add("medium orchid");}
            else	if(Hex.equals("ff800080")){list.add("purple");}
            else	if(Hex.equals("ffd8bfd8")){list.add("thistle");}
            else	if(Hex.equals("ffdda0dd")){list.add("plum");}
            else	if(Hex.equals("ffee82ee")){list.add("violet");}
            else	if(Hex.equals("ffda70d6")){list.add("orchid");}
            else	if(Hex.equals("ffc71585")){list.add("medium violet red");}
            else	if(Hex.equals("ffdb7093")){list.add("pale violet red");}
            else	if(Hex.equals("ffff1493")){list.add("deep pink");}
            else	if(Hex.equals("ffff69b4")){list.add("hot pink");}
            else	if(Hex.equals("ffffb6c1")){list.add("light pink");}
            else	if(Hex.equals("ffffc0cb")){list.add("pink");}
            else	if(Hex.equals("fffaebd7")){list.add("antique white");}
            else	if(Hex.equals("fff5f5dc")){list.add("beige");}
            else	if(Hex.equals("ffffe4c4")){list.add("bisque");}
            else	if(Hex.equals("ffffebcd")){list.add("blanched almond");}
            else	if(Hex.equals("fff5deb3")){list.add("wheat");}
            else	if(Hex.equals("fffff8DC")){list.add("corn silk");}
            else	if(Hex.equals("fffffacd")){list.add("lemon chiffon");}
            else	if(Hex.equals("fffafad2")){list.add("light golden rod yellow");}
            else	if(Hex.equals("ffffffe0")){list.add("light yellow");}
            else	if(Hex.equals("ff8b4513")){list.add("saddle brown");}
            else	if(Hex.equals("ffa0522d")){list.add("sienna");}
            else	if(Hex.equals("ffd2691e")){list.add("chocolate");}
            else	if(Hex.equals("ffcd853f")){list.add("peru");}
            else	if(Hex.equals("fff4a460")){list.add("sandy brown");}
            else	if(Hex.equals("ffdeb887")){list.add("burly wood");}
            else	if(Hex.equals("ffd2b48c")){list.add("tan");}
            else	if(Hex.equals("ffbc8f8f")){list.add("rosy brown");}
            else	if(Hex.equals("ffffe4b5")){list.add("moccasin");}
            else	if(Hex.equals("ffffdead")){list.add("navajo white");}
            else	if(Hex.equals("ffffdab9")){list.add("peach puff");}
            else	if(Hex.equals("ffffe4e1")){list.add("misty rose");}
            else	if(Hex.equals("fffff0f5")){list.add("lavender blush");}
            else	if(Hex.equals("fffaf0e6")){list.add("linen");}
            else	if(Hex.equals("fffdf5e6")){list.add("old lace");}
            else	if(Hex.equals("ffffefd5")){list.add("papaya whip");}
            else	if(Hex.equals("fffff5ee")){list.add("sea shell");}
            else	if(Hex.equals("fff5fffa")){list.add("mint cream");}
            else	if(Hex.equals("ff708090")){list.add("slate gray");}
            else	if(Hex.equals("ff778899")){list.add("light slate gray");}
            else	if(Hex.equals("ffb0c4de")){list.add("light steel blue");}
            else	if(Hex.equals("ffe6e6fa")){list.add("lavender");}
            else	if(Hex.equals("fffffaf0")){list.add("floral white");}
            else	if(Hex.equals("fff0f8ff")){list.add("alice blue");}
            else	if(Hex.equals("fff8f8ff")){list.add("ghost white");}
            else	if(Hex.equals("fff0fff0")){list.add("honeydew");}
            else	if(Hex.equals("fffffff0")){list.add("ivory");}
            else	if(Hex.equals("fff0ffff")){list.add("azure");}
            else	if(Hex.equals("fffffafa")){list.add("snow");}
            else	if(Hex.equals("ff696969")){list.add("dim gray");}
            else	if(Hex.equals("ffa9a9a9")){list.add("dark gray");}
            else	if(Hex.equals("ffd3d3d3")){list.add("light gray");}
            else	if(Hex.equals("ffdcdcdc")){list.add("gainsboro");}
            else	if(Hex.equals("fff5f5f5")){list.add("white smoke");}

        }
        HashSet<String> hs = new HashSet<>();

        hs.addAll(list);

        list.clear();

        list.addAll(hs);


        for (int i=0;i<list.size();i++){


          if(list.get(i).equals("red")){liste.add(0xffff0000);}
          else	if(list.get(i).equals("white")){liste.add(0xffffffff);}
          else	if(list.get(i).equals("black")){liste.add(0xff000000);}
          else	if(list.get(i).equals("lime")){liste.add(0xff00ff00);}
          else	if(list.get(i).equals("blue")){liste.add(0xff0000ff);}
          else	if(list.get(i).equals("Navy")){liste.add(0xff000080);}
          else	if(list.get(i).equals("Gray")){liste.add(0xff808080);}
          else	if(list.get(i).equals("Silver")){liste.add(0xffc0c0c0);}
          else	if(list.get(i).equals("magenta / fuchsia")){liste.add(0xffff00ff);}
          else	if(list.get(i).equals("Olive")){liste.add(0xff808000);}
          else	if(list.get(i).equals("dark red")){liste.add(0xff8b0000);}
          else	if(list.get(i).equals("brown")){liste.add(0xffa52a2a);}
          else	if(list.get(i).equals("firebrick")){liste.add(0xffb22222);}
          else	if(list.get(i).equals("crimson")){liste.add(0xffdc143c);}
          else	if(list.get(i).equals("tomato")){liste.add(0xffff6347);}
          else	if(list.get(i).equals("coral")){liste.add(0xffff7f50);}
          else	if(list.get(i).equals("light coral")){liste.add(0xfff08080);}
          else	if(list.get(i).equals("dark salmon")){liste.add(0xffe9967a);}
          else	if(list.get(i).equals("salmon")){liste.add(0xfffa8072);}
          else	if(list.get(i).equals("light salmon")){liste.add(0xffffa07a);}
          else	if(list.get(i).equals("orange red")){liste.add(0xffff4500);}
          else	if(list.get(i).equals("dark orange")){liste.add(0xffff8c00);}
          else	if(list.get(i).equals("gold")){liste.add(0xffffd700);}
          else	if(list.get(i).equals("dark golden rod")){liste.add(0xffb8860b);}
          else	if(list.get(i).equals("golden rod")){liste.add(0xffdaa520);}
          else	if(list.get(i).equals("pale golden rod")){liste.add(0xffeee8aa);}
          else	if(list.get(i).equals("dark khaki")){liste.add(0xffbdb76b);}
          else	if(list.get(i).equals("khaki")){liste.add(0xfff0e68c);}
          else	if(list.get(i).equals("yellow green")){liste.add(0xff9acd32);}
          else	if(list.get(i).equals("dark olive green")){liste.add(0xff556b2f);}
          else	if(list.get(i).equals("olive drab")){liste.add(0xff6b8e23);}
          else	if(list.get(i).equals("lawn green")){liste.add(0xff7cfc00);}
          else	if(list.get(i).equals("chart reuse")){liste.add(0xff7fff00);}
          else	if(list.get(i).equals("green yellow")){liste.add(0xffadff2f);}
          else	if(list.get(i).equals("dark green")){liste.add(0xff006400);}
          else	if(list.get(i).equals("forest green")){liste.add(0xff228b22);}
          else	if(list.get(i).equals("lime green")){liste.add(0xff32cd32);}
          else	if(list.get(i).equals("light green")){liste.add(0xff90ee90);}
          else	if(list.get(i).equals("pale green")){liste.add(0xff98fb98);}
          else	if(list.get(i).equals("dark sea green")){liste.add(0xff8fbc8f);}
          else	if(list.get(i).equals("medium spring green")){liste.add(0xff00fa9a);}
          else	if(list.get(i).equals("spring green")){liste.add(0xff00ff7f);}
          else	if(list.get(i).equals("sea green")){liste.add(0xff2e8b57);}
          else	if(list.get(i).equals("medium aqua marine")){liste.add(0xff66cdaa);}
          else	if(list.get(i).equals("medium sea green")){liste.add(0xff3cb371);}
          else	if(list.get(i).equals("light sea green")){liste.add(0xff20b2aa);}
          else	if(list.get(i).equals("dark slate gray")){liste.add(0xff2f4f4f);}
          else	if(list.get(i).equals("teal")){liste.add(0xff008080);}
          else	if(list.get(i).equals("dark cyan")){liste.add(0xff008b8b);}
          else	if(list.get(i).equals("light cyan")){liste.add(0xffe0ffff);}
          else	if(list.get(i).equals("dark turquoise")){liste.add(0xff00ced1);}
          else	if(list.get(i).equals("turquoise")){liste.add(0xff40ed0);}
          else	if(list.get(i).equals("medium turquoise")){liste.add(0xff48d1cc);}
          else	if(list.get(i).equals("pale turquoise")){liste.add(0xffAfeeee);}
          else	if(list.get(i).equals("aqua marine")){liste.add(0xff7fffd4);}
          else	if(list.get(i).equals("powder blue")){liste.add(0xffb0e0e6);}
          else	if(list.get(i).equals("cadet blue")){liste.add(0xff5f9ea0);}
          else	if(list.get(i).equals("steel blue")){liste.add(0xff4682b4);}
          else	if(list.get(i).equals("corn flower blue")){liste.add(0xff6495ed);}
          else	if(list.get(i).equals("deep sky blue")){liste.add(0xff00bfff);}
          else	if(list.get(i).equals("dodger blue")){liste.add(0xff1e90ff);}
          else	if(list.get(i).equals("light blue")){liste.add(0xffadd8e6);}
          else	if(list.get(i).equals("sky blue")){liste.add(0xff87ceeb);}
          else	if(list.get(i).equals("light sky blue")){liste.add(0xff87cefa);}
          else	if(list.get(i).equals("midnight blue")){liste.add(0xff191970);}
          else	if(list.get(i).equals("dark blue")){liste.add(0xff00008b);}
          else	if(list.get(i).equals("medium blue")){liste.add(0xff0000cd);}
          else	if(list.get(i).equals("royal blue")){liste.add(0xff4169e1);}
          else	if(list.get(i).equals("blue violet")){liste.add(0xff8a2be2);}
          else	if(list.get(i).equals("indigo")){liste.add(0xff4b0082);}
          else	if(list.get(i).equals("dark slate blue")){liste.add(0xff483d8b);}
          else	if(list.get(i).equals("slate blue")){liste.add(0xff6a5acd);}
          else	if(list.get(i).equals("medium slate blue")){liste.add(0xff7b68ee);}
          else	if(list.get(i).equals("medium purple")){liste.add(0xff9370db);}
          else	if(list.get(i).equals("dark magenta")){liste.add(0xff8b008b);}
          else	if(list.get(i).equals("dark violet")){liste.add(0xff9400d3);}
          else	if(list.get(i).equals("dark orchid")){liste.add(0xff9932cc);}
          else	if(list.get(i).equals("medium orchid")){liste.add(0xffba55d3);}
          else	if(list.get(i).equals("purple")){liste.add(0xff800080);}
          else	if(list.get(i).equals("thistle")){liste.add(0xffd8bfd8);}
          else	if(list.get(i).equals("plum")){liste.add(0xffdda0dd);}
          else	if(list.get(i).equals("violet")){liste.add(0xffee82ee);}
          else	if(list.get(i).equals("orchid")){liste.add(0xffda70d6);}
          else	if(list.get(i).equals("medium violet red")){liste.add(0xffc71585);}
          else	if(list.get(i).equals("pale violet red")){liste.add(0xffdb7093);}
          else	if(list.get(i).equals("deep pink")){liste.add(0xffff1493);}
          else	if(list.get(i).equals("hot pink")){liste.add(0xffff69b4);}
          else	if(list.get(i).equals("light pink")){liste.add(0xffffb6c1);}
          else	if(list.get(i).equals("pink")){liste.add(0xffffc0cb);}
          else	if(list.get(i).equals("antique white")){liste.add(0xfffaebd7);}
          else	if(list.get(i).equals("beige")){liste.add(0xfff5f5dc);}
          else	if(list.get(i).equals("bisque")){liste.add(0xffffe4c4);}
          else	if(list.get(i).equals("blanched almond")){liste.add(0xffffebcd);}
          else	if(list.get(i).equals("wheat")){liste.add(0xfff5deb3);}
          else	if(list.get(i).equals("corn silk")){liste.add(0xfffff8DC);}
          else	if(list.get(i).equals("lemon chiffon")){liste.add(0xfffffacd);}
          else	if(list.get(i).equals("light golden rod yellow")){liste.add(0xfffafad2);}
          else	if(list.get(i).equals("light yellow")){liste.add(0xffffffe0);}
          else	if(list.get(i).equals("saddle brown")){liste.add(0xff8b4513);}
          else	if(list.get(i).equals("sienna")){liste.add(0xffa0522d);}
          else	if(list.get(i).equals("chocolate")){liste.add(0xffd2691e);}
          else	if(list.get(i).equals("peru")){liste.add(0xffcd853f);}
          else	if(list.get(i).equals("sandy brown")){liste.add(0xfff4a460);}
          else	if(list.get(i).equals("burly wood")){liste.add(0xffdeb887);}
          else	if(list.get(i).equals("tan")){liste.add(0xffd2b48c);}
          else	if(list.get(i).equals("rosy brown")){liste.add(0xffbc8f8f);}
          else	if(list.get(i).equals("moccasin")){liste.add(0xffffe4b5);}
          else	if(list.get(i).equals("navajo white")){liste.add(0xffffdead);}
          else	if(list.get(i).equals("peach puff")){liste.add(0xffffdab9);}
          else	if(list.get(i).equals("misty rose")){liste.add(0xffffe4e1);}
          else	if(list.get(i).equals("lavender blush")){liste.add(0xfffff0f5);}
          else	if(list.get(i).equals("linen")){liste.add(0xfffaf0e6);}
          else	if(list.get(i).equals("old lace")){liste.add(0xfffdf5e6);}
          else	if(list.get(i).equals("papaya whip")){liste.add(0xffffefd5);}
          else	if(list.get(i).equals("sea shell")){liste.add(0xfffff5ee);}
          else	if(list.get(i).equals("mint cream")){liste.add(0xfff5fffa);}
          else	if(list.get(i).equals("slate gray")){liste.add(0xff708090);}
          else	if(list.get(i).equals("light slate gray")){liste.add(0xff778899);}
          else	if(list.get(i).equals("light steel blue")){liste.add(0xffb0c4de);}
          else	if(list.get(i).equals("lavender")){liste.add(0xffe6e6fa);}
          else	if(list.get(i).equals("floral white")){liste.add(0xfffffaf0);}
          else	if(list.get(i).equals("alice blue")){liste.add(0xfff0f8ff);}
          else	if(list.get(i).equals("ghost white")){liste.add(0xfff8f8ff);}
          else	if(list.get(i).equals("honeydew")){liste.add(0xfff0fff0);}
          else	if(list.get(i).equals("ivory")){liste.add(0xfffffff0);}
          else	if(list.get(i).equals("azure")){liste.add(0xfff0ffff);}
          else	if(list.get(i).equals("snow")){liste.add(0xfffffafa);}
          else	if(list.get(i).equals("dim gray")){liste.add(0xff696969);}
          else	if(list.get(i).equals("dark gray")){liste.add(0xffa9a9a9);}
          else	if(list.get(i).equals("light gray")){liste.add(0xffd3d3d3);}
          else	if(list.get(i).equals("gainsboro")){liste.add(0xffdcdcdc);}
          else	if(list.get(i).equals("white smoke")){liste.add(0xfff5f5f5);}




        }








    }

    protected void dialog_processing(int in){

        String st = Integer.toHexString(liste.get(in));

        bitmap = thePic.copy(Bitmap.Config.ARGB_8888, true);

        Array = new int[bitmap.getWidth()*bitmap.getHeight()];
        int cont =bitmap.getWidth()*bitmap.getHeight();

        bitmap.getPixels(Array, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());

        for(int i=0;i<cont;i++){

            String string = Integer.toHexString(Array[i]);


            if(!string.equals(st)){

                int av=  ( ((Array[i]>> 16) & 0xFF) + ((Array[i]>> 8) & 0xFF) + (Array[i] & 0xFF))/3;
               /* int Red = (Array[i]>>16) & 0xFF;
                int Green = (Array[i]>> 8) & 0xFF;
                int Blue = Array[i] & 0xFF;
*/

                Array[i]= Color.argb(10, av, av, av);


            }
            else {


                int Red = (Array[i]>>16) & 0xFF;
                int Green = (Array[i]>> 8) & 0xFF;
                int Blue = Array[i] & 0xFF;


                Array[i]= Color.argb(255, Red, Green, Blue);
            }






        }

        be=Bitmap.createBitmap(bitmap.getWidth(),bitmap.getHeight(),Bitmap.Config.ARGB_8888);
        be.setPixels(Array, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());




    }
}
