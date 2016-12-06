package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipLandAreaYearIterator theAuthorship = (AuthorshipLandAreaYearIterator)findAncestorWithClass(this, AuthorshipLandAreaYearIterator.class);
			pageContext.getOut().print(theAuthorship.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

