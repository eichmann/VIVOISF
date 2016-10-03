package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardLccnIterator theStandard = (StandardLccnIterator)findAncestorWithClass(this, StandardLccnIterator.class);
			pageContext.getOut().print(theStandard.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for lccn tag ");
		}
		return SKIP_BODY;
	}
}

