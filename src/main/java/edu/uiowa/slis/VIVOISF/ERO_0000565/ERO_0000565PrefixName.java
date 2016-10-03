package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565PrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565PrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565PrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565PrefixNameIterator theERO_0000565 = (ERO_0000565PrefixNameIterator)findAncestorWithClass(this, ERO_0000565PrefixNameIterator.class);
			pageContext.getOut().print(theERO_0000565.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

