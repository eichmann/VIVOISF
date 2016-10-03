package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateTopConceptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateTopConceptOfIterator theCertificateTopConceptOfIterator = (CertificateTopConceptOfIterator)findAncestorWithClass(this, CertificateTopConceptOfIterator.class);
			pageContext.getOut().print(theCertificateTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

