package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeUNDPIterator theAuthorship = (AuthorshipCodeUNDPIterator)findAncestorWithClass(this, AuthorshipCodeUNDPIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

