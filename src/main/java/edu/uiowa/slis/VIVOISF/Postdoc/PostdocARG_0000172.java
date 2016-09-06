package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocARG_0000172Iterator thePostdoc = (PostdocARG_0000172Iterator)findAncestorWithClass(this, PostdocARG_0000172Iterator.class);
			pageContext.getOut().print(thePostdoc.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}

