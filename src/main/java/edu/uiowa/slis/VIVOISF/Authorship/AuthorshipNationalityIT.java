package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityITIterator theAuthorship = (AuthorshipNationalityITIterator)findAncestorWithClass(this, AuthorshipNationalityITIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

