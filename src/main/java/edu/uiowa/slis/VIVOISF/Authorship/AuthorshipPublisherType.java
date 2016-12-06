package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipPublisherIterator theAuthorshipPublisherIterator = (AuthorshipPublisherIterator)findAncestorWithClass(this, AuthorshipPublisherIterator.class);
			pageContext.getOut().print(theAuthorshipPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for publisher tag ");
		}
		return SKIP_BODY;
	}
}

