package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			HospitalPrefixNameIterator theHospital = (HospitalPrefixNameIterator)findAncestorWithClass(this, HospitalPrefixNameIterator.class);
			pageContext.getOut().print(theHospital.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

