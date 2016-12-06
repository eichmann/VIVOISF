package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHDINotesIterator theAuthorship = (AuthorshipHDINotesIterator)findAncestorWithClass(this, AuthorshipHDINotesIterator.class);
			pageContext.getOut().print(theAuthorship.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

