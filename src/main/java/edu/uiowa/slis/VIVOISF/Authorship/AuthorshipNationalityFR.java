package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityFRIterator theAuthorship = (AuthorshipNationalityFRIterator)findAncestorWithClass(this, AuthorshipNationalityFRIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

