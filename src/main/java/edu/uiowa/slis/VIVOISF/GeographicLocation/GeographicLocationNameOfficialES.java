package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialESIterator theGeographicLocation = (GeographicLocationNameOfficialESIterator)findAncestorWithClass(this, GeographicLocationNameOfficialESIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

