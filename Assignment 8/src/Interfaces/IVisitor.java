package Interfaces;

import ConcreteVillagers.*;


public interface IVisitor {
    void visit(ButcherVillager butcherVillager);
    void visit(ClericVillager clericVillager);
    void visit(ToolsmithVillager toolsmithVillager);
}
