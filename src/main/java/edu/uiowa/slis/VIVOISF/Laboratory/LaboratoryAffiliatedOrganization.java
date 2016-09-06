package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryAffiliatedOrganizationIterator theLaboratoryAffiliatedOrganizationIterator = (LaboratoryAffiliatedOrganizationIterator)findAncestorWithClass(this, LaboratoryAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theLaboratoryAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

