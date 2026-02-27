package BinaryTree;

public class Lec3_Types_Of_Binary_Tree {
    public static void main(String[] args) {
        System.out.println("Types of binary trees");
 /*
         🌲 TYPES OF BINARY TREES (With Examples)
         ============================================

         1️⃣ FULL / STRICT / PROPER BINARY TREE
         --------------------------------------------
         • Each node has either 0 or 2 children.
         • Internal Nodes + 1 = External Nodes

         Example Diagram:
                 A
                / \
               B   C
              / \
             D   E

         Formulas:
         • Max nodes (height h) = 2^(h+1) - 1
           👉 Example: h = 3 → 2^(3+1) - 1 = 15 nodes

         • Min nodes (height h) = 2h + 1
           👉 Example: h = 3 → 2*3 + 1 = 7 nodes

         • Min height (n nodes) = log2(n+1) - 1
           👉 Example: n = 15 → log2(16) - 1 = 3

         • Max height (n nodes) = (n-1)/2
           👉 Example: n = 7 → (7-1)/2 = 3


         2️⃣ COMPLETE BINARY TREE
         --------------------------------------------
         • All levels completely filled except last.
         • Last level filled from LEFT to RIGHT.

         Example Diagram:
                 A
                / \
               B   C
              / \  /
             D   E F

         Formulas:
         • Max nodes (height h) = 2^(h+1) - 1
           👉 Example: h = 3 → 2^4 - 1 = 15 nodes

         • Min nodes (height h) = 2^h
           👉 Example: h = 3 → 2^3 = 8 nodes

         • Min height (n nodes) = log2(n+1) - 1
           👉 Example: n = 10 → log2(11)-1 ≈ 3.4-1 ≈ 2 (round up)

         • Max height (n nodes) = log2(n)
           👉 Example: n = 10 → log2(10) ≈ 3


         3️⃣ PERFECT BINARY TREE
         --------------------------------------------
         • Every internal node has 2 children.
         • All leaves at same level.

         Example Diagram (h=2):
                 A
                / \
               B   C
              / \ / \
             D  E F  G

         Formulas:
         • Max nodes (height h) = 2^(h+1) - 1
           👉 Example: h = 2 → 2^3 - 1 = 7 nodes

         • Min nodes (height h) = same as max (fixed)
           👉 Example: h = 2 → 7 nodes

         • Max height (n nodes) = log2(n)
           👉 Example: n = 15 → log2(15) ≈ 3.9 → h=3

         • Min height (n nodes) = log2(n+1) - 1
           👉 Example: n = 7 → log2(8)-1 = 2


         4️⃣ DEGENERATE (PATHOLOGICAL) BINARY TREE
         --------------------------------------------
         • Every internal node has 1 child.
         • Becomes like a linked list.

         Example Diagram:
                 A
                  \
                   B
                    \
                     C
                      \
                       D

         Formulas:
         • Max nodes = h+1
           👉 Example: h = 4 → 4+1 = 5 nodes

         • Min nodes = h+1 (same)
           👉 Example: h = 4 → 5 nodes

         • Max height = n-1
           👉 Example: n = 5 → h = 4


         5️⃣ SKEWED BINARY TREE
         --------------------------------------------
         • Special case of Degenerate Tree.
         • All nodes only LEFT child or only RIGHT child.

         Example Diagram (Left Skewed):
                 A
                /
               B
              /
             C
            /
           D

         Formulas:
         • Max nodes = h+1
           👉 Example: h = 3 → 3+1 = 4 nodes

         • Min nodes = h+1
           👉 Example: h = 3 → 4 nodes

         • Max height = n-1
           👉 Example: n = 4 → h = 3


         6️⃣ BALANCED BINARY TREE
         --------------------------------------------
         • For every node:
           | Height(left) - Height(right) | ≤ 1
         • Ensures logarithmic height O(log n).

         Example Diagram (Balanced):
                 A
                / \
               B   C
              /
             D

         Example Diagram (Unbalanced):
                 A
                /
               B
              /
             C

         (No fixed formula, but height ~ log n)


         7️⃣ ORDERED BINARY TREE
         --------------------------------------------
         • Nodes arranged in specific order.
         • Example: Binary Search Tree (BST)

         Example Diagram:
                 8
                / \
               3   10
              / \    \
             1   6    14
                / \   /
               4   7 13

         (Formulas depend on ordering, not general)

         ============================================
         📌 SUMMARY OF MAX VALUES (Examples)
         --------------------------------------------
         • Full Binary Tree → h=3 → Max nodes = 15
         • Complete Tree    → h=3 → Max nodes = 15
         • Perfect Tree     → h=2 → Max nodes = 7
         • Degenerate Tree  → n=5 → Max height = 4
         • Skewed Tree      → n=4 → Max height = 3
         • Balanced Tree    → n=15 → height ≈ log2(15)=4
         • Ordered Tree     → BST height depends on insertion order

         ============================================
         END OF NOTES
        */
    }
}
