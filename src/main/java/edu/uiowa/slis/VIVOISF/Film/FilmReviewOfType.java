package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmReviewOfIterator theFilmReviewOfIterator = (FilmReviewOfIterator)findAncestorWithClass(this, FilmReviewOfIterator.class);
			pageContext.getOut().print(theFilmReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

