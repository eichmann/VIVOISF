package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554IAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554IAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554IAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554IAO_0000136Iterator theOBI_0001554IAO_0000136Iterator = (OBI_0001554IAO_0000136Iterator)findAncestorWithClass(this, OBI_0001554IAO_0000136Iterator.class);
			pageContext.getOut().print(theOBI_0001554IAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

