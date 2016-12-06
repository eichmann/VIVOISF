package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeISO2Iterator theAuthorship = (AuthorshipCodeISO2Iterator)findAncestorWithClass(this, AuthorshipCodeISO2Iterator.class);
			pageContext.getOut().print(theAuthorship.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

