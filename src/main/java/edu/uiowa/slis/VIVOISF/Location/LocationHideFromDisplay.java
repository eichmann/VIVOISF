package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			if (!theLocation.commitNeeded) {
				pageContext.getOut().print(theLocation.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			return theLocation.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Location for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			theLocation.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hideFromDisplay tag ");
		}
	}
}

