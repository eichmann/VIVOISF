package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryAffiliatedOrganizationInverseIterator theCoreLaboratoryAffiliatedOrganizationInverseIterator = (CoreLaboratoryAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, CoreLaboratoryAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

