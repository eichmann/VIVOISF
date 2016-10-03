package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentUpcIterator thePatent = (PatentUpcIterator)findAncestorWithClass(this, PatentUpcIterator.class);
			pageContext.getOut().print(thePatent.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for upc tag ");
		}
		return SKIP_BODY;
	}
}

