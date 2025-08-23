public class LibraryItem {
    /*
     * 62. Start with a base class LibraryItem that includes common
     * attributes like itemID, title, and author, and methods like
     * checkout() and returnItem(). Create subclasses such as Book,
     * Magazine, and DVD, each inheriting from LibraryItem. Add unique
     * attributes to each subclass, like ISBN for Book, issueNumber for
     * Magazine, and duration for DVD.
     */
    int itemId;
    String title;
    String author;
    boolean isAvailable;

    LibraryItem() {
    }

    LibraryItem(int itemId, String title, String author) {
        this.author = author;
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    void checkout(int itemId) {
        if (itemId == this.itemId && this.isAvailable) {
            System.out.printf("Library Item with Item ID %d is issued.", itemId);
            this.isAvailable = false;
        } else if (itemId == this.itemId && !this.isAvailable) {
            System.out.printf("The Library Item is Not Available!!");
        } else if (itemId != this.itemId) {
            System.out.printf("Invalid Item id");
        }

    }

    void returnItem(int itemId) {
        if (itemId == this.itemId && !this.isAvailable) {
            System.out.printf("Library Item with Item ID %d is returned.", itemId);
            this.isAvailable = true;
        } else if (itemId == this.itemId && this.isAvailable) {
            System.out.printf("The Library Item is already Available!!");
        } else if (itemId != this.itemId) {
            System.out.printf("Invalid Item id");
        }

    }
}
