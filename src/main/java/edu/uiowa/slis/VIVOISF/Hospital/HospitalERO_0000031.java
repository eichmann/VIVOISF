package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalERO_0000031Iterator theHospitalERO_0000031Iterator = (HospitalERO_0000031Iterator)findAncestorWithClass(this, HospitalERO_0000031Iterator.class);
			pageContext.getOut().print(theHospitalERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

