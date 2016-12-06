package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasSubjectAreaIterator theAuthorshipHasSubjectAreaIterator = (AuthorshipHasSubjectAreaIterator)findAncestorWithClass(this, AuthorshipHasSubjectAreaIterator.class);
			pageContext.getOut().print(theAuthorshipHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

