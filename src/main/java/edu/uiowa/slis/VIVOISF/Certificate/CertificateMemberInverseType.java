package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateMemberInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateMemberInverseIterator theCertificateMemberInverseIterator = (CertificateMemberInverseIterator)findAncestorWithClass(this, CertificateMemberInverseIterator.class);
			pageContext.getOut().print(theCertificateMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for member tag ");
		}
		return SKIP_BODY;
	}
}

