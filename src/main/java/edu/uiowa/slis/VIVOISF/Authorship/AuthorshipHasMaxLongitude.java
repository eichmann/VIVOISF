package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasMaxLongitudeIterator theAuthorship = (AuthorshipHasMaxLongitudeIterator)findAncestorWithClass(this, AuthorshipHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theAuthorship.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

