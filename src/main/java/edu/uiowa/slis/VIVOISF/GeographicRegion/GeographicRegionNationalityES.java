package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNationalityESIterator theGeographicRegion = (GeographicRegionNationalityESIterator)findAncestorWithClass(this, GeographicRegionNationalityESIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

