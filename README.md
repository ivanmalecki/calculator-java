This read me is Colection of data from Start.java file.

##izvestaj za cloc.

github.com/AlDanial/cloc v 2.00  T=0.10 s (87.5 files/s, 122764.8 lines/s)
--------------------------------------------------------------------------------
Language                      files          blank        comment           code
--------------------------------------------------------------------------------
JSON                              1              0              0           8265
XML                               2             82             12           3745
Bourne Again Shell                1             29             21            162
Java                              2             61              5            148
DOS Batch                         1              6             13             60
Properties                        1              3             10              9
Markdown                          1              1              0              1
--------------------------------------------------------------------------------
SUM:                              9            182             61          12390
--------------------------------------------------------------------------------


## Izveštaj o statičkoj analizi.
### Zapažanja

###calcultor-java

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Message                                                                                                                               File                             Source
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Move this file to a named package.                                                                                                    Calculator-java [ln 1 col 1]     sonarlint
Add a private constructor to hide the implicit public one.                                                                            Calculator-java [ln 4 col 14]    sonarlint
Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object".       Calculator-java [ln 18 col 30]   sonarlint
Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.                                                        Calculator-java [ln 18 col 30]   sonarlint
Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.                                                        Calculator-java [ln 24 col 26]   sonarlint
Immediately return this expression instead of assigning it to the temporary variable "test result".                                    Calculator-java [ln 70 col 29]   sonarlint
Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.                                                        Calculator-java [ln 74 col 25]   sonarlint
Remove this redundant jump.                                                                                                           Calculator-java [ln 183 col 13]  sonarlint
###Start.java
Move this file to a named package.                                                                                                    Start.java      [ln 1 col 1]     sonarlint
Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.                                                     Start.java      [ln 6 col 10]    sonarlint
Replace this use of System.out by a logger.                                                                                           Start.java      [ln 8 col 3]     sonarlint
Replace this use of System.out by a logger.                                                                                           Start.java      [ln 19 col 5]    sonarlint


