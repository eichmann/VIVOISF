package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasEquipmentIterator theGovernmentAgencyHasEquipmentIterator = (GovernmentAgencyHasEquipmentIterator)findAncestorWithClass(this, GovernmentAgencyHasEquipmentIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

