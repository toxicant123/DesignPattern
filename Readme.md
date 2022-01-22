# Java设计模式

Begin in 2021/12/26

## 设计模式的目的

编写软件过程中，程序员面临着来自耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性等多方面的挑战，设计模式是为了让程序(软件)，具有更好的

1) 代码重用性 (即：相同功能的代码，不用多次编写)
2) 可读性 (即：编程规范性，便于其他程序员的阅读和理解)
3) 可扩展性 (即：当需要增加新的功能时，非常的方便，称为可维护)
4) 可靠性 (即：当我们增加新的功能后，对原来的功能没有影响)
5) 使程序呈现高内聚，低耦合的特性

## [七大原则](principle/src/main/java/设计原则核心思想.md)

1. [单一职责原则](principle/src/main/java/singleresponsibility/单一职责原则.md)
2. [接口隔离原则](principle/src/main/java/interfacesegregation/接口隔离原则.md)
3. [依赖倒转原则](principle/src/main/java/dependenceinversion/依赖倒转原则.md)
4. [里氏替换原则](principle/src/main/java/liskovsubstitution/里氏替换原则.md)
5. [开闭原则（ocp）](principle/src/main/java/openclosed/开闭原则.md)
6. [迪米特法则](principle/src/main/java/demeter/迪米特法则.md)
7. [合成复用原则](principle/src/main/java/compositereuse/合成复用原则.md)

## 类与类之间的关系

1. [依赖](uml/src/main/java/dependency/类图—依赖关系.md)
2. [泛化（继承）](uml/src/main/java/generalization/类图—泛化关系.md)
3. [实现](uml/src/main/java/implementation/类图—实现关系.md)
4. [关联](uml/src/main/java/association/类图—关联关系.md)
5. [聚合](uml/src/main/java/aggregation/类图—聚合关系.md)
6. [组合](uml/src/main/java/composition/类图—组合关系.md)

## 设计模式介绍

1) 设计模式是程序员在面对同类软件工程设计问题所总结出来的有用的经验，模式不是代码，而是某类问题的通用解决方案，设计模式（Design
   pattern）代表了最佳的实践。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的
2) 设计模式的本质提高 软件的维护性，通用性和扩展性，并降低软件的复杂度
3) 《设计模式》是经典的书，作者是 Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides Design（俗称“四人组GOF”）
4) 设计模式并不局限于某种语言，java，php，c++ 都有设计模式

## 设计模式类型

设计模式分为三种类型，共 23 种

1) 创建型模式：[单例模式](designpattern/src/main/java/创建型模式/singleton/单例模式.md)
   、[抽象工厂模式](designpattern/src/main/java/创建型模式/factory/工厂模式.md)
   、[原型模式](designpattern/src/main/java/创建型模式/prototype/原型模式.md)
   、[建造者模式](designpattern/src/main/java/创建型模式/builder/建造者模式.md)
   、[工厂模式](designpattern/src/main/java/创建型模式/factory/工厂模式.md)
2) 结构型模式：[适配器模式](designpattern/src/main/java/结构型模式/adapter/适配器模式.md)
   、[桥接模式](designpattern/src/main/java/结构型模式/bridge/桥接模式.md)
   、[装饰者模式](designpattern/src/main/java/结构型模式/decorator/装饰者模式.md)
   、[组合模式](designpattern/src/main/java/结构型模式/composite/组合模式.md)、[外观模式](designpattern/src/main/java/结构型模式/facade/外观模式.md)
   、[享元模式](designpattern/src/main/java/结构型模式/flyweight/享元模式.md)、[代理模式](designpattern/src/main/java/结构型模式/proxy/代理模式.md)
3) 行为型模式：[模版方法模式](designpattern/src/main/java/行为型模式/templatemethod/模板方法模式.md)
   、[命令模式](designpattern/src/main/java/行为型模式/command/命令模式.md)
   、[访问者模式](designpattern/src/main/java/行为型模式/visitor/访问者模式.md)
   、[迭代器模式](designpattern/src/main/java/行为型模式/iterator/迭代器模式.md)
   、[观察者模式](designpattern/src/main/java/行为型模式/observer/观察者模式.md)
   、[中介者模式](designpattern/src/main/java/行为型模式/mediator/中介者模式.md)
   、[备忘录模式](designpattern/src/main/java/行为型模式/memento/备忘录模式.md)
   、[解释器模式（Interpreter 模式）](designpattern/src/main/java/行为型模式/interpreter/解释器模式.md)
   、[状态模式](designpattern/src/main/java/行为型模式/state/状态模式.md)、[策略模式](designpattern/src/main/java/行为型模式/strategy/策略模式.md)
   、[职责链模式(责任链模式)](designpattern/src/main/java/行为型模式/chainofresponsibility/职责链模式.md)  
   注意：不同的书籍上对分类和名称略有差别

## [UML](uml/src/main/java/uml.md)