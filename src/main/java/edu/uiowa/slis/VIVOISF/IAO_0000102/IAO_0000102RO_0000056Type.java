package edu.uiowa.slis.VIVOISF.IAO_0000102;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000102RO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000102RO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000102RO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000102RO_0000056Iterator theIAO_0000102RO_0000056Iterator = (IAO_0000102RO_0000056Iterator)findAncestorWithClass(this, IAO_0000102RO_0000056Iterator.class);
			pageContext.getOut().print(theIAO_0000102RO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000102 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000102 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

