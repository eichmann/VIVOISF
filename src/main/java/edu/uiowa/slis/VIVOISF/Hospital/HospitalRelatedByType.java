package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalRelatedByIterator theHospitalRelatedByIterator = (HospitalRelatedByIterator)findAncestorWithClass(this, HospitalRelatedByIterator.class);
			pageContext.getOut().print(theHospitalRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

