package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityESIterator theAuthorship = (AuthorshipNationalityESIterator)findAncestorWithClass(this, AuthorshipNationalityESIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

