package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			if (!theHospital.commitNeeded) {
				pageContext.getOut().print(theHospital.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			return theHospital.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hospital for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			theHospital.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for label tag ");
		}
	}
}

