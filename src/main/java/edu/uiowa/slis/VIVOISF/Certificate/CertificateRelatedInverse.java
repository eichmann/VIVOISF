package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateRelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateRelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateRelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateRelatedInverseIterator theCertificateRelatedInverseIterator = (CertificateRelatedInverseIterator)findAncestorWithClass(this, CertificateRelatedInverseIterator.class);
			pageContext.getOut().print(theCertificateRelatedInverseIterator.getRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for related tag ");
		}
		return SKIP_BODY;
	}
}
