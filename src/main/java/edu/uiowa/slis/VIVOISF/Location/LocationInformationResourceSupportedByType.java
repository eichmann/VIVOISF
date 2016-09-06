package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationInformationResourceSupportedByIterator theLocationInformationResourceSupportedByIterator = (LocationInformationResourceSupportedByIterator)findAncestorWithClass(this, LocationInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLocationInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

