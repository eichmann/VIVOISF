package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002HasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002HasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002HasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002HasGeoIterator theBFO_0000002HasGeoIterator = (BFO_0000002HasGeoIterator)findAncestorWithClass(this, BFO_0000002HasGeoIterator.class);
			pageContext.getOut().print(theBFO_0000002HasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

