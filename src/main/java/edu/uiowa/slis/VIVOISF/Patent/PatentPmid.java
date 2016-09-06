package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentPmidIterator thePatent = (PatentPmidIterator)findAncestorWithClass(this, PatentPmidIterator.class);
			pageContext.getOut().print(thePatent.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for pmid tag ");
		}
		return SKIP_BODY;
	}
}

