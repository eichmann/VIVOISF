package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmContributorListIterator theFilmContributorListIterator = (FilmContributorListIterator)findAncestorWithClass(this, FilmContributorListIterator.class);
			pageContext.getOut().print(theFilmContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

