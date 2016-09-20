package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryAffiliatedOrganizationInverseIterator theLaboratoryAffiliatedOrganizationInverseIterator = (LaboratoryAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, LaboratoryAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theLaboratoryAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

