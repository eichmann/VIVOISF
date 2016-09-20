package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocERO_0000397Iterator thePostdocERO_0000397Iterator = (PostdocERO_0000397Iterator)findAncestorWithClass(this, PostdocERO_0000397Iterator.class);
			pageContext.getOut().print(thePostdocERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

