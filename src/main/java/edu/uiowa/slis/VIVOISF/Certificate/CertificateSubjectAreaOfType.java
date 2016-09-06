package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateSubjectAreaOfIterator theCertificateSubjectAreaOfIterator = (CertificateSubjectAreaOfIterator)findAncestorWithClass(this, CertificateSubjectAreaOfIterator.class);
			pageContext.getOut().print(theCertificateSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

