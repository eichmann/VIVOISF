package edu.uiowa.slis.VIVOISF.Workshop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Workshop theWorkshop = (Workshop)findAncestorWithClass(this, Workshop.class);
			if (!theWorkshop.commitNeeded) {
				pageContext.getOut().print(theWorkshop.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Workshop theWorkshop = (Workshop)findAncestorWithClass(this, Workshop.class);
			return theWorkshop.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Workshop for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Workshop theWorkshop = (Workshop)findAncestorWithClass(this, Workshop.class);
			theWorkshop.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for label tag ");
		}
	}
}

