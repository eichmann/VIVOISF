package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionLandAreaYearIterator thegeographical_region = (geographical_regionLandAreaYearIterator)findAncestorWithClass(this, geographical_regionLandAreaYearIterator.class);
			pageContext.getOut().print(thegeographical_region.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

