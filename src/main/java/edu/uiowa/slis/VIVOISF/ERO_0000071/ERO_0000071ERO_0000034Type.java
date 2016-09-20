package edu.uiowa.slis.VIVOISF.ERO_0000071;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000071ERO_0000034Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000071ERO_0000034Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000071ERO_0000034Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000071ERO_0000034Iterator theERO_0000071ERO_0000034Iterator = (ERO_0000071ERO_0000034Iterator)findAncestorWithClass(this, ERO_0000071ERO_0000034Iterator.class);
			pageContext.getOut().print(theERO_0000071ERO_0000034Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000071 for ERO_0000034 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000071 for ERO_0000034 tag ");
		}
		return SKIP_BODY;
	}
}

