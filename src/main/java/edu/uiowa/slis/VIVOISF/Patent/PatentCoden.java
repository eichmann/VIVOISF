package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentCodenIterator thePatent = (PatentCodenIterator)findAncestorWithClass(this, PatentCodenIterator.class);
			pageContext.getOut().print(thePatent.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for coden tag ");
		}
		return SKIP_BODY;
	}
}

