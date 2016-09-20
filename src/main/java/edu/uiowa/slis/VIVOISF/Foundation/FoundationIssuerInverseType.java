package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationIssuerInverseIterator theFoundationIssuerInverseIterator = (FoundationIssuerInverseIterator)findAncestorWithClass(this, FoundationIssuerInverseIterator.class);
			pageContext.getOut().print(theFoundationIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for issuer tag ");
		}
		return SKIP_BODY;
	}
}

