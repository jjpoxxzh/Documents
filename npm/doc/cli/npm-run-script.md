npm-run-script(1) -- Run arbitrary package scripts
==================================================

## SYNOPSIS

    npm run-script <command> [-- <args>...]

    alias: npm run

## DESCRIPTION

This runs an arbitrary command from a package's `"scripts"` object.  If no
`"command"` is provided, it will list the available scripts.  `run[-script]` is
used by the test, start, restart, and stop commands, but can be called
directly, as well. When the scripts in the package are printed out, they're
separated into lifecycle (test, start, restart) and directly-run scripts.

此命令从一个库包的"scripts"对象开始运行一条任意的命令。如果没有指明命令，则会列举出可用的脚本。run[-script]被用在test、start、restart和stop命令中，但它本身并不能直接被调用。当package中的scripts打印出来时，它们会按生命周期脚本（test、start、restart）和直接可运行脚本区分。

As of [`npm@2.0.0`](http://blog.npmjs.org/post/98131109725/npm-2-0-0), you can
use custom arguments when executing scripts. The special option `--` is used by
[getopt](http://goo.gl/KxMmtG) to delimit the end of the options. npm will pass
all the arguments after the `--` directly to your script:

npm 2.0.0后，你可以为脚本添加运行时的自定义参数。特定选项“--”被getopt用来作为每个选项结束的分隔符。npm会直接传递--之后的所有参数给你的脚本

    npm run test -- --grep="pattern"

The arguments will only be passed to the script specified after ```npm run```
and not to any pre or post script.

此参数只会传递给由npm run后定义的脚本，而不会传递给任意该脚本之前或之后的脚本。

The `env` script is a special built-in command that can be used to list
environment variables that will be available to the script at runtime. If an
"env" command is defined in your package it will take precedence over the
built-in.

In addition to the shell's pre-existing `PATH`, `npm run` adds
`node_modules/.bin` to the `PATH` provided to scripts. Any binaries provided by
locally-installed dependencies can be used without the `node_modules/.bin`
prefix. For example, if there is a `devDependency` on `tap` in your package,
you should write:

    "scripts": {"test": "tap test/\*.js"}

instead of `"scripts": {"test": "node_modules/.bin/tap test/\*.js"}` to run your tests.

`npm run` sets the `NODE` environment variable to the `node` executable with
which `npm` is executed. Also, if the `--scripts-prepend-node-path` is passed,
the directory within which `node` resides is added to the
`PATH`. If `--scripts-prepend-node-path=auto` is passed (which has been the
default in `npm` v3), this is only performed when that `node` executable is
not found in the `PATH`.

If you try to run a script without having a `node_modules` directory and it fails,
you will be given a warning to run `npm install`, just in case you've forgotten.

## SEE ALSO

* npm-scripts(7)
* npm-test(1)
* npm-start(1)
* npm-restart(1)
* npm-stop(1)
