package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipAgriculturalAreaTotalIterator theAuthorship = (AuthorshipAgriculturalAreaTotalIterator)findAncestorWithClass(this, AuthorshipAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theAuthorship.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

