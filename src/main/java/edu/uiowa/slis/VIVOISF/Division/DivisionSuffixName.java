package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DivisionSuffixNameIterator theDivision = (DivisionSuffixNameIterator)findAncestorWithClass(this, DivisionSuffixNameIterator.class);
			pageContext.getOut().print(theDivision.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

