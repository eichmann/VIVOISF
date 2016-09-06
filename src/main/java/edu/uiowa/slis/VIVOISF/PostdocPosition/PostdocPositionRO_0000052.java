package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionRO_0000052Iterator thePostdocPositionRO_0000052Iterator = (PostdocPositionRO_0000052Iterator)findAncestorWithClass(this, PostdocPositionRO_0000052Iterator.class);
			pageContext.getOut().print(thePostdocPositionRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

