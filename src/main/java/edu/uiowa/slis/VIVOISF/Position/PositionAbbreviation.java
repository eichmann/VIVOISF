package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			if (!thePosition.commitNeeded) {
				pageContext.getOut().print(thePosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Position for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			return thePosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Position for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			thePosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Position for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for abbreviation tag ");
		}
	}
}

