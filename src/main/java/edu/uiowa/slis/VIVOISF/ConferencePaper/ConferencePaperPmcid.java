package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPmcid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPmcid currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPmcid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPmcidIterator theConferencePaper = (ConferencePaperPmcidIterator)findAncestorWithClass(this, ConferencePaperPmcidIterator.class);
			pageContext.getOut().print(theConferencePaper.getPmcid());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for pmcid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for pmcid tag ");
		}
		return SKIP_BODY;
	}
}

