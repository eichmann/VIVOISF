package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameOfficialENIterator theConferencePaper = (ConferencePaperNameOfficialENIterator)findAncestorWithClass(this, ConferencePaperNameOfficialENIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

