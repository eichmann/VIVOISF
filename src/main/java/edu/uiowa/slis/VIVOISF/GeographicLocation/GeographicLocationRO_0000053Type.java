package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRO_0000053Iterator theGeographicLocationRO_0000053Iterator = (GeographicLocationRO_0000053Iterator)findAncestorWithClass(this, GeographicLocationRO_0000053Iterator.class);
			pageContext.getOut().print(theGeographicLocationRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

