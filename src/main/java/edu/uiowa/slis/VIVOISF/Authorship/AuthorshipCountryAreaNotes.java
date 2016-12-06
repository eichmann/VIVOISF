package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCountryAreaNotesIterator theAuthorship = (AuthorshipCountryAreaNotesIterator)findAncestorWithClass(this, AuthorshipCountryAreaNotesIterator.class);
			pageContext.getOut().print(theAuthorship.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

