package com.anselmo.matrixdemo.screens;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.anselmo.matrixdemo.R;
import com.anselmo.matrixdemo.utils.PathMatrix;
import com.anselmo.matrixdemo.utils.Utils;


/**
 * Created by chemo on 10/4/17.
 */

public class MatrixActivity extends BaseActivity {
    private TextView textMatrix;
    private TextView textAllWay;
    private TextView textTotalCost;
    private TextView textPathTaken;
    private Toolbar toolbar;
    private int position;
    private PathMatrix pathMatrix;
    private int matrix[][];
    private int total;
    private String path;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("position");
        }

        toolbar = getToolbar();
        toolbar.setTitle(getString(R.string.activity_matrix));
        toolbar.setNavigationIcon(R.mipmap.ic_up);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        textMatrix    = (TextView) findViewById(R.id.lbl_matrix);
        textAllWay    = (TextView) findViewById(R.id.lbl_all_the_way);
        textTotalCost = (TextView) findViewById(R.id.lbl_total_cost);
        textPathTaken = (TextView) findViewById(R.id.lbl_path_taken);

        switch ( position ) {
            case 0:
                matrix = Utils.MATRIX_EXAMPLE_1;
                pathMatrix = new PathMatrix(matrix);
                path = Utils.printMatrix(Utils.MATRIX_EXAMPLE_1);
                break;
            case 1:
                matrix = Utils.MATRIX_EXAMPLE_2;
                pathMatrix = new PathMatrix(matrix);
                path = Utils.printMatrix(Utils.MATRIX_EXAMPLE_2);
                break;
            case 2:
                matrix = Utils.MATRIX_EXAMPLE_3;
                pathMatrix = new PathMatrix(matrix);
                path = Utils.printMatrix(Utils.MATRIX_EXAMPLE_3);
                break;
            case 3:
                matrix = Utils.MATRIX_EXAMPLE_4;
                pathMatrix = new PathMatrix(matrix);
                path = Utils.printMatrix(Utils.MATRIX_EXAMPLE_4);
                break;
            case 4:
                matrix = Utils.MATRIX_EXAMPLE_5;
                pathMatrix = new PathMatrix(matrix);
                path = Utils.printMatrix(Utils.MATRIX_EXAMPLE_5);
                break;
        }

        total = pathMatrix.solve(matrix.length-1, matrix[0].length-1);

        textMatrix.setText(path);
        if( pathMatrix.isPathFull() ) {
            textAllWay.setText("YES");
        } else {
            textAllWay.setText("NO");
        }
        textTotalCost.setText(String.valueOf(total));
    }
}
