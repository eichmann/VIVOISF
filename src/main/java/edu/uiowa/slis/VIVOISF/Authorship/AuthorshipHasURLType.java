package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasURLIterator theAuthorshipHasURLIterator = (AuthorshipHasURLIterator)findAncestorWithClass(this, AuthorshipHasURLIterator.class);
			pageContext.getOut().print(theAuthorshipHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

