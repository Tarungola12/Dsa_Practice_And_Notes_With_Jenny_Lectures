package BinaryTree;

public class Lec2 {
    public static void main(String[] args) {
        System.out.println("Binary tree with its properties");
            /*
         🌲 BINARY TREE NOTES (With Diagrams)
         ============================================

         1️⃣ DEFINITION
         --------------------------------------------
         • A Binary Tree is a type of Tree in which
           each node can have AT MOST 2 children:
             → Left Child
             → Right Child

         Example Diagram:
                 A
                / \
               B   C
              / \
             D   E


         2️⃣ MAXIMUM NUMBER OF NODES AT A GIVEN LEVEL
         --------------------------------------------
         • Formula → At Level l → Maximum nodes = 2^l

         Example:
                 (Level 0)          A
                                 /     \
                 (Level 1)      B       C
                              /   \    /   \
                 (Level 2)   D     E  F     G
                           /|\   /|\ /|\   /|\
                 (Level 3) H I J K L M N O

         ✅ Check with Formula:
         • Level 0 → 2^0 = 1 node  → A
         • Level 1 → 2^1 = 2 nodes → B, C
         • Level 2 → 2^2 = 4 nodes → D, E, F, G
         • Level 3 → 2^3 = 8 nodes → H, I, J, K, L, M, N, O


         3️⃣ MINIMUM & MAXIMUM NUMBER OF NODES IN A TREE OF HEIGHT h
         --------------------------------------------
         • Minimum nodes = h + 1  (skewed tree → har level pe ek hi node)
         • Maximum nodes = 2^(h+1) - 1  (perfect binary tree → har level filled)

         Example:
         Height = 3

         Skewed Tree (Min nodes = 3+1 = 4)
             A
              \
               B
                \
                 C
                  \
                   D

         Perfect Binary Tree (Max nodes = 2^(3+1)-1 = 15)
                      A
                   /     \
                 B         C
                / \       / \
               D   E     F   G
              /\   /\   /\   /\
             H I  J K  L M  N O


         4️⃣ MINIMUM HEIGHT OF A TREE WITH N NODES
         --------------------------------------------
         • Formula: h = log2(n + 1) - 1

         Example:
         If n = 15 nodes
         h = log2(15+1) - 1 = log2(16) - 1 = 4 - 1 = 3

         ✅ This means → With 15 nodes → minimum height = 3
         (i.e., the tree will be perfect binary tree)


         5️⃣ NUMBER OF DISTINCT BINARY TREES POSSIBLE WITH N NODES
         --------------------------------------------
         • Formula: (1 / (n + 1)) * (2n C n)  → Catalan Number

         Example:
         If n = 3
         Number of binary trees = (1/4) * (6 C 3)
                                = (1/4) * 20 = 5

                                1)      A          2)      A        3)        A
         ✅ 5 different shapes of binary trees are possible with 3 nodes.
         B   C             B                   C


         Example Structures (n=3):
                 / \               /                 \
                                /                     /
                               C                     B

         (and 2 more variations)


         6️⃣ NUMBER OF DISTINCT BINARY TREES WITH LABELLED NODES
         --------------------------------------------
         • Formula: Catalan Number * n!
           = (1 / (n + 1)) * (2n C n) * n!

         Example:
         If n = 3
         Unlabelled binary trees = 5
         Labelled binary trees   = 5 * 3! = 30


         7️⃣ MAXIMUM NUMBER OF BINARY TREES OF MAXIMUM HEIGHT
         --------------------------------------------
         • Formula: 2^(n - 1)

         Example:
         If n = 4
         Max number of binary trees of max height = 2^(4-1) = 8

         Example Skewed Trees of n=4 (height = 3):
         1) A-B-C-D in straight line (all right)
         2) A-B-C-D in straight line (all left)
         ... and so on → total 8 variations possible.


         ============================================
         📌 SUMMARY (FORMULAS)
         --------------------------------------------
         • Max nodes at level l      = 2^l
         • Min nodes in tree (h)     = h + 1
         • Max nodes in tree (h)     = 2^(h+1) - 1
         • Min height (n nodes)      = log2(n + 1) - 1
         • Number of binary trees    = (1/(n+1)) * (2n C n)
         • Labelled binary trees     = (1/(n+1)) * (2n C n) * n!
         • Max binary trees (height) = 2^(n - 1)

         ============================================
         END OF NOTES
        */
    }
}
