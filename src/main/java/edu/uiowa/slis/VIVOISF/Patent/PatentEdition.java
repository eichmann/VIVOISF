package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentEditionIterator thePatent = (PatentEditionIterator)findAncestorWithClass(this, PatentEditionIterator.class);
			pageContext.getOut().print(thePatent.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for edition tag ");
		}
		return SKIP_BODY;
	}
}

