package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperUpcIterator theConferencePaper = (ConferencePaperUpcIterator)findAncestorWithClass(this, ConferencePaperUpcIterator.class);
			pageContext.getOut().print(theConferencePaper.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for upc tag ");
		}
		return SKIP_BODY;
	}
}

