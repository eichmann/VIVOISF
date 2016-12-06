package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialFRIterator theAuthorship = (AuthorshipNameOfficialFRIterator)findAncestorWithClass(this, AuthorshipNameOfficialFRIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

