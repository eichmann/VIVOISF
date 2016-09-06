package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalRO_0000056Iterator theHospitalRO_0000056Iterator = (HospitalRO_0000056Iterator)findAncestorWithClass(this, HospitalRO_0000056Iterator.class);
			pageContext.getOut().print(theHospitalRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

