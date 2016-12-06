package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003HasMaxLatitudeIterator theIAO_0000003 = (IAO_0000003HasMaxLatitudeIterator)findAncestorWithClass(this, IAO_0000003HasMaxLatitudeIterator.class);
			pageContext.getOut().print(theIAO_0000003.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

