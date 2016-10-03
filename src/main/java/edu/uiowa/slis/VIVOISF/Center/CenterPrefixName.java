package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CenterPrefixNameIterator theCenter = (CenterPrefixNameIterator)findAncestorWithClass(this, CenterPrefixNameIterator.class);
			pageContext.getOut().print(theCenter.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

