package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocRO_0001025Iterator thePostdocRO_0001025Iterator = (PostdocRO_0001025Iterator)findAncestorWithClass(this, PostdocRO_0001025Iterator.class);
			pageContext.getOut().print(thePostdocRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

