package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyIssuerInverseIterator theGovernmentAgencyIssuerInverseIterator = (GovernmentAgencyIssuerInverseIterator)findAncestorWithClass(this, GovernmentAgencyIssuerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for issuer tag ");
		}
		return SKIP_BODY;
	}
}

