package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			if (!thePosition.commitNeeded) {
				pageContext.getOut().print(thePosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			return thePosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Position for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			thePosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hideFromDisplay tag ");
		}
	}
}

