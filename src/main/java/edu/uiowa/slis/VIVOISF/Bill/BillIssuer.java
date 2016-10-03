package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(BillIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillIssuerIterator theBillIssuerIterator = (BillIssuerIterator)findAncestorWithClass(this, BillIssuerIterator.class);
			pageContext.getOut().print(theBillIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for issuer tag ");
		}
		return SKIP_BODY;
	}
}

