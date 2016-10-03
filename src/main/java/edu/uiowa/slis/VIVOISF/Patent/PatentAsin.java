package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentAsinIterator thePatent = (PatentAsinIterator)findAncestorWithClass(this, PatentAsinIterator.class);
			pageContext.getOut().print(thePatent.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for asin tag ");
		}
		return SKIP_BODY;
	}
}

