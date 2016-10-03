package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Lccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Lccn currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Lccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013LccnIterator theIAO_0000013 = (IAO_0000013LccnIterator)findAncestorWithClass(this, IAO_0000013LccnIterator.class);
			pageContext.getOut().print(theIAO_0000013.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for lccn tag ");
		}
		return SKIP_BODY;
	}
}

