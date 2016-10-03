package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionOwnerInverseIterator theDivisionOwnerInverseIterator = (DivisionOwnerInverseIterator)findAncestorWithClass(this, DivisionOwnerInverseIterator.class);
			pageContext.getOut().print(theDivisionOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for owner tag ");
		}
		return SKIP_BODY;
	}
}

