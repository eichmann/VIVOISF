package edu.uiowa.slis.VIVOISF.ERO_0000392;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000392ERO_0000460 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000392ERO_0000460 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000392ERO_0000460.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000392ERO_0000460Iterator theERO_0000392ERO_0000460Iterator = (ERO_0000392ERO_0000460Iterator)findAncestorWithClass(this, ERO_0000392ERO_0000460Iterator.class);
			pageContext.getOut().print(theERO_0000392ERO_0000460Iterator.getERO_0000460());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000392 for ERO_0000460 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000392 for ERO_0000460 tag ");
		}
		return SKIP_BODY;
	}
}

