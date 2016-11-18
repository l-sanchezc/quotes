package edu.iit.lazaro.quotes;
import java.util.ArrayList;
/**
 * Created by Lazaro on 2/16/16.
 */
public class DataSource {
    private ArrayList<Integer> mPhotoPool;
    private ArrayList<Integer> mQuotePool;
    private ArrayList<Integer> mPhotoHdPool;

    public ArrayList<Integer> getmPhotoHdPool() {
        return mPhotoHdPool;
    }

    public ArrayList<Integer> getmPhotoPool() {
        return mPhotoPool;
    }

    public ArrayList<Integer> getmQuotePool() {
        return mQuotePool;
    }

    public int getDataSourceLength() {
        return mPhotoPool.size();
    }

    public DataSource() {
        mPhotoPool = new ArrayList();
        mQuotePool = new ArrayList();
        mPhotoHdPool = new ArrayList();
        setupPhotoPool();
        setupQuotePool();
        setupPhotoHDPool();
    }

    private void setupPhotoPool() {
        mPhotoPool.add(R.drawable.steve_1);
        mPhotoPool.add(R.drawable.steve_2);
        mPhotoPool.add(R.drawable.steve_3);
        mPhotoPool.add(R.drawable.steve_4);
        mPhotoPool.add(R.drawable.albert);
        mPhotoPool.add(R.drawable.confucius);
        mPhotoPool.add(R.drawable.martin);
        mPhotoPool.add(R.drawable.oscar);
        mPhotoPool.add(R.drawable.salvador);
        mPhotoPool.add(R.drawable.thomas);
    }

    private void setupQuotePool() {
        mQuotePool.add(R.string.quote_1);
        mQuotePool.add(R.string.quote_2);
        mQuotePool.add(R.string.quote_3);
        mQuotePool.add(R.string.quote_4);
        mQuotePool.add(R.string.quote_5);
        mQuotePool.add(R.string.quote_6);
        mQuotePool.add(R.string.quote_7);
        mQuotePool.add(R.string.quote_8);
        mQuotePool.add(R.string.quote_9);
        mQuotePool.add(R.string.quote_10);
    }

    private void setupPhotoHDPool() {
        mPhotoHdPool.add(R.drawable.steve_hd_1);
        mPhotoHdPool.add(R.drawable.steve_hd_2);
        mPhotoHdPool.add(R.drawable.steve_hd_3);
        mPhotoHdPool.add(R.drawable.steve_hd_4);
        mPhotoHdPool.add(R.drawable.albert_hd);
        mPhotoHdPool.add(R.drawable.confucius_hd);
        mPhotoHdPool.add(R.drawable.martin_hd);
        mPhotoHdPool.add(R.drawable.oscar_hd);
        mPhotoHdPool.add(R.drawable.salvador_hd);
        mPhotoHdPool.add(R.drawable.thomas_hd);
    }
}
