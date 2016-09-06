package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalAffiliatedOrganizationIterator theHospitalAffiliatedOrganizationIterator = (HospitalAffiliatedOrganizationIterator)findAncestorWithClass(this, HospitalAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theHospitalAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

