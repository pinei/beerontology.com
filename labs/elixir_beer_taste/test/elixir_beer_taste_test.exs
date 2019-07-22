defmodule ElixirBeerTasteTest do
  use ExUnit.Case
  doctest ElixirBeerTaste

  test "greets the world" do
    assert ElixirBeerTaste.hello() == :world
  end

  test "greets someone" do
    assert ElixirBeerTaste.say_hello("John") == "Hello John"
  end
end
