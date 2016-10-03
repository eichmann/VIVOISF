package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardEditionIterator theStandard = (StandardEditionIterator)findAncestorWithClass(this, StandardEditionIterator.class);
			pageContext.getOut().print(theStandard.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for edition tag ");
		}
		return SKIP_BODY;
	}
}

