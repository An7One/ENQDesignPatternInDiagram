# Chapter 09 Bridge Design Pattern

## to separate functionality from its implementation

### 9.1 Bridge Design Pattern

to be added...

### 9.2 Example

### 9.3 Roles Involved in Bridge Design Pattern

<ul>
    <li>Abstraction 抽象化</li>
    <li>RefinedAbstraction 改善后的抽象化</li>
    <li>Implementator 实现者</li>
    <li>ConcreteImplementor 具体实现者</li>
</ul>

figure 9-3

### 9.4 Brain Storm

<ul>
    <li>easier to expand</li>
    <li>Inheritance is a strong association, while delegate is a weak association</li>
    <ul>
        <li>Example of delegates applied</li>
        <ul>
            <li>to call <code>open()</code> calls <code>impl.rawOpen()</code></li>
            <li>to call <code>print()</code> calls <code>impl.print()</code></li>
            <li>to call <code>close()</code> calls <code>impl.close()</code></li>
        </ul>
        <li>the reason why a delegate is of weak association is because only after instantiating <code>Display</code>, and being passed in, the association can be made.</li>
    </ul>
</ul>

### 9.5 Related Design Pattern

02, 03, 08