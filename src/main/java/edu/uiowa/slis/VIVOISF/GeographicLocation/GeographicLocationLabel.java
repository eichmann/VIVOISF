package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			if (!theGeographicLocation.commitNeeded) {
				pageContext.getOut().print(theGeographicLocation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			return theGeographicLocation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicLocation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			theGeographicLocation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for label tag ");
		}
	}
}

