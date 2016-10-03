package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalRecipientInverseIterator theHospitalRecipientInverseIterator = (HospitalRecipientInverseIterator)findAncestorWithClass(this, HospitalRecipientInverseIterator.class);
			pageContext.getOut().print(theHospitalRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for recipient tag ");
		}
		return SKIP_BODY;
	}
}

