package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRO_0002353Iterator theAuthorshipRO_0002353Iterator = (AuthorshipRO_0002353Iterator)findAncestorWithClass(this, AuthorshipRO_0002353Iterator.class);
			pageContext.getOut().print(theAuthorshipRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

