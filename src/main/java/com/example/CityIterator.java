package com.example;

import java.util.Iterator;

public class CityIterator implements Iterator<Country> {
  private Countries countries;
  private int index;

  public CityIterator(Countries countries) {
    this.countries = countries;
    index = 0;
  }

  @Override
  public boolean hasNext() {
    var countriesCollection = countries.getcountries();
    return index < countriesCollection.length;
  }

  @Override
  public Country next() {
    var countriesCollection = countries.getcountries();
    if (hasNext()) {
      var Country = countriesCollection[index++];
      return Country;
    } else {
      return null;
    }
  }

}
