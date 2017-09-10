# CPEN 221 Bootcamp

### Step 1:

Clone this repository, and import it into Eclipse as a Gradle project. There is a premade Triangle class and a main function that uses it. Verify that it compiles and runs.

### Step 2:

Write a Shape interface with the following methods:

    double perimeter();
    double area();

Now make Triangle implement Shape. Add methods as necessary to make it work.

### Step 3:

Write a Rectangle class implementing Shape. It should be represented by the coordinates (x1, x2) and (y1, y2) which give the locations of two opposite corners. It should have the following methods:

    double perimeter();   //Necessary for Shape interface
    double area();        //Necessary for Shape interface
    double aspectRatio(); //Returns width / height
    
Now modify the main function to create some rectangles and put them in the same list as the triangles.

Finally, create a new loop that prints out the aspect ratio of all the rectangles in the list.

### Step 4:

Write a CompositeShape class that implements Shape. It is a collection of child Shapes, and its methods get the total for all the shapes it contains. It should internally have an ArrayList<Shape> that can store Shapes.

Methods:

    double perimeter();   //Returns the sum of the perimeter of every child shape.
    double area();        //Returns the sum of the area of every child shape
    void addShape(Shape); //Adds the given Shape to the CompositeShape.

Incorporate CompositeShape in the main function.

Note that one CompositeShape can contain another CompositeShape. What happens if you add a CompositeShape to itself?



