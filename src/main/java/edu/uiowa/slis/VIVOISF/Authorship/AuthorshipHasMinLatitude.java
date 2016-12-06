package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasMinLatitudeIterator theAuthorship = (AuthorshipHasMinLatitudeIterator)findAncestorWithClass(this, AuthorshipHasMinLatitudeIterator.class);
			pageContext.getOut().print(theAuthorship.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

