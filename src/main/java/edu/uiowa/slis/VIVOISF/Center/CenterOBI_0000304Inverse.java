package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterOBI_0000304InverseIterator theCenterOBI_0000304InverseIterator = (CenterOBI_0000304InverseIterator)findAncestorWithClass(this, CenterOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theCenterOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

