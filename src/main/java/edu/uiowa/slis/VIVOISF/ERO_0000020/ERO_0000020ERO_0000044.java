package edu.uiowa.slis.VIVOISF.ERO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000020ERO_0000044 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000020ERO_0000044 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000020ERO_0000044.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000020ERO_0000044Iterator theERO_0000020 = (ERO_0000020ERO_0000044Iterator)findAncestorWithClass(this, ERO_0000020ERO_0000044Iterator.class);
			pageContext.getOut().print(theERO_0000020.getERO_0000044());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000020 for ERO_0000044 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000020 for ERO_0000044 tag ");
		}
		return SKIP_BODY;
	}
}

