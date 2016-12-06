package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipLandAreaUnitIterator theAuthorship = (AuthorshipLandAreaUnitIterator)findAncestorWithClass(this, AuthorshipLandAreaUnitIterator.class);
			pageContext.getOut().print(theAuthorship.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

