package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasNameIterator theGeographicLocationHasNameIterator = (GeographicLocationHasNameIterator)findAncestorWithClass(this, GeographicLocationHasNameIterator.class);
			pageContext.getOut().print(theGeographicLocationHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasName tag ");
		}
		return SKIP_BODY;
	}
}

