package no.uib.ii.inf112;

public interface TextAligner {

	/**
	 * Center a string.
	 * 
	 * For example,
	 * 
	 * <pre>
	 * assertEquals("  A  ", textUtils.center("A", 5));
	 * </pre>
	 * 
	 * @param text  The string to be centered
	 * @param width The width of the page
	 * @return the centered text
	 */
	String center(String text, int width);

	/**
	 * Align string to the right.
	 * 
	 * For example,
	 * 
	 * <pre>
	 * assertEquals("    A", textUtils.flushRight("A", 5));
	 * </pre>
	 * 
	 * @param text  The string to be aligned
	 * @param width The width of the page
	 * @return the aligned text
	 */
	String flushRight(String text, int width);

	/**
	 * Align string to the left.
	 * 
	 * For example,
	 * 
	 * <pre>
	 * assertEquals("A    ", textUtils.flushLeft("A", 5));
	 * </pre>
	 * 
	 * @param text  The string to be aligned
	 * @param width The width of the page
	 * @return the aligned text
	 */
	String flushLeft(String text, int width);

	/**
	 * Justify text, so it uses the whole width.
	 * 
	 * Inserts extra spaces between words to make it fit the width.
	 * 
	 * For example,
	 * 
	 * <pre>
	 * assertEquals("fee   fie   foo", textUtils.justify("fee fie foo", 15));
	 * </pre>
	 * 
	 * @param text  The string to be aligned
	 * @param width The width of the page
	 * @return the aligned text
	 */
	String justify(String text, int width);

}
