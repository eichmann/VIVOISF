package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardIAO_0000136Iterator theStandardIAO_0000136Iterator = (StandardIAO_0000136Iterator)findAncestorWithClass(this, StandardIAO_0000136Iterator.class);
			pageContext.getOut().print(theStandardIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

