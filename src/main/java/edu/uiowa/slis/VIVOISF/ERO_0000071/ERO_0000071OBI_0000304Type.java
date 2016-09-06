package edu.uiowa.slis.VIVOISF.ERO_0000071;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000071OBI_0000304Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000071OBI_0000304Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000071OBI_0000304Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000071OBI_0000304Iterator theERO_0000071OBI_0000304Iterator = (ERO_0000071OBI_0000304Iterator)findAncestorWithClass(this, ERO_0000071OBI_0000304Iterator.class);
			pageContext.getOut().print(theERO_0000071OBI_0000304Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000071 for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000071 for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

