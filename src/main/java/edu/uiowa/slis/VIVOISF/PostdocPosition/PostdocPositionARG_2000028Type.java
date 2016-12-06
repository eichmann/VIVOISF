package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionARG_2000028Iterator thePostdocPositionARG_2000028Iterator = (PostdocPositionARG_2000028Iterator)findAncestorWithClass(this, PostdocPositionARG_2000028Iterator.class);
			pageContext.getOut().print(thePostdocPositionARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

