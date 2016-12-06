package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeISO3Iterator theAuthorship = (AuthorshipCodeISO3Iterator)findAncestorWithClass(this, AuthorshipCodeISO3Iterator.class);
			pageContext.getOut().print(theAuthorship.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

