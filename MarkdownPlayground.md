# Markdown Playground

Use this file to add example markdown elements you learned about by reading the markdown resources below. You need to add at least 3 different markdown elements you learned about, and a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that here). 

<details>

<summary>Collapsed Section Example Element 1</summary>'

I learned that I can make a collapsable section

Example element 2
```java
public static void main(String[] args){
    System.out.println("I also learned that if I wanted to add code to this drop down this is how I would do so");
}
```
</details>

Example element 3
I learned that I can also use this to write out math equations

$$\left(\frac{x + y^2}{z}\;\right) \cdot\; \left(\sqrt{x}\right)$$



```mermaid
---
title: Aloha World UML Mermaid Diagram
---
classDiagram
   direction LR
   AlohaWorld --> Greeter
   AlohaWorld --> ConsoleView : uses
   ConsoleView --> Greeter : uses
   class AlohaWorld {
      - AlohaWorld
      + main(String[] args) void
   }

   class Greeter {
      - name : String
      - locality : int
      - localityList : List
      - HAWAII : int
      - CHINA : int
      - ITALY : int
      - DEFAULT_LOCALITY : int
      + Greeter(String name)
      + Greeter(String name, int locality)
      + String getName()
      + int getLocality()
      + void setLocality(int locality)
      + String greet()
      + String greet(boolean asciiOnly)
      -String getLocalityString()
      + int hashCode()
      + boolean equals(Object obj)
      + String toSting()
      +List<String> getLocalityList()
   }
   class ConsoleView {
    - SCANNER : Scanner 
    - LOCALITY_OPTIONS : List
    - ConsoleView()
    + String getName()
    + int getLocality()
    + boolean checkRunAgain()
    + void printGreeting(String greeting)
    
   }
```

Mermaid is a markdown language that allows you to create diagrams. You can find more information about mermaid in the resources below. It has become popular enough that github has included it as an option in their markdown.  For built in markdown readers, such as the one built into IntelliJ or VSCode, you may need to install a plugin to render the mermaid diagrams. 

> [!NOTE]
> [IntelliJ Mermaid Plugin](https://plugins.jetbrains.com/plugin/20146-mermaid). Also for intelliJ, this is often installed by default, but incase it isn't [Markdown Plugin IntelliJ](https://plugins.jetbrains.com/plugin/7793-markdown). 

> [!NOTE] 
> [VS Code Mermaid Preview](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-mermaid). Markdown preview is enabled by default, but if you want the full github flavored markdown, [Github Styling Preview](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-preview-github-styles) is popular. 


## Markdown Resources

* [Markdown Guide](https://www.markdownguide.org/basic-syntax/)
* [Github Flavored Markdown](https://guides.github.com/features/mastering-markdown/)
* [Github Markdown Getting Started](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
* [Mermaid Syntax Reference](https://mermaid.js.org/intro/syntax-reference.html) 


<!-- start your playground code under this dashed line -->
----