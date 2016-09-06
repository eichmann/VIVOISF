package edu.uiowa.slis.VIVOISF.Workshop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkshopRO_0000057Iterator theWorkshopRO_0000057Iterator = (WorkshopRO_0000057Iterator)findAncestorWithClass(this, WorkshopRO_0000057Iterator.class);
			pageContext.getOut().print(theWorkshopRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

