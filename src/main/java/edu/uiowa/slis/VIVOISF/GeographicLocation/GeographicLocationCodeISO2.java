package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeISO2Iterator theGeographicLocation = (GeographicLocationCodeISO2Iterator)findAncestorWithClass(this, GeographicLocationCodeISO2Iterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

