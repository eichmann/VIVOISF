package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRelatedByIterator theAuthorshipRelatedByIterator = (AuthorshipRelatedByIterator)findAncestorWithClass(this, AuthorshipRelatedByIterator.class);
			pageContext.getOut().print(theAuthorshipRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

