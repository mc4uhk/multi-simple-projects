multi-simple-projects

Aims: 
This project is aimed to setup a simple multiple project skeleton in order to easily create parallel (similar) project in the fly. The idea should be similar to micro-service. This beneifit is differen function that is developed on different stage would not interfere with each other and there minimize the testing of the whole system in the time of full development.


Structure:

root
  |  build.xml
  |  doc
  |
  +-- simple-proj-A
  |     +-- build.xml
  |     +-- src
  |     +-- lib
  +-- simple-proj-B
  |     +-- build.xml
  |     +-- src
  |     +-- lib
  +-- simple-proj-skeleton (the basic template of the sub-projects)
        +-- build.xml
        +-- src
        +-- lib


ant build:

root build.xml
clean     -- clean root project files
clean-all -- clean root project and all sub-projects
dist-all  -- create dist(s) for all sub-projects
tar       -- create a full distributable tar file


sub-project build.xml
clean     -- clean sub-project files
build     -- create target path and compile all java files.
jar       -- package all classes into a jar file.
dist      -- forming a distributable structure in dist/ folder.
tar       -- create a tar file from the dist/ folder.

 



