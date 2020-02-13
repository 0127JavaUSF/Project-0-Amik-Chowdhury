package com.revature.project0.viewer;
// Interface can be implemented by any of our classes that represent
// a menu that we can make the user view - this allows the user to travel
// through the different states of our program.

public interface Viewer {
	void openMenu(); // reusable if overridden
	Viewer pickOption(); // reusable if overridden
}

