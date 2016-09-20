package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalIssuerInverseIterator theHospitalIssuerInverseIterator = (HospitalIssuerInverseIterator)findAncestorWithClass(this, HospitalIssuerInverseIterator.class);
			pageContext.getOut().print(theHospitalIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for issuer tag ");
		}
		return SKIP_BODY;
	}
}

