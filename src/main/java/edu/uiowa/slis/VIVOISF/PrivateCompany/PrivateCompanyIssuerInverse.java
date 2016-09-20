package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyIssuerInverseIterator thePrivateCompanyIssuerInverseIterator = (PrivateCompanyIssuerInverseIterator)findAncestorWithClass(this, PrivateCompanyIssuerInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for issuer tag ");
		}
		return SKIP_BODY;
	}
}

