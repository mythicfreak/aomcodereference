AoM Code Reference
==================

What is this?
------------
This project uses a combination of the Java programming language and the JavaDoc tool to produce a reference for internal commands used by the game Age of Mythology, its expansion pack and the extended edition.

Where can I find the reference?
-------------------------------
Right here: https://mythicfreak.github.io/aomcodereference/

How does this work?
-------------------
This project contains Java code with function stubs that represent the internal commands used by AoM. Note that these functions merely offer an interface, there is no actual implementation of the code. The added value of this project is in the javadoc annotations of every function and variable. This information can automatically be extracted from the code by a tool (JavaDoc) and converted to HTML reference pages. Those are the pages we are interested in, and which are hosted here on GitHub.

I found some inconsistencies in your reference!
-----------------------------------------------
That is possible. I pulled this reference together from many different sources and added some of my expertise as an XS scripter, so small errors are probably present. On top of that, this project has been a work in progress for a couple of years now, and it will hopefully continue to be updated for the foreseeable future. 

In any case, pull requests with bugfixes, clarifications or even new additions are always welcome!

Which JavaDoc options do you use?
---------------------------------
- title: "AoM Code Reference"
- public level code
- generate complete index, not separated per letter
- extra options:
  - `-noqualifier  all`
  - `-taglet aom.scripting.taglet.SyncTaglet`
  - `-taglet aom.scripting.taglet.LocalTaglet`
  - `-taglet aom.scripting.taglet.SinglePlayerTaglet`
  - `-taglet aom.scripting.taglet.EditorTaglet`
  - `-tagletpath "<your_path_to_project_folder>\bin"`
  - `-tag return` 
  - `-tag throws`
  - `-tag note:a:"Note" `
  - `-tag see`
  - `-tag example:a:"Example"`
