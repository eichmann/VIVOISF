package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRO_0001025Iterator theAuthorshipRO_0001025Iterator = (AuthorshipRO_0001025Iterator)findAncestorWithClass(this, AuthorshipRO_0001025Iterator.class);
			pageContext.getOut().print(theAuthorshipRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
