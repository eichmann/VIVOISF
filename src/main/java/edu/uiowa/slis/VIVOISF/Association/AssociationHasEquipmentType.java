package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationHasEquipmentIterator theAssociationHasEquipmentIterator = (AssociationHasEquipmentIterator)findAncestorWithClass(this, AssociationHasEquipmentIterator.class);
			pageContext.getOut().print(theAssociationHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

