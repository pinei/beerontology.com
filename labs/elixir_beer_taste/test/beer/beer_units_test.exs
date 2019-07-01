defmodule Beer.BeerUnitsTest do
  use ExUnit.Case
  doctest Beer.BeerUnits

  test "355ml equals 12oz" do
    assert Beer.BeerUnits.ml_to_oz(355) == 12
    assert Beer.BeerUnits.oz_to_ml(12) == 355
  end
end
