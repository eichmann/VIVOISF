package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030HasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030HasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030HasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030HasMaxLongitudeIterator theIAO_0000030 = (IAO_0000030HasMaxLongitudeIterator)findAncestorWithClass(this, IAO_0000030HasMaxLongitudeIterator.class);
			pageContext.getOut().print(theIAO_0000030.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

