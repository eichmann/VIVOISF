package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationHasEquipmentIterator theFundingOrganizationHasEquipmentIterator = (FundingOrganizationHasEquipmentIterator)findAncestorWithClass(this, FundingOrganizationHasEquipmentIterator.class);
			pageContext.getOut().print(theFundingOrganizationHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

