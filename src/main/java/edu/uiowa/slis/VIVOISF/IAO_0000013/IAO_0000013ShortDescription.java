package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ShortDescriptionIterator theIAO_0000013 = (IAO_0000013ShortDescriptionIterator)findAncestorWithClass(this, IAO_0000013ShortDescriptionIterator.class);
			pageContext.getOut().print(theIAO_0000013.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

