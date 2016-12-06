package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameOfficialENIterator theLocation = (LocationNameOfficialENIterator)findAncestorWithClass(this, LocationNameOfficialENIterator.class);
			pageContext.getOut().print(theLocation.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

