package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionOBI_0000304InverseIterator theDivisionOBI_0000304InverseIterator = (DivisionOBI_0000304InverseIterator)findAncestorWithClass(this, DivisionOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theDivisionOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

