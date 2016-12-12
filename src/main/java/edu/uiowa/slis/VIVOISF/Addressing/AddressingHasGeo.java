package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingHasGeoIterator theAddressingHasGeoIterator = (AddressingHasGeoIterator)findAncestorWithClass(this, AddressingHasGeoIterator.class);
			pageContext.getOut().print(theAddressingHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

