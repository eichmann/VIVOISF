package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Content extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Content currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Content.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ContentIterator theIAO_0000013 = (IAO_0000013ContentIterator)findAncestorWithClass(this, IAO_0000013ContentIterator.class);
			pageContext.getOut().print(theIAO_0000013.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for content tag ");
		}
		return SKIP_BODY;
	}
}

