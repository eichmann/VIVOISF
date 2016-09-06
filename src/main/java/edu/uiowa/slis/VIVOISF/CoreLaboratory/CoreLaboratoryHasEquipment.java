package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryHasEquipmentIterator theCoreLaboratoryHasEquipmentIterator = (CoreLaboratoryHasEquipmentIterator)findAncestorWithClass(this, CoreLaboratoryHasEquipmentIterator.class);
			pageContext.getOut().print(theCoreLaboratoryHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

