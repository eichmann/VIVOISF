package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmDistributorIterator theFilmDistributorIterator = (FilmDistributorIterator)findAncestorWithClass(this, FilmDistributorIterator.class);
			pageContext.getOut().print(theFilmDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for distributor tag ");
		}
		return SKIP_BODY;
	}
}

