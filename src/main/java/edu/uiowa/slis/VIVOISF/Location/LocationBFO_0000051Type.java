package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationBFO_0000051Iterator theLocationBFO_0000051Iterator = (LocationBFO_0000051Iterator)findAncestorWithClass(this, LocationBFO_0000051Iterator.class);
			pageContext.getOut().print(theLocationBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

