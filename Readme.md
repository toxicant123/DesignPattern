# Java设计模式

start to learn Java design pattern in 2021/12/26

## 七大原则

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

1) 设计模式是程序员在面对同类软件工程设计问题所总结出来的有用的经验，模式不是代码，而是某类问题的通用解决方案，设计模式（Design pattern）代表了最佳的实践。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。
2) 设计模式的本质提高 软件的维护性，通用性和扩展性，并降低软件的复杂度。
3) 《设计模式》是经典的书，作者是 Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides Design（俗称“四人组GOF”）
4) 设计模式并不局限于某种语言，java，php，c++ 都有设计模式.

## 设计模式类型

设计模式分为三种类型，共 23 种

1) 创建型模式：[单例模式](designpattern/src/main/java/创建型模式/singleton/单例模式.md)
   、[抽象工厂模式](designpattern/src/main/java/创建型模式/factory/工厂模式.md)
   、[原型模式](designpattern/src/main/java/创建型模式/prototype/原型模式.md)、[建造者模式](designpattern/src/main/java/创建型模式/builder/建造者模式.md)、[工厂模式](designpattern/src/main/java/创建型模式/factory/工厂模式.md)。
2) 结构型模式：[适配器模式](designpattern/src/main/java/结构型模式/adapter/适配器模式.md)、[桥接模式](designpattern/src/main/java/结构型模式/bridge/桥接模式.md)、装饰模式、组合模式、外观模式、享元模式、代理模式。
3) 行为型模式：模版方法模式、命令模式、访问者模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式（Interpreter 模式）、状态模式、策略模式、职责链模式(责任链模式)。\
   注意：不同的书籍上对分类和名称略有差别