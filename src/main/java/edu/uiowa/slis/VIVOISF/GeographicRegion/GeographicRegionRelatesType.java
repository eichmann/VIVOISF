package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRelatesIterator theGeographicRegionRelatesIterator = (GeographicRegionRelatesIterator)findAncestorWithClass(this, GeographicRegionRelatesIterator.class);
			pageContext.getOut().print(theGeographicRegionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for relates tag ");
		}
		return SKIP_BODY;
	}
}

