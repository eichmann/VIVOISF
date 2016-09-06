package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateRelatedType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateRelatedType currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateRelatedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateRelatedIterator theCertificateRelatedIterator = (CertificateRelatedIterator)findAncestorWithClass(this, CertificateRelatedIterator.class);
			pageContext.getOut().print(theCertificateRelatedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for related tag ");
		}
		return SKIP_BODY;
	}
}

