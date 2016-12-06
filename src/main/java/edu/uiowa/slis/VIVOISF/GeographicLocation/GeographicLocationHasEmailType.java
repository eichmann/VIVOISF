package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasEmailIterator theGeographicLocationHasEmailIterator = (GeographicLocationHasEmailIterator)findAncestorWithClass(this, GeographicLocationHasEmailIterator.class);
			pageContext.getOut().print(theGeographicLocationHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

