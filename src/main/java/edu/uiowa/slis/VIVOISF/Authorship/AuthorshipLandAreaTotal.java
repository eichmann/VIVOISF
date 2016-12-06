package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipLandAreaTotalIterator theAuthorship = (AuthorshipLandAreaTotalIterator)findAncestorWithClass(this, AuthorshipLandAreaTotalIterator.class);
			pageContext.getOut().print(theAuthorship.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

