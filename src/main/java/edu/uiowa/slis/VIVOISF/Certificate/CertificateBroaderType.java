package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateBroaderType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateBroaderType currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateBroaderType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateBroaderIterator theCertificateBroaderIterator = (CertificateBroaderIterator)findAncestorWithClass(this, CertificateBroaderIterator.class);
			pageContext.getOut().print(theCertificateBroaderIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for broader tag ");
		}
		return SKIP_BODY;
	}
}

