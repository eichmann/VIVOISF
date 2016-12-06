package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialRUIterator theAuthorship = (AuthorshipNameOfficialRUIterator)findAncestorWithClass(this, AuthorshipNameOfficialRUIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

