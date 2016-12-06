package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeDBPediaIDIterator theAuthorship = (AuthorshipCodeDBPediaIDIterator)findAncestorWithClass(this, AuthorshipCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

