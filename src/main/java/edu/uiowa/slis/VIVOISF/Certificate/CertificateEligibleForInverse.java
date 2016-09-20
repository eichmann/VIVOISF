package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateEligibleForInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateEligibleForInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateEligibleForInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateEligibleForInverseIterator theCertificateEligibleForInverseIterator = (CertificateEligibleForInverseIterator)findAncestorWithClass(this, CertificateEligibleForInverseIterator.class);
			pageContext.getOut().print(theCertificateEligibleForInverseIterator.getEligibleForInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for eligibleFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for eligibleFor tag ");
		}
		return SKIP_BODY;
	}
}

