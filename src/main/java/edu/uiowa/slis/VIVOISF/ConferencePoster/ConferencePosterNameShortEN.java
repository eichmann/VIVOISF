package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameShortENIterator theConferencePoster = (ConferencePosterNameShortENIterator)findAncestorWithClass(this, ConferencePosterNameShortENIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

