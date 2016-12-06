package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasURLIterator theAuthorshipHasURLIterator = (AuthorshipHasURLIterator)findAncestorWithClass(this, AuthorshipHasURLIterator.class);
			pageContext.getOut().print(theAuthorshipHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

