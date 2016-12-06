package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRO_0002234Iterator theGeographicLocationRO_0002234Iterator = (GeographicLocationRO_0002234Iterator)findAncestorWithClass(this, GeographicLocationRO_0002234Iterator.class);
			pageContext.getOut().print(theGeographicLocationRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

