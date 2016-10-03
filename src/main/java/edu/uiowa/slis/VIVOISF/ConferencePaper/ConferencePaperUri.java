package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperUriIterator theConferencePaper = (ConferencePaperUriIterator)findAncestorWithClass(this, ConferencePaperUriIterator.class);
			pageContext.getOut().print(theConferencePaper.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for uri tag ");
		}
		return SKIP_BODY;
	}
}

