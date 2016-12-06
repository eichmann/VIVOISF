package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasResearchAreaIterator theAuthorshipHasResearchAreaIterator = (AuthorshipHasResearchAreaIterator)findAncestorWithClass(this, AuthorshipHasResearchAreaIterator.class);
			pageContext.getOut().print(theAuthorshipHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

