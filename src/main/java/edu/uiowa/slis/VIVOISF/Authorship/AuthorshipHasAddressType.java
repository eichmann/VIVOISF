package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasAddressIterator theAuthorshipHasAddressIterator = (AuthorshipHasAddressIterator)findAncestorWithClass(this, AuthorshipHasAddressIterator.class);
			pageContext.getOut().print(theAuthorshipHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

