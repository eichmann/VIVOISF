package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasMaxLatitudeIterator theAuthorship = (AuthorshipHasMaxLatitudeIterator)findAncestorWithClass(this, AuthorshipHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theAuthorship.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

