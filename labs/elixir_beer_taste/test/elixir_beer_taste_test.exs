defmodule ElixirBeerTasteTest do
  use ExUnit.Case
  doctest ElixirBeerTaste

  test "greets the world" do
    assert ElixirBeerTaste.hello() == :world
  end
end
