package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryAffiliatedOrganizationInverseIterator theLaboratoryAffiliatedOrganizationInverseIterator = (LaboratoryAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, LaboratoryAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theLaboratoryAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

