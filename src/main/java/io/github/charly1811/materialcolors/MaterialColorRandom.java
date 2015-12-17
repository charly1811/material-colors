package io.github.charly1811.materialcolors;

import android.content.Context;

import java.util.Random;

import cf.charleseugeneloubao.materialcolors.MaterialColor;
import cf.charleseugeneloubao.materialcolors.R;

/**
 * Copyright 2015 Charles-Eugene Loubao
 */
public class MaterialColorRandom {

    private Random random = new Random();

    private int[] primaryColors;
    private int[] darkColors;

    public MaterialColorRandom(Context context) {
        primaryColors = context.getResources().getIntArray(R.array.primary_colors);
        darkColors = context.getResources().getIntArray(R.array.dark_colors);
    }


    public MaterialColor nextMaterialColor() {
        int index = random.nextInt(primaryColors.length);
        return new MaterialColor(primaryColors[index],darkColors[index]);
    }
}
