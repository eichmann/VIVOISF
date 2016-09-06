package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNihmsid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNihmsid currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNihmsid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNihmsidIterator theConferencePaper = (ConferencePaperNihmsidIterator)findAncestorWithClass(this, ConferencePaperNihmsidIterator.class);
			pageContext.getOut().print(theConferencePaper.getNihmsid());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nihmsid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nihmsid tag ");
		}
		return SKIP_BODY;
	}
}

