package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeGAULIterator theAuthorship = (AuthorshipCodeGAULIterator)findAncestorWithClass(this, AuthorshipCodeGAULIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

