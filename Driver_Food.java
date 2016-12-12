
public class Driver_Food {

	public static void main(String[] args){
		
		/// Demonstrating Polymorphism (and somewhat a review of superclases)
		// Using types of Food as an example.
		
		Food genericEdible = new Food();
		// This food class has no abstract modifiers, so it can insantiate an object. 
		Burger hamburgSandwich = new Burger();
		// This burger class can have object of type Burger, just as Food.
		Food italyCircle = new Pizza ();
		// This statement is delcaring a new object Pizza using the
		// generic type Food. There's nothing too special about this on
		// it's own, because it functions just like the last statement.
		// (It creates a new Pizza object with name italyCircle)
		
		Food burger;
		Burger yummy = new Burger();
		burger = yummy;
		// This is just like when we had set two Strings equal to each other.
		// They are now aliases of each other, and this is possible because
		// "burger" is a food object of same Food type, and 
		// "yummy" is a Burger object of the inherited Food type.
		//--------------------------------------------------------------
		// You can eat food, and you can eat a burger.
		//--------------------------------------------------------------
		
		Food cheeseburger;
		Burger delish = new Burger();
		delish = cheeseburger;
		// See how this one doesn't work? This is because we are trying
		// to set a Burger object as an alias to a Food object. Burgers
		// are more specific than Foods, so it makes sense that we
		// cannot make a specific object refer to a generic type.
		
		// That is, unless we cast it. If you put (Burger) right before
		// "cheeseburger," you can tell the program that we are SPECIFYING
		// Food item cheeseburger is now a Burger object. (just like casting
		// a double into an integer, we tell the program that we're changing its type)
		
		//--------------------------------------------------------------
		// You have some food. Is it a burger? No.
		// Because you said it was "some food" in the first sentence,
		// there's no way for the program to know if it really is a burger.
		// You have to say "You have a burger" or 
		// "You have some food that is a burger."
		//--------------------------------------------------------------
		
		// Note: this is avoided by following the conventions demonstrated
		// earlier in the program.
		
		
		Burger deliciousFood;
		Pizza goodPizza = new Pizza();
		goodPizza = (Pizza)deliciousFood;
		
		// See how there's an error? That is because this operation is
		// attempting to cast a Burger object as a Pizza object. Even
		// though they are both objects of type Food, this is understandably
		// an illegal statement, because a Burger object may have different
		// traits and methods from a Pizza object.
		
		// In the previous set of statements,
		// a Burger object has ALL the from a Food object because it
		// inherits it.
		
		//--------------------------------------------------------------
		// You can slice a Pizza eight ways, but you probably 
		// shouldn't cut up a Burger like that.
		//--------------------------------------------------------------
		
		genericEdible.eat();
		hamburgSandwich.eat();
		italyCircle.eat();
		// Demonstration of method overriding. This will tie in nicely
		// To applying Polymorphism to Arrays.
		
		
	}
}
