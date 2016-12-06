package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialITIterator theAuthorship = (AuthorshipNameOfficialITIterator)findAncestorWithClass(this, AuthorshipNameOfficialITIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

