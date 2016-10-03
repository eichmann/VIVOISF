package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterOwnerInverseIterator theCenterOwnerInverseIterator = (CenterOwnerInverseIterator)findAncestorWithClass(this, CenterOwnerInverseIterator.class);
			pageContext.getOut().print(theCenterOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for owner tag ");
		}
		return SKIP_BODY;
	}
}

