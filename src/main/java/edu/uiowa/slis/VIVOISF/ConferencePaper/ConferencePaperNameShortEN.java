package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortENIterator theConferencePaper = (ConferencePaperNameShortENIterator)findAncestorWithClass(this, ConferencePaperNameShortENIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

