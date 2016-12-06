package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionRO_0002234Iterator thePostdocPositionRO_0002234Iterator = (PostdocPositionRO_0002234Iterator)findAncestorWithClass(this, PostdocPositionRO_0002234Iterator.class);
			pageContext.getOut().print(thePostdocPositionRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

