package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasMinLatitudeIterator thegeographical_region = (geographical_regionHasMinLatitudeIterator)findAncestorWithClass(this, geographical_regionHasMinLatitudeIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

