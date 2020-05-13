package lviv.lgs.ua;

public class Application {

	public static void main(String[] args) {
		
			Number arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
			
			Collection colection = new Collection(arr);

			Iterator iterator1 = colection.createForward();
			while (iterator1.hasNext())
				iterator1.next();

			System.out.println();
			Iterator iterator2 = colection.createBackward();
			while (iterator2.hasNext())
				iterator2.next();

			System.out.println();
			Iterator iterator3 = colection.createAnonymous();
			while (iterator3.hasNext())
				iterator3.next();

			System.out.println();
			Iterator iterator4 = colection.createLocal();
			while (iterator4.hasNext())
				iterator4.next();

			System.out.println();
			Iterator iterator5 = new Collection.staticIterator();
			while (iterator5.hasNext())
				iterator5.next();

		}
	}