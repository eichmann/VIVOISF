package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationHasEquipmentIterator theResearchOrganizationHasEquipmentIterator = (ResearchOrganizationHasEquipmentIterator)findAncestorWithClass(this, ResearchOrganizationHasEquipmentIterator.class);
			pageContext.getOut().print(theResearchOrganizationHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

