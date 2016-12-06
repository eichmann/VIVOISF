package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipGDPYearIterator theAuthorship = (AuthorshipGDPYearIterator)findAncestorWithClass(this, AuthorshipGDPYearIterator.class);
			pageContext.getOut().print(theAuthorship.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

