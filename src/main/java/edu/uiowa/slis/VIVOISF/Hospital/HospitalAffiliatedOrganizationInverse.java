package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalAffiliatedOrganizationInverseIterator theHospitalAffiliatedOrganizationInverseIterator = (HospitalAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, HospitalAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theHospitalAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

