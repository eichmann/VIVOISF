package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationInformationResourceSupportedByIterator theLocationInformationResourceSupportedByIterator = (LocationInformationResourceSupportedByIterator)findAncestorWithClass(this, LocationInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLocationInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

