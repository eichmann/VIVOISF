package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmContributorListIterator theFilmContributorListIterator = (FilmContributorListIterator)findAncestorWithClass(this, FilmContributorListIterator.class);
			pageContext.getOut().print(theFilmContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

