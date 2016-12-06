package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRank currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRankIterator theGeographicLocation = (GeographicLocationRankIterator)findAncestorWithClass(this, GeographicLocationRankIterator.class);
			pageContext.getOut().print(theGeographicLocation.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for rank tag ");
		}
		return SKIP_BODY;
	}
}

