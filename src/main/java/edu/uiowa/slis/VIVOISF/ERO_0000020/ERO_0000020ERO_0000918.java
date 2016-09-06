package edu.uiowa.slis.VIVOISF.ERO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000020ERO_0000918 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000020ERO_0000918 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000020ERO_0000918.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000020ERO_0000918Iterator theERO_0000020ERO_0000918Iterator = (ERO_0000020ERO_0000918Iterator)findAncestorWithClass(this, ERO_0000020ERO_0000918Iterator.class);
			pageContext.getOut().print(theERO_0000020ERO_0000918Iterator.getERO_0000918());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000020 for ERO_0000918 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000020 for ERO_0000918 tag ");
		}
		return SKIP_BODY;
	}
}

