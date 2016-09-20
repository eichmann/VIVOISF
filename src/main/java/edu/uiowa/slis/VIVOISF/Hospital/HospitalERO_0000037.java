package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalERO_0000037Iterator theHospitalERO_0000037Iterator = (HospitalERO_0000037Iterator)findAncestorWithClass(this, HospitalERO_0000037Iterator.class);
			pageContext.getOut().print(theHospitalERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

