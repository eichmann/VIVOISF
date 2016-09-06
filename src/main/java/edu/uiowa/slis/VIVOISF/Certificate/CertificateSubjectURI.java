package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Certificate theCertificate = (Certificate)findAncestorWithClass(this, Certificate.class);
			if (!theCertificate.commitNeeded) {
				pageContext.getOut().print(theCertificate.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Certificate theCertificate = (Certificate)findAncestorWithClass(this, Certificate.class);
			return theCertificate.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Certificate for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Certificate theCertificate = (Certificate)findAncestorWithClass(this, Certificate.class);
			theCertificate.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for subjectURI tag ");
		}
	}
}

