package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasTitleIterator theGeographicLocationHasTitleIterator = (GeographicLocationHasTitleIterator)findAncestorWithClass(this, GeographicLocationHasTitleIterator.class);
			pageContext.getOut().print(theGeographicLocationHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

