package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			if (!theGeographicLocation.commitNeeded) {
				pageContext.getOut().print(theGeographicLocation.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			return theGeographicLocation.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicLocation for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			theGeographicLocation.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for abbreviation tag ");
		}
	}
}

