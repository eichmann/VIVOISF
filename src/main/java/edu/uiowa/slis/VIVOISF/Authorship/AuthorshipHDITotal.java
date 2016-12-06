package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHDITotalIterator theAuthorship = (AuthorshipHDITotalIterator)findAncestorWithClass(this, AuthorshipHDITotalIterator.class);
			pageContext.getOut().print(theAuthorship.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

