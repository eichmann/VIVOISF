package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasMinLongitudeIterator theAuthorship = (AuthorshipHasMinLongitudeIterator)findAncestorWithClass(this, AuthorshipHasMinLongitudeIterator.class);
			pageContext.getOut().print(theAuthorship.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

