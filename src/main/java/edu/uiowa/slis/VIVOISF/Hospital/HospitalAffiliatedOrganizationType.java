package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalAffiliatedOrganizationIterator theHospitalAffiliatedOrganizationIterator = (HospitalAffiliatedOrganizationIterator)findAncestorWithClass(this, HospitalAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theHospitalAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

