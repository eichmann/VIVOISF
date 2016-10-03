package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterOwnerInverseIterator theCenterOwnerInverseIterator = (CenterOwnerInverseIterator)findAncestorWithClass(this, CenterOwnerInverseIterator.class);
			pageContext.getOut().print(theCenterOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for owner tag ");
		}
		return SKIP_BODY;
	}
}

