package edu.uiowa.slis.VIVOISF.ERO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000007OBI_0000299 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000007OBI_0000299 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000007OBI_0000299.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000007OBI_0000299Iterator theERO_0000007OBI_0000299Iterator = (ERO_0000007OBI_0000299Iterator)findAncestorWithClass(this, ERO_0000007OBI_0000299Iterator.class);
			pageContext.getOut().print(theERO_0000007OBI_0000299Iterator.getOBI_0000299());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000007 for OBI_0000299 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000007 for OBI_0000299 tag ");
		}
		return SKIP_BODY;
	}
}

