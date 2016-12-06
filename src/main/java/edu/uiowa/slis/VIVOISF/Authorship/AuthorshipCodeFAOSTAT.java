package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeFAOSTATIterator theAuthorship = (AuthorshipCodeFAOSTATIterator)findAncestorWithClass(this, AuthorshipCodeFAOSTATIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

