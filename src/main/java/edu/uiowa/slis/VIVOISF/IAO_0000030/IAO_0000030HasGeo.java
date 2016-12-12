package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030HasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030HasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030HasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030HasGeoIterator theIAO_0000030HasGeoIterator = (IAO_0000030HasGeoIterator)findAncestorWithClass(this, IAO_0000030HasGeoIterator.class);
			pageContext.getOut().print(theIAO_0000030HasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

