package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			if (!theGeographicLocation.commitNeeded) {
				pageContext.getOut().print(theGeographicLocation.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			return theGeographicLocation.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicLocation for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			theGeographicLocation.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hideFromDisplay tag ");
		}
	}
}

