# Elixir Beer Taste

Some code to taste Elixir

## Step by Step

1. Create and test an app

The command `mix` will invoke Elixir's Mix tool, wich provide tasks for creating, managing dependencies, compiling and testing Elixir projects.

```
$ mix new elixir_beer_taste
* creating README.md
* creating .formatter.exs
* creating .gitignore
* creating mix.exs
...

$ mix test
Compiling 1 file (.ex)
Generated elixir_beer_taste app
..
Finished in 0.04 seconds
1 doctest, 1 test, 0 failures
```

2. Use `iex` to start the Elixir's interactive shell

```
$ iex -S mix
```

Use Ctrl+C to break and access a menu with following options:

- (a)bort
- (c)ontinue
- (p)roc info
- (i)nfo
- (l)oaded
- (v)ersion
- (k)ill
- (D)b-tables
- (d)istribution

3. Call a module function

```
iex(1)> ElixirBeerTaste.hello()
:world
```

4. From module to free-floating function

To reference a function, you need its function name and its arity. Arity is the number of arguments a function takes.

```
iex(1)> hello = &ElixirBeerTaste.say_hello/1
&ElixirBeerTaste.hello/1
iex(1)> hello.("John")
Hello John
```

5. Call for help

```
iex(2)> h()

                                  IEx.Helpers

Welcome to Interactive Elixir. You are currently seeing the documentation for
the module IEx.Helpers which provides many helpers to make Elixir's shell more
joyful to work with.
...
```

6. Introspect a value

```
iex(3)> i(ElixirBeerTaste)
Term
  ElixirBeerTaste
Data type
  Atom
Module bytecode
  _build/dev/lib/elixir_beer_taste/ebin/Elixir.ElixirBeerTaste.beam
...
```

7. Declare a free-floating function

```
iex(4)> ml_to_oz = fn (ml) -> ml / 29.574 end
#Function<6.128620087/1 in :erl_eval.expr/5>

iex(5)> ml_to_oz.(350)
11.83471968621086
```

You need the period between the variable name and the argument when you call a function that is stored in a variable.

You won’t need it for functions declared in modules

8. Search packages

```
$ mix hex.search decimal
Package   Description                               Version  URL                            
decimal   Arbitrary precision decimal arithmetic.   1.8.0    https://hex.pm/packages/decimal
```

9. Add a dependency in mix.exs

```
  defp deps do
    [
      {:decimal, ">= 1.8.0 "}
    ]
  end
```

10. Install dependencies

```
$ mix deps.get
Resolving Hex dependencies...
Dependency resolution completed:
New:
  decimal 1.8.0
* Getting decimal (Hex package)
```

11. Build a module using the dependency

- `./lib/beer/beer_units.ex`
- `./test/beer/beer_units_test.exs`

12. Run tests

The test files are in the `test` folder.

```
$ mix test
.....

Finished in 0.05 seconds
2 doctests, 3 tests, 0 failures
```

## Modules

Each module should go in its own file, with an `.ex` extension .


## References

- [Introducing Elixir, 2nd Edition](http://shop.oreilly.com/product/0636920050612.do)
- [Elixir Style Guide](https://github.com/christopheradams/elixir_style_guide)
