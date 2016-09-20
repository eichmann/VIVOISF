package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalIssuerInverseIterator theHospitalIssuerInverseIterator = (HospitalIssuerInverseIterator)findAncestorWithClass(this, HospitalIssuerInverseIterator.class);
			pageContext.getOut().print(theHospitalIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for issuer tag ");
		}
		return SKIP_BODY;
	}
}

