package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalERO_0001520Iterator theHospitalERO_0001520Iterator = (HospitalERO_0001520Iterator)findAncestorWithClass(this, HospitalERO_0001520Iterator.class);
			pageContext.getOut().print(theHospitalERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

