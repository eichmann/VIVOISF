package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ARG_0000001Iterator theIAO_0000013 = (IAO_0000013ARG_0000001Iterator)findAncestorWithClass(this, IAO_0000013ARG_0000001Iterator.class);
			pageContext.getOut().print(theIAO_0000013.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

