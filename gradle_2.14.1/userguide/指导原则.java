闭包就是能够读取其他函数内部变量的函数。
由于在Javascript语言中，只有函数内部的子函数才能读取定义在函数内的局部变量，因此可以把闭包简单理解成"定义在一个函数内部的函数"。
所以，在本质上，闭包就是将函数内部和函数外部连接起来的一座桥梁。


可读性好是一般是指闭包结构的代码块。


孵化中的功能，建议你演变来形容。

第5章 The Gradle Wrapper

What if they’re building an old version of the software?
意思应该是：What if they’re building on an old version of the software? 如果他们在使用旧版本的工具进行构建，而不是与代码对应版本的构建工具。


 Just use the appropriate syntax from above whenever you see a command line starting with gradle ... in the user guide, on Stack Overflow, in articles or wherever.

cross-cutting concern 横切关注点
像安全检查、事务等系统层面的服务，常备安插到一些程序中各个对象的处理流程中，这样的服务逻辑在AOP中称为横切关注点，又称横切关心。

依赖包括
the dependencies 依赖形态
the dependency configurations 依赖组合态（依赖成分、依赖配置块）
依赖组合态由依赖形态组成，包括编译形态、运行形态、测试编译形态、测试运行形态等

依赖形态与依赖组合态都可以有多个


org.gradle.api.Project
void dependencies(Closure configureClosure)
Configures the dependencies for this project.
This method executes the given closure against the DependencyHandler for this project. The DependencyHandler is passed to the closure as the closure's delegate.
Examples:
See docs for DependencyHandler
Parameters:
configureClosure - the closure to use to configure the dependencies.


org.gradle.api.Project
void configurations(Closure configureClosure)
Configures the dependency configurations for this project.
This method executes the given closure against the ConfigurationContainer for this project. The ConfigurationContainer is passed to the closure as the closure's delegate.
Examples:
See docs for ConfigurationContainer
Parameters:
configureClosure - the closure to use to configure the dependency configurations.