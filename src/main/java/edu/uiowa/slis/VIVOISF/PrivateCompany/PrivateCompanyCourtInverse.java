package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyCourtInverseIterator thePrivateCompanyCourtInverseIterator = (PrivateCompanyCourtInverseIterator)findAncestorWithClass(this, PrivateCompanyCourtInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for court tag ");
		}
		return SKIP_BODY;
	}
}

