package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterHasEquipmentIterator theCenterHasEquipmentIterator = (CenterHasEquipmentIterator)findAncestorWithClass(this, CenterHasEquipmentIterator.class);
			pageContext.getOut().print(theCenterHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

