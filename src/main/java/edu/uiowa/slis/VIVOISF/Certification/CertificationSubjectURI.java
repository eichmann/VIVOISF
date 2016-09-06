package edu.uiowa.slis.VIVOISF.Certification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Certification theCertification = (Certification)findAncestorWithClass(this, Certification.class);
			if (!theCertification.commitNeeded) {
				pageContext.getOut().print(theCertification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Certification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Certification theCertification = (Certification)findAncestorWithClass(this, Certification.class);
			return theCertification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Certification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Certification theCertification = (Certification)findAncestorWithClass(this, Certification.class);
			theCertification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Certification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certification for subjectURI tag ");
		}
	}
}

