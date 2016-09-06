package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRank currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationRankIterator theLocation = (LocationRankIterator)findAncestorWithClass(this, LocationRankIterator.class);
			pageContext.getOut().print(theLocation.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for rank tag ");
		}
		return SKIP_BODY;
	}
}

