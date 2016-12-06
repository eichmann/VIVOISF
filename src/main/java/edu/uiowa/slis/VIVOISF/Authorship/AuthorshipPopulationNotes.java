package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipPopulationNotesIterator theAuthorship = (AuthorshipPopulationNotesIterator)findAncestorWithClass(this, AuthorshipPopulationNotesIterator.class);
			pageContext.getOut().print(theAuthorship.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

