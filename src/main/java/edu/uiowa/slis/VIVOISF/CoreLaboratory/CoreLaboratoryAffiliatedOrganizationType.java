package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryAffiliatedOrganizationIterator theCoreLaboratoryAffiliatedOrganizationIterator = (CoreLaboratoryAffiliatedOrganizationIterator)findAncestorWithClass(this, CoreLaboratoryAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theCoreLaboratoryAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

