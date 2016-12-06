package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030RO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030RO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030RO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030RO_0001025Iterator theIAO_0000030RO_0001025Iterator = (IAO_0000030RO_0001025Iterator)findAncestorWithClass(this, IAO_0000030RO_0001025Iterator.class);
			pageContext.getOut().print(theIAO_0000030RO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

