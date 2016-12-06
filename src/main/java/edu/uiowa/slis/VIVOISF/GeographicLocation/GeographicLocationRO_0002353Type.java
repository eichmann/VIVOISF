package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRO_0002353Iterator theGeographicLocationRO_0002353Iterator = (GeographicLocationRO_0002353Iterator)findAncestorWithClass(this, GeographicLocationRO_0002353Iterator.class);
			pageContext.getOut().print(theGeographicLocationRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

