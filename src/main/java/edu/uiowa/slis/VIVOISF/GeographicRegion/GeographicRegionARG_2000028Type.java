package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionARG_2000028Iterator theGeographicRegionARG_2000028Iterator = (GeographicRegionARG_2000028Iterator)findAncestorWithClass(this, GeographicRegionARG_2000028Iterator.class);
			pageContext.getOut().print(theGeographicRegionARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

