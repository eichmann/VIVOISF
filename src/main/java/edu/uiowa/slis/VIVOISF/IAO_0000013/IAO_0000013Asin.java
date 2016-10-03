package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Asin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Asin currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Asin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013AsinIterator theIAO_0000013 = (IAO_0000013AsinIterator)findAncestorWithClass(this, IAO_0000013AsinIterator.class);
			pageContext.getOut().print(theIAO_0000013.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for asin tag ");
		}
		return SKIP_BODY;
	}
}

