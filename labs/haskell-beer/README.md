# README

Encontrei 2 opções para instalação de ferramentas para desenvolvimento em Haskell.

## Haskell Platform

A multi-OS distribution designed to get you up and running quickly, making it easy to focus on using Haskell. You get:

- the Glasgow Haskell Compiler
- the Cabal build system
- the Stack tool for developing projects
- support for profiling and code coverage analysis
- 35 core & widely-used packages

`ghcup` is an installer for the general purpose language Haskell

```sh
$ curl --proto '=https' --tlsv1.2 -sSf https://get-ghcup.haskell.org | sh
```

## The Haskell Tool Stack

Stack is a cross-platform program for developing Haskell projects. It is aimed at Haskellers both new and experienced.

It features:

- Installing GHC automatically, in an isolated location.
- Installing packages needed for your project.
- Building your project.
- Testing your project.
- Benchmarking your project.

If you have the popular brew tool installed, you can just do:

```sh
$ brew install haskell-stack
```

## Instalando com Homebrew

```
$ brew install haskell-stack
==> Downloading https://homebrew.bintray.com/bottles/haskell-stack-2.3.3.catalina.bottle.tar.gz
==> Downloading from https://d29vzk4ow07wi7.cloudfront.net/0e72e5dcc47ad2a71d842bde6aa742a0ae87d68d5fc22c948db6585d2be400da?response-content-disposition=attachment%3Bfilename%3D%22has
######################################################################## 100.0%
==> Pouring haskell-stack-2.3.3.catalina.bottle.tar.gz
🍺  /usr/local/Cellar/haskell-stack/2.3.3: 6 files, 55.4MB
```

```
$ stack ghci
Writing implicit global project config file to: /Users/pinei/.stack/global-project/stack.yaml
Note: You can change the snapshot via the resolver field there.
Using latest snapshot resolver: lts-16.9
Preparing to install GHC to an isolated location.
This will not interfere with any system-level installation.
Downloaded ghc-8.8.3.
xcode-select: error: tool 'xcodebuild' requires Xcode, but active developer directory '/Library/Developer/CommandLineTools' is a command line tools instance
Installed GHC.

Note: No local targets specified, so a plain ghci will be started with no package hiding or package options.

      You are using snapshot: lts-16.9

      If you want to use package hiding and options, then you can try one of the following:

      * If you want to start a different project configuration than /Users/pinei/.stack/global-project/stack.yaml, then you can use stack init to create a new stack.yaml for the
        packages in the current directory.

      * If you want to use the project configuration at /Users/pinei/.stack/global-project/stack.yaml, then you can add to its 'packages' field.

Configuring GHCi with the following packages:
GHCi, version 8.8.3: https://www.haskell.org/ghc/  :? for help
Loaded GHCi configuration from /private/var/folders/jd/th6tj68x6gvc3ygvb_xdk7440000gn/T/haskell-stack-ghci/2a3bbd58/ghci-script
Prelude>
```

