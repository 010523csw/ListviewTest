package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<LiaoTianKuang> list = new ArrayList<LiaoTianKuang>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        initData();
        MyAdapter myAdapter = new MyAdapter(this,R.layout.activity_listview_iitem,list);
        listView.setAdapter(myAdapter);
    }

    private void initData() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <20 ; j++) {
                LiaoTianKuang liaoTianKuang = new LiaoTianKuang(R.drawable.img_8,"旺哥","今天中午吃啥子诶");
                list.add(liaoTianKuang);
                LiaoTianKuang liaoTianKuang1 = new LiaoTianKuang(R.drawable.img_9,"浩伟儿","快点来火力赛哦");
                list.add(liaoTianKuang1);
                LiaoTianKuang liaoTianKuang2 = new LiaoTianKuang(R.drawable.img_10,"大师","阿弥陀佛");
                list.add(liaoTianKuang2);
                LiaoTianKuang liaoTianKuang3 = new LiaoTianKuang(R.drawable.img_11,"；小阳阳","宝，今天也是想你的一天");
                list.add(liaoTianKuang3);
                LiaoTianKuang liaoTianKuang4 = new LiaoTianKuang(R.drawable.img_12,"奥奥酱","洛菲罗非罗非鱼");
                list.add(liaoTianKuang4);
                LiaoTianKuang liaoTianKuang5 = new LiaoTianKuang(R.drawable.img_13,"龙少","旺哥我知道错了");
                list.add(liaoTianKuang5);
                LiaoTianKuang liaoTianKuang6 = new LiaoTianKuang(R.drawable.img_14,"胖哥","陈善旺你真帅啊");
                list.add(liaoTianKuang6);
                LiaoTianKuang liaoTianKuang7 = new LiaoTianKuang(R.drawable.img_15,"小胖","明天晚上出去玩");
                list.add(liaoTianKuang7);
                LiaoTianKuang liaoTianKuang8 = new LiaoTianKuang(R.drawable.img_16,"旺哥来也","快点来学习");
                list.add(liaoTianKuang8);
                LiaoTianKuang liaoTianKuang9 = new LiaoTianKuang(R.drawable.img_17,"尖刀特种大队队长","大哥，兄弟们都想你了，快点回来吧");
                list.add(liaoTianKuang9);
                LiaoTianKuang liaoTianKuang10 = new LiaoTianKuang(R.drawable.img_18,"施瓦辛格","小伙子，练得不错昂");
                list.add(liaoTianKuang10);
                LiaoTianKuang liaoTianKuang11 = new LiaoTianKuang(R.drawable.img_19,"祖师爷","小伙子，以后当我徒弟吧");
                list.add(liaoTianKuang11);
            }
        }
    }
}