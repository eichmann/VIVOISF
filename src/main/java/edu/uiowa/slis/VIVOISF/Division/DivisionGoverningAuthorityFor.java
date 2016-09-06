package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionGoverningAuthorityForIterator theDivisionGoverningAuthorityForIterator = (DivisionGoverningAuthorityForIterator)findAncestorWithClass(this, DivisionGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theDivisionGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

