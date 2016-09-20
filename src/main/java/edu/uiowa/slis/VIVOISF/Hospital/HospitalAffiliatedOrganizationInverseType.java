package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalAffiliatedOrganizationInverseIterator theHospitalAffiliatedOrganizationInverseIterator = (HospitalAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, HospitalAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theHospitalAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

