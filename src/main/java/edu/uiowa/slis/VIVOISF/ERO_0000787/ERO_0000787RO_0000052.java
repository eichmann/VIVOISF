package edu.uiowa.slis.VIVOISF.ERO_0000787;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000787RO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000787RO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000787RO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000787RO_0000052Iterator theERO_0000787RO_0000052Iterator = (ERO_0000787RO_0000052Iterator)findAncestorWithClass(this, ERO_0000787RO_0000052Iterator.class);
			pageContext.getOut().print(theERO_0000787RO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000787 for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000787 for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

