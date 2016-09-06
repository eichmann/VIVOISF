package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocERO_0000033Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocERO_0000033Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocERO_0000033Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocERO_0000033Iterator thePostdocERO_0000033Iterator = (PostdocERO_0000033Iterator)findAncestorWithClass(this, PostdocERO_0000033Iterator.class);
			pageContext.getOut().print(thePostdocERO_0000033Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

