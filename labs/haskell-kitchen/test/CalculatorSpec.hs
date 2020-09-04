module CalculatorSpec (spec) where

import Test.Hspec
import Calculator

spec :: Spec
spec = do
  describe "sum" $ do
    it "sum a list of integers" $ do
      sum [2, 4, 6] `shouldBe` 12