package edu.uiowa.slis.VIVOISF.Campus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CampusValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CampusValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CampusValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CampusValidInInverseIterator theCampusValidInInverseIterator = (CampusValidInInverseIterator)findAncestorWithClass(this, CampusValidInInverseIterator.class);
			pageContext.getOut().print(theCampusValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for validIn tag ");
		}
		return SKIP_BODY;
	}
}

