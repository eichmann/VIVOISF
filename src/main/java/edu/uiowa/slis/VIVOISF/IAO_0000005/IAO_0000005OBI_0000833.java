package edu.uiowa.slis.VIVOISF.IAO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000005OBI_0000833 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000005OBI_0000833 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000005OBI_0000833.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000005OBI_0000833Iterator theIAO_0000005OBI_0000833Iterator = (IAO_0000005OBI_0000833Iterator)findAncestorWithClass(this, IAO_0000005OBI_0000833Iterator.class);
			pageContext.getOut().print(theIAO_0000005OBI_0000833Iterator.getOBI_0000833());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000005 for OBI_0000833 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000005 for OBI_0000833 tag ");
		}
		return SKIP_BODY;
	}
}

