package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalHasEquipmentIterator theHospitalHasEquipmentIterator = (HospitalHasEquipmentIterator)findAncestorWithClass(this, HospitalHasEquipmentIterator.class);
			pageContext.getOut().print(theHospitalHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

