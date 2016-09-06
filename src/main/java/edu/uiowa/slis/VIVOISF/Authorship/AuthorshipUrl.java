package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipUrlIterator theAuthorship = (AuthorshipUrlIterator)findAncestorWithClass(this, AuthorshipUrlIterator.class);
			pageContext.getOut().print(theAuthorship.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for url tag ");
		}
		return SKIP_BODY;
	}
}

