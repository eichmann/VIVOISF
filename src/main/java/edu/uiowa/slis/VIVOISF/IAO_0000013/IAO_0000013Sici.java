package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Sici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Sici currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Sici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013SiciIterator theIAO_0000013 = (IAO_0000013SiciIterator)findAncestorWithClass(this, IAO_0000013SiciIterator.class);
			pageContext.getOut().print(theIAO_0000013.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for sici tag ");
		}
		return SKIP_BODY;
	}
}

