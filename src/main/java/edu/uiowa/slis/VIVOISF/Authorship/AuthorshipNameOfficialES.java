package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialESIterator theAuthorship = (AuthorshipNameOfficialESIterator)findAncestorWithClass(this, AuthorshipNameOfficialESIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

