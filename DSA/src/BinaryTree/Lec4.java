package BinaryTree;

public class Lec4 {
    public static void main(String[] args) {
        System.out.println("Internal and external node relationships");
        /*
         🌲 INTERNAL vs EXTERNAL NODES in Binary Trees
         ==============================================

         🔹 Definition:
         • Internal Node → A node with AT LEAST 1 child (can have 1 or 2 children).
         • External Node (Leaf) → A node with NO children.

         👉 Example Tree:
                 A
                / \
               B   C
              / \    \
             D   E    F

         • Internal Nodes = {A, B, C} = 3
         • External Nodes = {D, E, F} = 3


         🔹 General Property in Binary Tree:
         ---------------------------------------------
         Total number of edges = Total number of nodes - 1
         Now relation:  degree(0) = degree(2) + 1
         (Here degree(0) → External nodes, degree(2) → Internal nodes with 2 children)

         ==============================================
         1️⃣ FULL / STRICT / PROPER BINARY TREE
         ----------------------------------------------
         • In Full Binary Tree → Each node has either 0 or 2 children.
         • So, relation: 
              External Nodes = Internal Nodes + 1

         👉 Example:
                 A
                / \
               B   C
              / \
             D   E

         • Internal = {A, B, C} = 3
         • External = {D, E} = 2
         ❌ Wait → Not Full! (Because node C has only 1 child)

         👉 Correct Full Tree Example:
                 A
                / \
               B   C
              / \ / \
             D  E F  G

         • Internal = {A, B, C} = 3
         • External = {D, E, F, G} = 4
         ✅ Relation holds → External = Internal + 1 (4 = 3 + 1)


         ==============================================
         2️⃣ COMPLETE BINARY TREE
         ----------------------------------------------
         • All levels filled except last, last filled left → right.
         • Relation: External nodes ≥ Internal nodes
           (But not exact fixed like Full)

         👉 Example:
                 A
                / \
               B   C
              / \
             D   E

         • Internal = {A, B} = 2
         • External = {C, D, E} = 3


         ==============================================
         3️⃣ PERFECT BINARY TREE
         ----------------------------------------------
         • All internal nodes have 2 children, all leaves same level.
         • Relation: External = Internal + 1
           (same as Full)

         👉 Example:
                 A
                / \
               B   C
              / \ / \
             D  E F  G

         • Internal = 3
         • External = 4


         ==============================================
         4️⃣ DEGENERATE TREE (Linked list type)
         ----------------------------------------------
         • Every internal node has only 1 child.
         • Relation: Internal Nodes = External Nodes - 1

         👉 Example:
                 A
                  \
                   B
                    \
                     C
                      \
                       D

         • Internal = {A, B, C} = 3
         • External = {D} = 1
         ❌ Relation of Full does not hold here.


         ==============================================
         5️⃣ SKEWED TREE
         ----------------------------------------------
         • Same as Degenerate (all nodes left or right only).
         • Internal = n-1, External = 1


         ==============================================
         📌 SUMMARY RELATION
         ----------------------------------------------
         • Full / Strict / Perfect → External = Internal + 1
         • Complete → External ≥ Internal
         • Degenerate / Skewed → External = 1, Internal = n-1

         ==============================================
        */
    }
}
