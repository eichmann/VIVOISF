package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			if (!thePosition.commitNeeded) {
				pageContext.getOut().print(thePosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Position for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			return thePosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Position for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			thePosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Position for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for label tag ");
		}
	}
}

