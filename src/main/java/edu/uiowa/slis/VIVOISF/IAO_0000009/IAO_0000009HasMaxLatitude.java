package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasMaxLatitudeIterator theIAO_0000009 = (IAO_0000009HasMaxLatitudeIterator)findAncestorWithClass(this, IAO_0000009HasMaxLatitudeIterator.class);
			pageContext.getOut().print(theIAO_0000009.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

