package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasNameIterator theAuthorshipHasNameIterator = (AuthorshipHasNameIterator)findAncestorWithClass(this, AuthorshipHasNameIterator.class);
			pageContext.getOut().print(theAuthorshipHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasName tag ");
		}
		return SKIP_BODY;
	}
}

