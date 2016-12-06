package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListENIterator theConferencePoster = (ConferencePosterNameListENIterator)findAncestorWithClass(this, ConferencePosterNameListENIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

