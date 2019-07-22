require Decimal

defmodule Beer.BeerUnits do
  @moduledoc """
  Units conversion module.
  """

  @doc """
  Use Decimal module to round a float to integer
  (private function)
  """
  defp to_integer(f_value) do
    d_value = Decimal.from_float(f_value)
    d_value = Decimal.round(d_value, 0)
    i_value = Decimal.to_integer(d_value)
    i_value
  end

  @doc """
  Convert milliliters to US fluid ounces, rounding the result to an integer.
  """
  def ml_to_oz(ml) do
    f_value = ml / 29.574
    to_integer(f_value)
  end

  @doc """
  Convert US fluid ounces to milliliters, rounding the result to an integer.
  """
  def oz_to_ml(oz) do
    f_value = oz * 29.574
    to_integer(f_value)
  end


end