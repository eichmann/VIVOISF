package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocARG_2000028Iterator thePostdocARG_2000028Iterator = (PostdocARG_2000028Iterator)findAncestorWithClass(this, PostdocARG_2000028Iterator.class);
			pageContext.getOut().print(thePostdocARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

