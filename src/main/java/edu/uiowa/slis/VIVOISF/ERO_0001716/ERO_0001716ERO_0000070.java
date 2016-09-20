package edu.uiowa.slis.VIVOISF.ERO_0001716;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001716ERO_0000070 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001716ERO_0000070 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001716ERO_0000070.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001716ERO_0000070Iterator theERO_0001716ERO_0000070Iterator = (ERO_0001716ERO_0000070Iterator)findAncestorWithClass(this, ERO_0001716ERO_0000070Iterator.class);
			pageContext.getOut().print(theERO_0001716ERO_0000070Iterator.getERO_0000070());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001716 for ERO_0000070 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for ERO_0000070 tag ");
		}
		return SKIP_BODY;
	}
}

