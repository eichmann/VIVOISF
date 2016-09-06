package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateResearchAreaOfIterator theCertificateResearchAreaOfIterator = (CertificateResearchAreaOfIterator)findAncestorWithClass(this, CertificateResearchAreaOfIterator.class);
			pageContext.getOut().print(theCertificateResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

