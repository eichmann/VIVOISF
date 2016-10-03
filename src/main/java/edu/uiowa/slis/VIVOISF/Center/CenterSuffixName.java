package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CenterSuffixNameIterator theCenter = (CenterSuffixNameIterator)findAncestorWithClass(this, CenterSuffixNameIterator.class);
			pageContext.getOut().print(theCenter.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

