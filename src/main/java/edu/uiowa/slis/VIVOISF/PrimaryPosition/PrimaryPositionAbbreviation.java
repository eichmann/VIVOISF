package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			if (!thePrimaryPosition.commitNeeded) {
				pageContext.getOut().print(thePrimaryPosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			return thePrimaryPosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrimaryPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			thePrimaryPosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for abbreviation tag ");
		}
	}
}

