package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipAgriculturalAreaYearIterator theAuthorship = (AuthorshipAgriculturalAreaYearIterator)findAncestorWithClass(this, AuthorshipAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theAuthorship.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

