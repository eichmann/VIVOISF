package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipBFO_0000051Iterator theAuthorshipBFO_0000051Iterator = (AuthorshipBFO_0000051Iterator)findAncestorWithClass(this, AuthorshipBFO_0000051Iterator.class);
			pageContext.getOut().print(theAuthorshipBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

