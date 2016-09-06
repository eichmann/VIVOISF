package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			if (!theHospital.commitNeeded) {
				pageContext.getOut().print(theHospital.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			return theHospital.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hospital for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			theHospital.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for subjectURI tag ");
		}
	}
}

