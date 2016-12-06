package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListENIterator theConferencePaper = (ConferencePaperNameListENIterator)findAncestorWithClass(this, ConferencePaperNameListENIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

