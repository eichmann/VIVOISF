package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionIssuerInverseIterator theDivisionIssuerInverseIterator = (DivisionIssuerInverseIterator)findAncestorWithClass(this, DivisionIssuerInverseIterator.class);
			pageContext.getOut().print(theDivisionIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for issuer tag ");
		}
		return SKIP_BODY;
	}
}

