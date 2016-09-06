package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryHasEquipmentIterator theLaboratoryHasEquipmentIterator = (LaboratoryHasEquipmentIterator)findAncestorWithClass(this, LaboratoryHasEquipmentIterator.class);
			pageContext.getOut().print(theLaboratoryHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

