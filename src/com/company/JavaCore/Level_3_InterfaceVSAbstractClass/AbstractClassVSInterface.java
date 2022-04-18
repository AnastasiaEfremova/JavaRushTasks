package com.company.JavaCore.Level_3_InterfaceVSAbstractClass;

public class AbstractClassVSInterface {
    /*
    Абстрактный класс                                             Интерфейс
              |                                                        |
    может наследоваться только от 1 класса                        не может наследоваться от классов,
    и множества интерфейсов                                       но может наследоваться от любого кол-ва
               |                                                   интерфейсов
   может содержать абстрактные методы, а может                          |
   и не содержать вообще                                          все не статические и не default методы
               |                                                  не содержат реализации, может не содержать
   может содержать методы с реализацией                           методы вообще
                                                                         |
                                                                   может содержать методы по умолчанию - default
                                                                         |
                                                                   содержит только public final static данные
     */
}