package com.revature.project0;

import com.revature.project0.viewer.MainMenu;
import com.revature.project0.viewer.Viewer;

 // Program begins from here. 
public class Launcher {
public static void main(String[] args) {
	Viewer view = new MainMenu();
	
	while(view != null) { // Waits for user input until user wants to exit the program.
		view.openMenu();
		view = view.pickOption();
	}
	System.out.println("Time to make like a banana and split!"+
	"                                                   \r\n" + 
	"                                                 syyssyhddmh               \r\n" + 
	"                                                `:/+:-/yo+s/               \r\n" + 
	"                                                .-+s-.+d+:o-               \r\n" + 
	"                                               `.:sh--sm:://               \r\n" + 
	"                                              `../so.:od/:-+.              \r\n" + 
	"                                            `.--:+/-:/ohh:.:+.             \r\n" + 
	"                                         `....-::---:/+yd:--://.           \r\n" + 
	"                                        .....---..-:://+/..-://+-          \r\n" + 
	"                                      `.....--....-:////....-:/+o`         \r\n" + 
	"                                   ``....----....-:///+/....-://+/         \r\n" + 
	"                                ``....-----....-::///++-....-::/+o`        \r\n" + 
	"             ``            ```...-------....--::////+o+.....-::/+o:        \r\n" + 
	"            oys:---........---------------::::///+++oo-....-::://+/        \r\n" + 
	"       :+/..oy+///::::::::::::::::::::://////////+ooo-....--::://++        \r\n" + 
	"       ymds++++////////////////////////////////++os+-....--::://+o+        \r\n" + 
	"       `/ossssso++////////////////////////////+oso:.....--:::://+o:        \r\n" + 
	"         ./ossssso++++++++++++++++++++////+++oo+:....---::::://+oo`        \r\n" + 
	"           ./sssyyysooooooo+++++++///////++oo/-....---:::::://+oo-         \r\n" + 
	"            /yyossyssssoooo++++/////::/+++/:...-----::::::///+oo:          \r\n" + 
	"            +ddyyyyyyyyyys+::///////+++/-...-----:::::::///++o+-           \r\n" + 
	"             `.:+osyyyyo/------::///:-..------:::::::////++oo/.            \r\n" + 
	"                  `/ys:::://++oo+/--------:::::///////++ooo/.              \r\n" + 
	"                   /ddsssssssyhs:::::::::::///////+++ooo+/.                \r\n" + 
	"                    .-/+ssyyyhmy+++///////+++++ooooo++/-`                  \r\n" + 
	"                        `.-://++///+++ooooooooo+++:-.                      \r\n" + 
	"                                     `..-----..``            ");
	}

}
