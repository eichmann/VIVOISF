package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationERO_0000031Iterator theFoundationERO_0000031Iterator = (FoundationERO_0000031Iterator)findAncestorWithClass(this, FoundationERO_0000031Iterator.class);
			pageContext.getOut().print(theFoundationERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

