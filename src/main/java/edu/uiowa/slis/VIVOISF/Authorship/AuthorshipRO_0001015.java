package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRO_0001015Iterator theAuthorshipRO_0001015Iterator = (AuthorshipRO_0001015Iterator)findAncestorWithClass(this, AuthorshipRO_0001015Iterator.class);
			pageContext.getOut().print(theAuthorshipRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

