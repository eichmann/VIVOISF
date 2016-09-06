package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Certificate theCertificate = (Certificate)findAncestorWithClass(this, Certificate.class);
			if (!theCertificate.commitNeeded) {
				pageContext.getOut().print(theCertificate.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Certificate theCertificate = (Certificate)findAncestorWithClass(this, Certificate.class);
			return theCertificate.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Certificate for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Certificate theCertificate = (Certificate)findAncestorWithClass(this, Certificate.class);
			theCertificate.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for label tag ");
		}
	}
}

