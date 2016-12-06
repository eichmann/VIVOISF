package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasMaxLatitudeIterator thegeographical_region = (geographical_regionHasMaxLatitudeIterator)findAncestorWithClass(this, geographical_regionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

