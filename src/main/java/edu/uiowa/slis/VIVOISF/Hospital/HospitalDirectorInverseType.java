package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalDirectorInverseIterator theHospitalDirectorInverseIterator = (HospitalDirectorInverseIterator)findAncestorWithClass(this, HospitalDirectorInverseIterator.class);
			pageContext.getOut().print(theHospitalDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for director tag ");
		}
		return SKIP_BODY;
	}
}

