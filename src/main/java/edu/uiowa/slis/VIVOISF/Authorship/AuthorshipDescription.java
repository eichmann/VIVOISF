package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipDescriptionIterator theAuthorship = (AuthorshipDescriptionIterator)findAncestorWithClass(this, AuthorshipDescriptionIterator.class);
			pageContext.getOut().print(theAuthorship.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for description tag ");
		}
		return SKIP_BODY;
	}
}

