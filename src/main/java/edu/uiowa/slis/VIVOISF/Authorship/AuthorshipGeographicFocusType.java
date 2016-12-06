package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipGeographicFocusIterator theAuthorshipGeographicFocusIterator = (AuthorshipGeographicFocusIterator)findAncestorWithClass(this, AuthorshipGeographicFocusIterator.class);
			pageContext.getOut().print(theAuthorshipGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

