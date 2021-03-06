package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNationalityRUIterator theGeographicRegion = (GeographicRegionNationalityRUIterator)findAncestorWithClass(this, GeographicRegionNationalityRUIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

