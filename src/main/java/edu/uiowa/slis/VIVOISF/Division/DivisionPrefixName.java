package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DivisionPrefixNameIterator theDivision = (DivisionPrefixNameIterator)findAncestorWithClass(this, DivisionPrefixNameIterator.class);
			pageContext.getOut().print(theDivision.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

