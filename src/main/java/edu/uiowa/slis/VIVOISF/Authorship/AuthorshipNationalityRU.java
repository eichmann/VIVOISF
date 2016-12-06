package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityRUIterator theAuthorship = (AuthorshipNationalityRUIterator)findAncestorWithClass(this, AuthorshipNationalityRUIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

