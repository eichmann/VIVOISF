package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationERO_0000037Iterator theFoundationERO_0000037Iterator = (FoundationERO_0000037Iterator)findAncestorWithClass(this, FoundationERO_0000037Iterator.class);
			pageContext.getOut().print(theFoundationERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

