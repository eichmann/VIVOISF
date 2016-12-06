package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameOfficialENIterator theConferencePoster = (ConferencePosterNameOfficialENIterator)findAncestorWithClass(this, ConferencePosterNameOfficialENIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

