package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmOclcnumIterator theFilm = (FilmOclcnumIterator)findAncestorWithClass(this, FilmOclcnumIterator.class);
			pageContext.getOut().print(theFilm.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

