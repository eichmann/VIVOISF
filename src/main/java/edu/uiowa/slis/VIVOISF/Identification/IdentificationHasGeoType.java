package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationHasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationHasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationHasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentificationHasGeoIterator theIdentificationHasGeoIterator = (IdentificationHasGeoIterator)findAncestorWithClass(this, IdentificationHasGeoIterator.class);
			pageContext.getOut().print(theIdentificationHasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

