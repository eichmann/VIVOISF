package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565ERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565ERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565ERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565ERO_0000037Iterator theERO_0000565ERO_0000037Iterator = (ERO_0000565ERO_0000037Iterator)findAncestorWithClass(this, ERO_0000565ERO_0000037Iterator.class);
			pageContext.getOut().print(theERO_0000565ERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

