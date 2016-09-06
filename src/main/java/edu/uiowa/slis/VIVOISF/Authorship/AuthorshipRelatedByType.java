package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRelatedByIterator theAuthorshipRelatedByIterator = (AuthorshipRelatedByIterator)findAncestorWithClass(this, AuthorshipRelatedByIterator.class);
			pageContext.getOut().print(theAuthorshipRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

