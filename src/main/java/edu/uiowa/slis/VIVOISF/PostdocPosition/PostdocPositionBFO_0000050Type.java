package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionBFO_0000050Iterator thePostdocPositionBFO_0000050Iterator = (PostdocPositionBFO_0000050Iterator)findAncestorWithClass(this, PostdocPositionBFO_0000050Iterator.class);
			pageContext.getOut().print(thePostdocPositionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

