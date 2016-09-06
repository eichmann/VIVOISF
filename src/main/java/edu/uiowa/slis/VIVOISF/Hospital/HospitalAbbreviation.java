package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			if (!theHospital.commitNeeded) {
				pageContext.getOut().print(theHospital.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			return theHospital.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hospital for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			theHospital.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for abbreviation tag ");
		}
	}
}

