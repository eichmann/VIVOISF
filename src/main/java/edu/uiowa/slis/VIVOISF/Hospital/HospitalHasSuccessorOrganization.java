package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalHasSuccessorOrganizationIterator theHospitalHasSuccessorOrganizationIterator = (HospitalHasSuccessorOrganizationIterator)findAncestorWithClass(this, HospitalHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theHospitalHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

