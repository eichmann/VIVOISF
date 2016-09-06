package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalHasPredecessorOrganizationIterator theHospitalHasPredecessorOrganizationIterator = (HospitalHasPredecessorOrganizationIterator)findAncestorWithClass(this, HospitalHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theHospitalHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

