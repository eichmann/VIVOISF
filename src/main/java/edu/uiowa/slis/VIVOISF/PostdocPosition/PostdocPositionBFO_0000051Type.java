package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionBFO_0000051Iterator thePostdocPositionBFO_0000051Iterator = (PostdocPositionBFO_0000051Iterator)findAncestorWithClass(this, PostdocPositionBFO_0000051Iterator.class);
			pageContext.getOut().print(thePostdocPositionBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

