package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeISO3Iterator theGeographicLocation = (GeographicLocationCodeISO3Iterator)findAncestorWithClass(this, GeographicLocationCodeISO3Iterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

