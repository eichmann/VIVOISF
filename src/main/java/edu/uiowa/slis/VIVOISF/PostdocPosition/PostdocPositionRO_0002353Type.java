package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionRO_0002353Iterator thePostdocPositionRO_0002353Iterator = (PostdocPositionRO_0002353Iterator)findAncestorWithClass(this, PostdocPositionRO_0002353Iterator.class);
			pageContext.getOut().print(thePostdocPositionRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

