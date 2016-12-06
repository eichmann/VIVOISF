package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityARIterator theAuthorship = (AuthorshipNationalityARIterator)findAncestorWithClass(this, AuthorshipNationalityARIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

