package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialZHIterator theGeographicLocation = (GeographicLocationNameOfficialZHIterator)findAncestorWithClass(this, GeographicLocationNameOfficialZHIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

