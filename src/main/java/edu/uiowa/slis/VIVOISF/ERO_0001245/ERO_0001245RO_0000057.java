package edu.uiowa.slis.VIVOISF.ERO_0001245;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001245RO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001245RO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001245RO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001245RO_0000057Iterator theERO_0001245RO_0000057Iterator = (ERO_0001245RO_0000057Iterator)findAncestorWithClass(this, ERO_0001245RO_0000057Iterator.class);
			pageContext.getOut().print(theERO_0001245RO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001245 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001245 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

