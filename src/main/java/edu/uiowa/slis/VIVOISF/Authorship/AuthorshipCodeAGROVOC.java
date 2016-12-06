package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeAGROVOCIterator theAuthorship = (AuthorshipCodeAGROVOCIterator)findAncestorWithClass(this, AuthorshipCodeAGROVOCIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

