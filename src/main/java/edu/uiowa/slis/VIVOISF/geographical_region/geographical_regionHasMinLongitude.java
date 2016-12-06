package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasMinLongitudeIterator thegeographical_region = (geographical_regionHasMinLongitudeIterator)findAncestorWithClass(this, geographical_regionHasMinLongitudeIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

