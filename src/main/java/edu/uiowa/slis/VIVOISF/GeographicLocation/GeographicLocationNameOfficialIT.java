package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialITIterator theGeographicLocation = (GeographicLocationNameOfficialITIterator)findAncestorWithClass(this, GeographicLocationNameOfficialITIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

