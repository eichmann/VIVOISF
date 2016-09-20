package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565OBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565OBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565OBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565OBI_0000304InverseIterator theERO_0000565OBI_0000304InverseIterator = (ERO_0000565OBI_0000304InverseIterator)findAncestorWithClass(this, ERO_0000565OBI_0000304InverseIterator.class);
			pageContext.getOut().print(theERO_0000565OBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

