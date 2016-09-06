package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationHasEquipmentIterator theClinicalOrganizationHasEquipmentIterator = (ClinicalOrganizationHasEquipmentIterator)findAncestorWithClass(this, ClinicalOrganizationHasEquipmentIterator.class);
			pageContext.getOut().print(theClinicalOrganizationHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

