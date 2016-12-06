package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasMaxLongitudeIterator thegeographical_region = (geographical_regionHasMaxLongitudeIterator)findAncestorWithClass(this, geographical_regionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

