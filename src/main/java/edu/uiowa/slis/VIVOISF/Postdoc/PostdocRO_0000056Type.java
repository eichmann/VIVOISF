package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocRO_0000056Iterator thePostdocRO_0000056Iterator = (PostdocRO_0000056Iterator)findAncestorWithClass(this, PostdocRO_0000056Iterator.class);
			pageContext.getOut().print(thePostdocRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

