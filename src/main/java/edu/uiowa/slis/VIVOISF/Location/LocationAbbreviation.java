package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			if (!theLocation.commitNeeded) {
				pageContext.getOut().print(theLocation.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Location for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			return theLocation.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Location for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Location theLocation = (Location)findAncestorWithClass(this, Location.class);
			theLocation.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Location for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for abbreviation tag ");
		}
	}
}

