package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipLandAreaNotesIterator theAuthorship = (AuthorshipLandAreaNotesIterator)findAncestorWithClass(this, AuthorshipLandAreaNotesIterator.class);
			pageContext.getOut().print(theAuthorship.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

