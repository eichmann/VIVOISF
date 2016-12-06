package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialARIterator theGeographicLocation = (GeographicLocationNameOfficialARIterator)findAncestorWithClass(this, GeographicLocationNameOfficialARIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

