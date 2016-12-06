package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortENIterator theLocation = (LocationNameShortENIterator)findAncestorWithClass(this, LocationNameShortENIterator.class);
			pageContext.getOut().print(theLocation.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

