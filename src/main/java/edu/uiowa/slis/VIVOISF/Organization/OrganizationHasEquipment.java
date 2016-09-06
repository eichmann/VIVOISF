package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasEquipmentIterator theOrganizationHasEquipmentIterator = (OrganizationHasEquipmentIterator)findAncestorWithClass(this, OrganizationHasEquipmentIterator.class);
			pageContext.getOut().print(theOrganizationHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

