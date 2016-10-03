package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperEditionIterator theConferencePaper = (ConferencePaperEditionIterator)findAncestorWithClass(this, ConferencePaperEditionIterator.class);
			pageContext.getOut().print(theConferencePaper.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for edition tag ");
		}
		return SKIP_BODY;
	}
}

