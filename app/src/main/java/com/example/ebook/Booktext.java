package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;

public class Booktext extends AppCompatActivity {
PDFView pdfView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booktext);

        pdfView = (PDFView) findViewById(R.id.bv) ;

        pdfView.fromAsset("book1.pdf").password(null).defaultPage(0).enableSwipe(true).swipeHorizontal(false).enableDoubletap(true)
                .onDraw(new OnDrawListener() {
                    @Override
                    public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

                    }
                }).onError(new OnErrorListener() {
            @Override
            public void onError(Throwable t) {

            }
        }).onPageChange(new OnPageChangeListener() {
            @Override
            public void onPageChanged(int page, int pageCount) {

            }
        }).enableAnnotationRendering(true).load();

    }
}


