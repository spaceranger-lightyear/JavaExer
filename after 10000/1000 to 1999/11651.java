import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());

		int [][] set = new int [N][2];

		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

			set[i][0] = x;
			set[i][1] = y;
		}
		
		Arrays.parallelSort(set, new Comparator<int []>() {
			@Override
			public int compare(int[] y1, int[] y2) {
				if( y1[1] == y2[1] )
					return Integer.compare(y1[0], y2[0]);
				return Integer.compare(y1[1], y2[1]);
			}
		});
		
		for( int i = 0; i < N; i++ )
			bw.write(set[i][0] + " " + set[i][1] + "\n");
		bw.flush();
	}
}