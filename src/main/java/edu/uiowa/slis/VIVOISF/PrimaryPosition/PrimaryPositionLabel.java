package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			if (!thePrimaryPosition.commitNeeded) {
				pageContext.getOut().print(thePrimaryPosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			return thePrimaryPosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrimaryPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			thePrimaryPosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for label tag ");
		}
	}
}

