package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			HospitalSuffixNameIterator theHospital = (HospitalSuffixNameIterator)findAncestorWithClass(this, HospitalSuffixNameIterator.class);
			pageContext.getOut().print(theHospital.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

