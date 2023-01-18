/*
 * File:     ColorSchema
 * Package:  ru.netology.graphics.image
 * Project:  java-diplom
 *
 * Created by dromakin as 05.01.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.01.10
 */

package ru.netology.graphics.image;


public class ColorSchema implements TextColorSchema {

    private final char[] symbols;

    public ColorSchema() {
        this.symbols = new char[]{'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
    }

    /**
     * @param color 0 - 255
     * @return character to print number of color
     */
    @Override
    public char convert(int color) {
        return symbols[(int) Math.floor(color / 256. * symbols.length)];
    }
}
