# Programming in Haskell

Iniciando o REPL

```
$ stack ghci

Note: No local targets specified, so a plain ghci will be started with no package hiding or package options.

      You are using snapshot: lts-16.9

      If you want to use package hiding and options, then you can try one of the following:

      * If you want to start a different project configuration than /Users/pinei/.stack/global-project/stack.yaml, then you can use stack init to create a new stack.yaml for the packages in the
        current directory.

      * If you want to use the project configuration at /Users/pinei/.stack/global-project/stack.yaml, then you can add to its 'packages' field.

Configuring GHCi with the following packages:
GHCi, version 8.8.3: https://www.haskell.org/ghc/  :? for help
Loaded GHCi configuration from /private/var/folders/jd/th6tj68x6gvc3ygvb_xdk7440000gn/T/haskell-stack-ghci/2a3bbd58/ghci-script
Prelude>
```

Prelude is a module that contains a small set of standard definitions and is included automatically into all Haskell modules

## Functions

```
> double x = x + x
> double 4
8
```

```
> total = sum[1..5]
> total
15
```

```
> :{
| rec_sum[] = 0
| rec_sum(x:xs) = x + rec_sum xs
| :}
> rec_sum[1..5]
15
```

```
> :{
| qsort[] = []
| qsort(x:xs) = qsort smaller ++ [x] ++ qsort larger
|   where
|     smaller = [a | a <- xs, a <= x]
|     larger = [b | b <- xs, b > x]
| :}
> qsort[6,1,9,5,8,4,3,7,2]
[1,2,3,4,5,6,7,8,9]
```

```
> factorial n = product [1..n]
> factorial 5
120
```

```
> average ns = sum ns `div` length ns
> average [1,2,3,4,5,6,7]
4
```

## Lists

```
> head[1,2,3,4,5]
1
> tail[1,2,3,4,5]
[2,3,4,5]
> [1,2,3,4,5]!!2 -- 3rd element
3
> take 3 [1,2,3,4,5]
[1,2,3]
> drop 3 [1,2,3,4,5]
[4,5]
> length [1,2,3,4,5]
5
> sum [1,2,3,4,5]
15
> product [1,2,3,4,5]
120
> [1,2,3] ++ [4,5]
[1,2,3,4,5]
> reverse [1,2,3,4,5]
[5,4,3,2,1]
```

## Types and classes



# References

- [HASKELL BASICS - CSE 341, Autumn 2008](https://courses.cs.washington.edu/courses/cse341/08au/haskell/basics.txt)
- [Error haskell: not in scope. What does that mean?](https://stackoverflow.com/questions/42103627/error-haskell-not-in-scope-what-does-that-mean)