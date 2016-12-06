package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			if (!theGeographicRegion.commitNeeded) {
				pageContext.getOut().print(theGeographicRegion.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			return theGeographicRegion.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicRegion for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			theGeographicRegion.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for abbreviation tag ");
		}
	}
}

