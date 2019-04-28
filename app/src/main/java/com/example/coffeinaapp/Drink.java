package com.example.coffeinaapp;

public class Drink
{
    private String name;
    private String deskrypszon;
    private int imageResourceId;

    public static final Drink[] drinks =
            {
                new Drink ("Latte", "Czarne Espresso z gorącym mlekiem i mleczną piąnką.",
                R.drawable.latte),
                new Drink ("Cappucino", "Czarne Espresso z dużą ilością spienionego mleka.",
                R.drawable.cappuccino),
                new Drink ("Espresso", "Czarna kawa ze świeżo zmielonych ziaren wysokiej jakości.",
                R.drawable.filter),
                new Drink ("Mango Loco", "Chłodny napój z soku mango oraz chyba kefiru, lub innego produktu mlecznego",
                R.drawable.dsc_5161)
            };

public Drink(String name, String deskrypszon, int imageResourceId)
    {
        this.name = name;
        this.deskrypszon = deskrypszon;
        this.imageResourceId = imageResourceId;
    }

public String getName()
    {
        return name;
    }

public String getDeskrypszon()
    {
        return deskrypszon;
    }

public int getImageResourceId()
    {
        return imageResourceId;
    }

@Override
public String toString()
    {
        return this.name;
    }
}

