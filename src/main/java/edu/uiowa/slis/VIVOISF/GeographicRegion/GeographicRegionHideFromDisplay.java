package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			if (!theGeographicRegion.commitNeeded) {
				pageContext.getOut().print(theGeographicRegion.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			return theGeographicRegion.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicRegion for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			theGeographicRegion.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hideFromDisplay tag ");
		}
	}
}

