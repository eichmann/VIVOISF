package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalAssigneeForIterator theHospitalAssigneeForIterator = (HospitalAssigneeForIterator)findAncestorWithClass(this, HospitalAssigneeForIterator.class);
			pageContext.getOut().print(theHospitalAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

