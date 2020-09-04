module Calculator
    ( double, sum, factorial, product
    ) where

double :: Num a => a -> a
double x = x + x

sum_list :: Num a => [a] -> a
sum_list[] = 0
sum_list(x:xs) = x + sum_list xs

product_list :: Num a => [a] -> a
product_list[] = 1
product_list(x:xs) = x * product_list xs

factorial :: Integral a => a -> a
factorial x = product_list [1..x]

-- average :: (Num a, Fractional b) => [a] -> b
-- average xs = sum_list xs `div` length xs

-- average :: Num a => [a] -> a
-- average xs = sum_list xs / fromIntegral(length xs)

-- Ref.:
-- https://mail.haskell.org/pipermail/beginners/2011-April/006701.html