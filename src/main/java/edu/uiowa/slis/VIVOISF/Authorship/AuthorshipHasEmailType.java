package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasEmailIterator theAuthorshipHasEmailIterator = (AuthorshipHasEmailIterator)findAncestorWithClass(this, AuthorshipHasEmailIterator.class);
			pageContext.getOut().print(theAuthorshipHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

