package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MedicalResidencySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MedicalResidency theMedicalResidency = (MedicalResidency)findAncestorWithClass(this, MedicalResidency.class);
			if (!theMedicalResidency.commitNeeded) {
				pageContext.getOut().print(theMedicalResidency.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MedicalResidency theMedicalResidency = (MedicalResidency)findAncestorWithClass(this, MedicalResidency.class);
			return theMedicalResidency.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MedicalResidency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MedicalResidency theMedicalResidency = (MedicalResidency)findAncestorWithClass(this, MedicalResidency.class);
			theMedicalResidency.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for subjectURI tag ");
		}
	}
}

