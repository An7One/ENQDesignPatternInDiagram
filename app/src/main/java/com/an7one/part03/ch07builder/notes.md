# Chapter 07 Builder Design Pattern

## to compose complicated instances

### 7.1 Introduction

### 7.2 Example

figure 7-1

### 7.3 Roles Involved

<ul>
    <li>Builder</li>
    <li>Concrete Builder</li>
    <li>Director 建工</li>
    <li>Client 使用者</li>
</ul>

figure 7-5

figure 7-6

### 7.4 Related Design Pattern

03, 08, 11, 15

### 7.5 Brainstorm

It is important to pay attention to "who knows what".

On one hand, the client <code>Main</code> (class) does not know <code>Builder</code> (class) at all; on the other hand,
the <code>Director</code> does know about <code>Builder</code>, but not know which <code>Builder</code> it is, in other
words, which <code>Builder</code> here is "replaceable".