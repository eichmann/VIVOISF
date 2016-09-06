package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			if (!theGeographicRegion.commitNeeded) {
				pageContext.getOut().print(theGeographicRegion.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			return theGeographicRegion.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicRegion for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			theGeographicRegion.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for label tag ");
		}
	}
}

