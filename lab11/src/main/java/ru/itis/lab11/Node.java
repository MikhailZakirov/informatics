package ru.itis.lab11;

class Node {
        private int value;
        private Node left;
        private Node right;

        public void printNode() {
            System.out.println(" Выбранный узел имеет значение :" + value);
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(final int value) {
            this.value = value;
        }

        public Node getLeft() {
            return this.left;
        }

        public void setLeft(final Node left) {
            this.left = left;
        }

        public Node getRight() {
            return this.right;
        }

        public void setRight(final Node right) {
            this.right = right;
        }
}