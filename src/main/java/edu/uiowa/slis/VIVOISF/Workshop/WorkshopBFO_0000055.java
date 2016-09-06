package edu.uiowa.slis.VIVOISF.Workshop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkshopBFO_0000055Iterator theWorkshopBFO_0000055Iterator = (WorkshopBFO_0000055Iterator)findAncestorWithClass(this, WorkshopBFO_0000055Iterator.class);
			pageContext.getOut().print(theWorkshopBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

