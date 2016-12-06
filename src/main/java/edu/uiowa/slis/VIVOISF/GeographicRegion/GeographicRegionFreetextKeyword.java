package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionFreetextKeywordIterator theGeographicRegion = (GeographicRegionFreetextKeywordIterator)findAncestorWithClass(this, GeographicRegionFreetextKeywordIterator.class);
			pageContext.getOut().print(theGeographicRegion.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

