package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationBFO_0000050Iterator theLocationBFO_0000050Iterator = (LocationBFO_0000050Iterator)findAncestorWithClass(this, LocationBFO_0000050Iterator.class);
			pageContext.getOut().print(theLocationBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

