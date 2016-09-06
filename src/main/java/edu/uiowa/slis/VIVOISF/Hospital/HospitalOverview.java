package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			if (!theHospital.commitNeeded) {
				pageContext.getOut().print(theHospital.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			return theHospital.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hospital for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Hospital theHospital = (Hospital)findAncestorWithClass(this, Hospital.class);
			theHospital.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for overview tag ");
		}
	}
}

