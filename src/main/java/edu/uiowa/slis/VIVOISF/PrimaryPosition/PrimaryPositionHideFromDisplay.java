package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			if (!thePrimaryPosition.commitNeeded) {
				pageContext.getOut().print(thePrimaryPosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			return thePrimaryPosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrimaryPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			thePrimaryPosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hideFromDisplay tag ");
		}
	}
}

