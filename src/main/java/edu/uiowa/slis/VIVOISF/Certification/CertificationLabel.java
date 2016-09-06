package edu.uiowa.slis.VIVOISF.Certification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Certification theCertification = (Certification)findAncestorWithClass(this, Certification.class);
			if (!theCertification.commitNeeded) {
				pageContext.getOut().print(theCertification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Certification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Certification theCertification = (Certification)findAncestorWithClass(this, Certification.class);
			return theCertification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Certification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Certification theCertification = (Certification)findAncestorWithClass(this, Certification.class);
			theCertification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Certification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for label tag ");
		}
	}
}

