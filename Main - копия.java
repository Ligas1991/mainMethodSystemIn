package ua.i.pustovalov.taskTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    static BufferedReader in;

    static PrintWriter out;

    public static void main(String[] args) throws IOException {
	in = new BufferedReader(new InputStreamReader(System.in));
	out = new PrintWriter(System.out);
	new Main().solve();
	out.close();
    }

    public void solve() throws IOException {
	// number of tests
	int s = Integer.parseInt(in.readLine().trim());
	for (int i = 0; i < s; i++) {
	    // number of cities
	    int n = Integer.parseInt(in.readLine().trim());
	    for (int j = 0; j < n; j++) {
		// name of the city
		String name = in.readLine().trim();
		// number of neighbours
		int p = Integer.parseInt(in.readLine().trim());
		for (int k = 0; k < p; k++) {
		    // read neighbour index and cost
		    String[] inp = in.readLine().trim().split("\\s+");
		}
	    }
	    // number of paths to find
	    int r = Integer.parseInt(in.readLine().trim());
	    for (int j = 0; j < r; j++) {
		// read source and destination names
		String[] inp = in.readLine().trim().split("\\s+");
		// output result
		out.println("result");
	    }
	    if (i < s - 1) {
		// read empty line
		in.readLine();
	    }
	}

    }


}

