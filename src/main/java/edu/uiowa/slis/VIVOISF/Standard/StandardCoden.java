package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardCodenIterator theStandard = (StandardCodenIterator)findAncestorWithClass(this, StandardCodenIterator.class);
			pageContext.getOut().print(theStandard.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for coden tag ");
		}
		return SKIP_BODY;
	}
}

