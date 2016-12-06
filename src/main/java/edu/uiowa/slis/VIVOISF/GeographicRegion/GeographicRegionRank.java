package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRankIterator theGeographicRegion = (GeographicRegionRankIterator)findAncestorWithClass(this, GeographicRegionRankIterator.class);
			pageContext.getOut().print(theGeographicRegion.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for rank tag ");
		}
		return SKIP_BODY;
	}
}

