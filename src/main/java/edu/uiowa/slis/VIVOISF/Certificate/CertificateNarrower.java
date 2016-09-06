package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateNarrower extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateNarrower currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateNarrower.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateNarrowerIterator theCertificateNarrowerIterator = (CertificateNarrowerIterator)findAncestorWithClass(this, CertificateNarrowerIterator.class);
			pageContext.getOut().print(theCertificateNarrowerIterator.getNarrower());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for narrower tag ");
		}
		return SKIP_BODY;
	}
}

