package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardDoiIterator theStandard = (StandardDoiIterator)findAncestorWithClass(this, StandardDoiIterator.class);
			pageContext.getOut().print(theStandard.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for doi tag ");
		}
		return SKIP_BODY;
	}
}

