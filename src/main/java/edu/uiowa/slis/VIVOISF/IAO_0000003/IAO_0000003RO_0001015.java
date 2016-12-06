package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003RO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003RO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003RO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003RO_0001015Iterator theIAO_0000003RO_0001015Iterator = (IAO_0000003RO_0001015Iterator)findAncestorWithClass(this, IAO_0000003RO_0001015Iterator.class);
			pageContext.getOut().print(theIAO_0000003RO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

