package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramHasEquipmentIterator theProgramHasEquipmentIterator = (ProgramHasEquipmentIterator)findAncestorWithClass(this, ProgramHasEquipmentIterator.class);
			pageContext.getOut().print(theProgramHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

