package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeFAOTERMIterator theAuthorship = (AuthorshipCodeFAOTERMIterator)findAncestorWithClass(this, AuthorshipCodeFAOTERMIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

