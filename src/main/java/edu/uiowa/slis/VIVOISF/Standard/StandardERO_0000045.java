package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardERO_0000045Iterator theStandard = (StandardERO_0000045Iterator)findAncestorWithClass(this, StandardERO_0000045Iterator.class);
			pageContext.getOut().print(theStandard.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

