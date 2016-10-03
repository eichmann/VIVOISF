package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentShortTitleIterator thePatent = (PatentShortTitleIterator)findAncestorWithClass(this, PatentShortTitleIterator.class);
			pageContext.getOut().print(thePatent.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

