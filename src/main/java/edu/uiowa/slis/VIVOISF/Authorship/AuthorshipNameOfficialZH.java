package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialZHIterator theAuthorship = (AuthorshipNameOfficialZHIterator)findAncestorWithClass(this, AuthorshipNameOfficialZHIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

