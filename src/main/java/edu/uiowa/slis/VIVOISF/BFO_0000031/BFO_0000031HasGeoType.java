package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031HasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031HasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031HasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031HasGeoIterator theBFO_0000031HasGeoIterator = (BFO_0000031HasGeoIterator)findAncestorWithClass(this, BFO_0000031HasGeoIterator.class);
			pageContext.getOut().print(theBFO_0000031HasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

