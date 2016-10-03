package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionCourtInverseIterator theDivisionCourtInverseIterator = (DivisionCourtInverseIterator)findAncestorWithClass(this, DivisionCourtInverseIterator.class);
			pageContext.getOut().print(theDivisionCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for court tag ");
		}
		return SKIP_BODY;
	}
}

