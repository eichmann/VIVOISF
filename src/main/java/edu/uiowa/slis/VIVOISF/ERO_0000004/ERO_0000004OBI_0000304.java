package edu.uiowa.slis.VIVOISF.ERO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000004OBI_0000304 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000004OBI_0000304 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000004OBI_0000304.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000004OBI_0000304Iterator theERO_0000004OBI_0000304Iterator = (ERO_0000004OBI_0000304Iterator)findAncestorWithClass(this, ERO_0000004OBI_0000304Iterator.class);
			pageContext.getOut().print(theERO_0000004OBI_0000304Iterator.getOBI_0000304());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000004 for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000004 for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

