package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmInformationResourceSupportedByIterator theFilmInformationResourceSupportedByIterator = (FilmInformationResourceSupportedByIterator)findAncestorWithClass(this, FilmInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theFilmInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

