package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteHasEquipmentIterator theInstituteHasEquipmentIterator = (InstituteHasEquipmentIterator)findAncestorWithClass(this, InstituteHasEquipmentIterator.class);
			pageContext.getOut().print(theInstituteHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

