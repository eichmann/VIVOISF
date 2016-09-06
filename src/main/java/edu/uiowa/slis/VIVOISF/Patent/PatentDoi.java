package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentDoiIterator thePatent = (PatentDoiIterator)findAncestorWithClass(this, PatentDoiIterator.class);
			pageContext.getOut().print(thePatent.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for doi tag ");
		}
		return SKIP_BODY;
	}
}

