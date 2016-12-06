package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortESIterator theGeographicLocation = (GeographicLocationNameShortESIterator)findAncestorWithClass(this, GeographicLocationNameShortESIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

