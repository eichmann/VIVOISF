package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalGoverningAuthorityForIterator theHospitalGoverningAuthorityForIterator = (HospitalGoverningAuthorityForIterator)findAncestorWithClass(this, HospitalGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theHospitalGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

