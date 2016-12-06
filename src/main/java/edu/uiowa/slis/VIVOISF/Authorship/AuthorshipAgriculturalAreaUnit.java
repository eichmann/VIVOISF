package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipAgriculturalAreaUnitIterator theAuthorship = (AuthorshipAgriculturalAreaUnitIterator)findAncestorWithClass(this, AuthorshipAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theAuthorship.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

