package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipDateTimeValueIterator theAuthorshipDateTimeValueIterator = (AuthorshipDateTimeValueIterator)findAncestorWithClass(this, AuthorshipDateTimeValueIterator.class);
			pageContext.getOut().print(theAuthorshipDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

