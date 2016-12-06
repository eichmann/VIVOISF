package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipDateTimeIntervalIterator theAuthorshipDateTimeIntervalIterator = (AuthorshipDateTimeIntervalIterator)findAncestorWithClass(this, AuthorshipDateTimeIntervalIterator.class);
			pageContext.getOut().print(theAuthorshipDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

