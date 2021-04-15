package com.fatih.designpattern.controller;

import com.fatih.designpattern.patterns.Behavioral.ChainofResponsibility.ChainofResponsibilityCallClass;
import com.fatih.designpattern.patterns.Behavioral.Command.CommandCallClass;
import com.fatih.designpattern.patterns.Behavioral.Interpreter.InterpreterCallClass;
import com.fatih.designpattern.patterns.Behavioral.Iterator.IteratorCallClass;
import com.fatih.designpattern.patterns.Behavioral.Mediator.MediatorCallClass;
import com.fatih.designpattern.patterns.Behavioral.Memento.MementoCallClass;
import com.fatih.designpattern.patterns.Behavioral.NullObject.NullObjectCallClass;
import com.fatih.designpattern.patterns.Behavioral.Observer.ObserverCallClass;
import com.fatih.designpattern.patterns.Behavioral.State.StateCallClass;
import com.fatih.designpattern.patterns.Behavioral.Strategy.StrategyCallClass;
import com.fatih.designpattern.patterns.Behavioral.Template.TemplateCallClass;
import com.fatih.designpattern.patterns.Behavioral.Visitor.VisitorCallClass;
import com.fatih.designpattern.patterns.Creational.AbstractFactoy.AbstractFactoryCallClass;
import com.fatih.designpattern.patterns.Creational.Builder.BuilderCallClass;
import com.fatih.designpattern.patterns.Creational.FactoryMethod.FactoryMethodCallClass;
import com.fatih.designpattern.patterns.Creational.ObjectPool.ObjectPoolCallClass;
import com.fatih.designpattern.patterns.Creational.Prototype.PrototypeCallClass;
import com.fatih.designpattern.patterns.Creational.Singleton.SingletonCallClass;
import com.fatih.designpattern.patterns.Structural.Adapter.AdapterCallClass;
import com.fatih.designpattern.patterns.Structural.Bridge.BridgeCallClass;
import com.fatih.designpattern.patterns.Structural.Composite.CompositeCallClass;
import com.fatih.designpattern.patterns.Structural.Decorator.DecoratorCallClass;
import com.fatih.designpattern.patterns.Structural.Facade.FacadeCallClass;
import com.fatih.designpattern.patterns.Structural.Flyweight.FlyWeightCallClass;
import com.fatih.designpattern.patterns.Structural.PrivateClassData.PrivateClassCallClass;
import com.fatih.designpattern.patterns.Structural.Proxy.ProxyCallClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/deneme")
    public String deneme() {
        return "ok";
    }

    @GetMapping(value = "factorymethod")
    public String factoryMethodDemo() {
        FactoryMethodCallClass callClass = new FactoryMethodCallClass();
        return callClass.call();
    }

    @GetMapping(value = "abstractfactory")
    public String abstractFactory() {
        AbstractFactoryCallClass callClass = new AbstractFactoryCallClass();
        return callClass.call();
    }

    @GetMapping(value = "singleton")
    public String singleton() {
        SingletonCallClass singletonCallClass = new SingletonCallClass();
        singletonCallClass.call();
        return "ok";
    }

    @GetMapping(value = "prototype")
    public String prototype() {
        PrototypeCallClass prototypeCallClass = new PrototypeCallClass();
        prototypeCallClass.runPrototype();
        return "ok";
    }

    @GetMapping(value = "builder")
    public String builder() {
        BuilderCallClass builderCallClass = new BuilderCallClass();
        builderCallClass.runBuilder();
        return "ok";
    }

    @GetMapping(value = "objectpool")
    public String objectPool() {
        ObjectPoolCallClass objectPoolCallClass = new ObjectPoolCallClass();
        objectPoolCallClass.runObjectPool();
        return "ok";

    }

    @GetMapping(value = "adapter")
    public String adapter() {
        AdapterCallClass adapterCallClass = new AdapterCallClass();
        adapterCallClass.runAdapter();
        return "Also known as wrapper";
    }

    @GetMapping(value = "bridge")
    public String bridge() {
        BridgeCallClass bridgeCallClass = new BridgeCallClass();
        bridgeCallClass.runBridge();
        return "ok";
    }

    @GetMapping(value = "composite")
    public String composite() {
        CompositeCallClass callClass = new CompositeCallClass();
        callClass.runComposite();
        return "ok";

    }

    @GetMapping(value = "decorator")
    public String decorator() {
        DecoratorCallClass decoratorCallClass = new DecoratorCallClass();
        decoratorCallClass.runDecorator();
        return "ok";

    }

    @GetMapping(value = "facade")
    public String facade() {
        FacadeCallClass facadeCallClass = new FacadeCallClass();
        facadeCallClass.runFacade();
        return "ok";

    }

    @GetMapping(value = "flyweight")
    public String flyweight() {
        FlyWeightCallClass flyWeightCallClass = new FlyWeightCallClass();
        flyWeightCallClass.runFlyWeight();
        return "ok";

    }

    @GetMapping(value = "privateclass")
    public String privateClass() {
        PrivateClassCallClass privateClassCallClass = new PrivateClassCallClass();
        privateClassCallClass.runPrivateClass();
        return "ok";

    }

    @GetMapping(value = "proxy")
    public String proxy() {
        ProxyCallClass proxyCallClass = new ProxyCallClass();
        proxyCallClass.runProxyCallClass();
        return "ok";

    }


    @GetMapping(value = "chainofresponsibility")
    public String chainOfResponsibility() {
        ChainofResponsibilityCallClass chainofResponsibilityCallClass = new ChainofResponsibilityCallClass();
        chainofResponsibilityCallClass.call();

        return "ok";

    }

    @GetMapping(value = "command")
    public String command() {
        CommandCallClass commandCallClass = new CommandCallClass();
        commandCallClass.call();

        return "ok";

    }

    @GetMapping(value = "interpreter")
    public String interpreter() {
        InterpreterCallClass interpreterCallClass = new InterpreterCallClass();
        interpreterCallClass.call();
        return "ok";

    }

    @GetMapping(value = "iterator")
    public String iterator() {
        IteratorCallClass iteratorCallClass = new IteratorCallClass();
        iteratorCallClass.call();

        return "ok";

    }

    @GetMapping(value = "mediator")
    public String mediator() {
        MediatorCallClass mediatorCallClass = new MediatorCallClass();
        mediatorCallClass.call();
        return "ok";

    }

    @GetMapping(value = "memento")
    public String memento() {
        MementoCallClass mementoCallClass = new MementoCallClass();
        mementoCallClass.call();

        return "ok";

    }

    @GetMapping(value = "nullobject")
    public String nullObject() {
        NullObjectCallClass nullObjectCallClass = new NullObjectCallClass();
        nullObjectCallClass.call();

        return "ok";

    }

    @GetMapping(value = "observer")
    public String observer() {
        ObserverCallClass observerCallClass = new ObserverCallClass();
        observerCallClass.call();

        return "ok";

    }

    @GetMapping(value = "state")
    public String state() {
        StateCallClass stateCallClass = new StateCallClass();
        stateCallClass.call();
        return "ok";

    }

    @GetMapping(value = "strategy")
    public String strategy() {
        StrategyCallClass strategyCallClass = new StrategyCallClass();
        strategyCallClass.call();
        return "ok";

    }

    @GetMapping(value = "template")
    public String template() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        TemplateCallClass templateCallClass = new TemplateCallClass();
        templateCallClass.call();

        return "ok";

    }

    @GetMapping(value = "visitor")
    public String visitor() {
        VisitorCallClass callClass = new VisitorCallClass();
        callClass.call();
        return "ok";

    }


}
