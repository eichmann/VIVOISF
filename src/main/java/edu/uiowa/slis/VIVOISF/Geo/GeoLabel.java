package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Geo theGeo = (Geo)findAncestorWithClass(this, Geo.class);
			if (!theGeo.commitNeeded) {
				pageContext.getOut().print(theGeo.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Geo theGeo = (Geo)findAncestorWithClass(this, Geo.class);
			return theGeo.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Geo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Geo theGeo = (Geo)findAncestorWithClass(this, Geo.class);
			theGeo.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for label tag ");
		}
	}
}

